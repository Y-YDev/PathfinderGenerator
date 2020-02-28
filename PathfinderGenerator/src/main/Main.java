package main;
import utility.Debug;
import weapon.Weapon;
import weapon.WeaponBuilder;

public class Main {
	
	public static void main (String[] args){
		WeaponBuilder weaponBuilder = new WeaponBuilder();
		Weapon weapon;
		
		//Creation de l'arme
		weapon = weaponBuilder.createWeapon(1);
		Debug.printWeapon(weapon);
		
		Debug.debug("SUCCEED");
	}
	
	
}
