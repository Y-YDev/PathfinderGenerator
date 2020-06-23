package item.weapon;
/**
 * Material représente les matériaux des armes.
 * @author Mentra20
 *
 */
public enum Material{
	
    PIERRE("Pierre"),OR("or"),OS("Os"),
    OBSIDIENNE("Obsidienne"),BRONZE("bronze"),NOTHING("_"),
    VIRIDIUM("Viridium"),RACINE_DE_WYR("Racine de wyr"),ACIER_VIVANT("Acier vivant"),
    FER_FROID("Fer froid"), ARGENT_ALCHIMIQUE("Argent alchimique"),CRISTAL_DE_SANG("Cristal de sang"),
    MITHRAL("Mithral"), ACIER_ARDENT("Acier ardent"), ACIER_GLACE("Acier glacé"),
    BRONZE_ELYSEEN("Bronze élyséen"), ADAMENTIUM("Adamentium"),BOIS_FLEXIBLE("Bois flexible"),
    EBENITE("Ebénite"),BOIS_VERT("Bois vert"),CHOOSE("à déterminer"),
    OR_PUR("or pur"),RACINE_DE_WYR1("Racine de wyr (1 pv)"),
    RACINE_DE_WYR2("Racine de wyr (2 pv)"),RACINE_DE_WYR3("Racine de wyr (3 pv)");

    private final String material;
    
    private Material(String material){
        this.material = material;
    }
    
    public String toString(){
        return material;
    }
    
}