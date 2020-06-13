package wand;

import java.util.Random;

import constant.WandConstant;
import utility.Data;
import utility.Debug;

/**
 * WandBuilder permet de créer des baguettes magiques.
 * @author Mentra20
 *
 */
public class WandBuilder {

	Random r; //Le random pour les tirages.
	
	/* CONSTRUCTOR */
    public WandBuilder(){
        this.r = new Random();
    }
    
    /**
     * createWand permet de créer une baguette magique selon la rareté
     * @param rarity : la rareté de la baguette.
     * @return La baguette
     */
    public Wand createWand(int rarity) {
    	Debug.debug("Creation magic wand of rarity "+rarity+"...");
    	
    	Data<Integer> dataNds = new Data<Integer>();
    	
    	//Chargement des données selon la rareté.
    	switch (rarity) {
		case 1: dataNds.addAll(WandConstant.rarity1());
			break;
		case 2: dataNds.addAll(WandConstant.rarity2());
			break;
		case 3: dataNds.addAll(WandConstant.rarity3());
			break;
		case 4: dataNds.addAll(WandConstant.rarity4());
			break;
		case 5: dataNds.addAll(WandConstant.rarity5());
			break;
		case 6: dataNds.addAll(WandConstant.rarity6());
			break;
		default: Debug.error("Error createWand: switch dataNds");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_nds = "+randomValue);
    	int nds = dataNds.selectObject(randomValue);
    	Debug.debug("With spell level "+nds+"...");
    	
    	
    	//Tirage de commun ou hors du commun
    	int randomValue2 = r.nextInt(100)+1;
    	Debug.debug("n_type = "+randomValue2);
    	
    	Wand wand;
    	
    	//Commun
    	if(randomValue2 <= 75) {
    		wand = createCommonWand(nds);
    	}
    	//Hors du commun
    	else {
    		wand =createUncommonWand(nds);
    	}
    	
    	//On affecte le NDS 
    	wand.setNds(nds);
    	//On calcule le NLS
    	wand.computeNls();
    	
    	Debug.debug("");
    	return wand;
    }
    
    /**
     * createCommonWand renvoie une baguette commune selon le nds.
     * @param nds : le niveau du sort.
     * @return la baguette.
     */
    public Wand createCommonWand(int nds) {
    	Debug.debug("Creation common wand...");
    	
    	Data<Wand> data = new Data<Wand>();
    	
    	//Chargement des données
    	switch(nds) {
    	case 0: data.addAll(WandConstant.commonWand0());
			break;
		case 1: data.addAll(WandConstant.commonWand1());
			break;
		case 2: data.addAll(WandConstant.commonWand2());
			break;
		case 3: data.addAll(WandConstant.commonWand3());
			break;
		case 4: data.addAll(WandConstant.commonWand4());
			break;
		default : Debug.error("Error on switch createCommonWand");
    	}
    	
		// Tirage
		int randomValue = r.nextInt(100)+1;
		Debug.debug("n_common = "+ randomValue);
		Wand wand = data.selectObject(randomValue);
		
		//ce n'est pas un baguette hors du commun
		wand.setUncommon(false);
		
		return wand;
    }
    
    /**
     * createUncommonWand renvoie une baguette hors du commun selon le nds.
     * @param nds : le niveau du sort.
     * @return la baguette.
     */
    public Wand createUncommonWand(int nds) {
    	Debug.debug("Creation uncommon wand...");
    	
    	Data<Wand> data = new Data<Wand>();
    	
    	//Chargement des données
    	switch(nds) {
    	case 0: data.addAll(WandConstant.uncommonWand0());
			break;
		case 1: data.addAll(WandConstant.uncommonWand1());
			break;
		case 2: data.addAll(WandConstant.uncommonWand2());
			break;
		case 3: data.addAll(WandConstant.uncommonWand3());
			break;
		case 4: data.addAll(WandConstant.uncommonWand4());
			break;
		default : Debug.error("Error on switch create UncommonWand");
    	}
    	
		// Tirage
		int randomValue = r.nextInt(100)+1;
		Debug.debug("n_uncommon = "+ randomValue);
		Wand wand = data.selectObject(randomValue);
		
		//ce n'est pas un baguette hors du commun
		wand.setUncommon(true);
		
		return wand;
    }
}
