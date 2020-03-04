package gemAndJewel;

/**
 * TypeJewelWork représente le travail sur le bijoux.
 * @author Mentra20
 *
 */
public enum TypeJewelWork {
	SIMPLE("Simple",0),ENGRAVING("Gravures",0.25),NOTHING("_",0);
	
	private final String name;
	//Modificateur du travail au prix du bijoux.
	private final double modificator;
	
	private TypeJewelWork(String name,double modificator) {
		this.name = name;
		this.modificator = modificator;
	}

	public String getName() {
		return name;
	}

	public double getModificator() {
		return modificator;
	}
	
}
