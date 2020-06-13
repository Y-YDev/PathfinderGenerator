package wand;

import utility.Debug;

/**
 * Potion représente une baguette magique.
 * @author Mentra20
 *
 */
public class Wand {
	
	private int nls;//Niveau de lançeur de sort.
	private int nds;//Niveau du sort.
	private String name;//Nom de la baguette.
	private double price;//Prix de la baguette.
	private boolean uncommon;//True si la baguette est hors du commun.
	
	public Wand(String name, double price) {
		this.setNds(-1);
		this.setName(name);
		this.setNls(-1);
		this.setPrice(price);
		this.setUncommon(false);
	}

	/* Getters and Setters */
	public int getNls() {
		return nls;
	}

	public void setNls(int nls) {
		this.nls = nls;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNds() {
		return nds;
	}

	public void setNds(int nds) {
		this.nds = nds;
	}
	
	public boolean isUncommon() {
		return uncommon;
	}

	public void setUncommon(boolean uncommon) {
		this.uncommon = uncommon;
	}
	
	/* Methods */
	
	/**
	 * computeNls calcule le niveau de lançeur de sort selon le niveau du sort.
	 * @param nds : niveau du sort.
	 * @return le niveau de lançeur de sort de la potion.
	 */
	public void computeNls() {
		switch (this.nds) {
		case 0: setNls(1);
			break;
		case 1: setNls(1);
			break;
		case 2: setNls(3);
			break;
		case 3: setNls(5);
			break;
		case 4: setNls(7);
			break;
		default: 
			Debug.error("Error compute nls");
			setNls(-1);
			break;
		}
	}

	
	
	
}
