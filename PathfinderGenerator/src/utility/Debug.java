package utility;
import java.util.ArrayList;

import generator.Level;
import generator.Treasure;
import item.Item;
import item.armor.ArmorShield;
import item.artItem.ArtItem;
import item.coin.Coin;
import item.gemAndJewel.Gem;
import item.gemAndJewel.Jewel;
import item.parchment.Parchment;
import item.potion.Potion;
import item.ring.Ring;
import item.scepter.Scepter;
import item.smartItem.SmartItem;
import item.smartItem.SmartItemCommunication;
import item.smartItem.SmartItemSkill;
import item.staff.Staff;
import item.wand.Wand;
import item.weapon.Munition;
import item.weapon.RangeWeapon;
import item.weapon.Type;
import item.weapon.Weapon;
import item.wonderfulObject.WonderfulObject;

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
			if(weapon.isMasterWork()) display += " de maître";
			
			display += "\nALTERATION : ";
			if(weapon.getAlteration() == -2) display += "+1 jet d'attaque";//Arme de maitre.
			else if(weapon.getAlteration() == -1) display += "_";//Arme spécifique.
			else display += "+"+weapon.getAlteration();
			
			display += "\nMATERIAL : "+ weapon.getMaterial();
			
			if(weapon.getType() == Type.DIST) {
				
				display += "\nMUNITION : "+ ((RangeWeapon) weapon).getMunition().getQuantity();
				//Si l'arme à des munitions.
				if(((RangeWeapon) weapon).getMunition().getStringQuantity() != "0") {
					//On ajoute le nom de la munition.
					display += " ("+((RangeWeapon) weapon).getMunition().getName()+")";
					//On ajout des infos sur les munitions;
					display += "\n\tMUNITION PRICE : "+ ((RangeWeapon) weapon).getMunition().getPrice()+" po";
					display += "\n\tMUNITION WEIGTH : "+((RangeWeapon) weapon).getMunition().getWeight()+" kg";
				}
			}
			if(weapon.getType() == Type.MUN) {
				display += "\nMUNITION : "+ ((Munition) weapon).getQuantity();
			}
			
			//Info de debug.
			if(debugMode) {
				display += "\nTYPE : "+ weapon.getType();
				display += "\nTYPE DAMAGE : "+ weapon.getTypeDamage();
			}
			
			
			//Si l'arme a des propriétés spéciales.
			if(weapon.getSpecialPropertie1().getName() != "_") {
				display += "\nSPECIAL PROPERTIE 1 : "+ weapon.getSpecialPropertie1().getName();
				
				if(debugMode) {//Affichae pour debug
					if(weapon.getSpecialPropertie1().getMagicAlterationOrPrice() > 10) {
						//On a directement le prix de l'alteration magique.
						display += "\n\tMAGIC ALTERATION PRICE : "+ weapon.getSpecialPropertie1().getMagicAlterationOrPrice()+" po";
					}
					else {//C'est un rang d'alteration magique
						display += "\n\tMAGIC ALTERATION PROPERTIE 1 : "+ weapon.getSpecialPropertie1().getMagicAlterationOrPrice();
					}
				}
				
				//Si l'arme a une deuxieme propriété spéciale.
				if(weapon.getSpecialPropertie2().getName() != "_") {
					display += "\nSPECIAL PROPERTIE 2 : "+ weapon.getSpecialPropertie2().getName();
					
					if(debugMode) {//Affichae pour debug
						if(weapon.getSpecialPropertie2().getMagicAlterationOrPrice() > 10) {
							//On a directement le prix de l'alteration magique.
							display += "\n\tMAGIC ALTERATION PRICE : "+ weapon.getSpecialPropertie2().getMagicAlterationOrPrice()+" po";
						}
						else {//C'est un rang d'alteration magique
							display += "\n\tMAGIC ALTERATION PROPERTIE 2 : "+ weapon.getSpecialPropertie2().getMagicAlterationOrPrice();
						}
					}
				}
				
				display += "\nPARTICULAR PROPERTIE : "+ weapon.getParticularPropertie();
			}
			
			display += "\nWEIGHT : "+ weapon.getWeight()+" kg";
			display += "\nPRICE : "+ weapon.getPrice()+" po";
			
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
	
	/**
	 * printPotion affiche une potion.
	 * @param potion : la potion à affichée.
	 */
	public static void printPotion(Potion potion) {
		if(displayMode) {
			String display = "";
			
			display += "\nPOTION : "+potion.getName();
			display += "\nSPELL LEVEL : "+potion.getNds();
			display += "\nCASTER LEVEL : "+potion.getNls();
			display += "\nPRICE : "+potion.getPrice()+" po";
			
			if(debugMode) {
				display += "\nTYPE : ";
				if(potion.isUncommon()) display += "uncommon";
				else display += "common";
			}
			
			display += "\n";
			System.out.println(display);
		}
	}
	
	/**
	 * affiche une armure ou un bouclier
	 * @param armor :  le bouclier/armure a afficher
	 */
	public static void printArmorShield(ArmorShield armor) {
		if(displayMode) {
			String display = "";
			
			display += "\nARMOR : "+ armor.getName();
			if(armor.isMasterWork()) display += " de maître";
			
			display += "\nALTERATION : ";
			if(armor.getAlteration() == -2) display += "-1 pénalité d'armure";//Armure de maitre.
			else if(armor.getAlteration() == -1) display += "_";//Armure spécifique.
			else display += "+"+armor.getAlteration();
			
			display += "\nMATERIAL : "+ armor.getMaterial();
			
			//Info de debug.
			if(debugMode) {
				display += "\nTYPE : "+ armor.getType();
			}
			
			//Si l'arme a des propriétés spéciales.
			if(armor.getSpecialPropertie1().getName() != "_") {
				display += "\nSPECIAL PROPERTIE 1 : "+ armor.getSpecialPropertie1().getName();
				
				if(debugMode) {//Affichae pour debug
					if(armor.getSpecialPropertie1().getMagicAlterationOrPrice() > 10) {
						//On a directement le prix de l'alteration magique.
						display += "\n\tMAGIC ALTERATION PRICE : "+ armor.getSpecialPropertie1().getMagicAlterationOrPrice()+" po";
					}
					else {//C'est un rang d'alteration magique
						display += "\n\tMAGIC ALTERATION PROPERTIE 1 : "+ armor.getSpecialPropertie1().getMagicAlterationOrPrice();
					}
				}
				
				//Si l'arme a une deuxieme propriété spéciale.
				if(armor.getSpecialPropertie2().getName() != "_") {
					display += "\nSPECIAL PROPERTIE 2 : "+ armor.getSpecialPropertie2().getName();
					
					if(debugMode) {//Affichae pour debug
						if(armor.getSpecialPropertie2().getMagicAlterationOrPrice() > 10) {
							//On a directement le prix de l'alteration magique.
							display += "\n\tMAGIC ALTERATION PRICE : "+ armor.getSpecialPropertie2().getMagicAlterationOrPrice()+" po";
						}
						else {//C'est un rang d'alteration magique
							display += "\n\tMAGIC ALTERATION PROPERTIE 2 : "+ armor.getSpecialPropertie2().getMagicAlterationOrPrice();
						}
					}
				}
			}
			
			display += "\nWEIGHT : "+ armor.getWeight()+" kg";
			display += "\nPRICE : "+ armor.getPrice()+" po";
			
			display += "\n";
			System.out.println(display);
		}
	}
	
	/**
	 * Affiche un anneau magique
	 * @param ring : l'anneau
	 */
	public static void printRing(Ring ring) {
		if(displayMode) {
			String display = "";
			
			display += "\nRING : "+ ring.getName();
			display += "\nPRICE : "+ ring.getPrice()+" po";
			
			if(ring.isParticularPropertie()) display += "\nPARTICULAR PROPERTIE : indice";
		
			if(ring.getSmartItem() != null) {
				display += smartItemToString(ring.getSmartItem());
			}
			
			display += "\n";
			System.out.println(display);
		}
	}
	
	/**
	 * Affiche une baguette magique
	 * @param wand : la baguette magique
	 */
	public static void printWand(Wand wand) {
		if(displayMode) {
			String display = "";
			
			display += "\nWAND : "+ wand.getName();
			display += "\nSPELL LEVEL : "+wand.getNds();
			display += "\nCASTER LEVEL : "+wand.getNls();
			display += "\nPRICE : "+ wand.getPrice()+" po";
			
			if(wand.isParticularPropertie()) display += "\nPARTICULAR PROPERTIE : indice";
			
			if(debugMode) {
				display += "\nTYPE : ";
				if(wand.isUncommon()) display += "hors du commun";
				else display += "commun";
			}
			
			display += "\n";
			System.out.println(display);
		}
	}
	
	/**
	 * Affiche un baton magique
	 * @param staff le baton magique
	 */
	public static void printStaff(Staff staff) {
		if(displayMode) {
			String display = "";
			
			display += "\nSTAFF : "+ staff.getName();
			display += "\nPRICE : "+ staff.getPrice()+" po";
			
			if(staff.isParticularPropertie()) display += "\nPARTICULAR PROPERTIE : indice";
			
			display += "\n";
			System.out.println(display);
		}
	}
	
	/**
	 * Affiche un sceptre magique
	 * @param scptr le sceptre magique
	 */
	public static void printScepter(Scepter scptr) {
		if(displayMode) {
			String display = "";
			
			display += "\nSCEPTER : "+ scptr.getName();
			display += "\nPRICE : "+ scptr.getPrice()+" po";
			
			if(scptr.getType() != item.scepter.Type.NONE) {
				display += "\nTYPE : "+scptr.getType();
			}

			if(scptr.isParticularPropertie()) display += "\nPARTICULAR PROPERTIE : indice";
			
			if(scptr.getSmartItem() != null) {
				display += smartItemToString(scptr.getSmartItem());
			}
			
			display += "\n";
			System.out.println(display);
		}
	}
	
	/**
	 * Affiche un parchemin 
	 * @param le parchemin
	 */
	public static void printParchment(Parchment parchment) {
		if(displayMode) {
			String display = "";
			
			display += "\nPARCHMENT : "+ parchment.getName();
			display += "\nSPELL LEVEL : "+parchment.getNds();
			display += "\nCASTER LEVEL : "+parchment.getNls();
			
			display += "\nCASTER TYPE : ";
			if(parchment.isDivine()) display += "divin";
			else display += "profane";	
					
			display += "\nPRICE : "+ parchment.getPrice()+" po";
			
			if(debugMode) {
				display += "\nTYPE : ";
				if(parchment.isUncommon()) display += "hors du commun";
				else display += "commun";
			}
			
			display += "\n";
			System.out.println(display);
		}
	}
	
	/**
	 * Affiche un objet d'art
	 * @param artItem : l'objet d'art
	 */
	public static void printArtItem(ArtItem artItem) {
		if(displayMode) {
			String display = "";
			
			display += "\nART ITEM : "+ artItem.getName();
			display += "\nPRICE : "+ artItem.getPrice()+" po";
			
			display += "\n";
			System.out.println(display);
		}
	}
	
	/**
	 * Affiche un objet intelligent.
	 * @param smartItem : l'objet intelligent
	 */
	public static String smartItemToString(SmartItem smartItem) {
		String display = "";
			
		display += "\nSMART ITEM : ";
		display += "\n\tALIGNMENT : "+smartItem.getAlignement();
			
		display += "\n\tINT : "+smartItem.getInt().getStat();
		display += " | SAG : "+smartItem.getSag().getStat();
		display += " | CHAR : "+smartItem.getChar().getStat();
			
		display += "\n\tEGO : "+smartItem.getEgo();
		display += "\n\tNUMBER OF LANGAGE : "+smartItem.getLangage();
			
		display += "\n\tCOMMUNICATION SKILLS : ";
		for(SmartItemCommunication c : smartItem.getCommunication()) {
			display += "\n\t\t"+c.getCommunication();
		}
			
		display += "\n\tSKILLS : ";
		for(SmartItemSkill s : smartItem.getSkill()) {
			display += "\n\t\t"+s.getSkill();
		}
			
		if(smartItem.getPlan() != null) {
			display += "\n\tPLAN : "+smartItem.getPlan().getPlan();
		}
		if(smartItem.getPower() != null) {
			display += "\n\tDEDICATE POWER : "+smartItem.getPower().getPower();
		}
			
		display += "\n\tTRAIT : ";
		for(String s : smartItem.getTraits()) {
			display += "\n\t\t"+s;
		}
			
		if(debugMode) {
			display += "\n\tBEFORE BONUS PRICE : "+smartItem.getBasePrice();
			display += "\n\tSMART BONUS PRICE : "+smartItem.getPrice();
		}
			
		display += "\n";
		return display;
	}
	
	/**
	 * Affiche un objet intelligent.
	 * @param smartItem : l'objet intelligent
	 */
	public static void printSmartItem(SmartItem smartItem) {
		if(displayMode) {
			System.out.println(smartItemToString(smartItem));
		}
	}
	
	/**
	 * Affiche un objet merveilleux.
	 * @param smartItem : l'objet merveilleux
	 */
	public static void printWonderfulObject(WonderfulObject wonderfulObject) {
		if(displayMode) {
			String display = "";
			
			display += "\nWONDERFUL OBJECT : "+ wonderfulObject.getName();		
			display += "\nPRICE : "+ wonderfulObject.getPrice()+" po";
			display += "\nLOCATION : "+wonderfulObject.getType();

			if(wonderfulObject.isParticularPropertie()) display += "\nPARTICULAR PROPERTIE : indice";
			
			if(wonderfulObject.getSmartItem() != null) {
				display += smartItemToString(wonderfulObject.getSmartItem());
			}
			
			display += "\n";
			System.out.println(display);
		}
	}
	
	/**
	 * Affiche un tresor.
	 * @param treasure : le tresor
	 */
	public static void printTreasure(Treasure treasure) {
		if(displayMode) {
			String display = "";
			
			display += "\nTREASURE : "+ treasure.getType();
			display += "\nPROBABILITY TYPE : " + treasure.getProbabilityType();
			
			if(debugMode) {
				display += "\nTOTAL PROBABILITY : " + treasure.computeProbability();
				
				display += "\nLEVEL PROBABILITY : ";
				for(Level level : treasure.getLevelList()) {
					display += Debug.levelToString(level);
				}
			}
			
			display += "\n";
			System.out.println(display);
		}
	}
	
	public static String levelToString(Level level) {
		String display = "";
		
		display += "\n\tPRICE : "+ level.getPrice();
		display += "\n\tPROBABILITY : "+level.getProbability();
		
		return display+"\n";
	}
	
	/**
	 * Affiche une quantité de pièce
	 * @param coin : les pièces
	 */
	public static void printCoin(Coin coin) {
		if(displayMode) {
			System.out.println("\n"+coin.toString());
		}
	}
	
	/**
	 * Affiche le contenu d'un trésor dropper
	 * @param reward
	 */
	public static void printReward(ArrayList<Item> reward) {
		if(displayMode) {
			for(Item item : reward) {
				switch (item.getTypeItem()) {
				case WEAPON:
					printWeapon((Weapon) item);
					break;
				case ARMOR:
					printArmorShield((ArmorShield) item);
					break;
				case COIN:
					printCoin((Coin) item);
					break;
				case ART:
					printArtItem((ArtItem) item);
					break;
				case GEM:
					printGem((Gem) item);
					break;
				case JEWEL:
					printJewel((Jewel) item);
					break;
				case PARCHMENT:
					printParchment((Parchment) item);
					break;
				case POTION :
					printPotion((Potion) item);
					break;
				case RING:
					printRing((Ring) item);
					break;
				case SCEPTER:
					printScepter((Scepter) item);
					break;
				case STAFF:
					printStaff((Staff) item);
					break;
				case WAND:
					printWand((Wand) item);
					break;
				case WONDERFUL:
					printWonderfulObject((WonderfulObject) item);
					break;
				default:
					break;
				}
			}
		}
	}
}
