package gemAndJewel;

import java.util.Random;

import constant.GemAndJewelConstant;
import utility.Data;
import utility.Debug;

public class GemAndJewelBuilder {

	Random r; //Le random pour les tirages.
	
	/* CONSTRUCTOR */
    public GemAndJewelBuilder(){
        this.r = new Random();
    }
    
    
    /* METHODS */
    
    public Gem makeGem(int grade, boolean cut) {
    	if(cut) {
    		Debug.debug("Create cut gem with grade "+grade);
    	}else {
    		Debug.debug("Create raw gem with grade "+grade);
		}
    	
    	Data<Gem> data = new Data<Gem>();
    	
    	//Chargement des données
    	switch(grade) {
		case 1: data.addAll(GemAndJewelConstant.gemGrade1());
			break;
		default: Debug.error("Error on makeGem switch : data");
			break;
		}
    	
    	//Tirage
        int randomValue = r.nextInt(100)+1;
        Debug.debug("n_gem = "+randomValue);
        Gem gem = data.selectObject(randomValue);
        
        //Ajout du prix
        switch (grade) {
		case 1: gem.setPrice(5);
			break;
		default: Debug.error("Error on makeGem switch : price");
			break;
		}
       
        if(cut) {
        	//La gemme est taillée.
        	gem.setCut(TypeCut.CUT);
        	
        	// 2d4 x prix du grade
        	int cutVal = r.nextInt(4)+1;
        	cutVal += r.nextInt(4)+1;
        	Debug.debug("n_cut = "+cutVal);
        	
        	//ajout au prix.
        	switch (grade) {
    		case 1: gem.setPrice(gem.getPrice() + cutVal * 1);
    			break;
    		default: Debug.error("Error on makeGem switch : cut");
    			break;
    		}
        }
        
        Debug.debug("");
        return gem;
    }
    
    
    
}
