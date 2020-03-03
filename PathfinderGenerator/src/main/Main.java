package main;
import gemAndJewel.Gem;
import gemAndJewel.GemAndJewelBuilder;
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
		Gem gem = gemAndJewelBuilder.makeGem(1, true);
		
		Debug.printWeapon(weapon);
		Debug.printGem(gem);

		
		Debug.debug("SUCCEED");
	}
	
}
