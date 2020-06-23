package item.ring;

import item.Item;
import item.TypeItem;
import item.smartItem.SmartItem;

/**
 * Représente un anneaux magique
 * @author Mentra20
 *
 */
public class Ring extends Item{
	private boolean particularPropertie;//Indice sur l'anneau
	private SmartItem smartItem;//Si l'objet est intelligent
	
	public Ring(String name,double price) {
		super(name, price, TypeItem.RING);
		this.setParticularPropertie(false);
		this.setSmartItem(null);
	}

	public boolean isParticularPropertie() {
		return particularPropertie;
	}

	public void setParticularPropertie(boolean particularPropertie) {
		this.particularPropertie = particularPropertie;
	}

	public SmartItem getSmartItem() {
		return smartItem;
	}

	public void setSmartItem(SmartItem smartItem) {
		this.smartItem = smartItem;
	}
}
