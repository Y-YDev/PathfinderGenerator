package generator;

/**
 * Type représente le type de tresor.
 * @author Mentra20
 *
 */
public enum TreasureType{
    A("Les pièces (A)"),B("Les pièces et les gemmes (B)"),C("Objets d'art (C)"),
    D("Les pièces et les objets de petite taille (D)"),E("Les armes et les armures (E)"),
    F("L'équipement des combattants (F)"),G("L'équipement des lanceurs de sorts (G)"),
    H("Le trésor des antres (H)"),I("Le trésor accumulé (I)");
    
    private final String type;
    
    private TreasureType(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}