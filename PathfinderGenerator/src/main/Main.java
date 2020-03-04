package main;
import gemAndJewel.Gem;
import gemAndJewel.GemAndJewelBuilder;
import gemAndJewel.Jewel;
import utility.Debug;
import weapon.Weapon;
import weapon.WeaponBuilder;

public class Main {
	
	public static void main (String[] args){
		//Paramètrage de l'affichage
		Debug.setMode(true, true);
		
		WeaponBuilder weaponBuilder = new WeaponBuilder();
		GemAndJewelBuilder gemAndJewelBuilder = new GemAndJewelBuilder();
		
		Weapon weapon = weaponBuilder.createWeapon(6);
		Gem gem = gemAndJewelBuilder.createGem(1, true);
		Jewel jewel = gemAndJewelBuilder.createJewel(1);
		
		Debug.printWeapon(weapon);
		Debug.printGem(gem);
		Debug.printJewel(jewel);

		
		Debug.debug("SUCCEED");
	}
	
}
