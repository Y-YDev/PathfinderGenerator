package item;

/**
 * représente un élément du trésor
 */
public class Item {
	private String name;//Nom de l'item
	private double price;//Prix de l'item
	private TypeItem type;//Type de l'item
	
	public Item(String name,double price,TypeItem typeItem) {
		this.setName(name);
		this.setPrice(price);
		this.setTypeItem(typeItem);
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

	public TypeItem getTypeItem() {
		return type;
	}

	public void setTypeItem(TypeItem type) {
		this.type = type;
	}
}
