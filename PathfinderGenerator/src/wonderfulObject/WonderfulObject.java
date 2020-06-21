package wonderfulObject;

import smartItem.SmartItem;
import wonderfulObject.Type;

/**
 * Représente un objet merveilleux
 * @author Mentra20
 *
 */
public class WonderfulObject {
	private String name;//Nom de l'objet merveilleux.
	private double price;//Prix de l'objet merveilleux.
	private Type type;//Type de l'objet merveilleux
	private boolean particularPropertie;//Indice sur l'objet
	private SmartItem smartItem;//Objet intelligent.
	
	public WonderfulObject(String name,double price,Type type) {
		this.setName(name);
		this.setPrice(price);
		this.setType(type);
		this.setParticularPropertie(false);
		this.setSmartItem(null);
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
