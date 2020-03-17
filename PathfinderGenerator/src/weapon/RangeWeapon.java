package weapon;

/**
 * RangeWeapon repr�sente les armes � distances.
 * @author Mentra20
 *
 */
public class RangeWeapon extends Weapon{
    private Munition munition;//La munition de l'arme � distance.
    
    /* CONSTRUCTOR */
    public RangeWeapon(String name, Munition munition, TypeDamage typeDamage, TypeMaterial typeMaterial, double price,double weight){
        super(name,Type.DIST,typeDamage,typeMaterial,price,weight);
        this.munition = munition;
    }

    /* GETTER AND SETTERS */
	public Munition getMunition() {
		return munition;
	}
	
	public void setMunition(Munition munition) {
		this.munition = munition;
	}
    
}