package generator;

import java.util.ArrayList;

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
}
