package main;
import armor.ArmorBuilder;
import armor.ArmorShield;
import artItem.ArtItem;
import artItem.ArtItemBuilder;
import gemAndJewel.Gem;
import gemAndJewel.GemAndJewelBuilder;
import gemAndJewel.Jewel;
import parchment.Parchment;
import parchment.ParchmentBuilder;
import potion.Potion;
import potion.PotionBuilder;
import ring.Ring;
import ring.RingBuilder;
import scepter.Scepter;
import scepter.ScepterBuilder;
import smartItem.SmartItem;
import smartItem.SmartItemBuilder;
import staff.Staff;
import staff.StaffBuilder;
import utility.Debug;
import utility.Tuple;
import wand.Wand;
import wand.WandBuilder;
import weapon.Weapon;
import weapon.WeaponBuilder;
import wonderfulObject.WonderfulObject;
import wonderfulObject.WonderfulObjectBuilder;

public class Main {
	
	public static void main (String[] args){
		//Paramètrage de l'affichage
		Debug.setMode(true, true);
		
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
		Tuple<Gem,Jewel> tuple = gemAndJewelBuilder.createGemOrJewel(6);
		Potion potion = potionBuilder.createPotion(6);
		ArmorShield armor = armorBuilder.createArmor(6);
		Ring ring = ringBuilder.createRing(6);
		Wand wand = wandBuilder.createWand(6);
		Staff staff = staffBuilder.createStaff(6);
		Scepter scepter = scepterBuilder.createStaff(6);
		Parchment parchment = parchmentBuilder.createParchment(6);
		ArtItem artItem = artItemBuilder.createArtItem(6);
		SmartItem smartItem = smartItemBuilder.createSmartItem(0);
		WonderfulObject wonderfulObject = wonderfulObjectBuilder.createWonderfulObject(6);
		
		Debug.printWeapon(weapon);
		Debug.printGemOrJewel(tuple);
		Debug.printPotion(potion);
		Debug.printArmorShield(armor);
		Debug.printRing(ring);
		Debug.printWand(wand);
		Debug.printStaff(staff);
		Debug.printScepter(scepter);
		Debug.printParchment(parchment);
		Debug.printArtItem(artItem);
		Debug.printSmartItem(smartItem);
		Debug.printWonderfulObject(wonderfulObject);
		
		Debug.display("");
		Debug.debug("SUCCEED");
	}
	
}
