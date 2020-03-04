package gemAndJewel;

import utility.Tuple;

public class Jewel {
	private Material material;
	private TypeSize size;
	private TypeJewel type;
	private TypeJewelWork work;
	private Tuple<Gem, Integer> GemN;
	private Tuple<Gem, Integer> GemN_1;
	private Tuple<Gem, Integer> GemN_2;
	private double price;
	
	
	public Jewel() {
		this.setMaterial(Material.NOTHING);
		this.setSize(TypeSize.NOTHING);
		this.setType(TypeJewel.NOTHING);
		this.setWork(TypeJewelWork.NOTHING);
		this.setGemN(null);
		this.setGemN_1(null);
		this.setGemN_2(null);
		this.setPrice(0);
	}


	public Material getMaterial() {
		return material;
	}


	public void setMaterial(Material material) {
		this.material = material;
	}


	public TypeSize getSize() {
		return size;
	}


	public void setSize(TypeSize size) {
		this.size = size;
	}


	public TypeJewelWork getWork() {
		return work;
	}


	public void setWork(TypeJewelWork work) {
		this.work = work;
	}


	public TypeJewel getType() {
		return type;
	}


	public void setType(TypeJewel type) {
		this.type = type;
	}


	public Tuple<Gem, Integer> getGemN() {
		return GemN;
	}


	public void setGemN(Tuple<Gem, Integer> gemN) {
		GemN = gemN;
	}


	public Tuple<Gem, Integer> getGemN_1() {
		return GemN_1;
	}


	public void setGemN_1(Tuple<Gem, Integer> gemN_1) {
		GemN_1 = gemN_1;
	}


	public Tuple<Gem, Integer> getGemN_2() {
		return GemN_2;
	}


	public void setGemN_2(Tuple<Gem, Integer> gemN_2) {
		GemN_2 = gemN_2;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
}
