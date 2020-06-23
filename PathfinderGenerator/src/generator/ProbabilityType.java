package generator;

/**
 * représente les differents types de probabilités
 */
public enum ProbabilityType {
	
	MINOR("Pleins de petits objets"),MEDIUM("Objets aléatoire"),MAJOR("Peu de gros objets");
	
    private final String type;
    
    private ProbabilityType(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}
