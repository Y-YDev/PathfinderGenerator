package main;

import generator.MonsterType;
import generator.ProbabilityType;
import generator.Treasure;
import generator.TreasureBuilder;
import generator.TreasureType;
import item.armor.ArmorBuilder;
import item.armor.ArmorShield;
import item.artItem.ArtItem;
import item.artItem.ArtItemBuilder;
import item.gemAndJewel.Gem;
import item.gemAndJewel.GemAndJewelBuilder;
import item.gemAndJewel.Jewel;
import item.parchment.Parchment;
import item.parchment.ParchmentBuilder;
import item.potion.Potion;
import item.potion.PotionBuilder;
import item.ring.Ring;
import item.ring.RingBuilder;
import item.scepter.Scepter;
import item.scepter.ScepterBuilder;
import item.smartItem.SmartItem;
import item.smartItem.SmartItemBuilder;
import item.staff.Staff;
import item.staff.StaffBuilder;
import item.wand.Wand;
import item.wand.WandBuilder;
import item.weapon.Weapon;
import item.weapon.WeaponBuilder;
import item.wonderfulObject.WonderfulObject;
import item.wonderfulObject.WonderfulObjectBuilder;
import utility.Debug;
import utility.Tuple;

public class Main {
	
	public static void main (String[] args){
		//Paramètrage de l'affichage
		Debug.setMode(true, true);
		
		//GENERATION D'ITEM
		WeaponBuilder weaponBuilder = new WeaponBuilder();
		GemAndJewelBuilder gemAndJewelBuilder = new GemAndJewelBuilder();
		PotionBuilder potionBuilder = new PotionBuilder();
		ArmorBuilder armorBuilder = new ArmorBuilder();
		RingBuilder ringBuilder = new RingBuilder();
		WandBuilder wandBuilder = new WandBuilder();
		StaffBuilder staffBuilder = new StaffBuilder();
		ScepterBuilder scepterBuilder = new ScepterBuilder();
		ParchmentBuilder parchmentBuilder = new ParchmentBuilder();
		ArtItemBuilder artItemBuilder = new ArtItemBuilder();
		SmartItemBuilder smartItemBuilder = new SmartItemBuilder();
		WonderfulObjectBuilder wonderfulObjectBuilder = new WonderfulObjectBuilder();

		Weapon weapon = weaponBuilder.createWeapon(6);
		Weapon weapon2 = weaponBuilder.createMasterWeapon();//Arme de maitre
		Tuple<Gem,Jewel> tuple = gemAndJewelBuilder.createGemOrJewel(6);
		Potion potion = potionBuilder.createPotion(6);
		ArmorShield armor = armorBuilder.createArmor(6);
		ArmorShield armor2 = armorBuilder.createMasterArmor();//Armure de maitre.
		Ring ring = ringBuilder.createRing(6);
		Wand wand = wandBuilder.createWand(6);
		Staff staff = staffBuilder.createStaff(6);
		Scepter scepter = scepterBuilder.createScepter(6);
		
		Parchment parchment = parchmentBuilder.createParchment(6);
		ArtItem artItem = artItemBuilder.createArtItem(6);
		SmartItem smartItem = smartItemBuilder.createSmartItem(0);
		WonderfulObject wonderfulObject = wonderfulObjectBuilder.createWonderfulObject(6);
		
		Debug.printWeapon(weapon);
		Debug.printWeapon(weapon2);
		Debug.printGemOrJewel(tuple);
		Debug.printPotion(potion);
		Debug.printArmorShield(armor);
		Debug.printArmorShield(armor2);
		Debug.printRing(ring);
		Debug.printWand(wand);
		Debug.printStaff(staff);
		Debug.printScepter(scepter);
		Debug.printParchment(parchment);
		Debug.printArtItem(artItem);
		Debug.printSmartItem(smartItem);
		Debug.printWonderfulObject(wonderfulObject);
		
		System.out.println("----------------------------------------------------------------------------");
		
		//GENERATION DE TRESOR
		TreasureBuilder treasureBuilder = new TreasureBuilder();
		Treasure treasure = new Treasure(TreasureType.B);
		treasure.affectProbability(ProbabilityType.FIBONACCI);
		Debug.printTreasure(treasure);

		Debug.printReward(treasureBuilder.createRandomRewardWithMonster(MonsterType.Undead, false, ProbabilityType.MAJOR, 1560));
		
			
		Debug.display("");
		Debug.debug("SUCCEED");
	}
	
}
