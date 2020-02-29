package utility;
import weapon.Munition;
import weapon.RangeWeapon;
import weapon.Type;
import weapon.Weapon;

public class Debug {
	// true = activ� / false = d�sactiv�.
	private static boolean debugMode = true; //Mode de debug
	private static boolean displayMode = true; //Mode d'affichage.
	
	/* CONSTRUCTOR */
	public static void setMode(boolean debug, boolean display) {
		debugMode = debug;
		displayMode = display;
	}
	
	/**
	 * Affiche un message.
	 * @param msg : le message.
	 */
	public static void display(String msg) {
		if(displayMode) System.out.println(msg);
	}
	
	/**
	 * Affiche un message de debug.
	 * @param msg : le message.
	 */
	public static void debug(String msg) {
		if(debugMode) System.out.println("[DEBUG] : "+msg);
	}
	
	/**
	 * Affiche un message d'erreur.
	 * @param msg : le message.
	 */
	public static void error(String msg) {
		if(debugMode) System.out.println("[ERROR] : "+msg);
	}
	
	/**
	 * Affiche les caract�ristiques d'une arme.
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
			
			//Info pour propri�t� sp�ciale.
			if(debugMode) display += "\nTYPE : "+ weapon.getType();
			if(debugMode) display += "\nTYPE DAMAGE : "+ weapon.getTypeDamage();
			
			if(weapon.getSpecialPropertie().getName() != "_") {
				display += "\nSPECIAL PROPERTIE : "+ weapon.getSpecialPropertie().getName();
				display += "\nPARTICULAR PROPERTIE : "+ weapon.getParticularPropertie();
			}
			
			
			display += "\n";
			
			System.out.println(display);
		}
	}
}
