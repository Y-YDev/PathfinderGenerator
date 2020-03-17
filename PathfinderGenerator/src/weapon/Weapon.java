package weapon;

/**
 * Weapon représente l'arme générée.
 * @author Mentra20
 *
 */
public class Weapon {
	private String name;//Le nom de l'arme.
    private int alteration;//L'altération de l'arme.
    private Material material;//Le matériel de l'arme.
    private Type type;//Le type de l'arme.
    private TypeDamage typeDamage;//Le type de dégat de l'arme.
    private TypeMaterial typeMaterial;//Le type du matériel de l'arme.
    private WeaponSpecialPropertie specialPropertie1;//Propriété speciale 1 de l'arme.
    private WeaponSpecialPropertie specialPropertie2;//Propriété speciale 2 de l'arme.
    private String particularPropertie;//Propriété particulière de l'arme.
    private double price;//Prix de l'arme
    private boolean masterWork = false;//True si l'arme est une arme de maitre.
    private double weight;//Poid de l'arme.
    
    /* CONSTRUCTOR */
    public Weapon(String name, Type type, TypeDamage typeDamage, TypeMaterial typeMaterial, double price,double weight){
        this.name = name;
        this.alteration = 0;
        this.material = null;
        this.type = type;
        this.typeDamage = typeDamage;
        this.typeMaterial = typeMaterial;
        this.specialPropertie1 = new WeaponSpecialPropertie("_",-1);
        this.specialPropertie2 = new WeaponSpecialPropertie("_",-1);
        this.particularPropertie = "_";
        this.price = price;
        this.setWeight(weight);
    }
    
    //Constructeur pour les armes spécifiques
    public Weapon(String name,double price) {
    	this.name = name;
    	this.alteration = -1;
    	this.material = Material.NOTHING;
    	this.type = Type.NOTHING;
    	this.typeDamage = TypeDamage.NOTHING;
    	this.typeMaterial = null;
    	this.specialPropertie1 = new WeaponSpecialPropertie("_",-1);
    	this.specialPropertie2 = new WeaponSpecialPropertie("_",-1);
    	this.particularPropertie = "_";
    	this.price = price;
    	this.setWeight(0);
    }
    
    /* GETTERS AND SETTERS */
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAlteration() {
		return alteration;
	}
	
	public void setAlteration(int alteration) {
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

	public WeaponSpecialPropertie getSpecialPropertie1() {
		return specialPropertie1;
	}

	public void setSpecialPropertie1(WeaponSpecialPropertie specialPropertie1) {
		this.specialPropertie1 = specialPropertie1;
	}

	public String getParticularPropertie() {
		return particularPropertie;
	}

	public void setParticularPropertie(String particularPropertie) {
		this.particularPropertie = particularPropertie;
	}

	public WeaponSpecialPropertie getSpecialPropertie2() {
		return specialPropertie2;
	}

	public void setSpecialPropertie2(WeaponSpecialPropertie specialPropertie2) {
		this.specialPropertie2 = specialPropertie2;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isMasterWork() {
		return masterWork;
	}

	public void setMasterWork(boolean masterWork) {
		this.masterWork = masterWork;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
