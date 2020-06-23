package item.coin;

/**
 * Type représente le type de piece.
 * @author Mentra20
 *
 */
public enum Type{
    GOLD("po"),COPPER("pc"),SILVER("pa"),PLATINIUM("pp"),NONE("_");
    
    private final String type;
    
    private Type(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}