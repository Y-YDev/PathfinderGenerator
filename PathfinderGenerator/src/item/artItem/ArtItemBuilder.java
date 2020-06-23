package item.artItem;

import java.util.Random;

import constant.ArtItemConstant;
import utility.Data;
import utility.Debug;

/**
 * ArtItemBuilder permet de créer des objets d'arts.
 * @author Mentra20
 *
 */
public class ArtItemBuilder {
	Random r; //Le random pour les tirages.
	
	/* CONSTRUCTOR */
    public ArtItemBuilder(){
        this.r = new Random();
    }
    
    /**
     * createArtItem permet de créer un objet d'art selon la rareté
     * @param rarity : la rareté de l'objet d'art.
     * @return l'objet d'art créé
     */
    public ArtItem createArtItem(int rarity) {
    	Debug.debug("Creation Art item of rarity "+rarity+"...");
    	
    	Data<ArtItem> data = new Data<ArtItem>();
    	
    	//Chargement des données selon la rareté.
    	switch (rarity) {
    	case 1: data.addAll(ArtItemConstant.rarity1());
			break;
    	case 2: data.addAll(ArtItemConstant.rarity2());
			break;
		case 3: data.addAll(ArtItemConstant.rarity3());
			break;
		case 4: data.addAll(ArtItemConstant.rarity4());
			break;
		case 5: data.addAll(ArtItemConstant.rarity5());
			break;
		case 6: data.addAll(ArtItemConstant.rarity6());
			break;
		default: Debug.error("Error createArtItem: switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_choice = "+randomValue);
    	ArtItem artItem = data.selectObject(randomValue);
    	
    	Debug.debug("");
    	return artItem;
    }
}