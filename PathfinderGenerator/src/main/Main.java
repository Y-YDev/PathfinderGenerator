package main;
import gemAndJewel.Gem;
import gemAndJewel.GemAndJewelBuilder;
import gemAndJewel.Jewel;
import utility.Debug;
import utility.Tuple;
import weapon.Weapon;
import weapon.WeaponBuilder;

public class Main {
	
	public static void main (String[] args){
		//Paramètrage de l'affichage
		Debug.setMode(true, true);
		
		WeaponBuilder weaponBuilder = new WeaponBuilder();
		GemAndJewelBuilder gemAndJewelBuilder = new GemAndJewelBuilder();
		
		Weapon weapon = weaponBuilder.createWeapon(6);
		Tuple<Gem, Jewel> tuple = gemAndJewelBuilder.createGemOrJewel(1);
		
		Debug.printWeapon(weapon);
		Debug.printGemOrJewel(tuple);
		
		Debug.display("");
		Debug.debug("SUCCEED");
	}
	
}
