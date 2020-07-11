package generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * représente les differents types de probabilités
 */
public enum ProbabilityType {
	
	MINOR("Pleins de petits objets peu cher"),MEDIUM("Objets aléatoires"),MAJOR("Des objets plutôt chers"),
	FIBONACCI("Peu d'objets mais très chers");
	
    private final String type;
    
    private ProbabilityType(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }

    public static ArrayList<String> toArray(){
        ArrayList<String> res = new ArrayList<String>();

        for(ProbabilityType p : ProbabilityType.values()){
            res.add(p.toString());
        }

        return res;
    }

    //La hashmap pour retrouver le type
    private static final Map<String, ProbabilityType> lookup = new HashMap<>();

    //Remplie la hashmap au chargement.
    static
    {
        for(ProbabilityType type : ProbabilityType.values())
        {
            lookup.put(type.toString(), type);
        }
    }

    /**
     * Renvoie le type correspondant à sa chaine de caractères.
     * @param type : la représentation en string du ProbabilityType
     * @return : le ProbabilityType
     */
    public static ProbabilityType getType(String type) {
        return lookup.get(type);
    }
}
