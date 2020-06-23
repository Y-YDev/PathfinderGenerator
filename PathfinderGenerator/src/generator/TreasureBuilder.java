package generator;

import java.util.ArrayList;
import java.util.Random;

import item.Item;
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
	private ArrayList<Treasure> treasureList;//List des trésor
	
	public TreasureBuilder() {
		r = new Random();
		treasureList = new ArrayList<Treasure>();
	}
	
	/**
	 * Convertit et calcule le gain du drop de pièces .
	 * @param dice : les dés sous forme de chaines de caractères.
	 * @return le resultat des dés sous forme de Coin.
	 */
	public Coin convertCoin(String dice) {
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
		
		//On convertir le resultat en chaine de caractère.
		return new Coin(typeCoin, res);
	}
	
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
	
	public ArrayList<Item> getReward(Level level){
		ArrayList<Item> reward = new ArrayList<Item>();
		
		for(String code : level.getReward()) {
			reward.add(convertToItem(code));
		}
		return reward;
	}

	public ArrayList<Treasure> getTreasureList() {
		return treasureList;
	}

	public void setTreasureList(ArrayList<Treasure> treasureList) {
		this.treasureList = treasureList;
	}
}
