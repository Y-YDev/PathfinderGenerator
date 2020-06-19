package parchment;

import java.util.Random;

import constant.ParchmentConstant;
import utility.Data;
import utility.Debug;

/**
 * WandBuilder permet de créer des parchemins magiques.
 * @author Mentra20
 *
 */
public class ParchmentBuilder {

	Random r; //Le random pour les tirages.
	
	/* CONSTRUCTOR */
    public ParchmentBuilder(){
        this.r = new Random();
    }
    
    /**
     * createWand permet de créer un parchemin magique selon la rareté
     * @param rarity : la rareté du parchemin.
     * @return Le parchemin
     */
    public Parchment createParchment(int rarity) {
    	Debug.debug("Creation magic parchment of rarity "+rarity+"...");
    	
    	Data<Integer> dataNds = new Data<Integer>();
    	
    	//Chargement des données selon la rareté.
    	switch (rarity) {
		case 1: dataNds.addAll(ParchmentConstant.rarity1());
			break;
		case 2: dataNds.addAll(ParchmentConstant.rarity2());
			break;
		case 3: dataNds.addAll(ParchmentConstant.rarity3());
			break;
		case 4: dataNds.addAll(ParchmentConstant.rarity4());
			break;
		case 5: dataNds.addAll(ParchmentConstant.rarity5());
			break;
		case 6: dataNds.addAll(ParchmentConstant.rarity6());
			break;
		default: Debug.error("Error createParchment: switch dataNds");
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
    	
    	Parchment parchment;
    	
    	//Commun
    	if(randomValue2 <= 45) {
    		parchment = createCommonProfaneParchment(nds);
    	}
    	//Hors du commun
    	else if(randomValue2 <= 60) {
    		parchment =createUncommonProfaneParchment(nds);
    	}
    	else if(randomValue2 <= 90) {
    		parchment =createCommonDivineParchment(nds);
    	}
    	else {
    		parchment =createUncommonDivineParchment(nds);
    	}
    	
    	//On affecte le NDS 
    	parchment.setNds(nds);
    	//On calcule le NLS
    	parchment.computeNls();
    	
    	Debug.debug("");
    	return parchment;
    }
    
    /**
     * createProfaneCommonParchment renvoie un parchemin profane commun selon le nds.
     * @param nds : le niveau du sort.
     * @return le parchemin.
     */
    public Parchment createCommonProfaneParchment(int nds) {
    	Debug.debug("Creation common profane parchment...");
    	
    	Data<Parchment> data = new Data<Parchment>();
    	
    	//Chargement des données
    	switch(nds) {
    	case 0: data.addAll(ParchmentConstant.commonProfaneParchment0());
			break;
		case 1: data.addAll(ParchmentConstant.commonProfaneParchment1());
			break;
		case 2: data.addAll(ParchmentConstant.commonProfaneParchment2());
			break;
		case 3: data.addAll(ParchmentConstant.commonProfaneParchment3());
			break;
		case 4: data.addAll(ParchmentConstant.commonProfaneParchment4());
			break;
		case 5: data.addAll(ParchmentConstant.commonProfaneParchment5());
			break;
		case 6: data.addAll(ParchmentConstant.commonProfaneParchment6());
			break;
		case 7: data.addAll(ParchmentConstant.commonProfaneParchment7());
			break;
		case 8: data.addAll(ParchmentConstant.commonProfaneParchment8());
		break;
		case 9: data.addAll(ParchmentConstant.commonProfaneParchment9());
			break;
		default : Debug.error("Error on switch createProfaneCommonParchment");
    	}
    	
		// Tirage
		int randomValue = r.nextInt(100)+1;
		Debug.debug("n_common = "+ randomValue);
		Parchment parchment = data.selectObject(randomValue);
		
		//ce n'est pas un parchemin hors du commun
		parchment.setUncommon(false);
		//ce n'est pas un parchemin divin
		parchment.setDivine(false);
		
		return parchment;
    }
    
    /**
     * createCommonWand renvoie un parchemin profane hors du commun selon le nds.
     * @param nds : le niveau du sort.
     * @return le parchemin.
     */
    public Parchment createUncommonProfaneParchment(int nds) {
    	Debug.debug("Creation uncommon profane parchment...");
    	
    	Data<Parchment> data = new Data<Parchment>();
    	
    	//Chargement des données
    	switch(nds) {
    	case 0: data.addAll(ParchmentConstant.uncommonProfaneParchment0());
			break;
		case 1: data.addAll(ParchmentConstant.uncommonProfaneParchment1());
			break;
		case 2: data.addAll(ParchmentConstant.uncommonProfaneParchment2());
			break;
		case 3: data.addAll(ParchmentConstant.uncommonProfaneParchment3());
			break;
		case 4: data.addAll(ParchmentConstant.uncommonProfaneParchment4());
			break;
		case 5: data.addAll(ParchmentConstant.uncommonProfaneParchment5());
			break;
		case 6: data.addAll(ParchmentConstant.uncommonProfaneParchment6());
			break;
		case 7: data.addAll(ParchmentConstant.uncommonProfaneParchment7());
			break;
		case 8: data.addAll(ParchmentConstant.uncommonProfaneParchment8());
		break;
		case 9: data.addAll(ParchmentConstant.uncommonProfaneParchment9());
			break;
		default : Debug.error("Error on switch createUncommonProfaneParchment");
    	}
    	
		// Tirage
		int randomValue = r.nextInt(100)+1;
		Debug.debug("n_common = "+ randomValue);
		Parchment parchment = data.selectObject(randomValue);
		
		//c'est un parchemin hors du commun
		parchment.setUncommon(true);
		//ce n'est pas un parchemin divin
		parchment.setDivine(false);
		
		return parchment;
    }
    
    /**
     * createProfaneCommonParchment renvoie un parchemin divin commun selon le nds.
     * @param nds : le niveau du sort.
     * @return le parchemin.
     */
    public Parchment createCommonDivineParchment(int nds) {
    	Debug.debug("Creation common divine parchment...");
    	
    	Data<Parchment> data = new Data<Parchment>();
    	
    	//Chargement des données
    	switch(nds) {
    	case 0: data.addAll(ParchmentConstant.commonDivineParchment0());
			break;
		case 1: data.addAll(ParchmentConstant.commonDivineParchment1());
			break;
		case 2: data.addAll(ParchmentConstant.commonDivineParchment2());
			break;
		case 3: data.addAll(ParchmentConstant.commonDivineParchment3());
			break;
		case 4: data.addAll(ParchmentConstant.commonDivineParchment4());
			break;
		case 5: data.addAll(ParchmentConstant.commonDivineParchment5());
			break;
		case 6: data.addAll(ParchmentConstant.commonDivineParchment6());
			break;
		case 7: data.addAll(ParchmentConstant.commonDivineParchment7());
			break;
		case 8: data.addAll(ParchmentConstant.commonDivineParchment8());
		break;
		case 9: data.addAll(ParchmentConstant.commonDivineParchment9());
			break;
		default : Debug.error("Error on switch createDivineCommonParchment");
    	}
    	
		// Tirage
		int randomValue = r.nextInt(100)+1;
		Debug.debug("n_common = "+ randomValue);
		Parchment parchment = data.selectObject(randomValue);
		
		//ce n'est pas un parchemin hors du commun
		parchment.setUncommon(false);
		//c'est un parchemin divin
		parchment.setDivine(true);
		
		return parchment;
    }
    
    /**
     * createCommonWand renvoie un parchemin divin hors du commun selon le nds.
     * @param nds : le niveau du sort.
     * @return le parchemin.
     */
    public Parchment createUncommonDivineParchment(int nds) {
    	Debug.debug("Creation uncommon divine parchment...");
    	
    	Data<Parchment> data = new Data<Parchment>();
    	
    	//Chargement des données
    	switch(nds) {
    	case 0: data.addAll(ParchmentConstant.uncommonDivineParchment0());
			break;
		case 1: data.addAll(ParchmentConstant.uncommonDivineParchment1());
			break;
		case 2: data.addAll(ParchmentConstant.uncommonDivineParchment2());
			break;
		case 3: data.addAll(ParchmentConstant.uncommonDivineParchment3());
			break;
		case 4: data.addAll(ParchmentConstant.uncommonDivineParchment4());
			break;
		case 5: data.addAll(ParchmentConstant.uncommonDivineParchment5());
			break;
		case 6: data.addAll(ParchmentConstant.uncommonDivineParchment6());
			break;
		case 7: data.addAll(ParchmentConstant.uncommonDivineParchment7());
			break;
		case 8: data.addAll(ParchmentConstant.uncommonDivineParchment8());
		break;
		case 9: data.addAll(ParchmentConstant.uncommonDivineParchment9());
			break;
		default : Debug.error("Error on switch createUncommonDivineParchment");
    	}
    	
		// Tirage
		int randomValue = r.nextInt(100)+1;
		Debug.debug("n_common = "+ randomValue);
		Parchment parchment = data.selectObject(randomValue);
		
		//c'est un parchemin hors du commun
		parchment.setUncommon(true);
		//c'est un parchemin divin
		parchment.setDivine(true);
		
		return parchment;
    }
}