package gemAndJewel;

import java.util.Random;

import constant.GemAndJewelConstant;
import utility.Data;
import utility.Debug;
import utility.Tuple;

/**
 * GemAndJewelBuilder permet de créer des bijoux et des gemmes.
 * @author Mentra20
 *
 */
public class GemAndJewelBuilder {

	Random r; //Le random pour les tirages.
	
	/* CONSTRUCTOR */
    public GemAndJewelBuilder(){
        this.r = new Random();
    }
    
    
    /* METHODS */
    
    /**
     * createGemOrJewel créer une gemme ou un bijoux selon le drop.
     * @param grade : grade du bijoux ou de la gemme
     * @return un tuple contenant un bijoux et une gemme (un des deux est null).
     */
    public Tuple<Gem, Jewel> createGemOrJewel(int grade){
    	Debug.debug("Choosing gem or jewel...");
    	
    	Data<Integer> data = new Data<Integer>();
    	
    	//Chargement des données.
    	switch (grade) {
		case 1: data.addAll(GemAndJewelConstant.grade1());
			break;
		case 2: data.addAll(GemAndJewelConstant.grade2());
			break;
		case 3: data.addAll(GemAndJewelConstant.grade3());
			break;
		case 4: data.addAll(GemAndJewelConstant.grade4());
			break;
		case 5: data.addAll(GemAndJewelConstant.grade5());
			break;
		case 6: data.addAll(GemAndJewelConstant.grade6());
			break;
		default: Debug.error("Error switch createGemOrJewel");
			break;
		}
    	
    	//Tirage
        int randomValue = r.nextInt(100)+1;
        Debug.debug("n_choice = "+randomValue);
    	int choice = data.selectObject(randomValue);
    	
    	//On retourne un tuple à moitié vide.
    	if(choice == 1) {//Gemme brute
    		Gem res = createGem(grade, false);
    		return new Tuple<Gem, Jewel>(res, null);
    	}
    	if(choice == 2) {//Gemme taillée
    		Gem res = createGem(grade, true);
    		return new Tuple<Gem, Jewel>(res, null);
    	}
    	if(choice == 3) {//Bijoux
    		Jewel res = createJewel(grade);
    		return new Tuple<Gem, Jewel>(null,res);
    	}
    	else {
    		Debug.error("Error on choice drop");
    		return null;
    	}
    }
    
    
    /**
     * CreateGem créer une gemme.
     * @param grade : grade de la gemme.
     * @param cut : true si elle est taillée, brut sinon.
     * @return La gemme créée.
     */
    public Gem createGem(int grade, boolean cut) {
    	if(cut) {
    		Debug.debug("Create cut gem with grade "+grade+"...");
    	}else {
    		Debug.debug("Create raw gem with grade "+grade+"...");
		}
    	
    	Data<Gem> data = new Data<Gem>();
    	
    	//Chargement des données
    	switch(grade) {
		case 1: data.addAll(GemAndJewelConstant.gemGrade1());
			break;
		case 2: data.addAll(GemAndJewelConstant.gemGrade2());
			break;
		case 3: data.addAll(GemAndJewelConstant.gemGrade3());
			break;
		case 4: data.addAll(GemAndJewelConstant.gemGrade4());
			break;
		case 5: data.addAll(GemAndJewelConstant.gemGrade5());
			break;
		case 6: data.addAll(GemAndJewelConstant.gemGrade6());
			break;
		default: Debug.error("Error on makeGem switch : data");
			break;
		}
    	
    	//Tirage
        int randomValue = r.nextInt(100)+1;
        Debug.debug("n_gem = "+randomValue);
        Gem gem = data.selectObject(randomValue);
        
        //Ajout du prix constant en fonction du grade.
        switch (grade) {
		case 1: gem.setPrice(5);
			break;
		case 2: gem.setPrice(25);
			break;
		case 3: gem.setPrice(50);
			break;
		case 4: gem.setPrice(250);
			break;
		case 5: gem.setPrice(500);
			break;
		case 6: gem.setPrice(2500);
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
        	
        	//ajout au prix (valeur multipliée constante).
        	switch (grade) {
    		case 1: gem.setPrice(gem.getPrice() + cutVal * 1);
    			break;
    		case 2: gem.setPrice(gem.getPrice() + cutVal * 5);
				break;
    		case 3: gem.setPrice(gem.getPrice() + cutVal * 10);
				break;
    		case 4: gem.setPrice(gem.getPrice() + cutVal * 50);
				break;
    		case 5: gem.setPrice(gem.getPrice() + cutVal * 100);
				break;
    		case 6: gem.setPrice(gem.getPrice() + cutVal * 500);
				break;
    		default: Debug.error("Error on makeGem switch : cut");
    			break;
    		}
        }
        else {
        	//La gemme est brute.
        	gem.setCut(TypeCut.RAW);
        }
        
        Debug.debug("");
        return gem;
    }
    
    /**
     * createJewel créer un bijoux
     * @param grade : le grade du bijoux.
     * @return Le bijoux créé.
     */
    public Jewel createJewel(int grade) {
    	Debug.debug("Create jewel of grade "+grade+"...");
    	Jewel jewel = new Jewel();
    	
    	//Ajout du prix constant en fonction du grade
    	switch (grade) {
		case 1: jewel.setPrice(0.5);
			break;
		case 2: jewel.setPrice(2.5);
			break;
		case 3: jewel.setPrice(5);
			break;
		case 4: jewel.setPrice(25);
			break;
		case 5: jewel.setPrice(50);
			break;
		case 6: jewel.setPrice(250);
			break;
		default: Debug.error("Error on createJewel : price");
			break;
		}
    	
    	//Creation du bijoux 
    	jewel.setSize(jeweSize());
    	jewel.setType(jewelType(grade));
    	jewel.setMaterial(jewelMaterial(grade));
    	
    	jewel = jewelWork(jewel, grade);
    	
    	//Calcul du prix du bijoux
    	double price = jewel.getPrice() * jewel.getMaterial().getMultiplier();
    	if(jewel.getGemN() != null) price += jewel.getGemN().getPrice()/2;
    	if(jewel.getGemN_1() != null) price += (jewel.getGemN_1().getX().getPrice() * jewel.getGemN_1().getY())/5;
    	if(jewel.getGemN_2() != null) price += (jewel.getGemN_2().getX().getPrice() * jewel.getGemN_2().getY())/10;
    	
    	//Calcul du modificateur du prix
    	double modificator = 1;
    	modificator += jewel.getWork().getModificator();
    	modificator += jewel.getType().getModificator();
    	modificator += jewel.getSize().getModificator();
    	
    	
    	//FORMULE : (PRIX BIJ * PRIX MAT + PRIX GEM N,N-1,N-2) * (1 + MODIF TAILLE + MODIF WORK + MODIF TYPE)
    	jewel.setPrice(modificator * price);
    	
    	//Affichage de fin de creation car affichage de blanc lors de l'appel de jewelWork.
    	Debug.debug("SUCCEED : Create Jewel");
    	Debug.debug("");
    	return jewel;
    }
    
    /**
     * Créer un type de bijoux
     * @param grade : le grade du bijoux
     * @return Le type du bijoux.
     */
    public TypeJewel jewelType(int grade) {
    	Debug.debug("Create jewel type...");
    	
    	Data<TypeJewel> data = new Data<TypeJewel>();
    	
    	//Chargement des données
    	switch(grade) {
		case 1: data.addAll(GemAndJewelConstant.jewelType1());
			break;
		case 2: data.addAll(GemAndJewelConstant.jewelType2());
			break;
		case 3: data.addAll(GemAndJewelConstant.jewelType3());
			break;
		case 4: data.addAll(GemAndJewelConstant.jewelType4());
			break;
		case 5: data.addAll(GemAndJewelConstant.jewelType5());
			break;
		case 6: data.addAll(GemAndJewelConstant.jewelType6());
			break;
		default: Debug.error("Error on jewelType switch : data");
			break;
		}
    	
    	//Tirage
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_type = "+randomValue);
    	
    	return data.selectObject(randomValue);
    	
    }
    
    /**
     * Créer la taille du bijoux.
     * @return la taille du bijoux.
     */
    public TypeSize jeweSize() {
    	Debug.debug("Create jewel size...");
    	
    	Data<TypeSize> data = new Data<TypeSize>();
    	
    	//Chargement des données
		data.addAll(GemAndJewelConstant.jewelSize());
    	
    	//Tirage
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_size = "+randomValue);
    	
    	return data.selectObject(randomValue);
    }
    
    /**
     * Créer le matériel du bijoux.
     * @param grade : le grade du bijoux.
     * @return le matériel du bijoux.
     */
    public Material jewelMaterial(int grade) {
    	Debug.debug("Create jewel material...");
    	
    	Data<Material> data = new Data<Material>();
    	
    	//Chargement des données
    	switch(grade) {
		case 1: data.addAll(GemAndJewelConstant.jewelMaterial1());
			break;
		case 2: data.addAll(GemAndJewelConstant.jewelMaterial2());
			break;
		case 3: data.addAll(GemAndJewelConstant.jewelMaterial3());
			break;
		case 4: data.addAll(GemAndJewelConstant.jewelMaterial4());
			break;
		case 5: data.addAll(GemAndJewelConstant.jewelMaterial5());
			break;
		case 6: data.addAll(GemAndJewelConstant.jewelMaterial6());
			break;
		default: Debug.error("Error on jewelMaterial switch : data");
			break;
		}
    	
    	//Tirage
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_mat = "+randomValue);
    	
    	return data.selectObject(randomValue);
    }
    
    /**
     * Créer un travail ou des gemmes sur le bijoux.
     * @param jewel : le bijoux à modifier.
     * @param grade : le grade du bijoux.
     * @return le bijoux modifié.
     */
    public Jewel jewelWork(Jewel jewel,int grade) {
    	Debug.debug("Create work on jewel...");
    	
    	//Nombre de tirage.
    	int rethrow = 1;
    	
    	//Tant qu'il reste des tirages.
    	while(rethrow > 0) {
    		rethrow--;
    		
    		//Tirage 
        	int randomValue = r.nextInt(100)+1;
        	Debug.debug("n_work = "+randomValue);
        	
        	//Selection du choix
        	if(randomValue <= 10) {
        		//Le bijoux a un travail normal.
        		jewel.setWork(TypeJewelWork.SIMPLE);
        	}
        	else if(randomValue <= 25) {
        		//Le bijoux a des gravures.
        		jewel.setWork(TypeJewelWork.ENGRAVING);
        	}
        	else if(randomValue <= 40) {
        		//Tirage du dé 8.
        		int d8 = r.nextInt(8)+1;
        		Debug.debug("d8 = "+d8);
        		
        		//Gemme de grade N-2
        		int newGrade = grade-2;
        		if(newGrade <= 0) newGrade = 1; //Impossible d'aller plus bas.
        		
        		Gem gemN_2 = this.createGem(newGrade, r.nextBoolean());
        		jewel.setGemN_2(new Tuple<Gem, Integer>(gemN_2, d8));
        	}
        	else if(randomValue <= 60) {
        		//Tirage du dé 4.
        		int d4 = r.nextInt(4)+1;
        		Debug.debug("d4 = "+d4);
        		
        		//Gemme de grade N-1
        		int newGrade = grade-1;
        		if(newGrade <= 0) newGrade = 1;//Impossible d'aller plus bas.
        		
        		Gem gemN_1 = this.createGem(newGrade, r.nextBoolean());
        		jewel.setGemN_1(new Tuple<Gem, Integer>(gemN_1, d4));
        	}
        	else if(randomValue <= 90) {
        		//Gemme de rang N.
        		Gem gemN = this.createGem(grade, r.nextBoolean());
        		jewel.setGemN(gemN);
        	}
        	else if(randomValue <= 100) {
        		//On gagne 2 tirages supplémentaires.
        		Debug.debug("re-throw");
        		rethrow += 2;
        	}
    	}
    	
    	return jewel;
    	
    }
}
