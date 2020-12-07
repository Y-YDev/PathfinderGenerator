package item.armor;

import item.Item;
import item.TypeItem;
import item.smartItem.SmartItem;

/**
 * Représente une armure ou un bouclier généré
 * @author Mentra20
 */
public class ArmorShield extends Item{
	private int alteration;//L'altération de l'armure ou bouclier
	private Material material;//Materiel de l'armure ou bouclier
	private TypeMaterial typeMaterial;//Type du materiel de l'armure ou bouclier
	private Type typeArmor;//Type de l'armure ou bouclier (lourde, légère...)
	private boolean isMasterWork;//Si l'armure ou le bouclier est de maitre
	private ArmorSpecialPropertie specialPropertie1;//La premiere propriété spéciale.
	private ArmorSpecialPropertie specialPropertie2;//La deuxieme propriété spéciale.
	private SmartItem smartItem;//Objet intelligent.
	private double weight;//Poids de l'armure ou bouclier
	
	/* CONSTRUCTOR */
	public ArmorShield(String name, TypeMaterial typeMaterial, Type typeArmor, double price, double weight) {
		super(name, price, TypeItem.ARMOR);
		this.setAlteration(0);
		this.setMaterial(null);
		this.setTypeMaterial(typeMaterial);
		this.setTypeArmor(typeArmor);
		this.setMasterWork(false);
		this.specialPropertie1 = new ArmorSpecialPropertie("_",-1);
        this.specialPropertie2 = new ArmorSpecialPropertie("_",-1);
        this.setWeight(weight);
        this.setSmartItem(null);
	}
	
	//Constructeur pour armure ou bouclier spécifique
	public ArmorShield(String name, Type typeArmor, double price) {
		super(name, price, TypeItem.ARMOR);
		this.setAlteration(-1);
		this.setMaterial(Material.NOTHING);
		this.setTypeMaterial(TypeMaterial.NOTHING);
		this.setTypeArmor(typeArmor);
		this.setMasterWork(false);
		this.specialPropertie1 = new ArmorSpecialPropertie("_",-1);
        this.specialPropertie2 = new ArmorSpecialPropertie("_",-1);
        this.setWeight(0);
	}

	/* GETTER AND SETTER */
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

	public TypeMaterial getTypeMaterial() {
		return typeMaterial;
	}

	public void setTypeMaterial(TypeMaterial typeMaterial) {
		this.typeMaterial = typeMaterial;
	}

	public Type getTypeArmor() {
		return typeArmor;
	}

	public void setTypeArmor(Type typeArmor) {
		this.typeArmor = typeArmor;
	}

	public boolean isMasterWork() {
		return isMasterWork;
	}

	public void setMasterWork(boolean isMasterWork) {
		this.isMasterWork = isMasterWork;
	}

	public ArmorSpecialPropertie getSpecialPropertie1() {
		return specialPropertie1;
	}

	public void setSpecialPropertie1(ArmorSpecialPropertie specialPropertie1) {
		this.specialPropertie1 = specialPropertie1;
	}

	public ArmorSpecialPropertie getSpecialPropertie2() {
		return specialPropertie2;
	}

	public void setSpecialPropertie2(ArmorSpecialPropertie specialPropertie2) {
		this.specialPropertie2 = specialPropertie2;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public SmartItem getSmartItem() {
		return smartItem;
	}

	public void setSmartItem(SmartItem smartItem) {
		this.smartItem = smartItem;
	}
}
