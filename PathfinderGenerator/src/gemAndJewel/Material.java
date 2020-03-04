package gemAndJewel;

public enum Material {
	BRONZE("Bronze",0.5),EBENITE("Ebénite",1),IVOIRE("Ivoire",1.5),FER_FROID("Fer froid",2),
	ACIER_VIVANT("Acier vivant",2.5),ACIER_ARDENT("Acier ardent",3),VIRIDIUM("Viridium",4),
	ACIER_GLACE("Acier glacé",5),ARGENT("Argent",6),BRONZE_ELIZEEN("Bronze elizéen",7),
	ELECTRUM("Electrum",8),ADAMENTIUM("Adamentium",9),OR("Or",10),MITHRAL("Mithral",11),
	OR_BLANC("Or blanc",12),PLATINE("Platine",13),NOTHING("_",-1);
	
	private final String name;
	private final double multiplier;
	
	private Material(String name,double multiplier) {
		this.name = name;
		this.multiplier = multiplier;
	}

	public String getName() {
		return name;
	}

	public double getMultiplier() {
		return multiplier;
	}
	
	public String toString() {
		return name;
	}
}



