package staff;

/**
 * Représente un bâtons magique
 * @author Mentra20
 *
 */
public class Staff {
	private String name;//Nom du bâtons
	private double price;//Prix du bâtons
	
	public Staff(String name,double price) {
		this.setName(name);
		this.setPrice(price);
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
}
