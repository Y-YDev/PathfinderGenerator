package item.weapon;
/**
 * TypeMaterial représente le type de dégat de l'arme.
 * @author Mentra20
 *
 */
public enum TypeDamage{
    P("Perforant"),C("Contendant"),T("Tranchant"),NOTHING("_"),
    C_P("Contendant ou perforant"),P_T("Perforant ou tranchant");
    
    private final String typeDamage;
    
    private TypeDamage(String typeDamage){
        this.typeDamage = typeDamage;
    }
    
    public String toString(){
        return typeDamage;
    }
}