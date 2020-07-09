package generator;

import java.util.ArrayList;
import java.util.Random;

import item.Item;
import item.TypeItem;
import item.armor.ArmorBuilder;
import item.artItem.ArtItemBuilder;
import item.coin.Coin;
import item.coin.Type;
import item.gemAndJewel.Gem;
import item.gemAndJewel.GemAndJewelBuilder;
import item.gemAndJewel.Jewel;
import item.parchment.ParchmentBuilder;
import item.potion.PotionBuilder;
import item.ring.RingBuilder;
import item.scepter.ScepterBuilder;
import item.staff.StaffBuilder;
import item.wand.WandBuilder;
import item.weapon.WeaponBuilder;
import item.wonderfulObject.WonderfulObjectBuilder;
import utility.Debug;
import utility.Tuple;

public class TreasureBuilder {
	private Random r;
	
	public TreasureBuilder() {
		r = new Random();
	}

	/**
	 * Créer une récompense en fonction d'un type de monstre (avec des trésors additionnels)
	 * @param monsterType : le type du monstre
	 * @param bonusType : true si le monstre à des trésors additionnels
	 * @param probabilityTypes : la probabilité à affecter aux trésors
	 * @param money : l'argent pour le trésor.
	 * @return le trésor créer
	 */
	public ArrayList<Item> createRandomRewardWithMonster(MonsterType monsterType,Boolean bonusType,ProbabilityType probabilityTypes, double money){
		ArrayList<Tuple<TreasureType, ProbabilityType>> probabilityList = new ArrayList<Tuple<TreasureType,ProbabilityType>>();
		ArrayList<Treasure> treasureList = new ArrayList<Treasure>();
		
		Debug.debug("Create reward for monster "+monsterType+"...");
		
		switch (monsterType) {
		case Aberration:
			treasureList.add(new Treasure(TreasureType.A));
			treasureList.add(new Treasure(TreasureType.B));
			treasureList.add(new Treasure(TreasureType.D));
			treasureList.add(new Treasure(TreasureType.E));
			
			if(bonusType) {
				treasureList.add(new Treasure(TreasureType.F));
				treasureList.add(new Treasure(TreasureType.G));
				treasureList.add(new Treasure(TreasureType.H));
			}
			break;
			
		case Animal :
			treasureList.add(new Treasure(TreasureType.A));
			treasureList.add(new Treasure(TreasureType.B));
			treasureList.add(new Treasure(TreasureType.D));
			treasureList.add(new Treasure(TreasureType.E));
			break;
			
		case Artificial_creature:
			treasureList.add(new Treasure(TreasureType.E));
			treasureList.add(new Treasure(TreasureType.F));
			
			if(bonusType) {
				treasureList.add(new Treasure(TreasureType.B));
				treasureList.add(new Treasure(TreasureType.C));
				treasureList.add(new Treasure(TreasureType.H));
			}
			break;
			
		case Magic_creature:
			treasureList.add(new Treasure(TreasureType.A));
			treasureList.add(new Treasure(TreasureType.B));
			treasureList.add(new Treasure(TreasureType.D));
			treasureList.add(new Treasure(TreasureType.E));
			break;
			
		case Dragon:
			treasureList.add(new Treasure(TreasureType.A));
			treasureList.add(new Treasure(TreasureType.B));
			treasureList.add(new Treasure(TreasureType.C));
			treasureList.add(new Treasure(TreasureType.H));
			treasureList.add(new Treasure(TreasureType.I));

			break;
			
		case Exterior:
			treasureList.add(new Treasure(TreasureType.A));
			treasureList.add(new Treasure(TreasureType.B));
			treasureList.add(new Treasure(TreasureType.C));
			treasureList.add(new Treasure(TreasureType.D));
			treasureList.add(new Treasure(TreasureType.E));
			treasureList.add(new Treasure(TreasureType.F));
			treasureList.add(new Treasure(TreasureType.G));
			treasureList.add(new Treasure(TreasureType.H));
			treasureList.add(new Treasure(TreasureType.I));

			break;
			
		case Fairy:
			treasureList.add(new Treasure(TreasureType.B));
			treasureList.add(new Treasure(TreasureType.C));
			treasureList.add(new Treasure(TreasureType.D));
			treasureList.add(new Treasure(TreasureType.G));

			break;
			
		case Humanoid:
			treasureList.add(new Treasure(TreasureType.A));
			treasureList.add(new Treasure(TreasureType.B));
			treasureList.add(new Treasure(TreasureType.D));
			treasureList.add(new Treasure(TreasureType.E));
			treasureList.add(new Treasure(TreasureType.F));
			treasureList.add(new Treasure(TreasureType.G));
			
			if(bonusType) treasureList.add(new Treasure(TreasureType.H));

			break;
			
		case Monstrous_umanoid:
			treasureList.add(new Treasure(TreasureType.A));
			treasureList.add(new Treasure(TreasureType.B));
			treasureList.add(new Treasure(TreasureType.C));
			treasureList.add(new Treasure(TreasureType.D));
			treasureList.add(new Treasure(TreasureType.E));
			treasureList.add(new Treasure(TreasureType.H));
			
			break;
			
		case Undead:
			treasureList.add(new Treasure(TreasureType.A));
			treasureList.add(new Treasure(TreasureType.B));
			treasureList.add(new Treasure(TreasureType.D));
			treasureList.add(new Treasure(TreasureType.E));
			
			if(bonusType) {
				treasureList.add(new Treasure(TreasureType.F));
				treasureList.add(new Treasure(TreasureType.G));
			}
			break;
			
		case Plant:
			treasureList.add(new Treasure(TreasureType.A));
			treasureList.add(new Treasure(TreasureType.B));
			treasureList.add(new Treasure(TreasureType.D));
			treasureList.add(new Treasure(TreasureType.E));

			break;
			
		case Vase:
			treasureList.add(new Treasure(TreasureType.A));
			treasureList.add(new Treasure(TreasureType.B));
			treasureList.add(new Treasure(TreasureType.D));

			break;
			
		case Vermine:
			treasureList.add(new Treasure(TreasureType.A));
			treasureList.add(new Treasure(TreasureType.B));
			treasureList.add(new Treasure(TreasureType.D));

			break;
			
		default:
			Debug.error("No such Monster Type.");
			break;
		}
		
		//On ajoute la probabilités aux trésors.
		for(Treasure treasure : treasureList) {
			probabilityList.add(new Tuple<TreasureType, ProbabilityType>(treasure.getType(), probabilityTypes));
		}
		
		//On créer et renvoie le trésor.
		return createRandomReward(treasureList, probabilityList, money);
	}
	
	/**
	 * Permet de créer des récompense selon un trésor et un montant d'argent.
	 * @param treasure : le trésor
	 * @param money : le montant donné
	 * @return la liste d'objet obtenu avec l'argent.
	 */
	public ArrayList<Item> createRandomReward(Treasure treasure, double money){
		ArrayList<Treasure> treasureList = new ArrayList<Treasure>();
		treasureList.add(treasure);//La liste n'aura qu'un élément
		return createRandomReward(treasureList, money);
	}
	
	/**
	 * Permet de créer des récompense selon un trésor et un montant d'argent.
	 * @param treasure : le trésor
	 * @param money : le montant donné
	 * @return la liste d'objet obtenu avec l'argent.
	 */
	public ArrayList<Item> createRandomReward(Treasure treasure, ProbabilityType probabilityTypes, double money){
		
		ArrayList<Treasure> treasureList = new ArrayList<Treasure>();
		treasureList.add(treasure);//La liste n'aura qu'un élément
		
		ArrayList<Tuple<TreasureType, ProbabilityType>> probabilityList = new ArrayList<Tuple<TreasureType, ProbabilityType>>();
		probabilityList.add(new Tuple<TreasureType, ProbabilityType>(treasure.getType(), probabilityTypes));//La liste n'aura qu'un élément
		
		return createRandomReward(treasureList,probabilityList, money);
	}
	
	/**
	 * Permet de créer des récompense selon une liste de trésor et un montant d'argent.
	 * @param treasures : la liste de trésor
	 * @param money : le montant donné
	 * @return la liste d'objet obtenu avec l'argent.
	 */
	public ArrayList<Item> createRandomReward(ArrayList<Treasure> treasures, double money){
		return createRandomReward(treasures, null, money);
	}
	
	
	/**
	 * Permet de créer des récompense selon une liste de trésor, de probabilité et un montant d'argent.
	 * @param treasures : la liste de trésor
	 * @param probabilityTypes : la liste des types de probabilités
	 * @param money : le montant donné
	 * @return la liste d'objet obtenu avec l'argent.
	 */
	public ArrayList<Item> createRandomReward(ArrayList<Treasure> treasures, ArrayList<Tuple<TreasureType, ProbabilityType>> probabilityTypes, double money){
		Debug.debug("------------------ create reward for money : "+money);
		
		//On initialise les trésors.
		initTreasureList(treasures, probabilityTypes);
		
		ArrayList<Item> reward = new ArrayList<Item>();
		int index;
		double startMoney = money;//L'argent de départ
		
		//Tant qu'on a de l'argent ou qu'on peut acheter (on s'arrete quans on atteind 2% du prix de base)
		while(treasures.size() > 0 && money > (startMoney * 0.02)) {
			index = r.nextInt(treasures.size());
			Treasure treasure = treasures.get(index);//On tire un trésor au hasard
			
			if(treasure.canBeChooseLevel(money)) {//Si le moins cher du tresor est inferieur à l'argent courant.
				//On retire les paliers trop cher
				treasure.removeTooExpensiveLevel(money);
				Debug.debug("");
				Level level = treasure.getRandomLevel();
				Debug.debug("");
				//On obtient les récompense
				reward.addAll(getReward(level));
				money -= level.getPrice();//On retire le prix du palier à l'argent courant.
				
				Debug.debug("------------------------- money is now "+money);
				Debug.debug("");
			}
			else {
				//Sinon on le retire
				Debug.debug("Removing expensive treasure of type : "+treasure.getType());
				treasures.remove(treasure);
			}
		}
		//On regroupe les pièces du même type pour plus de lisibilité.
		reward = gatherCoin(reward);
		
		return reward;
	}
	
	
	/**
	 * Convertit et calcule le gain du drop de pièces .
	 * @param dice : les dés sous forme de chaines de caractères.
	 * @return le resultat des dés sous forme de Coin.
	 */
	public Coin convertCoin(String dice) {
		Debug.debug("Convert coin of dice : "+ dice);
		
		int i = 0;
		String nbDice = "";		
		String typeDice = "";		
		String multiplicator = "";		
		item.coin.Type typeCoin;
		
		while(dice.charAt(i) != 'd') {//On lit le chiffre Cd_x_-_....
			nbDice += dice.charAt(i);
			i++;
		}
		i++;
		
		while(dice.charAt(i) != 'x' && dice.charAt(i) != '-') {//On lit le chiffre _dCx_-_....
			typeDice += dice.charAt(i);
			i++;
		}
		
		if(dice.charAt(i) == 'x') {//On lit le chiffre _d_xC-_.... si il existe
			i++;
			while(dice.charAt(i) != '-') {
				multiplicator += dice.charAt(i);
				i++;
			}
		}
		i++;
		
		switch (dice.charAt(i)) {//On lit le chiffre _d_x_-C....
		case 'C':
			typeCoin = Type.COPPER;
			break;
		case 'S':
			typeCoin = Type.SILVER;
			break;
		case 'G':
			typeCoin = Type.GOLD;
			break;
		case 'P':
			typeCoin = Type.PLATINIUM;
			break;
		default:
			typeCoin = Type.NONE;
			break;
		}
	
		//On calcule maintenant
		double res = 0;
		for(int j = 0; j < Integer.parseInt(nbDice);j++) {
			res += r.nextInt(Integer.parseInt(typeDice))+1;
		}
		
		if(multiplicator != "") {
			res *= Integer.parseInt(multiplicator);
		}
		Debug.debug("the result of coin is : "+res+" "+typeCoin);
		Debug.debug("");
		//On convertir le resultat en Coin.
		return new Coin(typeCoin, res);
	}
	
	/**
	 * Convertit un code en un item généré (selon le code)
	 * @param code : le code de génération
	 * @return l'item généré
	 */
	public Item convertToItem(String code) {
		//Tout code autre que les pièces fait 4 caractères.
		if(code.length() > 4) {
			return convertCoin(code);
		}
		//On recupere la rareté.
		int rarity = Character.getNumericValue(code.charAt(3)); 
			
		if(code.subSequence(0, 3).equals("GEM")) {//On doit créer un gemme
			GemAndJewelBuilder gemAndJewelBuilder = new GemAndJewelBuilder();
			Tuple<Gem, Jewel> tuple = gemAndJewelBuilder.createGemOrJewel(rarity);
				
			if(tuple.getX() != null) return tuple.getX();//C'est une gemme
			else return tuple.getY();//C'est un bijoux
		}
		else if(code.subSequence(0, 3).equals("ART")) {//On doit creer un objet d'art.
			ArtItemBuilder artItemBuilder = new ArtItemBuilder();
			return artItemBuilder.createArtItem(rarity);
		}
		else if(code.subSequence(0, 3).equals("PAR")) {//On doit creer un parchemin.
			ParchmentBuilder parchmentBuilder = new ParchmentBuilder();
			return parchmentBuilder.createParchment(rarity);
		}
		else if(code.subSequence(0, 3).equals("POT")) {//On doit creer une potion.
			PotionBuilder potionBuilder = new PotionBuilder();
			return potionBuilder.createPotion(rarity);
		}
		else if(code.subSequence(0, 3).equals("WAN")) {//On doit creer une baguette.
			WandBuilder wandBuilder = new WandBuilder();
			return wandBuilder.createWand(rarity);
		}
		else if(code.subSequence(0, 3).equals("LIG")) {//On doit creer une armure legere ou bouclier.
			ArmorBuilder armorBuilder = new ArmorBuilder();
			return armorBuilder.createLightOrShield();
		}
		else if(code.subSequence(0, 3).equals("INT")) {//On doit creer une armure intermediaire.
			ArmorBuilder armorBuilder = new ArmorBuilder();
			return armorBuilder.createIntermediate();
		}
		else if(code.subSequence(0, 3).equals("HEA")) {//On doit creer une armure lourde.
			ArmorBuilder armorBuilder = new ArmorBuilder();
			return armorBuilder.createHeavy();
		}
		else if(code.subSequence(0, 3).equals("MWE")) {//On doit creer une arme de maitre.
			WeaponBuilder weaponBuilder = new WeaponBuilder();
			return weaponBuilder.createMasterWeapon();
		}
		else if(code.subSequence(0, 3).equals("WEA")) {//On doit creer une arme.
			WeaponBuilder weaponBuilder = new WeaponBuilder();
			return weaponBuilder.createWeapon(rarity);
		}
		else if(code.subSequence(0, 3).equals("ARM")) {//On doit creer une armure.
			ArmorBuilder armorBuilder = new ArmorBuilder();
			return armorBuilder.createArmor(rarity);
		}
		else if(code.subSequence(0, 3).equals("WON")) {//On doit creer un objet merveilleux.
			WonderfulObjectBuilder wonderfulObjectBuilder = new WonderfulObjectBuilder();
			return wonderfulObjectBuilder.createWonderfulObject(rarity);
		}
		else if(code.subSequence(0, 3).equals("RIN")) {//On doit creer un anneau.
			RingBuilder ringBuilder = new RingBuilder();
			return ringBuilder.createRing(rarity);
		}
		else if(code.subSequence(0, 3).equals("SCE")) {//On doit creer un sceptre.
			ScepterBuilder scepterBuilder = new ScepterBuilder();
			return scepterBuilder.createScepter(rarity);
		}
		else if(code.subSequence(0, 3).equals("STA")) {//On doit creer un baton magique.
			StaffBuilder staffBuilder = new StaffBuilder();
			return staffBuilder.createStaff(rarity);
		}
		
		Debug.error("No Such Type of Item exist");
		return null;
	}

	/**
	 * Permet de renvoyer la récompense du palier
	 * @param level : le palier concerné
	 * @return les récompense du palier sous forme de liste d'item.
	 */
	public ArrayList<Item> getReward(Level level){
		ArrayList<Item> reward = new ArrayList<Item>();
		
		for(String code : level.getReward()) {
			reward.add(convertToItem(code));
		}
		return reward;
	}

	/**
	 * Permet de rassembler les types de pièces en un seul éléments
	 * @param reward : la liste d'item
	 * @return la liste d'item avec les pièces regroupées
	 */
	public ArrayList<Item> gatherCoin(ArrayList<Item> reward){
		ArrayList<Item> res = new ArrayList<Item>();
		double pp = 0;
		double po = 0;
		double pa = 0;
		double pc = 0;
		
		for(Item item : reward) {
			//Si l'item est une pièce
			if(item.getTypeItem() == TypeItem.COIN) {
				//Selon le type de pièce on ajoute.
				switch (((Coin) item).getTypeCoin()) {
				case PLATINIUM:
					pp += item.getPrice();
					break;
				case GOLD:
					po += item.getPrice();
					break;
				case SILVER:
					pa += item.getPrice();
					break;
				case COPPER:
					pc += item.getPrice();
					break;
					
				default:
					Debug.error("Impossible case");
					return null;
				}
			}
			else {//On ajoute l'objet car on ne peux combiner
				res.add(item);
			}
		}
		if(pp != 0) {
			res.add(new Coin(Type.PLATINIUM, pp));
		}
		if(po != 0) {
			res.add(new Coin(Type.GOLD, po));
		}
		if(pa != 0) {
			res.add(new Coin(Type.SILVER, pa));
		}
		if(pc != 0) {
			res.add(new Coin(Type.COPPER, pc));
		}
		return res;
	}
	
	/**
	 * Permet d'initialiser une liste de trésors selon une liste de probabilités potentiellement nulle.
	 * @param treasures : la liste de trésors
	 * @param probabilityTypes : la liste de probabilités
	 */
	public void initTreasureList(ArrayList<Treasure> treasures, ArrayList<Tuple<TreasureType, ProbabilityType>> probabilityTypes) {
		
		//On initialise de base à médium
		for(Treasure treasure : treasures) {
			treasure.createLevel(ProbabilityType.MEDIUM);
		}
		
		if(probabilityTypes != null) {
			Debug.debug("Affect wanted probability for treasure");
			
			//On set toutes les probabilités aux trésors.
			for(Tuple<TreasureType, ProbabilityType> tuple : probabilityTypes) {
				for(Treasure treasure : treasures) {
					if(treasure.getType() == tuple.getX()) {//Si la probabilité ici est précisé
						treasure.createLevel(tuple.getY());//Permet de réinitiliser aussi les trésors
					}
				}
			}
		}
		else {//La liste de proba n'est pas donnée.
			Debug.debug("Give standard probability for treasure");
		}
		Debug.debug("");
	}
	
}
