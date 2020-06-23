package item.armor;

/**
 * Type représente le type d'armure ou bouclier.
 * @author Mentra20
 *
 */
public enum Type{
    LIGTH("Légère"), INTERMEDIATE("Intermédiaire"),
    HEAVY("Lourde"),SHIELD("Shield"),NOTHING("_");
    
    private final String type;
    
    private Type(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}
