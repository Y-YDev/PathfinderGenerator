package item.wand;

import item.Item;
import item.TypeItem;
import utility.Debug;

/**
 * Potion représente une baguette magique.
 * @author Mentra20
 *
 */
public class Wand extends Item{
	
	private int nls;//Niveau de lançeur de sort.
	private int nds;//Niveau du sort.
	private boolean uncommon;//True si la baguette est hors du commun.
	private boolean particularPropertie;//True si la baguette a un indice sur sa capacité.
	
	public Wand(String name, double price) {
		super(name, price, TypeItem.WAND);
		this.setNds(-1);
		this.setNls(-1);
		this.setUncommon(false);
		this.setParticularPropertie(false);
	}

	/* Getters and Setters */
	public int getNls() {
		return nls;
	}

	public void setNls(int nls) {
		this.nls = nls;
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
	 * @return le niveau de lançeur de sort de la baguette.
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

	public boolean isParticularPropertie() {
		return particularPropertie;
	}

	public void setParticularPropertie(boolean particularPropertie) {
		this.particularPropertie = particularPropertie;
	}

}
