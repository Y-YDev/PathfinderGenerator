package weapon;

/**
 * RangeWeapon représente les armes à distances.
 * @author Mentra20
 *
 */
public class RangeWeapon extends Weapon{
    private Munition munition;//La munition de l'arme à distance.
    
    /* CONSTRUCTOR */
    public RangeWeapon(String name, String alteration, Material material,Munition munition, TypeMaterial typeMaterial){
        super(name,alteration,material,Type.DIST,typeMaterial);
        this.munition = munition;
    }

    /* GETTER */
	public Munition getMunition() {
		return munition;
	}
    
}