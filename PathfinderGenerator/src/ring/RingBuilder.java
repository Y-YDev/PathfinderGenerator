package ring;

import java.util.Random;
import constant.RingConstant;
import smartItem.SmartItemBuilder;
import utility.Data;
import utility.Debug;

/**
 * RingBuilder permet de créer des anneaux magiques.
 * @author Mentra20
 *
 */
public class RingBuilder {
	Random r; //Le random pour les tirages.
	SmartItemBuilder smartItemBuilder;//Pour creer un objet intelligent
	
	/* CONSTRUCTOR */
    public RingBuilder(){
        this.r = new Random();
        this.smartItemBuilder = new SmartItemBuilder();
    }
    
    /**
     * createRing permet de créer un anneau selon la rareté
     * @param rarity : la rareté de l'anneau.
     * @return l'anneau créé
     */
    public Ring createRing(int rarity) {
    	Debug.debug("Creation magic ring of rarity "+rarity+"...");
    	
    	Data<Ring> data = new Data<Ring>();
    	
    	//Chargement des données selon la rareté.
    	switch (rarity) {
		case 1: data.addAll(RingConstant.rarity1());
			break;
		case 2: data.addAll(RingConstant.rarity2());
			break;
		case 3: data.addAll(RingConstant.rarity3());
			break;
		case 4: data.addAll(RingConstant.rarity4());
			break;
		case 5: data.addAll(RingConstant.rarity5());
			break;
		case 6: data.addAll(RingConstant.rarity6());
			break;
		default: Debug.error("Error createRing: switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_choice = "+randomValue);
    	Ring ring = data.selectObject(randomValue);
    	
    	int randomValue2 = r.nextInt(100)+1;
    	if(randomValue2 == 1) {
    		ring.setSmartItem(smartItemBuilder.createSmartItem(ring.getPrice()));
    		ring.setPrice(ring.getPrice() + ring.getSmartItem().getPrice());
    	}
    	else if(randomValue2 <= 31) ring.setParticularPropertie(true);
    	
    	Debug.debug("");
    	return ring;
    }
}
