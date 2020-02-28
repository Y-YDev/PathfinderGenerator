package utility;
import weapon.Munition;
import weapon.RangeWeapon;
import weapon.Type;
import weapon.Weapon;

public class Debug {
	// true = activé / false = désactivé.
	private static boolean debugMode = true; //Mode de debug
	private static boolean displayMode = true; //Mode d'affichage.
	
	/* CONSTRUCTOR */
	public static void setMode(boolean debug, boolean display) {
		debugMode = debug;
		displayMode = display;
	}
	
	/**
	 * Affiche un message de debug.
	 * @param msg : le message.
	 */
	public static void debug(String msg) {
		if(debugMode) System.out.println("\n[DEBUG] : "+msg);
	}
	
	/**
	 * Affiche un message d'erreur.
	 * @param msg : le message.
	 */
	public static void error(String msg) {
		if(debugMode) System.out.println("\n[ERROR] : "+msg);
	}
	
	/**
	 * Affiche les caractéristiques d'une arme.
	 * @param weapon : l'arme.
	 */
	public static void printWeapon(Weapon weapon) {
		if(displayMode) {
			String display = "";
			
			display += "\nARME : "+ weapon.getName();
			display += "\nALTERATION : "+ weapon.getAlteration();
			display += "\nMATERIAL : "+ weapon.getMaterial();
			
			if(weapon.getType() == Type.DIST) {
				display += "\nMUNITION : "+ ((RangeWeapon) weapon).getMunition().getQuantity();
				if(((RangeWeapon) weapon).getMunition().getQuantity() != "_") {
					display += " ("+((RangeWeapon) weapon).getMunition().getName()+")";
				}
			}
			if(weapon.getType() == Type.MUN) {
				display += "\nMUNITION : "+ ((Munition) weapon).getQuantity();
			}
			
			display += "\nTYPE : "+ weapon.getType();
			
			System.out.println(display);
		}
	}
}
