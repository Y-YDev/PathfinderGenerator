package gemAndJewel;

/**
 * Gem représente une gemme.
 * @author Mentra20
 *
 */
public class Gem {
	private String name;//Nom de la gemme.
	private TypeCut cut;//Type de la gemme.
	private double price;//Prix de la gemme.
	
	/* CONSTRUCTOR */
	public Gem(String name) {
		this.name = name;
		this.price = 0;
		this.cut = TypeCut.NOTHING;
	}
	
	/* GETTERS AND SETTERS */
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public TypeCut getCut() {
		return cut;
	}

	public void setCut(TypeCut cut) {
		this.cut = cut;
	}
	
}
