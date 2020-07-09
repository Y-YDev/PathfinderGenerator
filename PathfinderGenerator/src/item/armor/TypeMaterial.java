package item.armor;

/**
 * TypeMaterial représente le type de matériel majoritaire de l'armure ou bouclier.
 * @author Mentra20
 *
 */
public enum TypeMaterial{
    WOOD("Bois"),STEEL("Metal"),LEATHER("Cuir"),NOTHING("Nothing");
    
    private final String typeMat;
    
    private TypeMaterial(String typeMat){
        this.typeMat = typeMat;
    }
    
    public String toString(){
        return typeMat;
    }
}