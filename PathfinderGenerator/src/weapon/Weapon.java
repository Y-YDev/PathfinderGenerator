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
    private TypeMaterial typeMaterial;//Le type du matériel de l'arme.
    
    /* CONSTRUCTOR */
    public Weapon(String name, String aliteration, Material material, Type type, TypeMaterial typeMaterial){
        this.name = name;
        this.alteration = aliteration;
        this.material = material;
        this.type = type;
        this.typeMaterial = typeMaterial;
    }
    
    public Weapon(String name) {
    	this.name = name;
    	this.alteration = "_";
    	this.material = Material.NOTHING;
    	this.type = Type.NOTHING;
    	this.typeMaterial = null;
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
}
