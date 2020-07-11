package generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Représente tout les types de monstres de pathfinder.
 */
public enum MonsterType {
	Aberration("Aberration"),Animal("Animal"),Artificial_creature("Créature artificielle"),
    Magic_creature("Créature magique"),Dragon("Dragon"),Exterior("Extérieur"),
    Fairy("Fée"),Humanoid("Humanoïde"),Monstrous_umanoid("Humanoïde monstrueux"),Undead("Mort-vivant"),
    Plant("Plante"),Vase("Vase"),Vermine("Vermine");
    
    private final String type;
    
    private MonsterType(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }

    /**
     * Renvoie une arraylist des string de l'enum
     * @return : l'arraylist
     */
    public static ArrayList<String> toArray(){
        ArrayList<String> res = new ArrayList<String>();

        for(MonsterType s : MonsterType.values()){
            res.add(s.toString());
        }

        return res;
    }

    //La hashmap pour retrouver le type
    private static final Map<String, MonsterType> lookup = new HashMap<>();
    
    //Remplie la hashmap au chargement.
    static
    {
        for(MonsterType type : MonsterType.values())
        {
            lookup.put(type.toString(), type);
        }
    }

    /**
     * Renvoie le type correspondant à sa chaine de caractères.
     * @param type : la représentation en string du MonsterType
     * @return : le MonsterType
     */
    public static MonsterType getType(String type) {
    	return lookup.get(type);
    }
}
