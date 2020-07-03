package generator;

/**
 * représente les differents types de probabilités
 */
public enum ProbabilityType {
	
	MINOR("Pleins de petits objets peu cher"),MEDIUM("Objets aléatoire"),MAJOR("Des objets plutôt chers"),
	FIBONACCI("Peu d'objets mais très chers");
	
    private final String type;
    
    private ProbabilityType(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}
