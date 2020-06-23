package item.staff;

import item.Item;
import item.TypeItem;

/**
 * Représente un bâtons magique
 * @author Mentra20
 *
 */
public class Staff  extends Item{
	private boolean particularPropertie;//True si la baguette a un indice sur sa capacité.
	
	public Staff(String name,double price) {
		super(name, price, TypeItem.STAFF);
		this.setParticularPropertie(false);
	}

	public boolean isParticularPropertie() {
		return particularPropertie;
	}

	public void setParticularPropertie(boolean particularPropertie) {
		this.particularPropertie = particularPropertie;
	}

}
