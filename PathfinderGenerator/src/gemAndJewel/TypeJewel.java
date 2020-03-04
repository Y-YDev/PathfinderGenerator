package gemAndJewel;

public enum TypeJewel {
	BAGUE("Bague",0),EPINGLE_A_CHAPEAU("Epingle à chapeau",0),MEDAILLE("Médaille",0),
	BOUCLES_D_OREILLES("Boucles d'oreilles",0),PIERCING("Piercing",0),
	BOUTON_DE_MANCHETTE("Bouton de manchette",0),FAUSSE_DENT("Fausse dent",0.25),
	BRACELET_DE_CHEVILLES("Bracelet de chevilles",0.25),BIJOUX_DE_CHEVEUX("Bijoux de cheveux",0.25),
	COLLIER("Collier",0.25),BRACELET("Bracelet",0.25),MEDAILLON("Médaillon",0.5),
	BROCHE("Broche",0.5),BAGUE_ARMURE("Bague armure",0.5),BOUCLE_DE_CEINTURE("Boucle de ceinture",0.5),
	SCEAU("Sceau",1),CEINTURE("Ceinture",1),BRACELET_BAGUE("Bracelet-bague",1.5),
	CHEVALIERE("Chevalière",1.5),BIJOU_DE_PEAU("Bijou de peau",1.5),PECTORAL("Pectoral",2),
	POMME_DE_SENTEUR("Pomme de senteur",2),TIARE("Tiare",2.5),NOTHING("_",0);
	
	private final String name;
	private final double modificator;
	
	private TypeJewel(String name,double modificator) {
		this.name = name;
		this.modificator = modificator;
	}

	public double getModificator() {
		return modificator;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return name;
	}
}

