package gemAndJewel;

public class Gem {
	private String name;
	private TypeCut cut;
	private double price;
	
	public Gem(String name) {
		this.name = name;
		this.price = 0;
		this.cut = TypeCut.RAW;
	}

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
