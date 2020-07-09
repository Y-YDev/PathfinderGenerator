package item.weapon;
/**
 * TypeMaterial représente le type de matériel majoritaire de l'arme.
 * @author Mentra20
 *
 */
public enum TypeMaterial{
    WOOD("Bois"),STEEL("Metal");
    
    private final String typeMat;
    
    private TypeMaterial(String typeMat){
        this.typeMat = typeMat;
    }
    
    public String toString(){
        return typeMat;
    }
}