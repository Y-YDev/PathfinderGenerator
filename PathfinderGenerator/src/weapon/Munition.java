package weapon;

/**
 * Munition représente les munitions des armes.
 * @author Mentra20
 *
 */
public class Munition extends Weapon{
    private String quantity; //Quantité de munitions.
    
    /* CONSTRUCTOR */
    public Munition(String name, String alteration, Material material,String quantity){
        super(name,alteration,material,Type.MUN,TypeDamage.NOTHING,TypeMaterial.STEEL); //Une munition est forcément en métal.
        this.quantity = quantity;
    }
    
    public Munition(String name) {//Constructeur pour munition d'arme à distance.
    	super(name,null,null,Type.MUN,TypeDamage.NOTHING,TypeMaterial.STEEL);
    	this.quantity = "_";
    }
    
    /* GETTER */
	public String getQuantity() {
		return quantity;
	}
}