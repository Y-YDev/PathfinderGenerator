package item.wonderfulObject;

import item.Item;
import item.TypeItem;
import item.smartItem.SmartItem;

/**
 * Représente un objet merveilleux
 * @author Mentra20
 *
 */
public class WonderfulObject extends Item{
	private Type typeWonder;//Type de l'objet merveilleux
	private boolean particularPropertie;//Indice sur l'objet
	private SmartItem smartItem;//Objet intelligent.
	
	public WonderfulObject(String name,double price,Type typeWonder) {
		super(name, price, TypeItem.WONDERFUL);
		this.setTypeWonder(typeWonder);
		this.setParticularPropertie(false);
		this.setSmartItem(null);
	}

	public Type getTypeWonder() {
		return typeWonder;
	}

	public void setTypeWonder(Type typeWonder) {
		this.typeWonder = typeWonder;
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
