package potion;

import java.util.Random;

import constant.PotionConstant;
import utility.Data;
import utility.Debug;

/**
 * PotionBuilder permet de créer des potions ou des huiles.
 * @author Mentra20
 *
 */
public class PotionBuilder {

Random r; //Le random pour les tirages.
	
	/* CONSTRUCTOR */
    public PotionBuilder(){
        this.r = new Random();
    }
    
    /**
     * createPotion permet de créer une huile/potion selon la rareté
     * @param rarity : la rareté de la potion.
     * @return La potion
     */
    public Potion createPotion(int rarity) {
    	Debug.debug("Creation potion of rarity "+rarity+"...");
    	
    	Data<Integer> dataNds = new Data<Integer>();
    	
    	//Chargement des données selon la rareté.
    	switch (rarity) {
		case 1: dataNds.addAll(PotionConstant.rarity1());
			break;
		case 2: dataNds.addAll(PotionConstant.rarity2());
			break;
		case 3: dataNds.addAll(PotionConstant.rarity3());
			break;
		case 4: dataNds.addAll(PotionConstant.rarity4());
			break;
		case 5: dataNds.addAll(PotionConstant.rarity5());
			break;
		case 6: dataNds.addAll(PotionConstant.rarity6());
			break;
		default: Debug.error("Error createPotion: switch dataNds");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_nds = "+randomValue);
    	int nds = dataNds.selectObject(randomValue);
    	Debug.debug("With caster level "+nds+"...");
    	
    	
    	//Tirage de commun ou hors du commun
    	int randomValue2 = r.nextInt(100)+1;
    	Debug.debug("n_type = "+randomValue2);
    	
    	// Les potions hors du commun pour nds 0 n'existe pas.
    	if(nds == 0 && randomValue2 > 75) {
    		Debug.debug("Force the type of potion to common...");
    		randomValue2 = 1;//On force le tirage.
    	}
    	
    	Potion potion = new Potion(nds);
    	
    	//Commun
    	if(randomValue2 <= 75) {
    		potion = createCommonPotion(nds);
    	}
    	//Hors du commun
    	else {
    		potion =createUncommonPotion(nds);
    	}
    	
    	return potion;
    }
    
    /**
     * createCommonPotion renvoie une potion commune selon le nds.
     * @param nds : le niveau du sort.
     * @return la potion.
     */
    public Potion createCommonPotion(int nds) {
    	Debug.debug("Creation common potion name...");
    	
    	Data<String> data = new Data<String>();
    	
    	//Chargement des données
    	switch(nds) {
    	case 0: data.addAll(PotionConstant.commonPotion0());
			break;
		case 1: data.addAll(PotionConstant.commonPotion1());
			break;
		case 2: data.addAll(PotionConstant.commonPotion2());
			break;
		case 3: data.addAll(PotionConstant.commonPotion3());
			break;
		default : Debug.error("Error on switch createCommonPotion");
    	}
    	
    	Potion potion = new Potion(nds);
    	potion.setUncommon(false);
    	
		// Tirage
		int randomValue = r.nextInt(100)+1;
		Debug.debug("n_common = "+ randomValue);
		potion.setName(data.selectObject(randomValue));
		
		return potion;
    }
    
    /**
     * createUncommonPotion renvoie une potion hors du commun selon le nds.
     * @param nds : le niveau du sort.
     * @return la potion.
     */
    public Potion createUncommonPotion(int nds) {
    	Debug.debug("Creation uncommon potion name...");
    	
    	Data<String> data = new Data<String>();
    	
    	//Chargement des données
    	switch(nds) {
		case 1: data.addAll(PotionConstant.uncommonPotion1());
			break;
		case 2: data.addAll(PotionConstant.uncommonPotion2());
			break;
		case 3: data.addAll(PotionConstant.uncommonPotion3());
			break;
		default : Debug.error("Error on switch create UncommonPotion");
    	}
    	
    	
    	Potion potion = new Potion(nds);
    	potion.setUncommon(true);
    	
		// Tirage
		int randomValue = r.nextInt(100)+1;
		Debug.debug("n_uncommon = "+ randomValue);
		potion.setName(data.selectObject(randomValue));
		
		return potion;
    }
}
