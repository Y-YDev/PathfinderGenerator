package utility;
import weapon.Material;
import weapon.MeleeWeapon;
import weapon.Munition;
import weapon.RangeWeapon;
import weapon.Type;
import weapon.TypeDamage;
import weapon.TypeMaterial;
import weapon.Weapon;
import weapon.WeaponSpecialPropertie;

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
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 0), 80));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(0, 0), 20));
		
		return res;
	}
	
	//Tableau de drop pour arme de rareté 2.
	public static Data<Tuple<Integer, Integer>> rarity2(){
		Data<Tuple<Integer, Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 0), 26));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 0), 27));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 1), 27));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(0, 0), 20));
		
		return res;
	}
	
	//Tableau de drop pour arme de rareté 3.
	public static Data<Tuple<Integer, Integer>> rarity3(){
		Data<Tuple<Integer, Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 0), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 0), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(3, 0), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 1), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 11), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 2), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 1), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(0, 0), 20));
			
		return res;
	}	
	
	//Tableau de drop pour arme de rareté 4.
	public static Data<Tuple<Integer, Integer>> rarity4(){
		Data<Tuple<Integer, Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 0), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(3, 0), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 1), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 2), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 1), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 2), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(3, 1), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(0, 0), 20));
				
		return res;
	}
	
	//Tableau de drop pour arme de rareté 5.
	public static Data<Tuple<Integer, Integer>> rarity5(){
		Data<Tuple<Integer, Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(3, 0), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 0), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 2), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 3), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 2), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(3, 1), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 1), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(0, 0), 20));
				
		return res;
	}
	
	//Tableau de drop pour arme de rareté 6.
	public static Data<Tuple<Integer, Integer>> rarity6(){
		Data<Tuple<Integer, Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 0), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 0), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 1), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 2), 8));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 3), 8));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 4), 5));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 1), 8));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 2), 8));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 3), 4));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 4), 3));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 14), 3));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 23), 3));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(0, 0), 20));
					
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
	
	// Tableau de drop des armes spécifique rareté 2.
	public static Data<Weapon> specificWeapon2(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Weapon("Dague en adamantium"), 20));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Hache d’armes en adamantium"), 20));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Balle fouisseuse supérieure"), 10));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Flèche mortelle supérieure"), 20));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Lance de joute"), 10));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Brise-arme"), 20));
		
		return res;
	}
	
	// Tableau de drop des armes spécifique rareté 3.
	public static Data<Weapon> specificWeapon3(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Weapon("Kukri de la saignée"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Masse de roc"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Gourdin bestial"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fourche de guerre"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Goupillon intarissable"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Bâton des ouragans"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Dague venimeuse"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Lame obscure"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fronde morsure-du-froid"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Trident de stabilité"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Trident d’alerte sous-marine"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Dague de l’assassin"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Dague jumelle"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fléau de terre"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Grande hache de vitesse"), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Marteau de polarité"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Entrave"), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Regret du changeant"), 7));
			
		return res;
	}
	
	// Tableau de drop des armes spécifique rareté 4.
	public static Data<Weapon> specificWeapon4(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Weapon("Piégeuse de dragons"), 7));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Épée à dix anneaux"), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Trident des tritons"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Masse de démolition inférieure"), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Rapière désarmante"), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fouet urticant"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Brise-bouclier"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Trident de domination aquatique"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Bâton de l’acrobate"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Pistolet drake-de-feu"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Marteau de ricochet"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Épée ardente"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Comète"), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Épée de bonne fortune (0 souhait)"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Épée de précision"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Épée des plans"), 5));
				
		return res;
	}
	
	
	// Tableau de drop des armes spécifique rareté 5.
	public static Data<Weapon> specificWeapon5(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Weapon("Épée aux neuf vies"), 12));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Hache affaiblissante"), 14));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Geôlier des âmes"), 14));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Marteau des nains"), 15));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Arc du long serment"), 15));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Épée voleuse de vie"), 15));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Apprentie du coupe-gorge"), 15));
		
		return res;
	}
	
	// Tableau de drop des armes spécifique rareté 6.
	public static Data<Weapon> specificWeapon6(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Weapon("Complainte des goules"), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Masse d’épouvante"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fouet des Enfers"), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Châtiment des dragons"), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Hache dévitalisante"), 4));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Épée du brave"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Tourment des invocateurs"), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Cimeterre des bois"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Lame spirituelle"), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Lance coeur-de-bois"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Rapière d’anémie"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Épée radieuse"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Katana du soleil levant"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Épée de givre"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Marteau de lancer nain"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Dague vampirique"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Cimeterre de rage assassine"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Épée de bonne fortune (1 souhait)"), 4));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Lame gardienne"), 4));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Pistolet des cieux infinis"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Masse de démolition"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Katana du moine sanctifié"), 4));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Chapardeur magique"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Croc de l’araignée"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fléau des démons"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Faux du néant"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Épée de bonne fortune (2 souhaits)"), 4));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Épée de justice"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Lame du bâtard"), 4));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Épée de bonne fortune (3 souhaits)"), 4));
					
		return res;
	}
	
	// Tableau de drop des armes.
	public static Data<Weapon> weaponList(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("épée bâtarde", null, null, Type.CAC_1M, TypeDamage.T, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("hache d’armes", null, null,Type.CAC_1M, TypeDamage.T, TypeMaterial.STEEL), 4));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("bolas",null,null, new Munition("bolas"),TypeDamage.C,TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("gourdin", null, null, Type.CAC_1M,TypeDamage.C, TypeMaterial.WOOD), 2));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("arc long composite",null,null, new Munition("flèche"),TypeDamage.P,TypeMaterial.WOOD), 2));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("arc court composite",null,null, new Munition("flèche"),TypeDamage.P,TypeMaterial.WOOD), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("dague", null, null,Type.CAC_LIGHT ,TypeDamage.P_T,TypeMaterial.STEEL), 4));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("fléchette",null,null, new Munition("fléchette"),TypeDamage.P,TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("hache d’armes de nain", null, null,Type.CAC_1M ,TypeDamage.T, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("cimeterre à deux mains", null, null,Type.CAC_2M,TypeDamage.T, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("gantelet", null, null,Type.CAC_LIGHT, TypeDamage.C, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("coutille", null, null,Type.CAC_2M, TypeDamage.T, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("grande hache", null, null, Type.CAC_2M,TypeDamage.T,TypeMaterial.STEEL), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("massue", null, null,Type.CAC_2M ,TypeDamage.C, TypeMaterial.WOOD), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("épée à deux mains", null, null, Type.CAC_2M, TypeDamage.T, TypeMaterial.STEEL), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("hallebarde", null, null,Type.CAC_2M ,TypeDamage.P_T, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("hachette", null, null,Type.CAC_LIGHT ,TypeDamage.T, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("arbalète lourde",null,null, new Munition("carreau"),TypeDamage.P, TypeMaterial.STEEL), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("fléau d’armes lourd", null, null,Type.CAC_2M,TypeDamage.C, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("masse d’armes lourde", null, null,Type.CAC_1M,TypeDamage.C, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("lance d’arçon", null, null,Type.CAC_2M, TypeDamage.P, TypeMaterial.STEEL), 2));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("arbalète légère",null,null, new Munition("carreau"),TypeDamage.P, TypeMaterial.STEEL), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("fléau d’armes léger", null, null,Type.CAC_1M, TypeDamage.C, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("marteau léger", null, null,Type.CAC_LIGHT ,TypeDamage.C, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("masse d’armes légère", null, null,Type.CAC_LIGHT,TypeDamage.C, TypeMaterial.STEEL), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("pic de guerre léger", null, null, Type.CAC_LIGHT ,TypeDamage.P, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("arc long",null,null, new Munition("flèche"),TypeDamage.P, TypeMaterial.STEEL), 4));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("pique", null, null, Type.CAC_2M,TypeDamage.P, TypeMaterial.WOOD), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("épée longue", null, null, Type.CAC_1M, TypeDamage.T, TypeMaterial.STEEL), 7));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("morgenstern", null, null, Type.CAC_1M, TypeDamage.C_P,TypeMaterial.STEEL), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("nunchaku", null, null,Type.CAC_LIGHT, TypeDamage.C, TypeMaterial.WOOD), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("bâton", null, null, Type.CAC_2M, TypeDamage.C, TypeMaterial.WOOD), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("rapière", null, null,Type.CAC_1M, TypeDamage.P ,TypeMaterial.STEEL), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("lance", null, null,Type.CAC_2M, TypeDamage.P, TypeMaterial.STEEL), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("trident", null, null,Type.CAC_1M,TypeDamage.P, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("marteau de guerre", null, null,Type.CAC_1M,TypeDamage.C,  TypeMaterial.STEEL), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("fouet", null, null,Type.CAC_1M, TypeDamage.T, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("autre arme de corps à corps légère", null, Material.NOTHING, Type.CAC_LIGHT, TypeDamage.NOTHING, null), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("autre arme de corps à corps à une main", null, Material.NOTHING, Type.CAC_1M, TypeDamage.NOTHING, null), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("autre arme de corps à corps à deux mains", null, Material.NOTHING, Type.CAC_2M, TypeDamage.NOTHING, null), 2));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("autre arme à distance",null,Material.NOTHING, new Munition("autre munition"), TypeDamage.NOTHING,null), 2));
		
		return res;
	}
	
	// Tableau de drop des munitions.
	public static Data<Weapon> weaponMunition() {
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Munition(null, null, null, "2d10"),10));
		res.add(new Tuple<Weapon, Integer>(new Munition(null, null, null, "4d10"),10));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon(null, null, null, new Munition(null),null, null), 60));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon(null, null, null, new Munition(null, null, null, "2d10"),null, null), 10));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon(null, null, null, new Munition(null, null, null, "4d10"),null, null), 10));
		
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
	
	//Tableau de drop des propriétés speciale de rareté 1. (mêlée)
	public static Data<WeaponSpecialPropertie> meleeSpecialPropertie1(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Solide"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mimétisme"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Alliance"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Tueuse"), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Soutient"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rappel"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Conductrice"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Corrosive"), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Contre-attaque"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Courageuse"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Cruelle"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rusée"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mortelle"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Gardienne"), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Dissipation"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Feu"), 6));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Froid"), 6));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Furieuse"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Spectrale"), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Flammegrise"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Protection contre l'électricité"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Protectrice"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Cherche-coeur"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Chasseresse"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Juge"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Acérée"), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Focalisation ki"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Révélatrice"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Menaçante"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Miséricordieuse"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Enchainement"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mimétique"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Neutralisante"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Intimidante"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Planaire"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Extinction"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Aquatique"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Foudre"), 6));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Stockage de sort"), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Dégivrante"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Lancer"), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Tonnerre"), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Vaillante"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Vicieuse"), 3));
		
		return res;
	}
	
	//Tableau de drop des propriétés speciale de rareté 2. (mêlée)
	public static Data<WeaponSpecialPropertie> meleeSpecialPropertie2(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Placement"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Anarchique"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Inamovible"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Axiomatique"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Explosion corrosive"), 7));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Survie"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Dissipation intense"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Destruction"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Feu intense"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Entêtée"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Glorieuse"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Sainte"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Froid intense"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Enflammée"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Percutante"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Revigorante"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Intensification ki"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Élan vital"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Atténuante"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Ancrage dimensionnel"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Foudre intense"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Filature"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Impie"), 7));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Sanglante"), 9));
		
		return res;
	}
	
	//Tableau de drop des propriétés speciale de rareté 3. (mêlée)
	public static Data<WeaponSpecialPropertie> meleeSpecialPropertie3(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Affaiblissement magique"), 20));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Repositionnante"), 20));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rapide"), 40));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Voleuse de magie"), 20));
		
		return res;
	}
	
	//Tableau de drop des propriétés speciale de rareté 4 et 5. (mêlée)
	public static Data<WeaponSpecialPropertie> meleeSpecialPropertie4_5(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Lumière"), 40));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Dansante"), 40));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Vorpale"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mutante"), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Duel"), 5));	
		
		return res;
	}
	
	//Tableau de drop des propriétés speciale de rareté 1. (distance)
	public static Data<WeaponSpecialPropertie> rangeSpecialPropertie1(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Polyvalent"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Solide"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mimétisme"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Alliance"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Tueuse"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rappel"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Conductrice"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Préservation"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Corrosive"), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Cruelle"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rusée"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Longue portée"), 8));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Feu"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Froid"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Chasseresse"), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Juge"), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Révélatrice"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Chanceux"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Miséricordieuse"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Planaire"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Fiable"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Boomerang"), 8));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Traqueuse"), 8));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Foudre"), 8));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Tonnerre"), 8));
		
		return res;
	}
	
	//Tableau de drop des propriétés speciale de rareté 2. (distance)
	public static Data<WeaponSpecialPropertie> rangeSpecialPropertie2(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Anarchique"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Inamovible"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Axiomatique"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Explosion corrosive"), 8));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Marquage"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Munitions inépuisables"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Feu intense"), 11));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Sainte"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Froid intense"), 11));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Enflammée"), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Ancrage dimensionnel"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Foudre intense"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Filature"), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Impie"), 10));
		
		return res;
	}
	
	//Tableau de drop des propriétés speciale de rareté 3 et 4. (distance)
	public static Data<WeaponSpecialPropertie> rangeSpecialPropertie3_4(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Chanceux supérieur"), 25));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Fiable supérieure"), 20));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rapide"), 40));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Lumière"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Marquage supérieur"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Preste"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Deuxième chance"), 2));
		
		return res;
	}
	
	//Tableau de drop des propriétés speciale de rareté 1. (munition)
	public static Data<WeaponSpecialPropertie> munitionSpecialPropertie1(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Charge étanche"), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Tueuse"), 11));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Conductrice"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Corrosive"), 11));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Cruelle"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rusée"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Feu"), 13));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Froid"), 13));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Spectrale"), 8));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Révélatrice"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Miséricordieuse"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Planaire"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Traqueuse"), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Foudre"), 13));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Tonnerre"), 14));
			
		return res;
	}
	
	//Tableau de drop des propriétés speciale de rareté 2. (munition)
	public static Data<WeaponSpecialPropertie> munitionSpecialPropertie2(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Anarchique"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Axiomatique"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Explosion corrosive"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Marquage"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Feu intense"), 12));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Sainte"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Froid intense"), 12));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Enflammée"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Ancrage dimensionnel"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Foudre intense"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Impie"), 10));
				
		return res;
	}
	
	//Tableau de drop des propriétés speciale de rareté 3. (munition)
	public static Data<WeaponSpecialPropertie> munitionSpecialPropertie3(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Lumière"), 66));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Marquage supérieur"), 34));
		
		return res;
	}
	
	//Tableau de drop pour une arme tueuse.
	public static Data<String> tueuseType(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("Aberrations", 5));
		res.add(new Tuple<String, Integer>("Animaux", 4));
		res.add(new Tuple<String, Integer>("Créatures artificielles", 7));
		res.add(new Tuple<String, Integer>("Dragons", 6));
		res.add(new Tuple<String, Integer>("Fées", 5));
		res.add(new Tuple<String, Integer>("Humanoïdes (choisir un sous-type)", 33));
		res.add(new Tuple<String, Integer>("Créatures magiques", 5));
		res.add(new Tuple<String, Integer>("Humanoïdes monstrueux", 5));
		res.add(new Tuple<String, Integer>("Vases", 2));
		res.add(new Tuple<String, Integer>("Extérieurs (choisir un sous-type)", 16));
		res.add(new Tuple<String, Integer>("Plantes", 2));
		res.add(new Tuple<String, Integer>("Morts-vivants", 8));
		res.add(new Tuple<String, Integer>("Vermine", 2));

		return res;
	}
}
