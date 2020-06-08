package ring;

/**
 * Représente un anneaux magique
 * @author Mentra20
 *
 */
public class Ring {
	private String name;//Nom de l'anneau
	private double price;//Prix de l'anneau
	
	public Ring(String name,double price) {
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
