package artItem;

/**
 * Représente un objet d'art.
 * @author Mentra20
 *
 */
public class ArtItem {
	private String name;//Nom de l'objet d'art.
	private double price;//Prix de l'objet d'art.
	
	public ArtItem(String name,double price) {
		this.setName(name);
		this.setPrice(price);
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
}
