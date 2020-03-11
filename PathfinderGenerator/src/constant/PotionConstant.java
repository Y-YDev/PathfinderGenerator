package constant;

import utility.Data;
import utility.Tuple;

/**
 * PotionConstant contient toutes les constantes pour crééer une potion.
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
public class PotionConstant {

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
		res.add(new Tuple<Integer, Integer>(0, 10));
		res.add(new Tuple<Integer, Integer>(1, 50));
		res.add(new Tuple<Integer, Integer>(2, 40));
		
		return res;
	}
	
	//Tirage pour les potions de rareté 3.
	public static Data<Integer> rarity3(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(1, 25));
		res.add(new Tuple<Integer, Integer>(2, 60));
		res.add(new Tuple<Integer, Integer>(3, 15));
		
		return res;
	}
	
	//Tirage pour les potions de rareté 4.
	public static Data<Integer> rarity4(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(1, 10));
		res.add(new Tuple<Integer, Integer>(2, 40));
		res.add(new Tuple<Integer, Integer>(3, 50));
		
		return res;
	}
	
	//Tirage pour les potions de rareté 5.
	public static Data<Integer> rarity5(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(2, 35));
		res.add(new Tuple<Integer, Integer>(3, 65));
		
		return res;
	}
	
	//Tirage pour les potions de rareté 6.
	public static Data<Integer> rarity6(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(2, 10));
		res.add(new Tuple<Integer, Integer>(3, 90));
		
		return res;
	}
	
	// Potions communes de nds 0.
	public static Data<String> commonPotion0(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("signature magique", 14));
		res.add(new Tuple<String, Integer>("assistance divine", 14));
		res.add(new Tuple<String, Integer>("lumière", 16));
		res.add(new Tuple<String, Integer>("purification de nourriture et d’eau", 14));
		res.add(new Tuple<String, Integer>("résistance", 14));
		res.add(new Tuple<String, Integer>("stabilisation", 14));
		res.add(new Tuple<String, Integer>("stimulant", 14));
		
		return res;
	}
	
	// Potions communes de nds 1.
	public static Data<String> commonPotion1(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("bénédiction d’arme", 4));
		res.add(new Tuple<String, Integer>("soins léger", 10));
		res.add(new Tuple<String, Integer>("endurance aux énergies destructives", 5));
		res.add(new Tuple<String, Integer>("agrandissement", 8));
		res.add(new Tuple<String, Integer>("saut", 6));
		res.add(new Tuple<String, Integer>("armure de mage", 8));
		res.add(new Tuple<String, Integer>("morsure magique", 6));
		res.add(new Tuple<String, Integer>("arme magique", 8));
		res.add(new Tuple<String, Integer>("passage sans trace", 5));
		res.add(new Tuple<String, Integer>("protection contre le Chaos", 4));
		res.add(new Tuple<String, Integer>("protection contre le Mal", 4));
		res.add(new Tuple<String, Integer>("protection contre le Bien", 4));
		res.add(new Tuple<String, Integer>("protection contre la Loi", 4));
		res.add(new Tuple<String, Integer>("rapetissement", 5));
		res.add(new Tuple<String, Integer>("regain d’assurance", 6));
		res.add(new Tuple<String, Integer>("sanctuaire", 5));
		res.add(new Tuple<String, Integer>("bouclier de la foi", 8));
		
		return res;
	}
	
	// Potions communes de nds 2.
	public static Data<String> commonPotion2(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("aide", 4));
		res.add(new Tuple<String, Integer>("arme alignée", 3));
		res.add(new Tuple<String, Integer>("peau d’écorce", 4));
		res.add(new Tuple<String, Integer>("endurance de l’ours", 5));
		res.add(new Tuple<String, Integer>("flou", 4));
		res.add(new Tuple<String, Integer>("force de taureau", 5));
		res.add(new Tuple<String, Integer>("grâce féline", 5));
		res.add(new Tuple<String, Integer>("soins modérés", 7));
		res.add(new Tuple<String, Integer>("vision dans le noir", 4));
		res.add(new Tuple<String, Integer>("retardement du poison", 3));
		res.add(new Tuple<String, Integer>("splendeur de l’aigle", 5));
		res.add(new Tuple<String, Integer>("ruse du renard", 5));
		res.add(new Tuple<String, Integer>("invisibilité", 7));
		res.add(new Tuple<String, Integer>("lévitation", 5));
		res.add(new Tuple<String, Integer>("sagesse du hibou", 5));
		res.add(new Tuple<String, Integer>("protection contre les projectiles", 2));
		res.add(new Tuple<String, Integer>("délivrance de la paralysie", 3));
		res.add(new Tuple<String, Integer>("résistance aux énergies destructives, acide", 4));
		res.add(new Tuple<String, Integer>("résistance aux énergies destructives, froid", 4));
		res.add(new Tuple<String, Integer>("résistance aux énergies destructives, électricité", 4));
		res.add(new Tuple<String, Integer>("résistance aux énergies destructives, feu", 4));
		res.add(new Tuple<String, Integer>("résistance aux énergies destructives, son", 2));
		res.add(new Tuple<String, Integer>("pattes d’araignée", 4));
		res.add(new Tuple<String, Integer>("alignement indétectable", 2));
		
		return res;
	}
	
	// Potions communes de nds 3.
	public static Data<String> commonPotion3(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("soins importants", 6));
		res.add(new Tuple<String, Integer>("dissipation de la magie", 4));
		res.add(new Tuple<String, Integer>("déplacement", 4));
		res.add(new Tuple<String, Integer>("vol", 6));
		res.add(new Tuple<String, Integer>("état gazeux", 5));
		res.add(new Tuple<String, Integer>("espoir", 4));
		res.add(new Tuple<String, Integer>("rapidité", 6));
		res.add(new Tuple<String, Integer>("héroïsme", 5));
		res.add(new Tuple<String, Integer>("affûtage", 4));
		res.add(new Tuple<String, Integer>("morsure magique suprême", 4));
		res.add(new Tuple<String, Integer>("panoplie magique", 4));
		res.add(new Tuple<String, Integer>("neutralisation du poison", 5));
		res.add(new Tuple<String, Integer>("protection contre les énergies destructives, acide", 3));
		res.add(new Tuple<String, Integer>("protection contre les énergies destructives, froid", 3));
		res.add(new Tuple<String, Integer>("protection contre les énergies destructives, électricité", 3));
		res.add(new Tuple<String, Integer>("protection contre les énergies destructives, feu", 3));
		res.add(new Tuple<String, Integer>("protection contre les énergies destructives, son", 2));
		res.add(new Tuple<String, Integer>("rage", 3));
		res.add(new Tuple<String, Integer>("guérison de la cécité/surdité", 3));
		res.add(new Tuple<String, Integer>("délivrance des malédictions", 4));
		res.add(new Tuple<String, Integer>("guérison des maladies", 5));
		res.add(new Tuple<String, Integer>("don de langues", 5));
		res.add(new Tuple<String, Integer>("respiration aquatique", 5));
		res.add(new Tuple<String, Integer>("marche sur l’onde", 4));
		
		return res;
	}
	
	// Potions hors du commun de nds 1.
	public static Data<String> uncommonPotion1(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("corde animée", 4));
		res.add(new Tuple<String, Integer>("charge de fourmi", 7));
		res.add(new Tuple<String, Integer>("manteau d’ombre", 5));
		res.add(new Tuple<String, Integer>("effacement", 4));
		res.add(new Tuple<String, Integer>("démarche aérienne", 6));
		res.add(new Tuple<String, Integer>("baie nourricière", 4));
		res.add(new Tuple<String, Integer>("graisse", 4));
		res.add(new Tuple<String, Integer>("invisibilité pour les animaux", 7));
		res.add(new Tuple<String, Integer>("invisibilité pour les morts-vivants", 8));
		res.add(new Tuple<String, Integer>("verrouillage", 4));
		res.add(new Tuple<String, Integer>("revigorer", 5));
		res.add(new Tuple<String, Integer>("sens surdéveloppés", 6));
		res.add(new Tuple<String, Integer>("pierre magique", 4));
		res.add(new Tuple<String, Integer>("dissipation de la fièvre", 7));
		res.add(new Tuple<String, Integer>("sanctification de cadavre", 5));
		res.add(new Tuple<String, Integer>("gourdin magique", 4));
		res.add(new Tuple<String, Integer>("caresse de la mer", 8));
		res.add(new Tuple<String, Integer>("disparition", 8));
		
		return res;
	}
	
	// Potions hors du commun de nds 2.
	public static Data<String> uncommonPotion2(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("barrière protectrice", 6));
		res.add(new Tuple<String, Integer>("sens aiguisés", 8));
		res.add(new Tuple<String, Integer>("verrou magique", 5));
		res.add(new Tuple<String, Integer>("bouclier pare-balles", 5));
		res.add(new Tuple<String, Integer>("poigne sûre", 6));
		res.add(new Tuple<String, Integer>("flamme éternelle", 5));
		res.add(new Tuple<String, Integer>("résistance à la corruption", 5));
		res.add(new Tuple<String, Integer>("déguiser autrui", 8));
		res.add(new Tuple<String, Integer>("préservation des morts", 8));
		res.add(new Tuple<String, Integer>("réparation intégrale", 5));
		res.add(new Tuple<String, Integer>("dissimulation d’objet", 6));
		res.add(new Tuple<String, Integer>("rapetissement d’animal", 5));
		res.add(new Tuple<String, Integer>("corde enchantée", 4));
		res.add(new Tuple<String, Integer>("vague", 6));
		res.add(new Tuple<String, Integer>("rapport", 8));
		res.add(new Tuple<String, Integer>("distorsion du bois", 5));
		res.add(new Tuple<String, Integer>("façonnage du bois", 5));
		
		return res;
	}
	
	// Potions hors du commun de nds 3.
	public static Data<String> uncommonPotion3(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("creusement", 12));
		res.add(new Tuple<String, Integer>("innombrables yeux", 10));
		res.add(new Tuple<String, Integer>("lumière du jour", 12));
		res.add(new Tuple<String, Integer>("réservoir draconique", 15));
		res.add(new Tuple<String, Integer>("flèches enflammées", 9));
		res.add(new Tuple<String, Integer>("rapetissement d’objet", 9));
		res.add(new Tuple<String, Integer>("façonnage de la pierre", 10));
		res.add(new Tuple<String, Integer>("piège à feu", 10));
		res.add(new Tuple<String, Integer>("antidétection", 13));
		
		return res;
	}
	
}
