package gemAndJewel;

import utility.Tuple;

/**
 * Jewel représente un bijoux.
 * @author Mentra20
 *
 */
public class Jewel {
	private Material material;//Materiel du bijoux.
	private TypeSize size;//Taile du bijoux.
	private TypeJewel type;//Type de bijoux.
	private TypeJewelWork work;//Travail du bijoux.
	// N représente le grade du bijoux (non retenu ici).
	private Gem GemN;//Gemme de grade N
	private Tuple<Gem, Integer> GemN_1;//Gemme de grade N-1
	private Tuple<Gem, Integer> GemN_2;//Gemme de grade N-2
	private double price;//Prix du bijoux.
	
	/* CONSTRUCTOR */
	public Jewel() {
		this.setMaterial(Material.NOTHING);
		this.setSize(TypeSize.NOTHING);
		this.setType(TypeJewel.NOTHING);
		this.setWork(TypeJewelWork.SIMPLE);
		this.GemN = null;
		this.GemN_1 = null;
		this.GemN_2 = null;
		this.setPrice(0);
	}

	/* GETTERS AND SETTER S*/

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


	public Gem getGemN() {
		return GemN;
	}


	public void setGemN(Gem gemN) {
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
