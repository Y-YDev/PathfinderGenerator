package wonderfulObject;

public enum Type {
	WAIST("Taille"),BODY("Corps"),TORSO("Torse"),EYES("Yeux"),
	FEET("Pieds"),HANDS("Mains"),HEAD("Tête"), FOREHEAD("Front"),
	NECK("Cou"),SHOULDERS("Epaules"),WRIST("Poignet et avant-bras"),
	WITHOUT_LOCATION("Sans emplacement"),NONE("_");
	
    private final String type;
    
    private Type(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}
