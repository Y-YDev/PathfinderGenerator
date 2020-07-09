package item.staff;

import java.util.Random;
import constant.StaffConstant;
import utility.Data;
import utility.Debug;

/**
 * StaffBuilder permet de créer des bâtons magiques.
 * @author Mentra20
 *
 */
public class StaffBuilder {
	Random r; //Le random pour les tirages.
	
	/* CONSTRUCTOR */
    public StaffBuilder(){
        this.r = new Random();
    }
    
    /**
     * createStaff permet de créer un bâtons selon la rareté
     * @param rarity : la rareté du bâtons.
     * @return le bâtons créé
     */
    public Staff createStaff(int rarity) {
    	Debug.debug("Creation magic staff of rarity "+rarity+"...");
    	
    	Data<Staff> data = new Data<Staff>();
    	
    	//Chargement des données selon la rareté.
    	switch (rarity) {
		case 3: data.addAll(StaffConstant.rarity3());
			break;
		case 4: data.addAll(StaffConstant.rarity4());
			break;
		case 5: data.addAll(StaffConstant.rarity5());
			break;
		case 6: data.addAll(StaffConstant.rarity6());
			break;
		default: Debug.error("Error createStaff: switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_choice = "+randomValue);
    	Staff staff = data.selectObject(randomValue);
    	
    	//On determine si la baguette a un indice
    	int randomValue2 = r.nextInt(100)+1;
    	Debug.debug("n_spe = "+randomValue2);
    	
    	if(randomValue2 <= 30) staff.setParticularPropertie(true);
    	else staff.setParticularPropertie(false); 
    	
    	Debug.debug("");
    	return staff;
    }
}
