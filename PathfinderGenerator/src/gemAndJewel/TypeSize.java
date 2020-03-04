package gemAndJewel;

/**
 * TypeSize représente les differentes taille de bijoux.
 * @author Mentra20
 *
 */
public enum TypeSize{
	
	MIN("MIN",0),P("P",0),M("M",0),G("G",0.25),
	TG("TG",0.5),GIG("Gig",1),COL("Col",2),NOTHING("_",0);
	
	//Modificateur de la taille au prix du bijoux
	private final double modificator;
	private final String name;
    
    private TypeSize(String name, double modificator){
        this.name = name;
        this.modificator = modificator;
    }

	public double getModificator() {
		return modificator;
	}

	public String getName() {
		return name;
	}
    
}