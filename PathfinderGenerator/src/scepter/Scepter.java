package scepter;

/**
 * Représente un sceptre magique
 * @author Mentra20
 *
 */
public class Scepter {
	private ScepterBuilder sb = new ScepterBuilder();//Pour générer les sceptres métamagique
	
	private String name;//Nom du sceptre
	private double price;//Prix du sceptre
	private Type type;//Mineur, normal ou superieur
	
	public Scepter(String name,Type type,double price) {
		this.setName(name);
		this.setType(type);
		this.setPrice(price);
	}

	//CONSTRUCTEUR POUR SCEPTRE METAMAGIQUE
	public Scepter(int spellLevel,Type type,double price) {
		//On creer le sceptre metamagique
		this.setName("Métamagie, "+sb.createMetamagicScepter(spellLevel));
		this.setType(type);
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
}
