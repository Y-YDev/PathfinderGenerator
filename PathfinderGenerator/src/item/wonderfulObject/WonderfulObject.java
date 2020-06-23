package item.wonderfulObject;

import item.Item;
import item.TypeItem;
import item.smartItem.SmartItem;
import item.wonderfulObject.Type;

/**
 * Représente un objet merveilleux
 * @author Mentra20
 *
 */
public class WonderfulObject extends Item{
	private Type type;//Type de l'objet merveilleux
	private boolean particularPropertie;//Indice sur l'objet
	private SmartItem smartItem;//Objet intelligent.
	
	public WonderfulObject(String name,double price,Type type) {
		super(name, price, TypeItem.WONDERFUL);
		this.setType(type);
		this.setParticularPropertie(false);
		this.setSmartItem(null);
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
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
