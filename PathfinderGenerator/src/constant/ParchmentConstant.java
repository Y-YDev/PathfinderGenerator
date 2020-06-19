package constant;

import parchment.Parchment;
import utility.Data;
import utility.Tuple;

/**
 * ParchmentConstant contient toutes les constantes pour crééer un parchemin.
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
public class ParchmentConstant {

	//Tirage pour les parchemins de rareté 1.
	public static Data<Integer> rarity1(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(0, 15));
		res.add(new Tuple<Integer, Integer>(1, 80));
		res.add(new Tuple<Integer, Integer>(2, 5));
		
		return res;
	}
	
	//Tirage pour les parchemins de rareté 2.
	public static Data<Integer> rarity2(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(0, 5));
		res.add(new Tuple<Integer, Integer>(1, 30));
		res.add(new Tuple<Integer, Integer>(2, 55));
		res.add(new Tuple<Integer, Integer>(3, 10));
		
		return res;
	}
	
	//Tirage pour les parchemins de rareté 3.
	public static Data<Integer> rarity3(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(2, 10));
		res.add(new Tuple<Integer, Integer>(3, 45));
		res.add(new Tuple<Integer, Integer>(4, 45));
		
		return res;
	}
	
	//Tirage pour les parchemins de rareté 4.
	public static Data<Integer> rarity4(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(3, 20));
		res.add(new Tuple<Integer, Integer>(4, 40));
		res.add(new Tuple<Integer, Integer>(5, 40));
		
		return res;
	}
	
	//Tirage pour les parchemins de rareté 5.
	public static Data<Integer> rarity5(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(4, 30));
		res.add(new Tuple<Integer, Integer>(5, 35));
		res.add(new Tuple<Integer, Integer>(6, 25));
		res.add(new Tuple<Integer, Integer>(7, 10));
		
		
		return res;
	}
	
	//Tirage pour les parchemins de rareté 6.
	public static Data<Integer> rarity6(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(6, 5));
		res.add(new Tuple<Integer, Integer>(7, 30));
		res.add(new Tuple<Integer, Integer>(8, 35));
		res.add(new Tuple<Integer, Integer>(9, 30));
		
		
		return res;
	}
	
	//Tableau de drop des parchemin profane commun de niveau 0.
	public static Data<Parchment> commonProfaneParchment0(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("aspersion acide", 12.5), 9));
		res.add(new Tuple<Parchment, Integer>(new Parchment("hébétement", 12.5), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection de la magie", 12.5), 10));
		res.add(new Tuple<Parchment, Integer>(new Parchment("illumination", 12.5), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("lumière", 12.5), 10));
		res.add(new Tuple<Parchment, Integer>(new Parchment("manipulation à distance", 12.5), 10));
		res.add(new Tuple<Parchment, Integer>(new Parchment("réparation", 12.5), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("prestidigitation", 12.5), 9));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rayon de givre", 12.5), 9));
		res.add(new Tuple<Parchment, Integer>(new Parchment("lecture de la magie", 12.5), 10));
		res.add(new Tuple<Parchment, Integer>(new Parchment("fatigue", 12.5), 9));
		
		return res;
	}
	
	//Tableau de drop des parchemin profane hors du commun de niveau 0.
	public static Data<Parchment> uncommonProfaneParchment0(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("signature magique", 12.5), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("saignement", 12.5), 10));
		res.add(new Tuple<Parchment, Integer>(new Parchment("lumières dansantes", 12.5), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection du poison", 12.5), 10));
		res.add(new Tuple<Parchment, Integer>(new Parchment("destruction de mort-vivant", 12.5), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("son imaginaire", 12.5), 9));
		res.add(new Tuple<Parchment, Integer>(new Parchment("message", 12.5), 10));
		res.add(new Tuple<Parchment, Integer>(new Parchment("ouverture/fermeture", 12.5), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("résistance", 12.5), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("inspection", 12.5), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("étincelles", 12.5), 9));
		res.add(new Tuple<Parchment, Integer>(new Parchment("allié involontaire", 12.5), 8));
		
		return res;
	}
	
	//Tableau de drop des parchemin divin commun de niveau 0.
	public static Data<Parchment> commonDivineParchment0(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("saignement", 12.5), 11));
		res.add(new Tuple<Parchment, Integer>(new Parchment("création d’eau", 12.5), 10));
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection de la magie", 12.5), 13));
		res.add(new Tuple<Parchment, Integer>(new Parchment("repérage", 12.5), 10));
		res.add(new Tuple<Parchment, Integer>(new Parchment("lumière", 12.5), 11));
		res.add(new Tuple<Parchment, Integer>(new Parchment("réparation", 12.5), 10));
		res.add(new Tuple<Parchment, Integer>(new Parchment("purification de nourriture et d’eau", 12.5), 10));
		res.add(new Tuple<Parchment, Integer>(new Parchment("lecture de la magie", 12.5), 13));
		res.add(new Tuple<Parchment, Integer>(new Parchment("stabilisation", 12.5), 12));
		
		return res;
	}
	
	//Tableau de drop des parchemin divin hors du commun de niveau 0.
	public static Data<Parchment> uncommonDivineParchment0(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection du poison", 12.5), 15));
		res.add(new Tuple<Parchment, Integer>(new Parchment("illumination", 12.5), 18));
		res.add(new Tuple<Parchment, Integer>(new Parchment("assistance divine", 12.5), 17));
		res.add(new Tuple<Parchment, Integer>(new Parchment("résistance", 12.5), 18));
		res.add(new Tuple<Parchment, Integer>(new Parchment("étincelles", 12.5), 17));
		res.add(new Tuple<Parchment, Integer>(new Parchment("stimulant", 12.5), 15));
		
		return res;
	}
	
	//Tableau de drop des parchemin profane commun de niveau 1.
	public static Data<Parchment> commonProfaneParchment1(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("mains brûlantes", 25), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("frayeur", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("charme-personne", 25), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("contact glacial", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("déguisement", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("endurance aux énergies destructives", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("agrandissement", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("repli expéditif", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("graisse", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("hypnose", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("identification", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("armure de mage", 25), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("projectile magique", 25), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("arme magique", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("brume de dissimulation	", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("protection contre le Chaos	2", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("protection contre le Mal", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("protection contre le Bien", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("protection contre la Loi", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rayon affaiblissant", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bouclier", 25), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("décharge électrique", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("image silencieuse", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sommeil", 25), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de monstres I", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("coup au but", 25), 4));
		
		return res;
	}
	
	//Tableau de drop des parchemin profane hors du commun de niveau 1.
	public static Data<Parchment> uncommonProfaneParchment1(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("bulle d’air", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("alarme", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("corde animée", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("charge de fourmi", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("caméléon", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cassé", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("couleurs dansantes", 25), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("compréhension des langages", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("contact corrosif", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection des passages secrets", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection des morts-vivants", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("effacement", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("grandes illuminations", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("disque flottant", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("verrouillage", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("poussée hydraulique", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("dague de stalactite", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("calme illusoire", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("saut", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("aura magique", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("frappe miroir", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("monture", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rayon de fièvre", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rapetissement", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("arme d’ombre", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bouclier de foudre", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("poing de pierre", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("caresse de la mer", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("serviteur invisible", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("grâce urbaine", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("disparition", 25), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("ventriloquie", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("altération vocale", 25), 2));
		
		return res;
	}
	
	//Tableau de drop des parchemin divin commun de niveau 1.
	public static Data<Parchment> commonDivineParchment1(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("imprécation", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bénédiction", 25), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("frayeur", 25), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("injonction", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("compréhension des langages", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("soins légers", 25), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection du Chaos", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection du Mal", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection du Bien", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection de la Loi", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection des morts-vivants", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("faveur divine", 25), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("anathème", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("enchevêtrement", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("blessure légère", 25), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("morsure magique", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("brume de dissimulation", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("flammes", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("protection contre le Chaos", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("protection contre le Mal", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("protection contre le Bien", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("protection contre la Loi", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("regain d’assurance", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sanctuaire", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bouclier de la foi", 25), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de monstres I", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation d’alliés naturels I", 25), 3));
		
		return res;
	}
	
	//Tableau de drop des parchemin divin hors du commun de niveau 1.
	public static Data<Parchment> uncommonDivineParchment1(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("charge de fourmi", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("aspect du faucon", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("apaisement des animaux", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("charme-animal", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("hostilité forcée", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("perception de la mort", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection de la faune ou de la flore", 25), 1));
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection des collets et des fosses", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("diagnostic", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("endurance aux énergies destructives", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bouclier entropique", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("lueur féerique", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("démarche aérienne", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("action interdite", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("morsure du froid", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("baie nourricière", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("invisibilité pour les animaux", 25), 1));
		res.add(new Tuple<Parchment, Integer>(new Parchment("invisibilité pour les morts-vivants", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("poussée hydraulique", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("saut", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sens surdéveloppés", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("ordre libérateur", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("grand pas", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("pierre magique", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("passage sans trace", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("dissipation de la fièvre", 25), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sanctification de cadavre", 25), 1));
		res.add(new Tuple<Parchment, Integer>(new Parchment("gourdin magique", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("communication avec les animaux", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("poing de pierre", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bouclier de pierre", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("métal solaire", 25), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("caresse de la mer", 25), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bénédiction de l’eau", 50), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("malédiction de l’eau", 50), 2));
		
		return res;
	}
	
	//Tableau de drop des parchemin profane commun de niveau 2.
	public static Data<Parchment> commonProfaneParchment2(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("flèche acide", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("modification d’apparence", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("endurance de l’ours", 150), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("flou", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("force de taureau", 150), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("grâce féline", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("ténèbres", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vision dans le noir", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("splendeur de l’aigle", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("simulacre de vie", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sphère de feu", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("ruse du renard", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("poussière scintillante", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("invisibilité", 150), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("déblocage", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("lévitation", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("image imparfaite", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("image miroir", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sagesse du hibou", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("résistance aux énergies destructives", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("corde enchantée", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rayon ardent", 150), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection de l’invisibilité", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("fracassement", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("pattes d’araignée", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de monstres II", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("nuée grouillante", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("toile d’araignée", 150), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vent de murmures", 150), 2));
		
		return res;
	}
	
	//Tableau de drop des parchemin profane hors du commun de niveau 2.
	public static Data<Parchment> uncommonProfaneParchment2(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("savoir manier une arme", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cécité/surdité", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("regard brûlant", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("poigne sûre", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("contrôle des morts-vivants", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("création de fosse", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("hébétement de monstre", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection des pensées", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("déguiser autrui", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("caresse élémentaire", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("souffle de feu", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("nappe de brouillard", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("baiser de la goule", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("planer", 150), 1));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bourrasque", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("brume hantée", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("fou rire", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("lueurs hypnotiques", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("localisation d’objet", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("réparation intégrale", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection faussée", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("dissimulation d’objet", 150), 1));
		res.add(new Tuple<Parchment, Integer>(new Parchment("poison pernicieux", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("protection contre les projectiles", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("pyrotechnie", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("arme boomerang", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("effroi", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("ancre d’ombre", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("partage des souvenirs", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vague", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("main spectrale", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("immolation spontanée", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("idiotie", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("froid pénétrant", 150), 1));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bouche magique", 160), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("verrou du mage", 175), 1));
		res.add(new Tuple<Parchment, Integer>(new Parchment("flamme éternelle", 200), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("piège illusoire", 200), 1));
		
		return res;
	}
	
	//Tableau de drop des parchemin divin commun de niveau 2.
	public static Data<Parchment> commonDivineParchment2(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("aide", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("arme alignée", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("messager animal", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("peau d’écorce", 150), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("endurance de l’ours", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("force de taureau", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("grâce féline", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("métal gelé", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("soins modérés", 150), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("ténèbres", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("ralentissement du poison", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("splendeur de l’aigle", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection des pièges", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("lame de feu", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("nappe de brouillard", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("métal brûlant", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("immobilisation d’animal", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("immobilisation de personne", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("blessure modérée", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sagesse du hibou", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("délivrance de la paralysie", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("résistance aux énergies destructives", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("restauration partielle", 150), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("protection d’autrui", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("silence", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cacophonie", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("arme spirituelle", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de monstres II", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation d’alliés naturels II", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("nuée grouillante", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("zone de vérité", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("augure", 175), 3));

		return res;
	}
	
	//Tableau de drop des parchemin divin commun de niveau 2.
	public static Data<Parchment> uncommonDivineParchment2(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("aspect animal", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("hypnose des animaux", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("animation des morts mineure", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("flèche de loi", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("aspect de l’ours", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bénédiction de vie et de courage", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("apaisement des émotions", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mise à mort", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("carreau de peur", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("armure sans effort", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("discours captivant", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sphère de feu", 150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("préservation des morts", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("grâce", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("élévation du sol", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bourrasque", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("armure instantanée", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("instrument d’agonie", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("réparation intégrale", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rapetissement d’animal", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("piste olfactive", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("éclat du chaos", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("partage de la langue", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("fracassement", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("ramollissement de la terre et de la pierre", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("lance de pureté", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("pattes d’araignée", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rapport", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme d’arbre", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("alignement indétectable", 150), 1));
		res.add(new Tuple<Parchment, Integer>(new Parchment("distorsion du bois", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("arme merveilleuse", 150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("façonnage du bois", 150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("consécration", 175), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("profanation", 175), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("piège à feu", 175), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("transformation de maître", 450), 1));

		return res;
	}
	
	//Tableau de drop des parchemin profane commun de niveau 3.
	public static Data<Parchment> commonProfaneParchment3(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme bestiale I", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("clignotement", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("dissipation de la magie", 375), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("déplacement", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("boule de feu", 375), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("flèches enflammées", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vol", 375), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("état gazeux", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rapidité", 375), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("héroïsme", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("immobilisation de personne", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sphère d’invisibilité", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("éclair", 375), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cercle magique contre le Chaos", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cercle magique contre le Mal", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cercle magique contre le Bien", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cercle magique contre la Loi", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("image accomplie", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("coursier fantôme", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("protection contre les énergies destructives", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("lenteur", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("nuage nauséabond", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("suggestion", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de monstres III", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("abri", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("don des langues", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("baiser du vampire", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("respiration aquatique", 375), 3));
		
		return res;
	}
	
	//Tableau de drop des parchemin profane hors du commun de niveau 3.
	public static Data<Parchment> uncommonProfaneParchment3(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("animation des morts mineure", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("orbe aqueux", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vision magique", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme bestiale", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("clairaudience/clairvoyance", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("manteau de vent", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("lumière du jour", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sommeil profond", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cacophonie distrayante", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("réservoir draconique", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("aura élémentaire", 375),5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("runes explosives", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("poing de force", 375), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("préservation des morts", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("immobilisation de morts-vivants", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vol de soins", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("torrent hydraulique", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("affûtage", 375), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("arme magique suprême", 375), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("physique monstrueux I", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rage", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rayon affaiblissant", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("peau résineuse", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("résistance aux énergies destructives (partagé)", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("page secrète", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("réduction d’objet", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("tempête de neige", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("fosse hérissée de pieux", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("anatomie morte-vivante I", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("arme polyvalente", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mur de vent", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("texte illusoire", 425), 1));
		res.add(new Tuple<Parchment, Integer>(new Parchment("antidétection", 425), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sceau du serpent", 875), 1));
		
		return res;
	}
	
	//Tableau de drop des parchemin divin commun de niveau 3.
	public static Data<Parchment> commonDivineParchment3(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("malédiction", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("appel de la foudre", 375), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("soins importants", 375), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("lumière du jour", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("ténèbres profondes", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("dissipation de la magie", 375), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("blessure grave", 375), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("négation de l’invisibilité", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("localisation d’objet", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cercle magique contre le Chaos", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cercle magique contre le Mal", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cercle magique contre le Bien", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cercle magique contre la Loi", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("morsure magique suprême", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("panoplie magique", 375), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("empoisonnement", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("prière", 375), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("protection contre les énergies destructives", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("guérison de la cécité/surdité", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("délivrance des malédictions", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("guérison des maladies", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("lumière brûlante", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("tempête de neige", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("communication avec les morts", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("façonnage de la pierre", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de monstres III", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation d’alliés naturels III", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("respiration aquatique", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("marche sur l’onde", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("animation des morts", 625), 3));
		
		return res;
	}
	
	//Tableau de drop des parchemin divin hors du commun de niveau 3.
	public static Data<Parchment> uncommonDivineParchment3(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("orbe aqueux", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("aura d’archon", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("accorder une intuition", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cécité/surdité", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("invasion d’orties", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("chaîne de perdition", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("contagion", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("création de nourriture et d’eau", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("flèche de l’aube", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rabougrissement des plantes", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("torche révélatrice", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("domination d’animal", 375), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("guide", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("main du berger", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("fusion dans la pierre", 375), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("dissimulation d’objet", 375), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("croissance végétale", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("extinction des feux", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sables changeants", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("collet", 375), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("communication avec les plantes", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("croissance d’épines", 375), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vision infernale", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mur de vent", 375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("manteau de colère", 375), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("flamme éternelle", 425), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sieste", 475), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("glyphe de garde", 575), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("symbole de guérison", 875), 2));
		
		return res;
	}
	
	//Tableau de drop des parchemin profane commun de niveau 4.
	public static Data<Parchment> commonProfaneParchment4(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme bestiale II", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("malédiction", 700), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("tentacules noirs", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("charme-monstre", 700), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("confusion", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("désespoir foudroyant", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("porte dimensionnelle", 700), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("ancre dimensionnelle", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("corps élémentaire I", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("énergie négative", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("agrandissement de groupe", 700), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("terreur", 700), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bouclier de feu", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("globe d’invulnérabilité partielle", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("tempête de grêle", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("invisibilité suprême", 700), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("assassin imaginaire", 700), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sphère d’isolement", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("scrutation", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation d’ombres", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cri", 700), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("brouillard dense", 700), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("façonnage de la pierre", 700), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de monstres IV	", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mur de feu", 700), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mur de glace", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("peau de pierre", 950), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("animation des morts", 1050), 3));
		
		return res;
	}
	
	//Tableau de drop des parchemin profane hors du commun de niveau 4.
	public static Data<Parchment> uncommonProfaneParchment4(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("fosse acide", 700), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("oeil du mage", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("boule de foudre", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("contagion", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vision dans le noir supérieure", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection de la scrutation", 700), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("souffle de dragon", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("simulacre de vie supérieur	", 700), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("jet de flamme", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mission", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("loup fantomatique", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("terrain hallucinatoire", 700), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mur illusoire", 700), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("localisation de créature", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("création mineure", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("physique monstrueux II", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("flot obsidien", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("char fantôme", 700), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("lueur d’arc-en-ciel", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rapetissement de groupe", 700), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("délivrance des malédictions", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("refuge du mage", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("projection d’ombre", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("image de foudre", 700), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("charge télékinétique", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme véritable", 700), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme de vermine I", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("tempête volcanique", 700), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("poussière d’étoile", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("piège à feu", 725), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mémorisation", 750), 1));
		
		return res;
	}
	
	//Tableau de drop des parchemin divin commun de niveau 4.
	public static Data<Parchment> commonDivineParchment4(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("marche dans les airs", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("marteau du Chaos", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("soins intensifs", 700), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("protection contre la mort", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("ancre dimensionnelle", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("détection du mensonge", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("renvoi", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("puissance divine", 700), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("colonne de feu", 700), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("liberté de mouvement", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("châtiment sacré", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("blessure critique", 700), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("arme magique suprême", 700), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("neutralisation du poison", 700), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("courroux de l’ordre", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("empoisonnement", 700), 4));//Il y est dans le tableau d'avant moins cher...
		res.add(new Tuple<Parchment, Integer>(new Parchment("immunité contre les sorts", 700), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("pierres acérées", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de monstres IV", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation d’alliés naturels IV", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("don des langues", 700), 3));//Idem (surement autres niveau de classe plus élevé)
		res.add(new Tuple<Parchment, Integer>(new Parchment("ténèbres maudites", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("divination", 725), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("allié d’outreplan", 1200), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("restauration", 1700), 4));
		
		return res;
	}
	
	//Tableau de drop des parchemin divin hors du commun de niveau 4.
	public static Data<Parchment> uncommonDivineParchment4(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("absorption de toxine", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("coquille antiplantes", 700), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("aspect du cerf", 700), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("aura de funeste destin", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("boule de foudre", 700), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bénédiction de ferveur", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("flétrissement végétal", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("empire végétal", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("contrôle de l’eau", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("présage débilitant", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vermine géante", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("tempête de grêle", 700), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("transfert de sorts", 700), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("porte-pestes", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("adaptation planaire", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("protection contre les énergies destructives (partagé)", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("réincarnation", 700), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("répulsif", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rouille", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("scrutation", 700), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("communication à distance", 700), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("allié spirituel", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("corps épineux", 700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("tempête volcanique", 700), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("symbole de lenteur", 1700), 2));
		
		return res;
	}
	
	//Tableau de drop des parchemin profane commun de niveau 5.
	public static Data<Parchment> commonProfaneParchment5(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("métamorphose funeste", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme bestiale III", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("annulation d’enchantement", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("brume mortelle", 1125), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cône de froid", 1125), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("contact avec les plans", 1125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("renvoi", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("domination", 1125), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("débilité", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("immobilisation de monstre", 1125), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("possession", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("brume mentale", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vol supérieur", 1125), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("passe-muraille", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("permanence", 1125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("allié d’outreplan", 1125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("métamorphose", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("communication à distance", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("magie des ombres", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de monstres V", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("télékinésie", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("téléportation", 1125), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mur de force", 1125), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mur de pierre", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vagues de fatigue", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("symbole de douleur", 2125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("symbole de sommeil", 2125), 3));
		
		return res;
	}
	
	//Tableau de drop des parchemin profane hors du commun de niveau 5.
	public static Data<Parchment> uncommonProfaneParchment5(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("absorption de toxine", 1125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("croissance animale", 1125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("flétrissement végétal", 1125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("songe", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("corps élémentaire II", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("fabrication", 1125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("serpent de feu", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("juxtaposition hostile", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("fosse affamée", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("prison de glace", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("main interposée", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bulle de vie", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("chien de garde", 1125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sanctuaire secret", 1125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("création majeure", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mirage", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("physique monstrueux III", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cauchemar", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("permanence", 1125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("adaptation planaire", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme végétale I", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("œil indiscret", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("coffre secret", 1125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("faux-semblant", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("estoc sonore", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("suffocation", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("lien télépathique", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("transmutation de la boue en pierre", 1125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("transmutation de la pierre en boue", 1125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("anatomie morte-vivante II", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme de vermine II", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("ailes de vent", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("leurre", 1375), 2));
		
		return res;
	}
	
	//Tableau de drop des parchemin divin commun de niveau 5.
	public static Data<Parchment> commonDivineParchment5(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("croissance animale", 1125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("pénitence", 1125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("métamorphose funeste", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("annulation d’enchantement", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("souffle de vie", 1125), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("appel de la tempête", 1125), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("injonction suprême", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("soins légers de groupe", 1125), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("protection contre la mort", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("arme destructrice", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("blessure légère de groupe", 1125), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("changement de plan", 1125), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("force du colosse", 1125), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("scrutation", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("exécution", 1125), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("résistance à la magie", 1125), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de monstres V", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation d’alliés naturels V", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("voyage par les arbres", 1125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mur de feu", 1125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mur de pierre", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mur d’épines", 1125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vision lucide", 1375), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("communion", 1625), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("éveil", 3125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rappel à la vie", 6125), 6));
		
		return res;
	}
	
	//Tableau de drop des parchemin divin hors du commun de niveau 5.
	public static Data<Parchment> uncommonDivineParchment5(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("marche dans les airs (partagé)", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("aspect du loup", 1125), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bénédiction de la salamandre", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("purification", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("communion avec la nature", 1125), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("contagion supérieure", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("contrôle des vents", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rejet du Chaos", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rejet du Mal", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rejet du Bien", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rejet de la Loi", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vents capricieux", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("action interdite supérieure", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("fléau d’insectes", 1125), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bulle de vie", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("marque de la justice", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("pilier de vie", 1125), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sérénité", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bâton serpent", 1125), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("immunité contre les sorts (partagé)", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("transmutation de la boue en pierre", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("transmutation de la pierre en boue", 1125), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("lames de vent", 1125), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("peau de pierre", 1375), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sanctification (sort de niveau 1)", 2125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("symbole de douleur", 2125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("symbole de sommeil", 2125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sanctification maléfique (sort de niveau 1)", 2125), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sanctification (sort de niveau 2)", 6125), 1));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sanctification maléfique (sort de niveau 2)", 6125), 1));
		
		return res;
	}
	
	//Tableau de drop des parchemin profane commun de niveau 6.
	public static Data<Parchment> commonProfaneParchment6(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("brume acide", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("zone d’antimagie", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("endurance de l’ours de groupe", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme bestiale IV", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("force de taureau de groupe", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("grâce féline de groupe", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("éclair multiple", 1650), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("désintégration", 1650), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("dissipation suprême", 1650), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("splendeur de l’aigle de groupe", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mauvais oeil", 1650), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("pétrification", 1650), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme draconique I", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("ruse du renard de groupe", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("globe d’invulnérabilité renforcée", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("héroïsme suprême", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("double illusoire", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sagesse du hibou de groupe", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("contrat intermédiaire", 1650), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("traversée des ombres", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("transmutation de la pierre en chair", 1650), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("suggestion de groupe", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de monstres VI", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("transformation martiale", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("voile", 1650), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mur de fer", 1700), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("création de mort-vivant", 1750), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mythes et légendes", 1900), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vision lucide", 1900), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cercle de mort", 2150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("symbole de terreur", 2650), 2));
		
		return res;
	}
	
	//Tableau de drop des parchemin profane hors du commun de niveau 6.
	public static Data<Parchment> uncommonProfaneParchment6(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("analyse d’enchantement", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("lien des esprits combatifs", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("manteau de rêves", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("contagion supérieure", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("flamme contagieuse", 1650), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("prévoyance", 1650), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("contrôle de l’eau", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("corps élémentaire III", 1650), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme liquide", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("main impérieuse", 1650), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sphère glaciale", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("quête", 1650), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("poudre d’escampette", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("défense magique", 1650), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("remémoration", 1650), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("physique monstrueux IV", 1650), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("glissement de terrain", 1650), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("image permanente", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme végétale II", 1650), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("champ de force", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sirocco", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("nappe de goudron", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("anatomie morte-vivante III", 1650), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("image programmée", 1675), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("annihilation de mort-vivant", 2150), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("symbole de persuasion", 6650), 2));
		
		return res;
	}
	
	//Tableau de drop des parchemin divin commun de niveau 6.
	public static Data<Parchment> commonDivineParchment6(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("endurance de l’ours de groupe", 1650), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("barrière de lames", 1650), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("force de taureau de groupe", 1650), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("grâce féline de groupe", 1650), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("soins modérés de groupe", 1650), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("dissipation suprême", 1650), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("splendeur de l’aigle de groupe	", 1650), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("orientation", 1650), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("germes de feu", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mise à mal", 1650), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("guérison suprême", 1650), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("festin des héros", 1650), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("blessure modérée de groupe", 1650),5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("chêne animé", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sagesse du hibou de groupe", 1650), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de monstres VI", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation d’alliés naturels VI", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mot de rappel", 1650), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("allié majeur d’outreplan", 2900), 4));
		
		return res;
	}
	
	//Tableau de drop des parchemin divin hors du commun de niveau 6.
	public static Data<Parchment> uncommonDivineParchment6(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("animation d’objets", 1650), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("coquille antivie", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bannissement", 1650), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("froide frappe de glace", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme de poussière", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("quête", 1650), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bois de fer", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("extase", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("glissement de terrain", 1650), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("tempête de peste", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("adaptation planaire de groupe", 1650), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("éloignement du bois", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sirocco", 1650),5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bâton à sort", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("pierres commères", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("peau de nuée", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("nappe de goudron", 1650), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("voie végétale", 1650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vent divin", 1650), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("création de mort-vivant", 1750), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("glyphe de garde suprême", 2050), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("annihilation de mort-vivant", 2150), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("symbole de douleur", 2650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("interdiction", 4650), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("symbole de persuasion", 6650), 2));
		
		return res;
	}
	
	//Tableau de drop des parchemin profane commun de niveau 7.
	public static Data<Parchment> commonProfaneParchment7(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("vision magique suprême", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bannissement", 2275), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("boule de feu à retardement", 2275), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme éthérée", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("doigt de mort", 2275), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme draconique II", 2275), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("immobilisation de personne de groupe", 2275), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("invisibilité de groupe", 2275), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("épée de force", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("porte de phase", 2275), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("changement de plan", 2275), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("métamorphose suprême", 2275), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mot de pouvoir aveuglant", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rayons prismatiques", 2275), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("inversion de la gravité", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("scrutation suprême", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation d’ombres suprême", 2275), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("renvoi des sorts", 2275), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de monstres VII", 2275), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("téléportation suprême", 2275), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vagues de fatigue", 2275), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("projection d’image", 2280), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cage de force", 2775), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("souhait limité", 3775), 3));
		
		return res;
	}
	
	//Tableau de drop des parchemin profane hors du commun de niveau 7.
	public static Data<Parchment> uncommonProfaneParchment7(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("contrôle des morts-vivants", 2275), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("contrôle du climat", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("création de demi-plan mineure", 2275), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("déviation", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("corps élémentaire IV", 2275), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("brandon", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vol de groupe", 2275), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme de géant I", 2275), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("poigne agrippeuse", 2275), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("juxtaposition hostile supérieure", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("corps de glace", 2275), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("aliénation mentale", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("manoir somptueux", 2275), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vengeance fantasmagorique", 2275), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("tempête de peste", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme végétale III", 2275), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("parole résonnante", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("dissimulation suprême", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("statue", 2275), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("téléportation d’objet", 2275), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("traverser l’espace", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vision", 2275), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("invocation instantanée", 3275), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("symbole d’étourdissement", 7275), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("symbole de faiblesse", 7275), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("simulacre", 8275), 2));

		return res;
	}
	
	//Tableau de drop des parchemin divin commun de niveau 7.
	public static Data<Parchment> commonDivineParchment7(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("blasphème", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("contrôle du climat", 2275), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mort rampante", 2275), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("soins importants de groupe", 2275), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("décret", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme éthérée", 2275), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("tempête de feu", 2275), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("parole sacrée", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("blessure importante de groupe", 2275), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("régénération", 2275), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("champ de force", 2275), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("scrutation suprême", 2275), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de monstres VII", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation d’alliés naturels VII", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rayon de soleil", 2275), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("parole du chaos", 2275), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("destruction", 2275), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("restauration suprême", 7275), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("résurrection", 12275), 6));

		return res;
	}
	
	//Tableau de drop des parchemin divin hors du commun de niveau 7.
	public static Data<Parchment> uncommonDivineParchment7(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("animation des plantes", 2275), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bâton sylvanien", 2275), 9));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cercle de clarté", 2275), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("création de demi-plan mineure", 2275), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("présage traumatisant", 2275), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rempart", 2275), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vents cinglants", 2275), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("arbres de siège", 2275), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("transmutation du métal en bois", 2275), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vortex", 2275), 9));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vagues d’extase", 2275), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("refuge", 3775), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("symbole d’étourdissement", 7275), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("symbole de faiblesse", 7275),5));

		return res;
	}
	
	//Tableau de drop des parchemin profane commun de niveau 8.
	public static Data<Parchment> commonProfaneParchment8(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("charme-monstre de groupe", 3000), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("exigence", 3000), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("verrou dimensionnel", 3000), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme draconique III", 3000), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("flétrissure", 3000), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("nuage incendiaire", 3000), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("danse irrésistible", 3000), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("dédale", 3000), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("esprit impénétrable", 3000), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("allié suprême d’outreplan", 3000), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("rayon polaire", 3000), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("métamorphose universelle", 3000), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mot de pouvoir étourdissant", 3000), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mur prismatique", 3000), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("motif scintillant", 3000), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de monstres VIII", 3000), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sphère téléguidée", 3000), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("protection contre les sorts", 3500), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("symbole de mort", 8000), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("animation suspendue", 8000), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("séquestration", 23000), 3));
		
		return res;
	}
	
	//Tableau de drop des parchemin profane hors du commun de niveau 8.
	public static Data<Parchment> uncommonProfaneParchment8(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("aversion", 3000), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("poing serré", 3000), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("clone", 3000), 2));
		res.add(new Tuple<Parchment, Integer>(new Parchment("création de demi-plan", 3000), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("localisation suprême", 3000), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("tranquillité euphorique", 3000), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("aspect terrifiant", 3000), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme de géant II", 3000), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("corps de fer", 3000), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("moment de prescience", 3000), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("orbe du néant", 3000), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("œil indiscret suprême", 3000), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("écran", 3000), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("magie des ombres suprême", 3000), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cri suprême", 3000), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("nuées d’orage", 3000), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("explosion de lumière", 3000), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("anatomie morte-vivante IV", 3000), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mur de lave", 3000), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("création de mort-vivant dominant", 3150), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("attirance", 4500), 4));
		res.add(new Tuple<Parchment, Integer>(new Parchment("symbole d’aliénation mentale", 8000), 3));
		res.add(new Tuple<Parchment, Integer>(new Parchment("entrave (enchaînement)", 13000), 2));
		
		return res;
	}
	
	//Tableau de drop des parchemin divin commun de niveau 8.
	public static Data<Parchment> commonDivineParchment8(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("zone d’antimagie", 3000), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("manteau du Chaos", 3000), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("soins intensifs de groupe", 3000), 9));
		res.add(new Tuple<Parchment, Integer>(new Parchment("tremblement de terre", 3000), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("doigt de mort", 3000), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("aura sacrée", 3000), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("blessure critique de groupe", 3000), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("inversion de la gravité", 3000), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("bouclier de la Loi", 3000), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("immunité contre les sorts suprême", 3000), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de monstres VIII", 3000), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation d’alliés naturels VIII", 3000), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("explosion de lumière", 3000), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("aura maudite", 3000), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("allié suprême d’outreplan", 5500), 5));
		
		return res;
	}
	
	//Tableau de drop des parchemin divin hors du commun de niveau 8.
	public static Data<Parchment> uncommonDivineParchment8(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("forme animale", 3000), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("brume sanglante", 3000), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("contrôle des plantes", 3000), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("création de demi-plan", 3000), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("verrou dimensionnel", 3000), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("localisation suprême", 3000), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("tranquillité euphorique", 3000), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("aspect terrifiant", 3000), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("orbe du néant", 3000), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("éloignement du métal et de la pierre", 3000), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("manteau marin", 3000), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("nuées d’orage", 3000), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cyclone", 3000), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("création de mort-vivant dominant", 3150), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("symbole de mort", 8000), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("symbole d’aliénation mentale", 8000), 5));
		
		return res;
	}
	
	//Tableau de drop des parchemin profane commun de niveau 9.
	public static Data<Parchment> commonProfaneParchment9(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("domination universelle", 3825), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("absorption d’énergie", 3825), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("délivrance", 3825), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("portail", 3825), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("immobilisation de monstre de groupe", 3825), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("emprisonnement", 3825), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("disjonction", 3825), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("nuée de météores", 3825), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("mot de pouvoir mortel", 3825), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("sphère prismatique", 3825), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("changement de forme", 3825), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de monstres IX", 3825), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("arrêt du temps", 3825), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("ennemi subconscient", 3825), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("projection astrale", 4825), 5));
		res.add(new Tuple<Parchment, Integer>(new Parchment("cercle de téléportation", 4825), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("souhait", 28825), 4));
		
		return res;
	}
	
	//Tableau de drop des parchemin profane hors du commun de niveau 9.
	public static Data<Parchment> uncommonProfaneParchment9(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("création de demi-plan supérieure", 3825), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("main broyeuse", 3825), 9));
		res.add(new Tuple<Parchment, Integer>(new Parchment("passage dans l’éther", 3825), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("corps enflammé", 3825), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("prémonition", 3825), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("invocation héroïque", 3825), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("prison de glace de groupe", 3825), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("chevaucher la foudre", 3825), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("reflets d’ombre", 3825), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("capture d’âme", 3825), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("tsunami", 3825), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("plainte d’outre-tombe", 3825), 9));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vents de la vengeance", 3825), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("refuge", 4325), 5));
		
		return res;
	}
	
	//Tableau de drop des parchemin divin commun de niveau 9.
	public static Data<Parchment> commonDivineParchment9(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("nuée d’élémentaires", 3825), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("absorption d’énergie", 3825), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("passage dans l’éther", 3825), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("portail", 3825), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("guérison suprême", 3825), 10));
		res.add(new Tuple<Parchment, Integer>(new Parchment("implosion", 3825), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("miracle", 3825), 10));
		res.add(new Tuple<Parchment, Integer>(new Parchment("grand tertre", 3825), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("changement de forme", 3825), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("tempête vengeresse", 3825), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de monstres IX", 3825), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation d’alliés naturels IX", 3825), 6));
		res.add(new Tuple<Parchment, Integer>(new Parchment("résurrection suprême", 28825), 7));

		return res;
	}
	
	//Tableau de drop des parchemin divin hors du commun de niveau 9.
	public static Data<Parchment> uncommonDivineParchment9(){
		Data<Parchment> res = new Data<Parchment>();
		res.add(new Tuple<Parchment, Integer>(new Parchment("aversion", 3825), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("heurt de pierres", 3825), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("création de demi-plan supérieure", 3825), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("prémonition", 3825), 9));
		res.add(new Tuple<Parchment, Integer>(new Parchment("présence écrasante", 3825), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("nuit polaire", 3825), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("capture d’âme", 3825), 9));
		res.add(new Tuple<Parchment, Integer>(new Parchment("immunité contre les sorts suprême (partagé)", 3825), 8));
		res.add(new Tuple<Parchment, Integer>(new Parchment("convocation de froghémoth", 3825), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vents de la vengeance", 3825), 9));
		res.add(new Tuple<Parchment, Integer>(new Parchment("vague mondiale", 3825), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("projection astrale", 4825), 7));
		res.add(new Tuple<Parchment, Integer>(new Parchment("attirance", 5325), 6));

		return res;
	}
	
}
