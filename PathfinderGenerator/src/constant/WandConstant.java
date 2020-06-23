package constant;

import item.wand.Wand;
import utility.Data;
import utility.Tuple;

/**
 * WandConstant contient toutes les constantes pour crééer une baguette.
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
public class WandConstant {

	//Tirage pour les potions de rareté 1.
	public static Data<Integer> rarity1(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(0, 40));
		res.add(new Tuple<Integer, Integer>(1, 60));
		
		return res;
	}
	
	//Tirage pour les potions de rareté 2.
	public static Data<Integer> rarity2(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(1, 80));
		res.add(new Tuple<Integer, Integer>(2, 20));
		
		
		return res;
	}
	
	//Tirage pour les potions de rareté 3.
	public static Data<Integer> rarity3(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(2, 75));
		res.add(new Tuple<Integer, Integer>(3, 25));
		
		return res;
	}
	
	//Tirage pour les potions de rareté 4.
	public static Data<Integer> rarity4(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(2, 20));
		res.add(new Tuple<Integer, Integer>(3, 80));
		
		return res;
	}
	
	//Tirage pour les potions de rareté 5.
	public static Data<Integer> rarity5(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(3, 60));
		res.add(new Tuple<Integer, Integer>(4, 40));
		
		return res;
	}
	
	//Tirage pour les potions de rareté 6.
	public static Data<Integer> rarity6(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(3, 30));
		res.add(new Tuple<Integer, Integer>(4, 70));
		
		return res;
	}	
	
	// Baguette commune de niveau 0
	public static Data<Wand> commonWand0(){
		Data<Wand> res = new Data<Wand>();
		
		res.add(new Tuple<Wand, Integer>(new Wand("aspersion acide", 375), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("création d’eau", 375), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("hébétement", 375), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("détection de la magie", 375), 8));
		res.add(new Tuple<Wand, Integer>(new Wand("son imaginaire", 375), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("lumière", 375), 8));
		res.add(new Tuple<Wand, Integer>(new Wand("manipulation à distance", 375), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("réparation", 375), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("message", 375), 5));
		res.add(new Tuple<Wand, Integer>(new Wand("prestidigitation", 375), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("purification de nourriture et d’eau", 375), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("rayon de givre", 375), 8));
		res.add(new Tuple<Wand, Integer>(new Wand("lecture de la magie", 375), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("stabilisation", 375), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("fatigue", 375), 5));
	
		return res;
	}
	
	// Baguette commune de niveau 1
	public static Data<Wand> commonWand1(){
		Data<Wand> res = new Data<Wand>();
		
		res.add(new Tuple<Wand, Integer>(new Wand("alarme", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("corde animée", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("imprécation", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("bénédiction", 750), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("mains brûlantes", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("frayeur", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("charme-personne", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("couleurs dansantes", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("injonction", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("compréhension des langages", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("soins légers", 750), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("déguisement", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("faveur divine", 750), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("endurance aux énergies destructives", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("agrandissement", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("enchevêtrement", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("repli expéditif", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("feuille morte", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("graisse", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("identification", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("blessure légère", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("armure de mage", 750), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("morsure magique", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("projectile magique", 750), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("pierre magique", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("arme magique", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("brume de dissimulation", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("flammes", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("protection contre le Chaos", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("protection contre le Mal", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("protection contre le Bien", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("protection contre la Loi", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("rayon affaiblissant", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("regain d’assurance", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("bouclier", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("bouclier de la foi", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("gourdin magique", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("décharge électrique", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("image silencieuse", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("sommeil", 750), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("convocation de monstres I", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("convocation d’alliés naturels I", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("coup au but", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("serviteur invisible", 750), 1));
	
		return res;
	}
	
	// Baguette commune de niveau 2
	public static Data<Wand> commonWand2(){
		Data<Wand> res = new Data<Wand>();
		
		res.add(new Tuple<Wand, Integer>(new Wand("flèche d'acide", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("aide", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("modification d'apparence", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("peau d'écorce", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("endurance de l'ours", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("flou", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("force du taureau", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("grâce féline", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("soins modérés", 4500), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("ténèbres", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("vision dans le noir", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("ralentissement du poison", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("splendeur de l'aigle", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("simulacre de vie", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("détéction des pièges", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("lame de feu", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("sphère de feu", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("nappe de brouillard", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("ruse du renard", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("poussière scintillante", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("métal brûlant", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("immobilisation de personne", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("blessure modérée", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("invisibilité", 4500), 5));
		res.add(new Tuple<Wand, Integer>(new Wand("déblocage", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("lévitation", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("image imparfaite", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("image miroir", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("sagesse du hibou", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("pyrotechnie", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("délivrance de la paralysie", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("résistance aux énergies destructives", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("restauration partielle", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("rayon ardent", 4500), 5));
		res.add(new Tuple<Wand, Integer>(new Wand("détection de l’invisibilité", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("fracassement", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("protection d’autrui", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("silence", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("cacophonie", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("pattes d’araignée", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("arme spirituelle", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("convocation de monstres II", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("convocation d’alliés naturels II", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("nuée grouillante", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("toile d’araignée", 4500), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("vent de murmures", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("augure", 5750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("piège à feu", 5750), 1));
	
		return res;
	}
	
	// Baguette commune de niveau 3
	public static Data<Wand> commonWand3(){
		Data<Wand> res = new Data<Wand>();
		
		res.add(new Tuple<Wand, Integer>(new Wand("forme bestiale I", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("clignotement", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("appel de la foudre", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("création de nourriture et d’eau", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("soins importants", 11250), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("lumière du jour", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("sommeil profond", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("ténèbres profondes", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("dissipation de la magie", 11250), 5));
		res.add(new Tuple<Wand, Integer>(new Wand("déplacement", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("boule de feu", 11250), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("flèches enflammées", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("vol", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("état gazeux", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("rapidité", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("héroïsme", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("blessure grave", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("négation de l’invisibilité", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("sphère d’invisibilité", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("affûtage", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("éclair", 11250), 5));
		res.add(new Tuple<Wand, Integer>(new Wand("cercle magique contre le Chaos", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("cercle magique contre le Mal", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("cercle magique contre le Bien", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("cercle magique contre la Loi", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("morsure magique suprême", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("panoplie magique", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("arme magique suprême", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("image accomplie", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("prière", 11250), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("protection contre les énergies destructives", 11250), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("guérison de la cécité/surdité", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("délivrance des malédictions", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("guérison des maladies", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("lumière brûlante", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("tempête de neige", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("lenteur", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("communication avec les morts", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("nuage nauséabond", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("façonnage de la pierre", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("suggestion", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("convocation de monstres III", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("convocation d’alliés naturels III", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("baiser du vampire", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("respiration aquatique", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("animation des morts", 23750), 1));
		
		return res;
	}
	
	// Baguette commune de niveau 4
	public static Data<Wand> commonWand4(){
		Data<Wand> res = new Data<Wand>();
		
		res.add(new Tuple<Wand, Integer>(new Wand("marche dans les airs", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("forme bestiale II", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("tentacules noirs", 21000), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("marteau du Chaos", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("charme-monstre", 21000), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("confusion", 21000), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("désespoir foudroyant", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("soins intensifs", 21000), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("protection contre la mort", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("porte dimensionnelle", 21000), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("ancre dimensionnelle", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("renvoi", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("puissance divine", 21000), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("corps élémentaire I", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("énergie négative", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("agrandissement de groupe", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("terreur", 21000), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("bouclier de feu", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("colonne de feu", 21000), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("liberté de mouvement", 21000), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("globe d’invulnérabilité partielle", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("châtiment sacré", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("tempête de grêle", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("transfert de sorts", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("blessure critique", 21000), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("invisibilité suprême", 21000), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("courroux de l’ordre", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("assassin imaginaire", 21000), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("sphère d’isolement", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("scrutation", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("communication à distance", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("cri", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("brouillard dense", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("immunité contre les sorts", 21000), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("convocation de monstres IV", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("convocation d’alliés naturels IV", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("ténèbres maudites", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("mur de feu", 21000), 5));
		res.add(new Tuple<Wand, Integer>(new Wand("mur de glace", 21000), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("divination", 22250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("annulation d’enchantement", 30000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("peau de pierre", 33500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("allié d’outreplan", 46000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("restauration", 71000), 3));//duplication fusionnée ici
		
		return res;
	}
	
	// Baguette hors du commun de niveau 0
	public static Data<Wand> uncommonWand0(){
		Data<Wand> res = new Data<Wand>();
		
		res.add(new Tuple<Wand, Integer>(new Wand("signature magique", 375), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("saignement", 375), 9));
		res.add(new Tuple<Wand, Integer>(new Wand("lumières dansantes", 375), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("détection du poison", 375), 9));
		res.add(new Tuple<Wand, Integer>(new Wand("destruction de mort-vivant", 375), 9));
		res.add(new Tuple<Wand, Integer>(new Wand("illumination", 375), 8));
		res.add(new Tuple<Wand, Integer>(new Wand("assistance divine", 375), 8));
		res.add(new Tuple<Wand, Integer>(new Wand("repérage", 375), 9));
		res.add(new Tuple<Wand, Integer>(new Wand("berceuse", 375), 8));
		res.add(new Tuple<Wand, Integer>(new Wand("ouverture/fermeture", 375), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("résistance", 375), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("étincelles", 375), 8));
		res.add(new Tuple<Wand, Integer>(new Wand("stimulant", 375), 6));
	
		return res;
	}
	
	// Baguette hors du commun de niveau 1
	public static Data<Wand> uncommonWand1(){
		Data<Wand> res = new Data<Wand>();
		
		res.add(new Tuple<Wand, Integer>(new Wand("charge de fourmi", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("aspect du faucon", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("bénédiction d’arme", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("apaisement des animaux", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("charme-animal", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("contact glacial", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("hostilité forcée", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("confusion mineure", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("contact corrosif", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("perception de la mort", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("détection de la faune ou de la flore", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("détection du Chaos", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("détection du Mal", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("détection du Bien", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("détection de la Loi", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("détection des passages secrets", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("détection des collets et des fosses", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("détection des morts-vivants", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("anathème", 750), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("bouclier entropique", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("effacement", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("lueur féerique", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("démarche aérienne", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("disque flottant", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("baie nourricière", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("invisibilité pour les animaux", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("invisibilité pour les morts-vivants", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("fou rire", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("verrouillage", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("hypnose", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("dague de stalactite", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("mauvais présage", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("saut", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("grand pas", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("aura magique", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("monture", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("dissimulation d’objet", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("passage sans trace", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("rayon de fièvre", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("rapetissement", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("sanctuaire", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("bouclier de foudre", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("communication avec les animaux", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("poing de pierre", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("bouclier de pierre", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("convocation de monstres mineure", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("alignement indétectable", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("grâce urbaine", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("disparition", 750), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("ventriloquie", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("bouche magique", 1250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("bénédiction de l’eau", 2000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("malédiction de l’eau", 2000), 1));
	
		return res;
	}
	
	// Baguette hors du commun de niveau 2
	public static Data<Wand> uncommonWand2(){
		Data<Wand> res = new Data<Wand>();
		
		res.add(new Tuple<Wand, Integer>(new Wand("arme alignée", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("aspect animal", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("messager animal", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("hypnose des animaux", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("aspect de l’ours", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("savoir manier une arme", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("cécité/surdité", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("regard brûlant", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("apaisement des émotions", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("métal gelé", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("contrôle des morts-vivants", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("hébétement de monstre", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("mise à mort", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("décharge défensive", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("retardement de la douleur", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("détection de pensées", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("déguiser autrui", 4500), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("armure sans effort", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("caresse élémentaire", 4500), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("discours captivant", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("préservation des morts", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("baiser de la goule", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("planer", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("élévation du sol", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("bourrasque", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("immobilisation d’animal", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("lueurs hypnotiques", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("localisation d’objet", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("réparation intégrale", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("détection faussée", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("ennui oppressant", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("protection contre les projectiles", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("rapetissement d’animal", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("corde enchantée", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("effroi", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("partage de la langue", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("ramollissement de la terre et de la pierre", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("main spectrale", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("rapport", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("don des langues", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("idiotie", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("forme d’arbre", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("distorsion du bois", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("arme merveilleuse", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("façonnage du bois", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("zone de vérité", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("verrou du mage", 5750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("consécration", 5750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("profanation", 5750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("flamme éternelle", 7000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("piège illusoire", 7000), 1));
		
		return res;
	}
	
	// Baguette hors du commun de niveau 3
	public static Data<Wand> uncommonWand3(){
		Data<Wand> res = new Data<Wand>();
		
		res.add(new Tuple<Wand, Integer>(new Wand("aspect animal supérieur", 11250), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("orbe aqueux", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("vision magique", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("aura d’archon", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("tempête de cendres", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("malédiction", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("clairaudience/clairvoyance", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("contagion", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("rabougrissement des plantes", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("domination d’animal", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("aura élémentaire", 11250), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("runes explosives", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("poing de force", 11250), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("immobilisation de morts-vivants", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("main du berger", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("lévitation hostile", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("hurlement d’agonie", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("torrent hydraulique", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("singes fous", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("fusion dans la pierre", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("neutralisation du poison", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("frappe douloureuse", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("coursier fantôme", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("croissance végétale", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("empoisonnement", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("extinction des feux", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("rage", 11250), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("rayon affaiblissant", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("peau résineuse", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("page secrète", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("réduction d’objet", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("collet", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("communication avec les plantes", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("croissance d’épines", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("abri", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("marche sur l’onde", 11250), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("mur de vent", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("manteau de colère", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("texte illusoire", 13750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("antidétection", 13750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("bagou", 15750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("espoir", 15750), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("guérison de destrier", 15750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("manipulation des sons", 15750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("glyphe de garde", 21250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("sceau du serpent", 36250), 1));
		
		return res;
	}
	
	// Baguette hors du commun de niveau 4
		public static Data<Wand> uncommonWand4(){
			Data<Wand> res = new Data<Wand>();
			
			res.add(new Tuple<Wand, Integer>(new Wand("coquille antiplantes", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("vision magique", 21000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("aspect du cerf", 21000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("boule de foudre", 21000), 4));
			res.add(new Tuple<Wand, Integer>(new Wand("flétrissement végétal", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("empire végétal", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("contrôle de l’eau", 21000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("vision dans le noir supérieure", 21000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("détection de la scrutation", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("détection du mensonge", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("souffle de dragon", 21000), 4));
			res.add(new Tuple<Wand, Integer>(new Wand("simulacre de vie supérieur", 21000), 4));
			res.add(new Tuple<Wand, Integer>(new Wand("mission", 21000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("loup fantomatique", 21000), 4));
			res.add(new Tuple<Wand, Integer>(new Wand("vermine géante", 21000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("terrain hallucinatoire", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("mur illusoire", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("localisation de créature", 21000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("création mineure", 21000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("mémorisation", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("flot obsidien", 21000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("lueur d’arc-en-ciel", 21000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("rapetissement de groupe", 21000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("réincarnation", 21000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("répulsif", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("chevaucher les vagues", 21000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("rouille", 21000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("refuge du mage", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("convocation d’ombres", 21000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("pas de l’ombre", 21000), 4));
			res.add(new Tuple<Wand, Integer>(new Wand("image de foudre", 21000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("pierres acérées", 21000), 4));
			res.add(new Tuple<Wand, Integer>(new Wand("tempête volcanique", 21000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("poussière d’étoile", 21000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("croissance animale", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("communion avec la nature", 30000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("Rejet du Chaos", 30000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("Rejet du Mal", 30000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("domination", 30000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("immobilisation de monstre", 30000), 4));
			res.add(new Tuple<Wand, Integer>(new Wand("épée sainte", 30000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("marque de la justice", 30000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("modification de mémoire", 30000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("voyage par les arbres", 30000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("zone de silence", 30000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("mythes et légendes", 33500),1));
			
			return res;
	}
}
