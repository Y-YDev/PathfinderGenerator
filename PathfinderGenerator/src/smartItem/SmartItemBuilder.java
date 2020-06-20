package smartItem;

import java.util.Random;

import constant.SmartItemConstant;
import utility.Debug;

/**
 * permet de creer un objet intelligent.
 * @author Mentra20
 *
 */
public class SmartItemBuilder {
	private Random r;
	
	public SmartItemBuilder() {
		this.r = new Random();
	}
	
	/**
	 * creer un objet intelligent
	 * @return
	 */
	public SmartItem createSmartItem(double basePrice) {
		Debug.debug("Create smart item...");
		
		SmartItem smartItem = new SmartItem(basePrice);
		
		//Creation de l'alignement
		int randomValue = r.nextInt(100)+1;
		Debug.debug("n_alig = "+randomValue);
		smartItem.setAlignement(SmartItemConstant.alignement().selectObject(randomValue));
		//Creation des stats de l'objet
		smartItem = createStat(smartItem);
		//Ajout des langues
		smartItem.setLangage(computeLangage(smartItem));
		//Ajout des capacité de communication
		if((r.nextInt(100)+1) <= 80 ) smartItem = createCommunication(smartItem);//20% de chance de ne rien ajouter.
		//Ajout des pouvoirs
		smartItem = createSkill(smartItem);
		//Ajout des desseins
		if((r.nextInt(100)+1) <= 80 ) smartItem = createPlan(smartItem);//20% de chance de ne pas avoir de desseins.
		//Si l'objet n'a pas de desseins il n'a pas de pouvoir dédiés à celui-ci.
		if(smartItem.getPlan() != null && r.nextBoolean()) smartItem = createDedicatePower(smartItem);//50% de chance d'avoir un pouvoir de dessein
		//Bonus d'ego en fonction du prix.
		smartItem.setEgo(smartItem.getEgo() + computeBasePrice(smartItem));
		//Ajout des traits
		smartItem = createTrait(smartItem);
		
		return smartItem;
	}
	
	/**
	 * créer les statistiques d'un objet intelligent.
	 * @param smartItem : l'objet
	 * @return l'objet modifié
	 */
	public SmartItem createStat(SmartItem smartItem) {
		Debug.debug("create statistics for smart item..");
		
		//Int
		int randomValue = r.nextInt(100)+1;
		Debug.debug("n_int = "+randomValue);
		SmartItemStat smartItemStat = SmartItemConstant.statistics().selectObject(randomValue);
		
		smartItem.setEgo(smartItem.getEgo() + smartItemStat.getEgo());
		smartItem.setPrice(smartItem.getPrice() + smartItemStat.getPrice());
		smartItem.setInt(smartItemStat);
		
		//Sag
		int randomValue2 = r.nextInt(100)+1;
		Debug.debug("n_sag = "+randomValue2);
		SmartItemStat smartItemStat2 = SmartItemConstant.statistics().selectObject(randomValue2);
		
		smartItem.setEgo(smartItem.getEgo() + smartItemStat2.getEgo());
		smartItem.setPrice(smartItem.getPrice() + smartItemStat2.getPrice());
		smartItem.setSag(smartItemStat2);
		
		//Char
		int randomValue3 = r.nextInt(100)+1;
		Debug.debug("n_char = "+randomValue3);
		SmartItemStat smartItemStat3 = SmartItemConstant.statistics().selectObject(randomValue3);
		
		smartItem.setEgo(smartItem.getEgo() + smartItemStat3.getEgo());
		smartItem.setPrice(smartItem.getPrice() + smartItemStat3.getPrice());
		smartItem.setChar(smartItemStat3);
		
		return smartItem;
	}
	
	/**
	 * Calcule le nombre de langues connues par l'objet
	 * @param smartItem : l'objet
	 * @return le nombre de langues connues
	 */
	public int computeLangage(SmartItem smartItem) {
		Debug.debug("Compute langage known by smart object....");
		
		switch (smartItem.getInt().getStat()) {
		case 10:
		case 11:
			return 1;//0 + 1 (le commun)   
		case 12:
		case 13:
			return 2;
		case 14:
		case 15:
			return 3;
		case 16:
		case 17:
			return 4;
		case 18:
		case 19:
			return 5;
		case 20 :
			return 6;
		default:
			Debug.error("Error on switch computeLangage");
			return -999999;
		}
	}
	
	
	/**
	 * Calcule l'ego en fonction du prix de base de l'objet
	 * @param smartItem : l'objet
	 * @return l'ego bonus
	 */
	public int computeBasePrice(SmartItem smartItem) {
		Debug.debug("Compute ego by base price for smart object....");
		
		double price = smartItem.getBasePrice();
		if(price <= 1000 ) return 0;
		else if(price <= 5000) return 1;
		else if(price <= 10000) return 2;
		else if(price <= 20000) return 3;
		else if(price <= 50000) return 4;
		else if(price <= 100000) return 6;
		else if(price <= 200000) return 8;
		else if(price > 200000) return 12;
		else {
			Debug.error("Unreachable case");
			return -99999;
		}
	}
	
	/**
	 * Créer les capacités de communications de l'objet.
	 * @param smartItem : l'objet
	 * @return l'objet modifié
	 */
	public SmartItem createCommunication(SmartItem smartItem) {
		Debug.debug("create communications skills for smart item...");
		int reroll;
		boolean first;
		
		do {
			first = true;
			reroll = r.nextInt(100)+1;
			Debug.debug("add communications skills...");
			
			int randomValue = r.nextInt(100)+1;
			Debug.debug("n_comm = "+randomValue);
			SmartItemCommunication smartItemCommunication = SmartItemConstant.communicationCapacity().selectObject(randomValue);
			
			//On vérifie que la capacité n'existe pas déjà
			for(SmartItemCommunication c : smartItem.getCommunication()) {
				if(c.getCommunication().equals(smartItemCommunication.getCommunication())) {
					reroll = 9999;//On relance car on à déjà la capacité
					first = false;
					Debug.debug("Forcing reroll...");
				}
			}
			//On peut ajouter
			if(first) {
				smartItem.setPrice(smartItem.getPrice() + smartItemCommunication.getPrice());
				smartItem.setEgo(smartItem.getEgo() + smartItemCommunication.getEgo());
				smartItem.getCommunication().add(smartItemCommunication);
			}
			
			//Pour éviter les boucles infinies (si l'objet à tout.)
			if(smartItem.getCommunication().size() == 10) return smartItem;
			
		} while (reroll >= 85);
		
		return smartItem;
	}
	
	/**
	 * Créer les pouvoirs de l'objet.
	 * @param smartItem : l'objet
	 * @return l'objet modifié
	 */
	public SmartItem createSkill(SmartItem smartItem) {
		Debug.debug("create skills for smart item...");
		int reroll;
		boolean first;
		
		do {
			first = true;
			reroll = r.nextInt(100)+1;
			Debug.debug("add skills...");
			
			int randomValue = r.nextInt(100)+1;
			Debug.debug("n_skill = "+randomValue);
			SmartItemSkill smartItemSkill = SmartItemConstant.powerList().selectObject(randomValue);
			
			//On vérifie que la capacité n'existe pas déjà
			for(SmartItemSkill c : smartItem.getSkill()) {
				if(c.getSkill().equals(smartItemSkill.getSkill())) {
					reroll = 9999;//On relance car on à déjà la capacité
					first = false;
					Debug.debug("Forcing reroll...");
				}
			}
			//On peut ajouter
			if(first) {
				smartItem.setPrice(smartItem.getPrice() + smartItemSkill.getPrice());
				smartItem.setEgo(smartItem.getEgo() + smartItemSkill.getEgo());
				smartItem.getSkill().add(smartItemSkill);
			}
			
			//Pour éviter les boucles infinies (si l'objet à tout.)
			if(smartItem.getSkill().size() == 15) return smartItem;
			
		} while (reroll >= 80);
		
		return smartItem;
	}
	
	/**
	 * Créer les desseins de l'objet.
	 * @param smartItem : l'objet
	 * @return l'objet modifié
	 */
	public SmartItem createPlan(SmartItem smartItem) {
		Debug.debug("create plan for smart item...");
		
		int randomValue = r.nextInt(100)+1;
		Debug.debug("n_plan = "+randomValue);
		SmartItemPlan smartItemPlan = SmartItemConstant.planList().selectObject(randomValue);
		
		smartItem.setEgo(smartItem.getEgo() + smartItemPlan.getEgo());
		smartItem.setPlan(smartItemPlan);
		
		return smartItem;
	}
	
	/**
	 * Créer les pouvoir de desseins de l'objet.
	 * @param smartItem : l'objet
	 * @return l'objet modifié
	 */
	public SmartItem createDedicatePower(SmartItem smartItem) {
		Debug.debug("create dedicate power for smart item...");
		
		int randomValue = r.nextInt(100)+1;
		Debug.debug("n_dedi = "+randomValue);
		SmartItemDedicatePower smartItemDedicatePower = SmartItemConstant.dedicatePowerList().selectObject(randomValue);
		
		smartItem.setEgo(smartItem.getEgo() + smartItemDedicatePower.getEgo());
		smartItem.setPrice(smartItem.getPrice() + smartItemDedicatePower.getPrice());
		smartItem.setPower(smartItemDedicatePower);
		
		return smartItem;
	}
	
	/**
	 * Créer les traits de l'objet.
	 * @param smartItem : l'objet
	 * @return l'objet modifié
	 */
	public SmartItem createTrait(SmartItem smartItem) {
		Debug.debug("create traits for smart item...");
		int reroll;
		boolean first;
		
		do {
			first = true;
			reroll = r.nextInt(100)+1;
			Debug.debug("add traits...");
			
			int randomValue = r.nextInt(100)+1;
			Debug.debug("n_trait = "+randomValue);
			String trait = SmartItemConstant.traitList().selectObject(randomValue);
			
			//On vérifie que la capacité n'existe pas déjà
			for(String t : smartItem.getTraits()) {
				if(t.equals(trait)) {
					reroll = 9999;//On relance car on à déjà la capacité
					first = false;
					Debug.debug("Forcing reroll...");
				}
			}
			//On peut ajouter
			if(first) {
				smartItem.getTraits().add(trait);
			}
			
			//Pour éviter les boucles infinies (si l'objet à tout...Impossible mais on sais jamais)
			if(smartItem.getTraits().size() == 100) return smartItem;
			
		} while (reroll >= 80);//20% de chance d'en avoir un autre
		
		return smartItem;
	}
}
