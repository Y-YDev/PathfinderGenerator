package ring;

import smartItem.SmartItem;

/**
 * Représente un anneaux magique
 * @author Mentra20
 *
 */
public class Ring {
	private String name;//Nom de l'anneau
	private double price;//Prix de l'anneau
	private boolean particularPropertie;//Indice sur l'anneau
	private SmartItem smartItem;//Si l'objet est intelligent
	
	public Ring(String name,double price) {
		this.setName(name);
		this.setPrice(price);
		this.setParticularPropertie(false);
		this.setSmartItem(null);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
