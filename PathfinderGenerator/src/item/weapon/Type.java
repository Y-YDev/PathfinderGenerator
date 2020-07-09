package item.weapon;
/**
 * Type représente le type d'arme.
 * @author Mentra20
 *
 */
public enum Type{
    CAC_LIGHT("Corps à corps - légère"),CAC_1M("Corps à corps - 1 main"),CAC_2M("Corps à corps - 2 main"),
    DIST("Distance"),MUN("Munition"),NOTHING("_");
    
    private final String type;
    
    private Type(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}