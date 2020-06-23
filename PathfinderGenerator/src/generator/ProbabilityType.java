package generator;

/**
 * représente les differents types de probabilités
 */
public enum ProbabilityType {
	
	MINOR("Pleins de petits objets peu cher"),MEDIUM("Objets aléatoire"),MAJOR("Quelques objets cher");
	
    private final String type;
    
    private ProbabilityType(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}
