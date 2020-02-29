package weapon;

/**
 * Weapon représente l'arme générée.
 * @author Mentra20
 *
 */
public class Weapon {
	private String name;//Le nom de l'arme.
    private String alteration;//L'altération de l'arme.
    private Material material;//Le matériel de l'arme.
    private Type type;//Le type de l'arme.
    private TypeDamage typeDamage;//Le type de dégat de l'arme.
    private TypeMaterial typeMaterial;//Le type du matériel de l'arme.
    private WeaponSpecialPropertie specialPropertie;//Propriété speciale de l'arme.
    private String particularPropertie;//Propriété particulière de l'arme.
    
    /* CONSTRUCTOR */
    public Weapon(String name, String aliteration, Material material, Type type, TypeDamage typeDamage, TypeMaterial typeMaterial){
        this.name = name;
        this.alteration = aliteration;
        this.material = material;
        this.type = type;
        this.typeDamage = typeDamage;
        this.typeMaterial = typeMaterial;
        this.specialPropertie = new WeaponSpecialPropertie("_");
        this.particularPropertie = "_";
    }
    
    public Weapon(String name) {
    	this.name = name;
    	this.alteration = "_";
    	this.material = Material.NOTHING;
    	this.type = Type.NOTHING;
    	this.typeDamage = TypeDamage.NOTHING;
    	this.typeMaterial = null;
    	this.specialPropertie = new WeaponSpecialPropertie("_");
    	this.particularPropertie = "_";
    }
    
    /* GETTERS AND SETTERS */
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getAlteration() {
		return alteration;
	}
	
	public void setAlteration(String alteration) {
		this.alteration = alteration;
	}

	public Material getMaterial() {
		return material;
	}
	
	public void setMaterial(Material material) {
		this.material = material;
	}

	public Type getType() {
		return type;
	}

	public TypeMaterial getTypeMaterial() {
		return typeMaterial;
	}

	public void setTypeMaterial(TypeMaterial typeMaterial) {
		this.typeMaterial = typeMaterial;
	}

	public TypeDamage getTypeDamage() {
		return typeDamage;
	}

	public void setTypeDamage(TypeDamage typeDamage) {
		this.typeDamage = typeDamage;
	}

	public WeaponSpecialPropertie getSpecialPropertie() {
		return specialPropertie;
	}

	public void setSpecialPropertie(WeaponSpecialPropertie specialPropertie) {
		this.specialPropertie = specialPropertie;
	}

	public String getParticularPropertie() {
		return particularPropertie;
	}

	public void setParticularPropertie(String particularPropertie) {
		this.particularPropertie = particularPropertie;
	}
}
