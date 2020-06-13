package main;
import armor.ArmorBuilder;
import armor.ArmorShield;
import constant.ScepterConstant;
import gemAndJewel.Gem;
import gemAndJewel.GemAndJewelBuilder;
import gemAndJewel.Jewel;
import potion.Potion;
import potion.PotionBuilder;
import ring.Ring;
import ring.RingBuilder;
import scepter.Scepter;
import scepter.ScepterBuilder;
import staff.Staff;
import staff.StaffBuilder;
import utility.Debug;
import utility.Tuple;
import wand.Wand;
import wand.WandBuilder;
import weapon.Weapon;
import weapon.WeaponBuilder;

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

		Weapon weapon = weaponBuilder.createWeapon(6);
		Tuple<Gem,Jewel> tuple = gemAndJewelBuilder.createGemOrJewel(6);
		Potion potion = potionBuilder.createPotion(6);
		ArmorShield armor = armorBuilder.createArmor(6);
		Ring ring = ringBuilder.createRing(6);
		Wand wand = wandBuilder.createWand(6);
		Staff staff = staffBuilder.createStaff(6);
		Scepter scepter = scepterBuilder.createStaff(6);
		
		Debug.printWeapon(weapon);
		Debug.printGemOrJewel(tuple);
		Debug.printPotion(potion);
		Debug.printArmorShield(armor);
		Debug.printRing(ring);
		Debug.printWand(wand);
		Debug.printStaff(staff);
		Debug.printScepter(scepter);
		
		Debug.display("");
		Debug.debug("SUCCEED");
		
	}
	
}
