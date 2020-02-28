package utility;
import weapon.Material;
import weapon.MeleeWeapon;
import weapon.Munition;
import weapon.RangeWeapon;
import weapon.Type;
import weapon.TypeMaterial;
import weapon.Weapon;

/**
 * Constant contient les constantes pour les tirages du générateur.
 * Basé sur le tableau : Generateur_de_tresor.ods (en lien sur Github).
 * Rareté 1 : faible inférieur
 * Rareté 2 : faible supérieur
 * Rareté 3 : intermédiaire inférieur
 * Rareté 4 : intermédiaire supérieur
 * Rareté 5 : puissant inférieur
 * Rareté 6 : puissant supérieur
 * @author Mentra20
 *
 */
public class Constant {

	// Tableau de drop pour arme de rareté 1.
	public static Data<Tuple<Integer,Integer>> rarity1(){
		Data<Tuple<Integer,Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, null), 80));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(0, null), 20));
		
		return res;
	}
	
	// Tableau de drop des armes spécifique rareté 1.
	public static Data<Weapon> specificWeapon1(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Weapon("Balle de signalisation"), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Flèche endormante"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Bille de poussière"), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Carreau d’enchevêtrement"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Carreau hurleur"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Dague de maître en argent"), 10));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Bille de l’alchimiste"), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Épée longue de maître en fer froid"), 10));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Flèche silencieuse"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Flèche silencieuse supérieure"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Javeline de foudre"), 10));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Flèche brûlante"), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Flèche grésillante"), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Balle fouisseuse"), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Carreau asséchant"), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Flèche mortelle"), 8));
		
		return res;
	}
	
	// Tableau de drop des armes.
	public static Data<Weapon> weaponList(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("épée bâtarde", null, null, Type.CAC_1M, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("hache d’armes", null, null,Type.CAC_1M, TypeMaterial.STEEL), 4));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("bolas",null,null, new Munition("bolas"),TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("gourdin", null, null, Type.CAC_1M, TypeMaterial.WOOD), 2));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("arc long composite",null,null, new Munition("flèche"),TypeMaterial.WOOD), 2));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("arc court composite",null,null, new Munition("flèche"),TypeMaterial.WOOD), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("dague", null, null,Type.CAC_LIGHT ,TypeMaterial.STEEL), 4));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("fléchette",null,null, new Munition("fléchette"),TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("hache d’armes de nain", null, null,Type.CAC_1M ,TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("cimeterre à deux mains", null, null,Type.CAC_2M, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("gantelet", null, null,Type.CAC_LIGHT, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("coutille", null, null,Type.CAC_2M, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("grande hache", null, null, Type.CAC_2M, TypeMaterial.STEEL), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("massue", null, null,Type.CAC_2M , TypeMaterial.WOOD), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("épée à deux mains", null, null, Type.CAC_2M, TypeMaterial.STEEL), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("hallebarde", null, null,Type.CAC_2M ,TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("hachette", null, null,Type.CAC_LIGHT ,TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("arbalète lourde",null,null, new Munition("carreau"),TypeMaterial.STEEL), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("fléau d’armes lourd", null, null,Type.CAC_2M, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("masse d’armes lourde", null, null,Type.CAC_1M, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("lance d’arçon", null, null,Type.CAC_2M, TypeMaterial.STEEL), 2));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("arbalète légère",null,null, new Munition("carreau"),TypeMaterial.STEEL), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("fléau d’armes léger", null, null,Type.CAC_1M, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("marteau léger", null, null,Type.CAC_LIGHT ,TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("masse d’armes légère", null, null,Type.CAC_LIGHT, TypeMaterial.STEEL), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("pic de guerre léger", null, null, Type.CAC_LIGHT ,TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("arc long",null,null, new Munition("flèche"),TypeMaterial.STEEL), 4));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("pique", null, null, Type.CAC_2M, TypeMaterial.WOOD), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("épée longue", null, null, Type.CAC_1M,TypeMaterial.STEEL), 7));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("morgenstern", null, null, Type.CAC_1M,TypeMaterial.STEEL), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("nunchaku", null, null,Type.CAC_LIGHT, TypeMaterial.WOOD), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("bâton", null, null, Type.CAC_2M,TypeMaterial.WOOD), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("rapière", null, null,Type.CAC_1M, TypeMaterial.STEEL), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("lance", null, null,Type.CAC_2M, TypeMaterial.STEEL), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("trident", null, null,Type.CAC_1M, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("marteau de guerre", null, null,Type.CAC_1M, TypeMaterial.STEEL), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("fouet", null, null,Type.CAC_1M, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("autre arme de corps à corps légère", null, Material.NOTHING, Type.CAC_LIGHT, null), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("autre arme de corps à corps à une main", null, Material.NOTHING, Type.CAC_1M, null), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("autre arme de corps à corps à deux mains", null, Material.NOTHING, Type.CAC_2M, null), 2));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("autre arme à distance",null,Material.NOTHING, new Munition("à determiner"),null), 2));
		
		return res;
	}
	
	// Tableau de drop des munitions.
	public static Data<Weapon> weaponMunition() {
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Munition(null, null, null, "2d10"),10));
		res.add(new Tuple<Weapon, Integer>(new Munition(null, null, null, "4d10"),10));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon(null, null, null, new Munition(null), null), 60));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon(null, null, null, new Munition(null, null, null, "2d10"), null), 10));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon(null, null, null, new Munition(null, null, null, "4d10"), null), 10));
		
		return res;
	}
	
	// Tableau de drop des matériaux (métal).
	public static Data<Material> steelMaterial(){
		Data<Material> res = new Data<Material>();
		res.add(new Tuple<Material, Integer>(Material.PIERRE, 1));
		res.add(new Tuple<Material, Integer>(Material.OR, 1));
		res.add(new Tuple<Material, Integer>(Material.OS, 1));
		res.add(new Tuple<Material, Integer>(Material.OBSIDIENNE, 1));
		res.add(new Tuple<Material, Integer>(Material.BRONZE, 2));
		res.add(new Tuple<Material, Integer>(Material.NOTHING, 50));
		res.add(new Tuple<Material, Integer>(Material.VIRIDIUM, 2));
		res.add(new Tuple<Material, Integer>(Material.RACINE_DE_WYR, 3));
		res.add(new Tuple<Material, Integer>(Material.ACIER_VIVANT, 7));
		res.add(new Tuple<Material, Integer>(Material.FER_FROID, 7));
		res.add(new Tuple<Material, Integer>(Material.ARGENT_ALCHIMIQUE, 7));
		res.add(new Tuple<Material, Integer>(Material.CRISTAL_DE_SANG, 2));
		res.add(new Tuple<Material, Integer>(Material.MITHRAL, 6));
		res.add(new Tuple<Material, Integer>(Material.ACIER_ARDENT, 4));
		res.add(new Tuple<Material, Integer>(Material.ACIER_GLACE, 1));
		res.add(new Tuple<Material, Integer>(Material.BRONZE_ELYSEEN, 3));
		res.add(new Tuple<Material, Integer>(Material.ADAMENTIUM, 2));
		
		return res;
	}
	
	// Tableau de drop des matériaux (bois).
	public static Data<Material> woodMaterial(){
		Data<Material> res = new Data<Material>();
		res.add(new Tuple<Material, Integer>(Material.OS, 5));
		res.add(new Tuple<Material, Integer>(Material.NOTHING, 50));
		res.add(new Tuple<Material, Integer>(Material.BOIS_FLEXIBLE, 15));
		res.add(new Tuple<Material, Integer>(Material.EBENITE, 15));
		res.add(new Tuple<Material, Integer>(Material.BOIS_VERT, 10));
		res.add(new Tuple<Material, Integer>(Material.RACINE_DE_WYR, 5));
		
		return res;
	}
}
