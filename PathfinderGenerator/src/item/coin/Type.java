package item.coin;

import java.util.HashMap;
import java.util.Map;

import item.TypeItem;

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

    //La hashmap pour retrouver le type
    private static final Map<String, Type> lookup = new HashMap<>();

    //Remplie la hashmap au chargement.
    static
    {
        for(Type type : Type.values())
        {
            lookup.put(type.toString(), type);
        }
    }

    /**
     * Renvoie le type correspondant à sa chaine de caractères.
     * @param type : la représentation en string du Type (Coin)
     * @return : le Type (Coin)
     */
    public static Type getType(String type) {
        return lookup.get(type);
    }
}