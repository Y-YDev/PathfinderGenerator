package constant;

import item.armor.ArmorShield;
import item.armor.ArmorSpecialPropertie;
import item.armor.Material;
import item.armor.Type;
import item.armor.TypeMaterial;
import utility.Data;
import utility.Tuple;


/**
 * Constant contient les constantes des armure et bouclier pour les tirages du générateur.
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
public class ArmorConstant {

	// Tableau de drop pour armure/bouclier de rareté 1.
	public static Data<Tuple<Integer,Integer>> rarity1(){
		Data<Tuple<Integer,Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 0), 80));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(-1, 0), 20));
			
		return res;
	}
	
	// Tableau de drop pour armure/bouclier de rareté 2.
	public static Data<Tuple<Integer,Integer>> rarity2(){
		Data<Tuple<Integer,Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 0), 26));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 0), 27));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 1), 27));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(-1, 0), 20));
				
		return res;
	}
	
	// Tableau de drop pour armure/bouclier de rareté 3.
	public static Data<Tuple<Integer,Integer>> rarity3(){
		Data<Tuple<Integer,Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 0), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 0), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(3, 0), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 1), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 11), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 2), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 1), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(-1, 0), 20));
				
		return res;
	}
	
	// Tableau de drop pour armure/bouclier de rareté 4.
	public static Data<Tuple<Integer,Integer>> rarity4(){
		Data<Tuple<Integer,Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 0), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(3, 0), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 1), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 2), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 1), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 2), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(3, 1), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(-1, 0), 20));
				
		return res;
	}
	
	// Tableau de drop pour armure/bouclier de rareté 5.
	public static Data<Tuple<Integer,Integer>> rarity5(){
		Data<Tuple<Integer,Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(3, 0), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 0), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 2), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 3), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 2), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(3, 1), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 1), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(-1, 0), 20));
				
		return res;
	}
	
	// Tableau de drop pour armure/bouclier de rareté 6.
	public static Data<Tuple<Integer,Integer>> rarity6(){
		Data<Tuple<Integer,Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 0), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 0), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 1), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 2), 8));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 3), 8));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 4), 5));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 1), 8));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 2), 8));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 3), 4));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 22), 3));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 4), 3));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 5), 3));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(-1, 0), 20));
				
		return res;
	}
	
	
	// Tableau de drop des armure/bouclier.
	public static Data<ArmorShield> armorShieldList(){
		Data<ArmorShield> res = new Data<ArmorShield>();
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Crevice",TypeMaterial.STEEL,Type.HEAVY,250,17.5), 4));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Cuirasse",TypeMaterial.STEEL,Type.INTERMEDIATE,200 ,15), 7));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Targe",TypeMaterial.STEEL,Type.SHIELD,5,2.5), 3));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Chemise de maille",TypeMaterial.STEEL,Type.LIGTH,100,12.5), 7));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Cotte de maille",TypeMaterial.STEEL,Type.INTERMEDIATE,150,20), 6));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Harnois",TypeMaterial.STEEL,Type.HEAVY,1500,25), 7));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure de plaques",TypeMaterial.STEEL,Type.HEAVY,600,25), 5));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Ecu en acier",TypeMaterial.STEEL,Type.SHIELD,20,7.5), 6));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Ecu en bois",TypeMaterial.WOOD,Type.SHIELD,7,5), 6));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure de peau",TypeMaterial.LEATHER,Type.INTERMEDIATE,15,12.5), 4));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure de cuir",TypeMaterial.LEATHER,Type.LIGTH,10,7.5), 6));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Rondache en acier",TypeMaterial.STEEL,Type.SHIELD,9,3), 4));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Rondache en bois",TypeMaterial.WOOD,Type.SHIELD,3,2.5), 4));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Vêtement rembourré",TypeMaterial.LEATHER,Type.LIGTH,100,7.5), 3));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure d'écaille",TypeMaterial.STEEL,Type.INTERMEDIATE,50,15), 5));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Clibanion",TypeMaterial.STEEL,Type.HEAVY,200,22.5), 4));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure de cuir cloutée",TypeMaterial.LEATHER,Type.LIGTH,25,10), 6));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Pavois",TypeMaterial.WOOD,Type.SHIELD,30,22.5), 3));
		//Cas à gérer manuellement
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Autre armure légère",TypeMaterial.NOTHING,Type.LIGTH,0,0), 3));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Autre armure intermédaire",TypeMaterial.NOTHING,Type.INTERMEDIATE,0,0), 2));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Autre armure lourde",TypeMaterial.NOTHING,Type.HEAVY,0,0), 3));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Autre bouclier",TypeMaterial.NOTHING,Type.SHIELD,0,0), 2));
		
		return res;	
	}
	
	// Tableau de drop des armure spécifique rareté 1.
	public static Data<ArmorShield> specificArmor1(){
		Data<ArmorShield> res = new Data<ArmorShield>();
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Chemise de mailles en mithral",Type.LIGTH,1100), 50));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure de maître/non-magique fabriqué dans un matériau spécial",Type.NOTHING,0), 50));
	
		return res;
	}
	
	// Tableau de drop des armure spécifique rareté 2.
	public static Data<ArmorShield> specificArmor2(){
		Data<ArmorShield> res = new Data<ArmorShield>();
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Maillebrume",Type.LIGTH,2250), 33));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure En Peau d'Otyugh",Type.INTERMEDIATE,2565), 33));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Harnois en peau de dragon",Type.HEAVY,3300), 34));

		return res;
	}
	
	// Tableau de drop des armure spécifique rareté 3.
	public static Data<ArmorShield> specificArmor3(){
		Data<ArmorShield> res = new Data<ArmorShield>();
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Cotte de mailles elfique",Type.INTERMEDIATE,5150), 33));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure en peau de rhinocéros",Type.INTERMEDIATE,5165), 33));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure en peau de morlock",Type.LIGTH,8910), 34));

		return res;
	}
	
	// Tableau de drop des armure spécifique rareté 4.
	public static Data<ArmorShield> specificArmor4(){
		Data<ArmorShield> res = new Data<ArmorShield>();
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Cuirasse en adamantium",Type.INTERMEDIATE,10200), 15));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Habits du devin",Type.LIGTH,10300), 10));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure équestre",Type.HEAVY,10650), 13));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure En Peau d'Anguille Enchantée",Type.LIGTH,11160), 12));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure de Contorsionniste",Type.LIGTH,12160), 12));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Habits noirs du meurtrier",Type.LIGTH,12405), 10));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure pliante",Type.HEAVY,12650), 14));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Cuirasse de volatilisation",Type.INTERMEDIATE,15200), 14));

		return res;
	}
	
	// Tableau de drop des armure spécifique rareté 5.
	public static Data<ArmorShield> specificArmor5(){
		Data<ArmorShield> res = new Data<ArmorShield>();
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure d'insulte",Type.LIGTH,16175), 13));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Harnois nain",Type.HEAVY,16500), 16));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Crevice de la seconde chance",Type.HEAVY,18900), 16));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure en peau de chat",Type.LIGTH,18910), 13));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure céleste",Type.INTERMEDIATE,22400), 13));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Cuirasse du boucanier",Type.INTERMEDIATE,23850), 13));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Harnois des profondeurs",Type.HEAVY,24650), 16));

		return res;
	}
	
	// Tableau de drop des armure spécifique rareté 6.
	public static Data<ArmorShield> specificArmor6(){
		Data<ArmorShield> res = new Data<ArmorShield>();
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Cuirasse de commandement",Type.INTERMEDIATE,25400), 10));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Crevice impie",Type.HEAVY,25400), 4));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Harnois en mithral de vitesse",Type.HEAVY,26500), 10));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Gardien des forêts",Type.HEAVY,29350), 4));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Cuirasse-scarabée",Type.INTERMEDIATE,32350), 4));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure en peau de géant (ogre)",Type.INTERMEDIATE,39165), 6));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure en peau d'hamatula",Type.INTERMEDIATE,44215), 4));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure en peau de géant (géant des collines)",Type.INTERMEDIATE,46665), 6));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure démoniaque",Type.HEAVY,52260), 4));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure en peau de géant (géant de pierre, de feu ou de froid)",Type.INTERMEDIATE,54165), 6));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure en peau de géant (troll)",Type.INTERMEDIATE,59165), 6));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Cotte de mailles de malveillance",Type.INTERMEDIATE,61300), 6));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure en peau de géant (géant des nuages)",Type.INTERMEDIATE,69165), 6));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure en peau de géant (géant des tempêtes)",Type.INTERMEDIATE,76665), 6));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Astre du jour",Type.HEAVY,81250), 6));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Armure d'invincibilité",Type.HEAVY,137650), 8));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Harnois prismatique",Type.HEAVY,160650), 4));
		
		return res;
	}
	
	// Tableau de drop des boucliers spécifique rareté 1.
	public static Data<ArmorShield> specificShield1(){
		Data<ArmorShield> res = new Data<ArmorShield>();
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("écu en acier vivant",Type.SHIELD,120), 20));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Rondache en ébénite",Type.SHIELD,203), 25));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("écu en ébénite",Type.SHIELD,257), 25));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("écu en mithral",Type.SHIELD,1020), 30));
		
		return res;
	}
	
	// Tableau de drop des boucliers spécifique rareté 2.
	public static Data<ArmorShield> specificShield2(){
		Data<ArmorShield> res = new Data<ArmorShield>();
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Bouclier en peau de zombi",Type.SHIELD,2159), 30));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Bouclier des arcanes",Type.SHIELD,3153), 45));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Targe du cambrioleur",Type.SHIELD,4655), 25));
		
		return res;
	}
	
	// Tableau de drop des boucliers spécifique rareté 3.
	public static Data<ArmorShield> specificShield3(){
		Data<ArmorShield> res = new Data<ArmorShield>();
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Bouclier de la manticore",Type.SHIELD,5580), 35));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Bouclier du pourfendeur de dragons",Type.SHIELD,7170), 15));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Pavois pliant",Type.SHIELD,8170), 15));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Bouclier du lion",Type.SHIELD,9170), 35));
		
		return res;
	}
	
	// Tableau de drop des boucliers spécifique rareté 4.
	public static Data<ArmorShield> specificShield4(){
		Data<ArmorShield> res = new Data<ArmorShield>();
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Bouclier des arcanes suprême",Type.SHIELD,10153), 20));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Bouclier céleste",Type.SHIELD,13170), 20));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Bouclier maelström",Type.SHIELD,14170), 20));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Bouclier volcanique",Type.SHIELD,14170), 20));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Bouclier des tempêtes",Type.SHIELD,15170), 20));
		
		return res;
	}
	
	// Tableau de drop des boucliers spécifique rareté 5.
	public static Data<ArmorShield> specificShield5(){
		Data<ArmorShield> res = new Data<ArmorShield>();
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Bouclier crénelé",Type.SHIELD,16180), 20));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Bouclier ailé",Type.SHIELD,17257), 20));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Bouclier des éboulis",Type.SHIELD,19170), 20));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Bouclier forteresse",Type.SHIELD,19180), 20));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Bouclier du pourfendeur de dracosires",Type.SHIELD,20170), 20));
		
		return res;
	}
	
	// Tableau de drop des boucliers spécifique rareté 6.
	public static Data<ArmorShield> specificShield6(){
		Data<ArmorShield> res = new Data<ArmorShield>();
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Pavois d'esquive magique",Type.SHIELD,25180), 20));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Targe de blocage éclair",Type.SHIELD,36155), 15));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Bouclier agressif",Type.SHIELD,36170), 15));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Pavois de force",Type.SHIELD,46030), 15));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Bouclier phagocyte",Type.SHIELD,50170), 20));
		res.add(new Tuple<ArmorShield, Integer>(new ArmorShield("Bouclier de l'élysée",Type.SHIELD,52620), 15));
		
		return res;
	}

	
	// Tableau de drop des matériaux (métal).
	public static Data<Material> steelMaterial(){
		Data<Material> res = new Data<Material>();
		res.add(new Tuple<Material, Integer>(Material.OS, 1));
		res.add(new Tuple<Material, Integer>(Material.OR, 1));
		res.add(new Tuple<Material, Integer>(Material.BRONZE, 2));
		res.add(new Tuple<Material, Integer>(Material.NOTHING, 49));
		res.add(new Tuple<Material, Integer>(Material.ACIER_VIVANT, 7));
		res.add(new Tuple<Material, Integer>(Material.ACIER_ARDENT, 7));
		res.add(new Tuple<Material, Integer>(Material.ACIER_GLACE, 2));
		res.add(new Tuple<Material, Integer>(Material.MITHRAL, 15));
		res.add(new Tuple<Material, Integer>(Material.BRONZE_ELYSEEN, 5));
		res.add(new Tuple<Material, Integer>(Material.ADAMENTIUM, 6));
		res.add(new Tuple<Material, Integer>(Material.PEAU_DE_DRAGON, 5));
			
		return res;
	}
	
	// Tableau de drop des matériaux (cuir/bois).
	public static Data<Material> leatherWoodMaterial(){
		Data<Material> res = new Data<Material>();
		res.add(new Tuple<Material, Integer>(Material.OS, 2));
		res.add(new Tuple<Material, Integer>(Material.EBENITE, 3));
		res.add(new Tuple<Material, Integer>(Material.NOTHING, 62));
		res.add(new Tuple<Material, Integer>(Material.CRIN_DE_GRIFFON, 8));
		res.add(new Tuple<Material, Integer>(Material.PEAU_D_ANGUILLE, 10));
		res.add(new Tuple<Material, Integer>(Material.PEAU_D_ANGE, 2));
		res.add(new Tuple<Material, Integer>(Material.TISSUS_DE_SOMBREFEUILLE, 11));
		res.add(new Tuple<Material, Integer>(Material.PEAU_DE_DRAGON, 2));
	
		return res;
	}
	
	// Tableau des propriétés spéciale d'armure de rang 1.
	public static Data<ArmorSpecialPropertie> armorSpecialProperties1(){
		Data<ArmorSpecialPropertie> res = new Data<ArmorSpecialPropertie>();
		
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Soutien", 2000), 6));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Résistance au poison", 2250), 6));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("équilibrée", 1), 6));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Amertume", 1), 6));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Renforcement", 1), 6));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Pugilat", 1), 6));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Championne", 1), 6));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Fourberie", 1), 6));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Immortalité", 1), 6));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Opposition", 1), 6));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Défense (légère)", 1), 6));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Barbelée", 1), 5));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Solide", 1), 5));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Miroir", 1), 6));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Stockage de sort", 1), 6));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Garrot", 1), 6));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Prévention", 1), 6));
		
		return res;
	}
	
	// Tableau des propriétés spéciale d'armure de rang 2.
	public static Data<ArmorSpecialPropertie> armorSpecialProperties2(){
		Data<ArmorSpecialPropertie> res = new Data<ArmorSpecialPropertie>();
		
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Mimétisme", 2700), 12));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Joute", 3750), 12));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Ombre", 3750), 14));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Graisseuse", 3750), 14));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Expéditive", 4000), 12));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Discrétion", 5000), 12));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Ralliement", 5000), 12));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Résistance à la magie (13)", 2), 12));
		
		return res;
	}
	
	// Tableau des propriétés spéciale d'armure de rang 3.
	public static Data<ArmorSpecialPropertie> armorSpecialProperties3(){
		Data<ArmorSpecialPropertie> res = new Data<ArmorSpecialPropertie>();
		
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Adhésive", 7000), 8));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Niche", 7000), 9));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("éclatante", 7500), 9));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Fouisseuse", 10000), 10));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Putride", 10000), 9));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Défense (intermédiaire)", 3), 10));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Spectrale", 3), 10));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Invulnérabilité", 3), 9));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Résistance à la magie (15)", 3), 10));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Titanesque", 3), 8));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Forme animale", 3), 8));
		
		return res;
	}
	
	// Tableau des propriétés spéciale d'armure de rang 4.
	public static Data<ArmorSpecialPropertie> armorSpecialProperties4(){
		Data<ArmorSpecialPropertie> res = new Data<ArmorSpecialPropertie>();
		
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Harmonique", 15000), 16));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Ombre supérieure", 15000), 17));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Graisseuse supérieure", 15000),17));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Résistance aux énergies destructives", 18000), 17));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Martyr", 18000), 16));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Résistance à la magie (17)", 4), 17));
		
		return res;
	}
	
	// Tableau des propriétés spéciale d'armure de rang 5.
	public static Data<ArmorSpecialPropertie> armorSpecialProperties5(){
		Data<ArmorSpecialPropertie> res = new Data<ArmorSpecialPropertie>();
		
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Vertueuse", 27000), 8));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Libertaire", 27000), 7));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Impie", 27000), 8));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Vigilante", 27000), 7));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Détermination", 30000), 7));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Ombre suprême", 33750), 8));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Graisseuse suprême", 33750), 8));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Résistance supérieure aux énergies destructives", 42000), 8));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("éthérée", 49000), 8));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Contrôle des morts-vivants", 49000), 7));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Résistance suprême aux énergies destructives", 66000), 8));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Défense (lourde)", 5), 8));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Résistance à la magie (19)", 5), 8));
		
		return res;
	}
	
	
	// Tableau des propriétés spéciale de bouclier de rang 1.
	public static Data<ArmorSpecialPropertie> shieldSpecialProperties1(){
		Data<ArmorSpecialPropertie> res = new Data<ArmorSpecialPropertie>();
		
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Résistance au poison", 2250), 10));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Interception de projectile", 1), 9));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Attaque", 1), 9));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Aveuglante", 1), 9));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Retentissant", 1), 9));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Opposition", 1), 9));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Défense (légère)", 1), 9));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Barbelée", 1), 9));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Solide", 1), 9));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Miroir", 1), 9));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Bêlier", 1), 9));
		
		return res;
	}	
	
	// Tableau des propriétés spéciale de bouclier de rang 2.
	public static Data<ArmorSpecialPropertie> shieldSpecialProperties2(){
		Data<ArmorSpecialPropertie> res = new Data<ArmorSpecialPropertie>();
		
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Ralliement", 5700), 15));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Souffle draconique", 5000), 15));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Animée", 2), 20));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Anti-projectiles", 2), 17));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Fusion", 2), 15));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Résistance à la magie (13)", 2), 18));
		
		return res;
	}	
	
	// Tableau des propriétés spéciale de bouclier de rang 3.
	public static Data<ArmorSpecialPropertie> shieldSpecialProperties3(){
		Data<ArmorSpecialPropertie> res = new Data<ArmorSpecialPropertie>();
		
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Niche", 7500), 15));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("éclatante", 7500), 17));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Défense (intermédiaire)", 3), 17));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Spectrale", 3), 17));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Résistance à la magie (15)", 3), 17));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Forme animale", 3), 17));
		
		return res;
	}	
	
	// Tableau des propriétés spéciale de bouclier de rang 4.
	public static Data<ArmorSpecialPropertie> shieldSpecialProperties4(){
		Data<ArmorSpecialPropertie> res = new Data<ArmorSpecialPropertie>();
		
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Résistance aux énergies destructives", 18000),50));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Résistance à la magie (17)", 4), 50));
		
		return res;
	}	
	
	// Tableau des propriétés spéciale de bouclier de rang 5.
	public static Data<ArmorSpecialPropertie> shieldSpecialProperties5(){
		Data<ArmorSpecialPropertie> res = new Data<ArmorSpecialPropertie>();
		
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Détermination", 30000), 11));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Résistance supérieure aux énergies destructives", 42000), 16));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Contrôle des morts-vivants", 49000), 11));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Résistance supréme aux énergies destructives", 66000), 17));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Défense (lourde)", 5), 15));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Réfléchissante", 5), 15));
		res.add(new Tuple<ArmorSpecialPropertie, Integer>(new ArmorSpecialPropertie("Résistance à la magie (19)", 5), 15));

		return res;
	}		
	
}
