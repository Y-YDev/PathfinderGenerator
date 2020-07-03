package generator;

import java.util.ArrayList;
import java.util.Random;

import constant.TreasureConstant;
import utility.Debug;

/**
 * Représente un trésor.
 * @author Mentra20
 *
 */
public class Treasure {
	private Random r;
	private TreasureType type;//Lettre du type du trésor
	private ArrayList<Level> levelList;//Liste des paliers du trésor.
	private ProbabilityType probabilityType;//repartition de probabilité de drop.
	
	public Treasure(TreasureType type) {
		r = new Random();
		this.setType(type);
		this.createLevel(ProbabilityType.MEDIUM);
	}

	/**
	 * Retourne la somme des probabilité de chaque paliers.
	 * @return la probabilité totale du tresor
	 */
	public int computeProbability() {
		int sum = 0;
		
		for(Level l : levelList) {
			sum += l.getProbability();
		}
		return sum;
	}
	
	/**
	 * Creer les paliers d'un tresor selon le type.
	 * @return la liste des paliers.
	 */
	public void createLevel(ProbabilityType probabilityType){
		ArrayList<Level> levels = new ArrayList<Level>();
		
		switch (this.type) {
		case A:
			levels = TreasureConstant.TypeA();
			break;
		case B:
			levels = TreasureConstant.TypeB();
			break;
		case C:
			levels = TreasureConstant.TypeC();
			break;
		case D:
			levels = TreasureConstant.TypeD();
			break;
		case E:
			levels = TreasureConstant.TypeE();
			break;
		case F:
			levels = TreasureConstant.TypeF();
			break;
		case G:
			levels = TreasureConstant.TypeG();
			break;
		case H:
			levels = TreasureConstant.TypeH();
			break;
		case I:
			levels = TreasureConstant.TypeI();
			break;
		default:
			Debug.error("Error switch createLevel");
			levels = null;
			break;
		}
		
		this.setLevelList(levels);
		//On affecte les probabilités.
		affectProbability(probabilityType);
	}
	
	/**
	 * Affecte les probabilité au palier selon le mode de répartition de probabilité choisi.
	 */
	public void affectProbability(ProbabilityType probabilityType) {
		//On change la répartition de proba.
		setProbabilityType(probabilityType);
		//Probabilité décroissante
		if(this.probabilityType == ProbabilityType.MINOR) {
			int proba = 1;//On commence a une proba de 1.
			//On recupere le prix du dernier
			double actualPrice = levelList.get(levelList.size()-1).getPrice();
			
			for(int i = levelList.size()-1; i >= 0; i--) {
				if(levelList.get(i).getPrice() < actualPrice) {
					proba++;
					actualPrice = levelList.get(i).getPrice();
				}
				levelList.get(i).setProbability(proba);
			}
		}
		//Probabilité equiprobable
		else if(this.probabilityType == ProbabilityType.MEDIUM) {
			for(Level level : this.levelList) {
				level.setProbability(1);
			}
		}
		//Probabilité croissante
		else if (this.probabilityType == ProbabilityType.MAJOR){
			int proba = 1;//On commence a une proba de 1.
			//On recupere le prix du premier
			double actualPrice = levelList.get(0).getPrice();
			
			for(int i = 0; i < levelList.size();i++) {
				if(levelList.get(i).getPrice() > actualPrice) {
					proba++;
					actualPrice = levelList.get(i).getPrice();
				}
				levelList.get(i).setProbability(proba);
			}
		}
		//Probabilité avec suite de fibonacci
		else if (this.probabilityType == ProbabilityType.FIBONACCI) {
			int n1 = 0;
			int n2 = 1;
			int temp;
			
			//On recupere le prix du premier
			double actualPrice = levelList.get(0).getPrice();
			
			for(int i = 0; i < levelList.size();i++) {
				if(levelList.get(i).getPrice() > actualPrice) {
					
					temp = n2;
					n2 = n2 + n1;
					n1 = temp;
					
					actualPrice = levelList.get(i).getPrice();
				}
				levelList.get(i).setProbability(n2);
			}
		}
		else {
			Debug.error("No probability was given before");
		}
	}

	/**
	 * Renvoie un palier au hasard (selon la répartition de probabilité)
	 * @return Le palier séléctionné
	 */
	public Level getRandomLevel() {
		int random = r.nextInt(computeProbability())+1;
		int index = 0;
		int currentProb = levelList.get(index).getProbability();
		
		while(random > currentProb) {
			index++;
			currentProb += levelList.get(index).getProbability();
		}
		Level res = levelList.get(index);
		Debug.debug("Result of draw is "+random+" : get level of price "+res.getPrice());
		return res;
	}
	
	/**
	 * Renvoie true ou false selon que le trésor peut etre choisir pour un prix donné
	 * @param price : le prix
	 * @return true ou false.
	 */
	public boolean canBeChooseLevel(double price) {
		if(levelList.get(0).getPrice() > price) {
			//Si le prix le plus bas ne peux pas être choisi on ne peux rien avoir dans ce trésor
			return false;
		}
		return true;
	}
	
	/**
	 * Permet de retirer les paliers trop cher pour le prix donné
	 * @param price : le prix
	 * @return la liste sans les paliers trop chers
	 */
	public void removeTooExpensiveLevel(double price) {
		Debug.debug("Removing too expensive level of type "+this.type+" for price "+price);
		
		ArrayList<Level> newLevel = new ArrayList<Level>();
		
		for(int i =0 ;i < levelList.size(); i++) {
			if(levelList.get(i).getPrice() <= price) {//Si on peut le selectionner avec notre argent
				Debug.debug("keep level of price : "+levelList.get(i).getPrice());
				newLevel.add(levelList.get(i));//On l'ajoute à la future levelList
			}
		}
		this.setLevelList(newLevel);
	}
	
	/* GETTER AND SETTERS */
	
	public TreasureType getType() {
		return type;
	}

	public void setType(TreasureType type) {
		this.type = type;
	}

	public ArrayList<Level> getLevelList() {
		return levelList;
	}

	public void setLevelList(ArrayList<Level> levelList) {
		this.levelList = levelList;
	}

	public ProbabilityType getProbabilityType() {
		return probabilityType;
	}

	public void setProbabilityType(ProbabilityType probabilityType) {
		this.probabilityType = probabilityType;
	}
}
