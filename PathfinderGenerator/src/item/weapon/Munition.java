package item.weapon;

import java.util.Random;

import utility.Debug;

/**
 * Munition représente les munitions des armes.
 * @author Mentra20
 *
 */
public class Munition extends Weapon{
    private int quantity; //Quantité de munitions (après jet de dés).
    private String stringQuantity;//Quantité de munition (avant jet de dé).
    private Random r = new Random();
    
    /* CONSTRUCTOR */
    public Munition(String name,TypeDamage typeDamage , String quantity,double price,double weight){
        super(name,Type.MUN,typeDamage,TypeMaterial.STEEL,price,weight); //Une munition est forcément en métal.
        this.stringQuantity = quantity;
    }
    
    public Munition(String name,double weigth) {//Constructeur pour munition d'arme à distance.
    	//weigth correspond au poid d'une seule munition.
    	super(name,Type.MUN,TypeDamage.NOTHING,TypeMaterial.STEEL,0,weigth);
    	this.stringQuantity = "0";
    }
    
    /* GETTER AND SETTERS */
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStringQuantity() {
		return stringQuantity;
	}

	public void setStringQuantity(String stringQuantity) {
		this.stringQuantity = stringQuantity;
	}
	
	/* METHODS */
	/**
	 * computeAmmoQuantity calcule la quantité de munitions de l'arme.
	 */
	public void computeAmmoQuantity() {
		Debug.debug("Compute amount of ammo : "+this.stringQuantity+"...");
		int quantity = 0;
		
		switch (this.stringQuantity) {
		case "2d10":
			quantity += r.nextInt(10)+1;
			quantity += r.nextInt(10)+1;
			break;
		case "4d10":
			quantity += r.nextInt(10)+1;
			quantity += r.nextInt(10)+1;
			quantity += r.nextInt(10)+1;
			quantity += r.nextInt(10)+1;
			break;
		case "1":
			quantity = 1;
			break;
		default:
			break;
		}
		
		Debug.debug("quantityAmmo = "+quantity);
		this.setQuantity(quantity);
	}
	
	/**
	 * computeAmmoPrice calcule le prix de l'arme.
	 */
	public void computeAmmoPrice() {
    	Debug.debug("Compute ammo price for "+this.getName()+" * "+this.quantity+"...");
    	double price;
    	
		switch (this.getName()) {
		case "Flèche": 
			price = 0.1 * quantity;
			break;
		case "Carreau":
			price =  0.1 * quantity;
			break;
		case "Bolas" :
			price = 5 * quantity;
			break;
		case "Fléchette" :
			price = 0.5 * quantity;
			break;
		case "Bille" :
			price = 0.01 * quantity;
			break;
		default://Arme a déterminer ou autre.
			price = 0;
			break;
		}
		
		this.setPrice(price);
	}
	
	public void computeAmmoWeight() {
		Debug.debug("Compute ammo weight for "+this.getName()+" * "+this.quantity+"...");
		this.setWeight(this.getWeight() * quantity);
	}

	
}