package wonderfulObject;

import java.util.Random;

import constant.WonderfulObjectConstant;
import smartItem.SmartItemBuilder;
import utility.Data;
import utility.Debug;

/**
 * Permet de créer un objet merveilleux.
 * @author Mentra20
 *
 */
public class WonderfulObjectBuilder {
	Random r; //Le random pour les tirages.
	SmartItemBuilder smartItemBuilder;//Pour faire l'objet intelligent
	
	public WonderfulObjectBuilder() {
		this.r = new Random();
		this.smartItemBuilder = new SmartItemBuilder();
	}
	
	/**
	 * creer un objet merveilleux selon la rareté
	 * @param rarity : la rareté
	 * @return l'objet merveilleux
	 */
	public WonderfulObject createWonderfulObject(int rarity) {
		Debug.debug("Creation of wonderful object of rarity "+rarity+"...");
    	
    	Data<Type> data = new Data<Type>();
    	data.addAll(WonderfulObjectConstant.location());
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_type = "+randomValue);
    	Type type = data.selectObject(randomValue);
        	
    	WonderfulObject wonderfulObject = null;
    	
    	switch (type) {
		case WAIST:
			wonderfulObject = createWaist(rarity);
			break;
		case BODY:
			wonderfulObject = createBody(rarity);
			break;
		case TORSO:
			wonderfulObject = createTorso(rarity);
			break;
		case EYES:
			wonderfulObject = createEyes(rarity);
			break;
		case FEET:
			wonderfulObject = createFeet(rarity);
			break;
		case HANDS:
			wonderfulObject = createHands(rarity);
			break;
		case HEAD:
			wonderfulObject = createHead(rarity);
			break;
		case FOREHEAD:
			wonderfulObject = createForehead(rarity);
			break;
		case NECK:
			wonderfulObject = createNeck(rarity);
			break;
		case SHOULDERS:
			wonderfulObject = createShoulder(rarity);
			break;
		case WRIST:
			wonderfulObject = createWrist(rarity);
			break;
		case WITHOUT_LOCATION:
			wonderfulObject = createWithoutLocation(rarity);
			break;
		default: Debug.error("Error createWonderfulObject: switch");
			break;
		}
    	
    	int randomValue2 = r.nextInt(100)+1;
    	if(randomValue2 == 1) {
    		wonderfulObject.setSmartItem(smartItemBuilder.createSmartItem(wonderfulObject.getPrice()));
    		wonderfulObject.setPrice(wonderfulObject.getPrice() + wonderfulObject.getSmartItem().getPrice());
    	}
    	else if(randomValue2 <= 31) wonderfulObject.setParticularPropertie(true);
    	
    	return wonderfulObject;
	}
	
	/**
	 * créer un objet merveilleux porté à la taille
	 * @param rarity : la rareté de l'objet
	 * @return l'objet porté 
	 */
	public WonderfulObject createWaist(int rarity) {
		Debug.debug("Creation of wonderfull object (waist) of rarity "+rarity+"...");
		
		Data<WonderfulObject> data = new Data<WonderfulObject>();
    	
    	//Chargement des données selon la rareté.
    	switch (rarity) {
    	case 1: data.addAll(WonderfulObjectConstant.waist1());
			break;
    	case 2: data.addAll(WonderfulObjectConstant.waist2());
			break;
		case 3: data.addAll(WonderfulObjectConstant.waist3());
			break;
		case 4: data.addAll(WonderfulObjectConstant.waist4());
			break;
		case 5: data.addAll(WonderfulObjectConstant.waist5());
			break;
		case 6: data.addAll(WonderfulObjectConstant.waist6());
			break;
		default: Debug.error("Error createWaist: switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_choice = "+randomValue);
    	WonderfulObject wonderfulObject = data.selectObject(randomValue);
    	
    	Debug.debug("");
    	return wonderfulObject;
	}
	
	/**
	 * créer un objet merveilleux porté au corps
	 * @param rarity : la rareté de l'objet
	 * @return l'objet porté 
	 */
	public WonderfulObject createBody(int rarity) {
		Debug.debug("Creation of wonderfull object (body) of rarity "+rarity+"...");
		
		Data<WonderfulObject> data = new Data<WonderfulObject>();
    	
    	//Chargement des données selon la rareté.
    	switch (rarity) {
    	case 1: data.addAll(WonderfulObjectConstant.body1());
			break;
    	case 2: data.addAll(WonderfulObjectConstant.body2());
			break;
		case 3: data.addAll(WonderfulObjectConstant.body3());
			break;
		case 4: data.addAll(WonderfulObjectConstant.body4());
			break;
		case 5: data.addAll(WonderfulObjectConstant.body5());
			break;
		case 6: data.addAll(WonderfulObjectConstant.body6());
			break;
		default: Debug.error("Error createBody: switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_choice = "+randomValue);
    	WonderfulObject wonderfulObject = data.selectObject(randomValue);
    	
    	Debug.debug("");
    	return wonderfulObject;
	}
	
	/**
	 * créer un objet merveilleux porté au corps
	 * @param rarity : la rareté de l'objet
	 * @return l'objet porté 
	 */
	public WonderfulObject createTorso(int rarity) {
		Debug.debug("Creation of wonderfull object (torso) of rarity "+rarity+"...");
		
		Data<WonderfulObject> data = new Data<WonderfulObject>();
    	
    	//Chargement des données selon la rareté.
    	switch (rarity) {
    	case 1: data.addAll(WonderfulObjectConstant.torso1());
			break;
    	case 2: data.addAll(WonderfulObjectConstant.torso2());
			break;
		case 3: data.addAll(WonderfulObjectConstant.torso3());
			break;
		case 4: data.addAll(WonderfulObjectConstant.torso4());
			break;
		case 5: data.addAll(WonderfulObjectConstant.torso5());
			break;
		case 6: data.addAll(WonderfulObjectConstant.torso6());
			break;
		default: Debug.error("Error createTorso: switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_choice = "+randomValue);
    	WonderfulObject wonderfulObject = data.selectObject(randomValue);
    	
    	Debug.debug("");
    	return wonderfulObject;
	}
	
	/**
	 * créer un objet merveilleux porté aux yeux
	 * @param rarity : la rareté de l'objet
	 * @return l'objet porté 
	 */
	public WonderfulObject createEyes(int rarity) {
		Debug.debug("Creation of wonderfull object (eyes) of rarity "+rarity+"...");
		
		Data<WonderfulObject> data = new Data<WonderfulObject>();
    	
    	//Chargement des données selon la rareté.
    	switch (rarity) {
    	case 1: data.addAll(WonderfulObjectConstant.eyes1());
			break;
    	case 2: data.addAll(WonderfulObjectConstant.eyes2());
			break;
		case 3: data.addAll(WonderfulObjectConstant.eyes3());
			break;
		case 4: data.addAll(WonderfulObjectConstant.eyes4());
			break;
		case 5: data.addAll(WonderfulObjectConstant.eyes5());
			break;
		case 6: data.addAll(WonderfulObjectConstant.eyes6());
			break;
		default: Debug.error("Error createEyes: switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_choice = "+randomValue);
    	WonderfulObject wonderfulObject = data.selectObject(randomValue);
    	
    	Debug.debug("");
    	return wonderfulObject;
	}
	
	/**
	 * créer un objet merveilleux porté aux pieds
	 * @param rarity : la rareté de l'objet
	 * @return l'objet porté 
	 */
	public WonderfulObject createFeet(int rarity) {
		Debug.debug("Creation of wonderfull object (feet) of rarity "+rarity+"...");
		
		Data<WonderfulObject> data = new Data<WonderfulObject>();
    	
    	//Chargement des données selon la rareté.
    	switch (rarity) {
    	case 1: data.addAll(WonderfulObjectConstant.feet1());
			break;
    	case 2: data.addAll(WonderfulObjectConstant.feet2());
			break;
		case 3: data.addAll(WonderfulObjectConstant.feet3());
			break;
		case 4: data.addAll(WonderfulObjectConstant.feet4());
			break;
		case 5: data.addAll(WonderfulObjectConstant.feet5());
			break;
		case 6: data.addAll(WonderfulObjectConstant.feet6());
			break;
		default: Debug.error("Error createFeet: switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_choice = "+randomValue);
    	WonderfulObject wonderfulObject = data.selectObject(randomValue);
    	
    	Debug.debug("");
    	return wonderfulObject;
	}
	
	/**
	 * créer un objet merveilleux porté aux mains
	 * @param rarity : la rareté de l'objet
	 * @return l'objet porté 
	 */
	public WonderfulObject createHands(int rarity) {
		Debug.debug("Creation of wonderfull object (hands) of rarity "+rarity+"...");
		
		Data<WonderfulObject> data = new Data<WonderfulObject>();
    	
    	//Chargement des données selon la rareté.
    	switch (rarity) {
    	case 1: data.addAll(WonderfulObjectConstant.hands1());
			break;
    	case 2: data.addAll(WonderfulObjectConstant.hands2());
			break;
		case 3: data.addAll(WonderfulObjectConstant.hands3());
			break;
		case 4: data.addAll(WonderfulObjectConstant.hands4());
			break;
		case 5: data.addAll(WonderfulObjectConstant.hands5());
			break;
		case 6: data.addAll(WonderfulObjectConstant.hands6());
			break;
		default: Debug.error("Error createHands: switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_choice = "+randomValue);
    	WonderfulObject wonderfulObject = data.selectObject(randomValue);
    	
    	Debug.debug("");
    	return wonderfulObject;
	}
	
	/**
	 * créer un objet merveilleux porté à la tête
	 * @param rarity : la rareté de l'objet
	 * @return l'objet porté 
	 */
	public WonderfulObject createHead(int rarity) {
		Debug.debug("Creation of wonderfull object (head) of rarity "+rarity+"...");
		
		Data<WonderfulObject> data = new Data<WonderfulObject>();
    	
    	//Chargement des données selon la rareté.
    	switch (rarity) {
    	case 1: data.addAll(WonderfulObjectConstant.head1());
			break;
    	case 2: data.addAll(WonderfulObjectConstant.head2());
			break;
		case 3: data.addAll(WonderfulObjectConstant.head3());
			break;
		case 4: data.addAll(WonderfulObjectConstant.head4());
			break;
		case 5: data.addAll(WonderfulObjectConstant.head5());
			break;
		case 6: data.addAll(WonderfulObjectConstant.head6());
			break;
		default: Debug.error("Error createHead: switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_choice = "+randomValue);
    	WonderfulObject wonderfulObject = data.selectObject(randomValue);
    	
    	Debug.debug("");
    	return wonderfulObject;
	}
	
	/**
	 * créer un objet merveilleux porté au front
	 * @param rarity : la rareté de l'objet
	 * @return l'objet porté 
	 */
	public WonderfulObject createForehead(int rarity) {
		Debug.debug("Creation of wonderfull object (forehead) of rarity "+rarity+"...");
		
		Data<WonderfulObject> data = new Data<WonderfulObject>();
    	
    	//Chargement des données selon la rareté.
    	switch (rarity) {
    	case 1: data.addAll(WonderfulObjectConstant.forehead1());
			break;
    	case 2: data.addAll(WonderfulObjectConstant.forehead2());
			break;
		case 3: data.addAll(WonderfulObjectConstant.forehead3());
			break;
		case 4: data.addAll(WonderfulObjectConstant.forehead4());
			break;
		case 5: data.addAll(WonderfulObjectConstant.forehead5());
			break;
		case 6: data.addAll(WonderfulObjectConstant.forehead6());
			break;
		default: Debug.error("Error createForehead: switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_choice = "+randomValue);
    	WonderfulObject wonderfulObject = data.selectObject(randomValue);
    	
    	Debug.debug("");
    	return wonderfulObject;
	}
	
	/**
	 * créer un objet merveilleux porté au cou
	 * @param rarity : la rareté de l'objet
	 * @return l'objet porté
	 */
	public WonderfulObject createNeck(int rarity) {
		Debug.debug("Creation of wonderfull object (neck) of rarity "+rarity+"...");
		
		Data<WonderfulObject> data = new Data<WonderfulObject>();
    	
    	//Chargement des données selon la rareté.
    	switch (rarity) {
    	case 1: data.addAll(WonderfulObjectConstant.neck1());
			break;
    	case 2: data.addAll(WonderfulObjectConstant.neck2());
			break;
		case 3: data.addAll(WonderfulObjectConstant.neck3());
			break;
		case 4: data.addAll(WonderfulObjectConstant.neck4());
			break;
		case 5: data.addAll(WonderfulObjectConstant.neck5());
			break;
		case 6: data.addAll(WonderfulObjectConstant.neck6());
			break;
		default: Debug.error("Error createNeck: switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_choice = "+randomValue);
    	WonderfulObject wonderfulObject = data.selectObject(randomValue);
    	
    	Debug.debug("");
    	return wonderfulObject;
	}
	
	/**
	 * créer un objet merveilleux porté aux épaules
	 * @param rarity : la rareté de l'objet
	 * @return l'objet porté 
	 */
	public WonderfulObject createShoulder(int rarity) {
		Debug.debug("Creation of wonderfull object (shoulder) of rarity "+rarity+"...");
		
		Data<WonderfulObject> data = new Data<WonderfulObject>();
    	
    	//Chargement des données selon la rareté.
    	switch (rarity) {
    	case 1: data.addAll(WonderfulObjectConstant.shoulder1());
			break;
    	case 2: data.addAll(WonderfulObjectConstant.shoulder2());
			break;
		case 3: data.addAll(WonderfulObjectConstant.shoulder3());
			break;
		case 4: data.addAll(WonderfulObjectConstant.shoulder4());
			break;
		case 5: data.addAll(WonderfulObjectConstant.shoulder5());
			break;
		case 6: data.addAll(WonderfulObjectConstant.shoulder6());
			break;
		default: Debug.error("Error createShoulder: switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_choice = "+randomValue);
    	WonderfulObject wonderfulObject = data.selectObject(randomValue);
    	
    	Debug.debug("");
    	return wonderfulObject;
	}
	
	/**
	 * créer un objet merveilleux porté aux poignets
	 * @param rarity : la rareté de l'objet
	 * @return l'objet porté 
	 */
	public WonderfulObject createWrist(int rarity) {
		Debug.debug("Creation of wonderfull object (wrist) of rarity "+rarity+"...");
		
		Data<WonderfulObject> data = new Data<WonderfulObject>();
    	
    	//Chargement des données selon la rareté.
    	switch (rarity) {
    	case 1: data.addAll(WonderfulObjectConstant.wrist1());
			break;
    	case 2: data.addAll(WonderfulObjectConstant.wrist2());
			break;
		case 3: data.addAll(WonderfulObjectConstant.wrist3());
			break;
		case 4: data.addAll(WonderfulObjectConstant.wrist4());
			break;
		case 5: data.addAll(WonderfulObjectConstant.wrist5());
			break;
		case 6: data.addAll(WonderfulObjectConstant.wrist6());
			break;
		default: Debug.error("Error createWrist: switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_choice = "+randomValue);
    	WonderfulObject wonderfulObject = data.selectObject(randomValue);
    	
    	Debug.debug("");
    	return wonderfulObject;
	}
	
	/**
	 * créer un objet merveilleux sans emplacement.
	 * @param rarity : la rareté de l'objet
	 * @return l'objet porté 
	 */
	public WonderfulObject createWithoutLocation(int rarity) {
		Debug.debug("Creation of wonderfull object (without location) of rarity "+rarity+"...");
		
		Data<WonderfulObject> data = new Data<WonderfulObject>();
    	
    	//Chargement des données selon la rareté.
    	switch (rarity) {
    	case 0 : data.addAll(WonderfulObjectConstant.withoutLocation0());//ATTENTION RARETE 0.
    		break;
    	case 1: data.addAll(WonderfulObjectConstant.withoutLocation1());
			break;
    	case 2: data.addAll(WonderfulObjectConstant.withoutLocation2());
			break;
		case 3: data.addAll(WonderfulObjectConstant.withoutLocation3());
			break;
		case 4: data.addAll(WonderfulObjectConstant.withoutLocation4());
			break;
		case 5: data.addAll(WonderfulObjectConstant.withoutLocation5());
			break;
		case 6: data.addAll(WonderfulObjectConstant.withoutLocation6());
			break;
		default: Debug.error("Error createWithoutLocation switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_choice = "+randomValue);
    	WonderfulObject wonderfulObject = data.selectObject(randomValue);
    	
    	if(wonderfulObject.getName().equals("RARITY0")) {
    		return createWithoutLocation(0);//On creer l'objet de rareté 0.
    	}
    	
    	Debug.debug("");
    	return wonderfulObject;
	}
}
