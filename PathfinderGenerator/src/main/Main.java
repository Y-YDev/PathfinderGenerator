package main;
import utility.Debug;
import weapon.Weapon;
import weapon.WeaponBuilder;

public class Main {
	
	public static void main (String[] args){
		//Paramètrage de l'affichage
		Debug.setMode(true, true);
		
		WeaponBuilder weaponBuilder = new WeaponBuilder();
		Weapon weapon = weaponBuilder.createWeapon(6);
		
		Debug.printWeapon(weapon);

		
		Debug.debug("SUCCEED");
	}
	
}
