package generator;

/**
 * Type représente le type de tresor.
 * @author Mentra20
 *
 */
public enum Type{
    A("Les pièces"),B("Les pièces et les gemmes"),C("Objets d'art"),
    D("Les pièces et les objets de petite taille"),E("Les armes et les armures"),
    F("L'équipement des combattants"),G("L'équipement des lanceurs de sorts"),
    H("Le trésor des antres"),I("Le trésor accumulé");
    
    private final String type;
    
    private Type(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}