package utility;
import gemAndJewel.Gem;
import gemAndJewel.Jewel;
import weapon.Munition;
import weapon.RangeWeapon;
import weapon.Type;
import weapon.Weapon;

/**
 * La classe Debug s'occupe de l'affichage de toute sorte.
 * @author Mentra20
 *
 */
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
	 * Affiche les caractéristiques d'une arme.
	 * @param weapon : l'arme.
	 */
	public static void printWeapon(Weapon weapon) {
		if(displayMode) {
			String display = "";
			
			display += "\nWEAPON : "+ weapon.getName();
			display += "\nALTERATION : "+ weapon.getAlteration();
			display += "\nMATERIAL : "+ weapon.getMaterial();
			
			if(weapon.getType() == Type.DIST) {
				display += "\nMUNITION : "+ ((RangeWeapon) weapon).getMunition().getQuantity();
				if(((RangeWeapon) weapon).getMunition().getQuantity() != "_") {
					//On ajoute le nom de la munition.
					display += " ("+((RangeWeapon) weapon).getMunition().getName()+")";
				}
			}
			if(weapon.getType() == Type.MUN) {
				display += "\nMUNITION : "+ ((Munition) weapon).getQuantity();
			}
			
			//Info de debug.
			if(debugMode) display += "\nTYPE : "+ weapon.getType();
			if(debugMode) display += "\nTYPE DAMAGE : "+ weapon.getTypeDamage();
			
			//Si l'arme a des propriétés spéciales.
			if(weapon.getSpecialPropertie1().getName() != "_") {
				display += "\nSPECIAL PROPERTIE 1 : "+ weapon.getSpecialPropertie1().getName();
				
				if(weapon.getSpecialPropertie2().getName() != "_")
					display += "\nSPECIAL PROPERTIE 2 : "+ weapon.getSpecialPropertie2().getName();
				
				display += "\nPARTICULAR PROPERTIE : "+ weapon.getParticularPropertie();
			}
			
			display += "\n";
			System.out.println(display);
		}
	}
	
	/**
	 * printGem affiche la gemme.
	 * @param gem : la gemme à afficher.
	 */
	public static void printGem(Gem gem) {
		if(displayMode) {
			String display = "";
			
			display += "\nGEM : "+ gem.getName();
			display += "\nCUT : "+ gem.getCut();
			display += "\nPRICE : "+ gem.getPrice()+" po";
			
			display += "\n";
			System.out.println(display);
		}
	}
	
	/**
	 * printJewel affiche le bijoux.
	 * @param jewel : le bijoux à afficher.
	 */
	public static void printJewel(Jewel jewel) {
		if(displayMode) {
			String display = "";
			
			display += "\nJEWEL : "+jewel.getType().getName();
			display += "\nMATERIAL : "+jewel.getMaterial().getName();
			display += "\nWORK : "+jewel.getWork().getName();
			display += "\nSIZE : "+jewel.getSize().getName();
			display += "\nPRICE : "+jewel.getPrice()+" po";
			
			//Si il a des gemmes.
			if(jewel.getGemN() != null) {
				display += "\nGEM GRADE N :";
				display += "\n\tGEM : "+jewel.getGemN().getName();
				display += "\n\tCUT : "+jewel.getGemN().getCut();
				display += "\n\tPRICE : "+jewel.getGemN().getPrice()+" po";
			}
			
			if(jewel.getGemN_1() != null) {
				Gem gem = jewel.getGemN_1().getX();
				display += "\nGEM GRADE N-1 :";
				display += "\n\tNUMBER : "+jewel.getGemN_1().getY();
				display += "\n\tGEM : "+gem.getName();
				display += "\n\tCUT : "+gem.getCut();
				display += "\n\tPRICE : "+gem.getPrice()+" po";
			}
			
			if(jewel.getGemN_2() != null) {
				Gem gem = jewel.getGemN_2().getX();
				display += "\nGEM GRADE N-2 :";
				display += "\n\tNUMBER : "+jewel.getGemN_2().getY();
				display += "\n\tGEM : "+gem.getName();
				display += "\n\tCUT : "+gem.getCut();
				display += "\n\tPRICE : "+gem.getPrice()+" po";
			}
			
			display += "\n";
			System.out.println(display);
			
		}
	}
	
	/**
	 * Affiche une gemme ou un bijoux
	 * @param tuple : le tuple qui contient la gemme ou le bijoux.
	 */
	public static void printGemOrJewel(Tuple<Gem,Jewel> tuple) {
		if(tuple.getX() != null) {
			printGem(tuple.getX());
		}
		if(tuple.getY() != null) {
			printJewel(tuple.getY());
		}
	}
	
}
