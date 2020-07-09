package item.armor;

public class ArmorSpecialPropertie {
	private String name;//nom de la propriété magique
	private int magicAlterationOrPrice;//Alteration magique (ou prix) à ajouter au prix.
	//Si magicAlteration < 10, il s'agit de l'alteration magique, le prix fixe sinon.
	
	/* CONSTRUCTOR */
	public ArmorSpecialPropertie(String name,int magicAlteration) {
		this.name = name;
		this.magicAlterationOrPrice = magicAlteration;
	}

	/* GETTERS AND SETTERS */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMagicAlterationOrPrice() {
		return magicAlterationOrPrice;
	}

	public void setMagicAlterationOrPrice(int magicAlterationOrPrice) {
		this.magicAlterationOrPrice = magicAlterationOrPrice;
	}
	
}