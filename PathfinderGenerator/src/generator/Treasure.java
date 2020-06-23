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
	private Type type;//Lettre du type du trésor
	private ArrayList<Level> levelList;//Liste des paliers du trésor.
	private ProbabilityType probabilityType;//repartition de probabilité de drop.
	
	public Treasure(Type type) {
		r = new Random();
		this.setType(type);
		this.setLevelList(createLevel());
		affectProbability(ProbabilityType.MEDIUM);
	}
	
	public Treasure(Type type, ProbabilityType probabilityType) {
		r = new Random();
		this.setType(type);
		this.setLevelList(createLevel());
		affectProbability(probabilityType);
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
	public ArrayList<Level> createLevel(){
		switch (this.type) {
		case A:
			return TreasureConstant.TypeA();
		case B:
			return TreasureConstant.TypeB();
		default:
			Debug.error("Error switch createLevel");
			return null;
		}
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
			//On recupere le prix du dernier
			double actualPrice = levelList.get(0).getPrice();
			
			for(int i = 0; i < levelList.size();i++) {
				if(levelList.get(i).getPrice() > actualPrice) {
					proba++;
					actualPrice = levelList.get(i).getPrice();
				}
				levelList.get(i).setProbability(proba);
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
		return levelList.get(index);
	}
	
	
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
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
