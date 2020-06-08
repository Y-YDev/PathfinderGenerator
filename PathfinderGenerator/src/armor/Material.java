package armor;
/**
 * Material représente les matériaux des armures et bouclier.
 * @author Mentra20
 *
 */
public enum Material {
	
    OR("or"),OS("Os"),BRONZE("bronze"),NOTHING("_"),
    ACIER_VIVANT("Acier vivant"), MITHRAL("Mithral"),
    ACIER_ARDENT("Acier ardent"), ACIER_GLACE("Acier glacé"),
    BRONZE_ELYSEEN("Bronze élyséen"), ADAMENTIUM("Adamentium"),
    EBENITE("Ebénite"), CHOOSE("à déterminer"), PEAU_DE_DRAGON("Peau de dragon"),
    OR_PUR("or pur"),CRIN_DE_GRIFFON("Crin de griffon"),PEAU_D_ANGUILLE("Peau d'anguille"),
    PEAU_D_ANGE("Peau d'ange"),TISSUS_DE_SOMBREFEUILLE("Tissus de sombrefeuille"),
    OR_PUR_DECO("or pur plaqué"),OR_DECO("or plaqué");
	
    private final String material;
    
    private Material(String material){
        this.material = material;
    }
    
    public String toString(){
        return material;
    }
}

