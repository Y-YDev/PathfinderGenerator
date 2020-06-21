package constant;

import utility.Data;
import utility.Tuple;
import wonderfulObject.Type;
import wonderfulObject.WonderfulObject;

/**
 * Les tableaux de tirages pour les objets merveilleux
 * Rareté 0 : faible insignifiant
 * Rareté 1 : faible inférieur
 * Rareté 2 : faible supérieur
 * Rareté 3 : intermédiaire inférieur
 * Rareté 4 : intermédiaire supérieur
 * Rareté 5 : puissant inférieur
 * Rareté 6 : puissant supérieur
 * @author Mentra20
 *
 */
public class WonderfulObjectConstant {
		
	//Tableau de drop du genre d'objets merveilleux
	public static Data<Type> location(){
		Data<Type> res = new Data<Type>();
	
		res.add(new Tuple<Type, Integer>(Type.WAIST, 6));
		res.add(new Tuple<Type, Integer>(Type.BODY, 6));
		res.add(new Tuple<Type, Integer>(Type.TORSO, 5));
		res.add(new Tuple<Type, Integer>(Type.EYES, 5));
		res.add(new Tuple<Type, Integer>(Type.FEET, 6));
		res.add(new Tuple<Type, Integer>(Type.HANDS, 6));
		res.add(new Tuple<Type, Integer>(Type.HEAD, 7));
		res.add(new Tuple<Type, Integer>(Type.FOREHEAD, 6));
		res.add(new Tuple<Type, Integer>(Type.NECK, 7));
		res.add(new Tuple<Type, Integer>(Type.SHOULDERS, 7));
		res.add(new Tuple<Type, Integer>(Type.WRIST, 6));
		res.add(new Tuple<Type, Integer>(Type.WITHOUT_LOCATION, 33));
		
		return res;
	}
	
	//Objet merveilleux à la taille de rareté 1.
	public static Data<WonderfulObject> waist1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bande de cabriole", 800, Type.WAIST), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cartouchière bénéfique", 1000, Type.WAIST), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon méridien", 1000, Type.WAIST), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture à lame", 1000, Type.WAIST), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture d’allègement du fardeau", 2000, Type.WAIST), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Large ceinture aquatique", 2600, Type.WAIST), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture d’équitation", 3200, Type.WAIST), 16));
	
		return res;
	}
	
	//Objet merveilleux à la taille de rareté 2.
	public static Data<WonderfulObject> waist2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de force de géant +2", 4000, Type.WAIST), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de dextérité du chat +2", 4000, Type.WAIST), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de constitution de l’ours +2", 4000, Type.WAIST), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture mordante", 4000, Type.WAIST), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de récupération d’armes", 5000, Type.WAIST), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture du rat contaminé", 5200, Type.WAIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de subsistance", 6000, Type.WAIST), 16));
	
		return res;
	}
	
	//Objet merveilleux à la taille de rareté 3.
	public static Data<WonderfulObject> waist3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture reptilienne", 9000, Type.WAIST), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture simiesque", 9400, Type.WAIST), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de puissance de géant +2", 10000, Type.WAIST), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de la belette", 10000, Type.WAIST), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de charge tonitruante", 10000, Type.WAIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture du Minotaure", 11000, Type.WAIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture du rat contaminé supérieure", 11200, Type.WAIST), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de santé", 12000, Type.WAIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de surveillance", 12500, Type.WAIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de jet", 14000, Type.WAIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture des nains", 14900, Type.WAIST), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corde de ténacité", 15000, Type.WAIST), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de force de géant +4", 16000, Type.WAIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de la perfection physique +2", 16000, Type.WAIST), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de dextérité du chat +4", 16000, Type.WAIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de constitution de l’ours +4", 16000, Type.WAIST), 10));	
		return res;
	}
	
	//Objet merveilleux à la taille de rareté 4.
	public static Data<WonderfulObject> waist4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture simiesque supérieure", 18000, Type.WAIST), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Anneaux de l’anaconda", 18500, Type.WAIST), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture reptilienne supérieure", 20000, Type.WAIST), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture des héros déchus", 21000, Type.WAIST), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de la gorgone", 23000, Type.WAIST), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de terre élémentaire", 24000, Type.WAIST), 17));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Écharpe de déviation", 25000, Type.WAIST), 16));
	
		return res;
	}
	
	//Objet merveilleux à la taille de rareté 5.
	public static Data<WonderfulObject> waist5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de l’homme-poisson", 32000, Type.WAIST), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de force de géant +6", 36000, Type.WAIST), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de dextérité du chat +6", 36000, Type.WAIST), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de constitution de l’ours +6", 36000, Type.WAIST), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de puissance de géant +4", 40000, Type.WAIST), 22));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de jet supérieure", 42000, Type.WAIST), 12));
	
		return res;
	}
	
	//Objet merveilleux à la taille de rareté 6.
	public static Data<WonderfulObject> waist6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de peau de pierre	", 60000, Type.WAIST), 25));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de la perfection physique +4", 64000, Type.WAIST), 30));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de puissance de géant +6", 90000, Type.WAIST), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture d’intangibilité", 110000, Type.WAIST), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de la perfection physique +6", 144000, Type.WAIST), 10));
	
		return res;
	}
	
	//Objet merveilleux porté au corps de rareté 1.
	public static Data<WonderfulObject> body1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de corde infinie", 1000, Type.BODY), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de la manticore", 1000, Type.BODY), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe d’ossements", 2400, Type.BODY), 25));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandelettes de frappes dévastatrices +1", 3000, Type.BODY), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corset du vishkanya", 3000, Type.BODY), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chasuble de druide", 3750, Type.BODY), 20));
	
		return res;
	}
	
	//Objet merveilleux porté au corps de rareté 2.
	public static Data<WonderfulObject> body2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Soutane de prêtre", 4600, Type.BODY), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de mémorisation", 5000, Type.BODY), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de composantes", 5000, Type.BODY), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe d’ensorceleur", 5000, Type.BODY), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Harnais d’ancrage pour eidolon", 6000, Type.BODY), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de camelot", 7000, Type.BODY), 25));
	
		return res;
	}
	
	//Objet merveilleux porté au corps de rareté 3.
	public static Data<WonderfulObject> body3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de mimétisme", 8400, Type.BODY), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe ardente", 11000, Type.BODY), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe électrifiée", 11000, Type.BODY), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe gelée", 11000, Type.BODY), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandelettes de frappes dévastatrices +2", 12000, Type.BODY), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de moine", 13000, Type.BODY), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robes de l’héritage magique", 16000, Type.BODY), 25));
		
		return res;
	}
	
	//Objet merveilleux porté au corps de rareté 4.
	public static Data<WonderfulObject> body4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe du xorn", 20000, Type.BODY), 25));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corset de sorcellerie", 22000, Type.BODY), 27));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandelettes de frappes dévastatrices +3", 27000, Type.BODY), 24));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe prismatique", 27000, Type.BODY), 24));
		
		return res;
	}
	
	//Objet merveilleux porté au corps de rareté 5.
	public static Data<WonderfulObject> body5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cache-poussière du tireur", 36000, Type.BODY), 40));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandelettes de frappes dévastatrices +4", 48000, Type.BODY), 40));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de contrebandier", 48000, Type.BODY), 20));
		
		return res;
	}
	
	//Objet merveilleux porté au corps de rareté 6.
	public static Data<WonderfulObject> body6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe étoilée", 58000, Type.BODY), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de convocation", 64000, Type.BODY), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Kimono mystique", 67000, Type.BODY), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandelettes de frappes dévastatrices +5", 75000, Type.BODY), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe resplendissante du comédien", 75000, Type.BODY), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe d’archimage", 75000, Type.BODY), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandelettes de frappes dévastatrices +6", 108000, Type.BODY), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de vision totale", 120000, Type.BODY), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandelettes de frappes dévastatrices +7", 147000, Type.BODY), 3));
		
		return res;
	}
	
	//Objet merveilleux porté au torse de rareté 1.
	public static Data<WonderfulObject> torso1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandages de guérison rapide", 200, Type.TORSO), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Maillot de sprinter", 1000, Type.TORSO), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cartouchière inépuisable", 1500, Type.TORSO), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Veste à outils", 1800, Type.TORSO), 25));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gilet de médecin", 3000, Type.TORSO), 25));
		
		return res;
	}
	
	//Objet merveilleux porté au torse de rareté 2.
	public static Data<WonderfulObject> torso2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Écharpe du champion", 4000, Type.TORSO), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Veste absorbante", 5000, Type.TORSO), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Tunique d’incantation minutieuse", 5000, Type.TORSO), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gilet d’évasion", 5200, Type.TORSO), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Vareuse de sorcière ricaneuse", 6000, Type.TORSO), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gilet de tir impitoyable", 6000, Type.TORSO), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Plastron prophétique", 6000, Type.TORSO), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Tunique de puissance dévastatrice", 6000, Type.TORSO), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gilet du traqueur", 6000, Type.TORSO), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Uniforme resplendissant", 7000, Type.TORSO), 10));
		
		return res;
	}
	
	//Objet merveilleux porté au torse de rareté 3.
	public static Data<WonderfulObject> torso3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chemise enflammée", 8000, Type.TORSO), 13));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Tunique en peau de serpent", 8000, Type.TORSO), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Baudrier du tueur", 10000, Type.TORSO), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chemise de liberté", 10000, Type.TORSO), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Veston de l’empoisonneur", 12000, Type.TORSO), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Veste du cafard", 16000, Type.TORSO), 20));
		
		return res;
	}
	
	//Objet merveilleux porté au torse de rareté 4.
	public static Data<WonderfulObject> torso4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
				
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gilet de stabilité mutagène", 20000, Type.TORSO), 50));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Linceul spectral", 26000, Type.TORSO), 50));

		return res;
	}
	
	//Objet merveilleux porté au torse de rareté 5.
	public static Data<WonderfulObject> torso5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
				
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pèlerine d’immortalité", 50000, Type.TORSO), 60));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Veston de l’empoisonneur supérieur", 58000, Type.TORSO), 40));

		return res;
	}
	
	//Objet merveilleux porté au torse de rareté 6.
	public static Data<WonderfulObject> torso6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
				
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Baudrier miséricordieux", 60000, Type.TORSO), 35));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chasuble de la foi", 76000, Type.TORSO), 35));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chasuble de résistance à la magie", 90000, Type.TORSO), 30));
		
		return res;
	}
	
	//Objet merveilleux porté aux yeux de rareté 1.
	public static Data<WonderfulObject> eyes1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Yeux de perception de la mort", 2000, Type.EYES), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Yeux de lynx", 2500, Type.EYES), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes grossissantes", 2500, Type.EYES), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cache-oeil de pirate", 2600, Type.EYES), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bésicles de compréhension", 3000, Type.EYES), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Loupe de détection", 3500, Type.EYES), 13));
		
		return res;
	}
	
	//Objet merveilleux porté aux yeux de rareté 2.
	public static Data<WonderfulObject> eyes2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Yeux de chouette", 4000, Type.EYES), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Yeux perçants", 6000, Type.EYES), 24));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes du chasseur de trésors", 6400, Type.EYES), 22));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Monocle d’enquêteur", 6800, Type.EYES), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes de vision jumelée", 7500, Type.EYES), 16));
		
		return res;
	}
	
	//Objet merveilleux porté aux yeux de rareté 3.
	public static Data<WonderfulObject> eyes3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes elfiques", 8500, Type.EYES), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes de lumière aveuglante", 8800, Type.EYES), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de l’aveugle", 12000, Type.EYES), 17));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes de nyctalope", 12000, Type.EYES), 19));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bésicles de détection des chimères", 12000, Type.EYES), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes de vision à 360°", 15000, Type.EYES), 18));

		
		return res;
	}
	
	//Objet merveilleux porté aux yeux de rareté 4.
	public static Data<WonderfulObject> eyes4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes d’Ombreterre", 20000, Type.EYES), 21));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes de sniper", 20000, Type.EYES), 19));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes arc-en-ciel", 21000, Type.EYES), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes d’annihilation", 25000, Type.EYES), 19));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Yeux d’anathème", 25000, Type.EYES), 23));
		
		return res;
	}
	
	//Objet merveilleux porté aux yeux de rareté 5.
	public static Data<WonderfulObject> eyes5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bésicles du mauvais œil", 30000, Type.EYES), 60));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes de sniper supérieures", 50000, Type.EYES), 40));
		
		return res;
	}
	
	//Objet merveilleux porté aux yeux de rareté 6.
	public static Data<WonderfulObject> eyes6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Yeux de charme", 56000, Type.EYES), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Monocle d’investigateur", 66000, Type.EYES), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cache-oeil du tyran des mers", 70000, Type.EYES), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau du maître d’armes", 80000, Type.EYES), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Yeux de domination mentale", 95000, Type.EYES), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Yeux de dragon", 110000, Type.EYES), 13));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes de vision lucide", 184800, Type.EYES), 10));

		return res;
	}
	
	//Objet merveilleux porté aux pieds de rareté 1.
	public static Data<WonderfulObject> feet1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes du chat", 1000, Type.FEET), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes de casse-cou", 1400, Type.FEET), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes d’endurance", 1500, Type.FEET), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pantoufles de démarche aérienne", 2000, Type.FEET), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes du terrain amical", 2400, Type.FEET), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes des terres gelées", 2500, Type.FEET), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes elfiques", 2500, Type.FEET), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaussons d’acrobate", 3000, Type.FEET), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers à cheval de rapidité", 3000, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes du bourbier", 3500, Type.FEET), 8));

		return res;
	}
	
	//Objet merveilleux porté aux pieds de rareté 2.
	public static Data<WonderfulObject> feet2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes de cambrioleur", 4000, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers à cheval de ruade dévastatrice +1", 4000, Type.FEET), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sandales réactives", 4000, Type.FEET), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaussons de marche brumeuse", 4400, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaussons d’araignée", 4800, Type.FEET), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sandales de légèreté aérienne", 5000, Type.FEET), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes de sept lieues", 5500, Type.FEET), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers à cheval du zéphyr", 6000, Type.FEET), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Souliers hantés", 6480, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes d’échappée", 7200, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes de lévitation", 7500, Type.FEET), 18));

		return res;
	}
	
	//Objet merveilleux porté aux pieds de rareté 3.
	public static Data<WonderfulObject> feet3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes d’évasion", 8000, Type.FEET), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes d’enracinement", 8000, Type.FEET), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes cauchemardesque", 8500, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers à cheval cauchemardesque", 9000, Type.FEET), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes à chausse-trappes", 10000, Type.FEET), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes de perception des vibrations", 10000, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes du mastodonte", 10500, Type.FEET), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaussures d’éclairs bondissants", 10500, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes de rapidité", 12000, Type.FEET), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes verdoyantes", 12000, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers à cheval de ruade dévastatrice +2", 16000, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes ailées", 16000, Type.FEET), 16));

		return res;
	}
	
	//Objet merveilleux porté aux pieds de rareté 4.
	public static Data<WonderfulObject> feet4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaussures de marche sur le feu", 21000, Type.FEET), 38));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sandales des dryades", 24000, Type.FEET), 34));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers à cheval de brume", 27000, Type.FEET), 28));

		return res;
	}
	
	//Objet merveilleux porté aux pieds de rareté 5.
	public static Data<WonderfulObject> feet5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes d’escampette", 30000, Type.FEET), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers à cheval de ruade dévastatrice +3", 36000, Type.FEET), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers à cheval glorieux", 39600, Type.FEET), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes de cambrioleur supérieures", 46000, Type.FEET), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes de téléportation", 49000, Type.FEET), 25));

		return res;
	}
	
	//Objet merveilleux porté aux pieds de rareté 6.
	public static Data<WonderfulObject> feet6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaussons du triton", 56000, Type.FEET), 40));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers à cheval de ruade dévastatrice +4", 64000, Type.FEET), 30));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers à cheval de ruade dévastatrice +5", 100000, Type.FEET), 30));

		return res;
	}
	
	//Objet merveilleux porté aux pieds de rareté 1.
	public static Data<WonderfulObject> hands1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de soutien", 180, Type.HANDS), 13));//180 po wtf
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Griffes de l’ours polaire", 1300, Type.HANDS), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Mitaines de reconnaissance", 2000, Type.HANDS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants luisants", 2000, Type.HANDS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants d’apprenti prestidigitateur", 2200, Type.HANDS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants du défi", 2200, Type.HANDS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants d’escamotage", 2500, Type.HANDS), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants du guérisseur", 2500, Type.HANDS), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants d’ingénieur", 3000, Type.HANDS), 10));

		return res;
	}
	
	//Objet merveilleux porté aux pieds de rareté 2.
	public static Data<WonderfulObject> hands2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gantelets de manoeuvre offensive", 4000, Type.HANDS), 12));//180 po ??
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de vision spectrale", 4000, Type.HANDS), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants antiprojectiles", 4000, Type.HANDS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de désamorçage des pièges", 4000, Type.HANDS), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de frappe magique", 5000, Type.HANDS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants empoisonnés", 5000, Type.HANDS), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants magnétiques", 6000, Type.HANDS), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de nage et d’escalade", 6250, Type.HANDS), 25));

		return res;
	}
	
	//Objet merveilleux porté aux pieds de rareté 3.
	public static Data<WonderfulObject> hands3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants déliquescents", 8000, Type.HANDS), 2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gantelets de neutralisation des métamorphes", 4000, Type.HANDS), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gantelet du cobra de fer", 8000, Type.HANDS), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gant de fauconnier", 8000, Type.HANDS), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de magus", 8000, Type.HANDS), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de désamorçage des glyphes", 9000, Type.HANDS), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gant de rangement", 10000, Type.HANDS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de façonnage", 10000, Type.HANDS), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Mitaines d’élasticité", 10000, Type.HANDS), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gantelet de rouille", 11500, Type.HANDS), 22));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de duelliste", 15000, Type.HANDS), 24));
		
		return res;
	}
	
	//Objet merveilleux porté aux pieds de rareté 4.
	public static Data<WonderfulObject> hands4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants vampiriques", 18000, Type.HANDS), 30));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gantelets de poigne colossale", 20000, Type.HANDS), 35));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de raccourcis", 27000, Type.HANDS), 35));
		
		return res;
	}
	
	//Objet merveilleux porté aux pieds de rareté 5.
	public static Data<WonderfulObject> hands5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants d’invocateur autoritaire", 30000, Type.HANDS), 40));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gantelet de rouille supérieur", 34500, Type.HANDS), 60));
		
		return res;
	}
	
	//Objet merveilleux porté aux pieds de rareté 6.
	public static Data<WonderfulObject> hands6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Serres de Leng", 67000, Type.HANDS), 60));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gantelets de maître d’armes", 110000, Type.HANDS), 40));
		
		return res;
	}
	
	//Objet merveilleux porté à la tête de rareté 1.
	public static Data<WonderfulObject> head1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque de l’homme de marbre", 500, Type.HEAD), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Couvre-chef de déguisement humanoïde", 800, Type.HEAD), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Calotte de lumière", 900, Type.HEAD), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Couvre-chef de déguisement", 1800, Type.HEAD), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Couvre-chef amortissant", 2000, Type.HEAD), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque de l’avare", 3000, Type.HEAD), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque du traqueur", 3500, Type.HEAD), 15));

		return res;
	}
	
	//Objet merveilleux porté à la tête de rareté 2.
	public static Data<WonderfulObject> head2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Serre-tête de persuasion", 4500, Type.HEAD), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque du lutteur", 5000, Type.HEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Casque de présence intimidante", 5000, Type.HEAD), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Jingasa du soldat chanceux", 5000, Type.HEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Heaume de compréhension", 5200, Type.HEAD), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Couronne des épées", 6000, Type.HEAD), 13));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Serre-tête de lumière destructrice", 6480, Type.HEAD), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque du krenshar", 7200, Type.HEAD), 13));

		return res;
	}
	
	//Objet merveilleux porté à la tête de rareté 3.
	public static Data<WonderfulObject> head3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Heaume du seigneur des Mammouths", 8500, Type.HEAD), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Voilette des regards fugaces", 9000, Type.HEAD), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque encyclopédique", 10000, Type.HEAD), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque de la méduse", 10000, Type.HEAD), 17));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Couvre-chef du libre penseur", 12000, Type.HEAD), 17));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Auréole de sérénité", 16000, Type.HEAD), 20));

		return res;
	}
	
	//Objet merveilleux porté à la tête de rareté 4.
	public static Data<WonderfulObject> head4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Couronne oeil-de-chat", 18000, Type.HEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gueule de dragon", 18000, Type.HEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Mitre du hiérophante", 18000, Type.HEAD), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chapeau de magicien", 20000, Type.HEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Diadème de détection de pensées", 22000, Type.HEAD),7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque de la camarde", 22000, Type.HEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Casque hurlant", 22600, Type.HEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Serre-tête de lumière dévastatrice", 23760, Type.HEAD), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Casque de l’homme-poisson", 24000, Type.HEAD),10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Couronne de conquérant", 24600, Type.HEAD), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Casque batracien", 26000, Type.HEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Casque de télépathie", 27000, Type.HEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque anti-épidémie", 27000, Type.HEAD), 6));

		return res;
	}
	
	//Objet merveilleux porté à la tête de rareté 5.
	public static Data<WonderfulObject> head5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Serre-tête de protection des âmes", 30000, Type.HEAD), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lauriers de commandement", 30000, Type.HEAD), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque mineur des géants", 30000, Type.HEAD), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Couvre-chef de volonté inébranlable", 33600, Type.HEAD), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Heaume du seigneur des tempêtes", 35000, Type.HEAD),17));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Casque de cent feux", 36000, Type.HEAD), 22));

		return res;
	}
	
	//Objet merveilleux porté à la tête de rareté 6.
	public static Data<WonderfulObject> head6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perruque de juge", 59200, Type.HEAD), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Casque de téléportation", 73500, Type.HEAD), 25));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Auréole de menace", 84000, Type.HEAD), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque majeur des géants", 90000, Type.HEAD), 13));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Casque de mille feux", 125000, Type.HEAD),15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Casque d’éclat électrique", 125000, Type.HEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Diadème des cieux", 150000, Type.HEAD), 8));

		return res;
	}
	
	//Objet merveilleux porté au front rareté 1.
	public static Data<WonderfulObject> forehead1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Phylactère du croyant", 1000, Type.FOREHEAD), 60));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau du mort", 3600, Type.FOREHEAD), 40));

		return res;
	}
	
	//Objet merveilleux porté au front rareté 2.
	public static Data<WonderfulObject> forehead2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de belle allure +2", 4000, Type.FOREHEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d’inspiration +2", 4000, Type.FOREHEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d’intelligence +2", 4000, Type.FOREHEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d’agilité aérienne +2", 4500, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de métamorphe +2", 4500, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de réminiscence", 5100, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de focalisation ki", 5400, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de résolution inébranlable", 5600, Type.FOREHEAD), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Couronne de houx", 5700, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d’infaillible détermination", 6400, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Phylactère du berger", 7000, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d’intuition", 7000, Type.FOREHEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de chance renforcée", 7700, Type.FOREHEAD), 9));

		return res;
	}
	
	//Objet merveilleux porté au front rareté 3.
	public static Data<WonderfulObject> forehead3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de l’enragé", 8000, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau du serpent", 9000, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de prouesse mentale +2", 10000, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau du chasseur", 11000, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Phylactère de canalisation d’énergie négative", 11000, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Phylactère de canalisation d’énergie positive", 11000, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Oeil voilé", 12000, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de vaillance", 14000, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de ninjitsu", 15000, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de belle allure +4", 16000, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d’inspiration +4", 16000, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de supériorité mentale +2", 16000, Type.FOREHEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d’intelligence +4", 16000, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de métamorphe +4", 17500, Type.FOREHEAD), 7));

		return res;
	}
	
	//Objet merveilleux porté au front rareté 4.
	public static Data<WonderfulObject> forehead4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d’énergie magique", 20000, Type.FOREHEAD), 30));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de contresort", 20000, Type.FOREHEAD), 40));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de maîtrise des zombis", 27500, Type.FOREHEAD), 30));
		
		return res;
	}
	
	//Objet merveilleux porté au front rareté 5.
	public static Data<WonderfulObject> forehead5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Oeil des âmes", 30000, Type.FOREHEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau du loup arctique", 32000, Type.FOREHEAD), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de belle allure +6", 36000, Type.FOREHEAD), 13));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d’inspiration +6", 36000, Type.FOREHEAD), 13));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d’intelligence +6", 36000, Type.FOREHEAD), 13));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de métamorphe +6", 39000, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de prouesse mentale +4", 40000, Type.FOREHEAD), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de séduction", 40000, Type.FOREHEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d’agilité aérienne +4", 42000, Type.FOREHEAD), 10));

		return res;
	}
	
	//Objet merveilleux porté au front rareté 6.
	public static Data<WonderfulObject> forehead6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de résistance mentale", 64000, Type.FOREHEAD), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de supériorité mentale +4", 64000, Type.FOREHEAD), 30));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d’agilité aérienne +6", 81000, Type.FOREHEAD), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de prouesse mentale +6", 90000, Type.FOREHEAD), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de supériorité mentale +6", 144000, Type.FOREHEAD), 15));

		return res;
	}
	
	//Objet merveilleux porté au cou rareté 1.
	public static Data<WonderfulObject> neck1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Main du mage", 900, Type.NECK), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Effigie de guérison", 1500, Type.NECK), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette pare-balle +1", 1500, Type.NECK), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Broche de défense", 1500, Type.NECK), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier à boules de feu (1er modèle)", 1650, Type.NECK), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette d’armure naturelle +1", 2000, Type.NECK), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Broche antigolems", 2500, Type.NECK), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier à boules de feu (2e modèle)", 2700, Type.NECK), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Broche tueuse de nuées", 3000, Type.NECK), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Médaillon de protection spirituelle", 3500, Type.NECK), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collerette d’imitateur", 3500, Type.NECK), 5));

		return res;
	}
	
	//Objet merveilleux porté au cou rareté 2.
	public static Data<WonderfulObject> neck2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette de conflit élémentaire", 4000, Type.NECK), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des poings invincibles +1", 4000, Type.NECK), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier à boules de feu (3e modèle)", 4350, Type.NECK), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des poings vertueux", 5000, Type.NECK), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier à boules de feu (4e modèle)", 5400, Type.NECK), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Leurre à tempêtes", 5400, Type.NECK), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier à boules de feu (5e modèle)", 5850, Type.NECK),11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette pare-balle +2	", 6000, Type.NECK), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier de l’enfant-fée", 6000, Type.NECK), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaîne de détention", 7200, Type.NECK), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Charme de bonne santé", 7500, Type.NECK), 11));

		return res;
	}
	
	//Objet merveilleux porté au cou rareté 3.
	public static Data<WonderfulObject> neck3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette d’armure naturelle +2", 8000, Type.NECK), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette de protection contre la pétrification", 8000, Type.NECK), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette anti-sommeil", 8000, Type.NECK), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pendentif garde-tombes", 8000, Type.NECK), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Main miraculeuse", 8000, Type.NECK), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Torque de la furie du lion", 8000, Type.NECK), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier à boules de feu (6e modèle)", 8100, Type.NECK),7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier à boules de feu (7e modèle)", 8700, Type.NECK), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette de force soudaine", 9000, Type.NECK), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier d’adaptation", 9000, Type.NECK), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette d’astuce magique", 10000, Type.NECK), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier du fidèle compagnon", 10000, Type.NECK), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des poings glacés", 10000, Type.NECK), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cristal des mains guérisseuses	", 12000, Type.NECK), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gorgerin de protection", 12000, Type.NECK), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Médaillon des pensées", 12000, Type.NECK), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Charme de protection contre les malédictions", 12000, Type.NECK), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des poings ardents", 13000, Type.NECK),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette pare-balle +3", 13500, Type.NECK), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Charme de coagulation", 15000, Type.NECK), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier de sérénité", 16000, Type.NECK), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Broche d’étincelles ambrées", 16800, Type.NECK), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Symbole de protection sanguine", 17500, Type.NECK), 2));

		return res;
	}
	
	//Objet merveilleux porté au cou rareté 4.
	public static Data<WonderfulObject> neck4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette d’armure naturelle +3", 18000, Type.NECK), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ampoule de sang factice", 20000, Type.NECK), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des arts magiques", 20000, Type.NECK), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des poings invincibles +2", 20000, Type.NECK), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette d’opposition aux dragons", 20000, Type.NECK), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette de maîtrise magique", 22000, Type.NECK), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette pare-balle +4", 24000, Type.NECK),5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Main de pierre", 27000, Type.NECK), 13));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Charme antipoison", 27000, Type.NECK), 15));

		return res;
	}
	
	//Objet merveilleux porté au cou rareté 5.
	public static Data<WonderfulObject> neck5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette d’armure naturelle +4", 32000, Type.NECK), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette d’antidétection", 35000, Type.NECK), 17));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette pare-balle +5", 37500, Type.NECK), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Scarabée de protection", 38000, Type.NECK), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier d’étoiles enchevêtrées", 42000, Type.NECK), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des poings invincibles +3", 45000, Type.NECK), 18));

		return res;
	}
	
	//Objet merveilleux porté au cou rareté 6.
	public static Data<WonderfulObject> neck6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette d’armure naturelle +5", 50000, Type.NECK), 35));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des poings invincibles +4", 80000, Type.NECK), 25));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des plans", 120000, Type.NECK), 25));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des poings invincibles +5", 125000, Type.NECK), 15));

		return res;
	}
	
	//Objet merveilleux porté aux épaules rareté 1.
	public static Data<WonderfulObject> shoulder1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape enveloppante", 200, Type.SHOULDERS), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de déguisement humain", 900, Type.SHOULDERS), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de résistance +1", 1000, Type.SHOULDERS), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cordes de mulet", 1000, Type.SHOULDERS), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Châle de transfert vital", 1000, Type.SHOULDERS), 2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape défensive", 1000, Type.SHOULDERS), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de transformiste", 1500, Type.SHOULDERS), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape du lâche accroupi", 1800, Type.SHOULDERS), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape elfique", 2500, Type.SHOULDERS), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape du magicien solitaire", 2500, Type.SHOULDERS), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de disparition enflammée", 2600, Type.SHOULDERS), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de crocs", 2800, Type.SHOULDERS), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Spallières du serpent", 3000, Type.SHOULDERS), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape des brumes montagneuses", 3500, Type.SHOULDERS), 3));

		return res;
	}
	
	//Objet merveilleux porté aux épaules rareté 2.
	public static Data<WonderfulObject> shoulder2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de résistance +2", 4000, Type.SHOULDERS), 26));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape du rat sanguinaire", 6000, Type.SHOULDERS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Châle d’écume de mer", 6000, Type.SHOULDERS), 1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape du grand chêne", 6000, Type.SHOULDERS), 13));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de l’aigle", 7000, Type.SHOULDERS), 22));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de la raie manta", 7200, Type.SHOULDERS), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape du chasseur", 7500, Type.SHOULDERS), 6));
	
		return res;
	}
	
	//Objet merveilleux porté aux épaules rareté 3.
	public static Data<WonderfulObject> shoulder3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de résistance +3", 9000, Type.SHOULDERS), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de Marcheur du crépuscule", 10000, Type.SHOULDERS), 2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape cocon", 10000, Type.SHOULDERS), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Spallières du taureau", 10000, Type.SHOULDERS), 2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de pierre", 10000, Type.SHOULDERS), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de prestidigitateur", 10800, Type.SHOULDERS), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Spallières du lion vigilant", 10800, Type.SHOULDERS), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape du lion", 12000, Type.SHOULDERS), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Houppelande de spores", 13400, Type.SHOULDERS), 2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape d’évasion radieuse", 14000, Type.SHOULDERS), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de l’araignée", 14000, Type.SHOULDERS), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poncho de franc-tireur", 14000, Type.SHOULDERS), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape tentaculaire", 14000, Type.SHOULDERS), 2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Spallières à pointes démoniaques", 14350, Type.SHOULDERS), 2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape confortable", 15600, Type.SHOULDERS), 2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de résistance +4", 16000, Type.SHOULDERS), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Châle de mégère", 16000, Type.SHOULDERS), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pèlerine de bateleur", 17200, Type.SHOULDERS), 9));

		return res;
	}
	
	//Objet merveilleux porté aux épaules rareté 4.
	public static Data<WonderfulObject> shoulder4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Étole de justice", 18000, Type.SHOULDERS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de la méduse", 19200, Type.SHOULDERS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de diplomate", 20000, Type.SHOULDERS), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape tranchante", 20000, Type.SHOULDERS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de pierre supérieure", 20000, Type.SHOULDERS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de déplacement mineure", 24000, Type.SHOULDERS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de résistance +5", 25000, Type.SHOULDERS), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de la chauve-souris", 26000, Type.SHOULDERS), 12));

		return res;
	}
	
	//Objet merveilleux porté aux épaules rareté 5.
	public static Data<WonderfulObject> shoulder5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de bandit de grand chemin", 32500, Type.SHOULDERS),40));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Spallières de juggernaut", 40000, Type.SHOULDERS), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de charlatan", 45000, Type.SHOULDERS), 40));

		return res;
	}
	
	//Objet merveilleux porté aux épaules rareté 6.
	public static Data<WonderfulObject> shoulder6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de déplacement majeure", 50000, Type.SHOULDERS),15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ailes de vol", 54000, Type.SHOULDERS), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape éthérée", 55000, Type.SHOULDERS), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ailes de gargouille", 72000, Type.SHOULDERS), 25));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de la vouivre", 78600, Type.SHOULDERS), 20));

		return res;
	}
	
	//Objet merveilleux porté aux poignets rareté 1.
	public static Data<WonderfulObject> wrist1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manches à vêtements", 200, Type.WRIST),10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards de lutteur", 500, Type.WRIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d’armure +1", 1000, Type.WRIST), 28));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards de cambrioleur", 1050, Type.WRIST), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d’assiduité", 2000, Type.WRIST), 28));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Menottes de coopération", 2000, Type.WRIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Menottes d’obéissance", 3280, Type.WRIST), 4));

		return res;
	}
	
	//Objet merveilleux porté aux poignets rareté 2.
	public static Data<WonderfulObject> wrist2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d’armure +2", 4000, Type.WRIST),27));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards du faucon chasseur", 4000, Type.WRIST), 1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Canons fortifiés d’inquisiteur", 4000, Type.WRIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d’archer", 5000, Type.WRIST), 27));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards d’incantation défensive", 5000, Type.WRIST), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets Broyeurs", 6000, Type.WRIST), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards de défense", 6000, Type.WRIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelet de vigne", 6000, Type.WRIST), 17));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards d’allonge", 7200, Type.WRIST), 1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards d’amuseur", 7900, Type.WRIST), 1));

		return res;
	}
	
	//Objet merveilleux porté aux poignets rareté 3.
	public static Data<WonderfulObject> wrist3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelet de charmes", 8000, Type.WRIST),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Canons de duelliste", 8000, Type.WRIST), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Canons d’avant-bras miséricordieux", 8000, Type.WRIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards de tacticien", 8000, Type.WRIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d’armure +3", 9000, Type.WRIST), 25));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fléau des séducteurs", 9900, Type.WRIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards du chevalier vengeur", 11500, Type.WRIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets de maître-archer", 13900, Type.WRIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards des génies (éfrit)", 14400, Type.WRIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelet de négociation", 14500, Type.WRIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets de grâce", 15000, Type.WRIST), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards du chevalier miséricordieux", 15600, Type.WRIST), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelet de chances renouvelées", 15750, Type.WRIST),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d’armure +4", 16000, Type.WRIST), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Menottes de domination", 16200, Type.WRIST), 1));		
		
		return res;
	}
	
	//Objet merveilleux porté aux poignets rareté 4.
	public static Data<WonderfulObject> wrist4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards des génies (djinn)", 18900, Type.WRIST),10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards des génies (marid)", 18900, Type.WRIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards des génies (shaitan)", 18900, Type.WRIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelet d’assistance", 19000, Type.WRIST), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d’archer hors pair", 25000, Type.WRIST), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d’armure +5", 25000, Type.WRIST), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards de vengeance", 25000, Type.WRIST), 10));
		
		return res;
	}
	
	//Objet merveilleux porté aux poignets rareté 5.
	public static Data<WonderfulObject> wrist5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaînes dimensionnelles", 28000, Type.WRIST),30));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets des Hauts Elfes", 30000, Type.WRIST), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d’armure +6", 36000, Type.WRIST), 55));
		
		return res;
	}
	
	//Objet merveilleux porté aux poignets rareté 6.
	public static Data<WonderfulObject> wrist6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d’armure +7", 49000, Type.WRIST),60));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d’armure +8", 64000, Type.WRIST), 40));
		
		return res;
	}
	
	//Objet merveilleux sans emplacement rareté 0.
	public static Data<WonderfulObject> withoutLocation0(){//ATTENTION RARETE 0
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Plume magique (ancre)", 50, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Solvant universel", 50, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Torche ioun", 75, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Piton tenace", 100, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Peinture de guerre du terrible visage", 100, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Élixir d’amour", 150, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Onguent d’intemporalité", 150, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Plume magique (éventail)", 200, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Alambic à formules", 200, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Entonnoir d’hybridation", 200, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Savon de l’âme", 200, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poudre de dissimulation des traces", 250, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Élixir de discrétion instinctive", 250, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Élixir de nage", 250, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Élixir d’acrobatie", 250, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Élixir d’acuité visuelle", 250, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gouttes de vision nocturne", 250, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Huile de silence", 250, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lustrargent", 250, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Outil multifonction de baroudeur", 250, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bouteille à message", 300, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Plume magique (oiseau)", 300, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Vermine en papier plié", 300, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pomme d’or alléchante", 400, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Plume magique (arbre)", 400, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Clef de solide fermeture", 400, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Plume magique (bateau cygne)", 450, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Portrait animé", 500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Maléfice en bouteille", 500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sérum de vérité", 500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Plume magique (fouet)", 500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fourreau à aiguiser", 500, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Thé divinatoire", 550, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sel d’abjuration", 600, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Aimant à projectiles", 600, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poudre obscurcissante", 600, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de feu de camp", 720, Type.WITHOUT_LOCATION),6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Torche d’archon", 750, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Livre de convocation durable inférieur", 750, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corde de fer", 750, Type.WITHOUT_LOCATION),4));	
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Feuille magique", 750, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fourrure de yéti en bouteille", 800, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cirage défoliant", 800, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poussière d’émulation", 800, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre d’entrailles en acier", 800, Type.WITHOUT_LOCATION),5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poudre dessiccative", 850, Type.WITHOUT_LOCATION),3));

		return res;
	}
	
	//Objet merveilleux sans emplacement rareté 1.
	public static Data<WonderfulObject> withoutLocation1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("RARITY0", -9999999, Type.NONE), 3));//Le premier element amène à la rareté 0.
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poupée anatomique", 1000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bille antimétamorphose", 1000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pâte de lien animal", 1000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ex-libris de rappel", 1000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bille de bore (1er niveau)", 1000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poche de dissimulation", 1000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Liqueur radiesthésique", 1000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Encens de transcendance", 1000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Page de connaissances magiques (1er niveau)", 1000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (1er niveau)", 1000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flasque de conservation alchimique (1er niveau)", 1000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ciboire des domaines altérés", 1000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Onguent d’insaisissabilité", 1000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Nid grouillant de guêpes", 1000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Élixir de souffle enflammé", 1100, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sel funéraire", 1100, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flûte d’Hamelin", 1150, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poudre d’illusion", 1200, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Crâne gobelin explosif", 1200, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Élixir de souffle draconique", 1400, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Marque-page trompeur", 1500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bouteille à paroles", 1500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poudre absorbante acide", 1600, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poudre d’apparition", 1800, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Carquois efficace", 1800, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flûte à bruitages", 1800, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fourreau de vigueur", 1800, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bâton de marche agile", 2000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sang de prouesse physique", 2000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Boîte à tintamarre", 2000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corne à poudre étanche", 2000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Tambour de feu gobelin", 2000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Havresac du mage", 2000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corne de brume", 2000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pointe en fer illusoire", 2000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pennon du chevalier (honneur)", 2200, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pilule volatile (1er niveau)", 2200, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gemme à élémentaire", 2250, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Onguent de vol", 2250, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Colle universelle", 2400, Type.WITHOUT_LOCATION),1));	
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pomme du sommeil éternel", 2500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sac sans fond (1er modèle)", 2500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cierge de vérité", 2500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poupée malfaisante", 2500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre d’alerte", 2700, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Livre de convocation durable intermédiaire", 2750, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bille de force", 3000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaudron à décoction", 3000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Carillon d’ouverture", 3000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Philtre d’amour", 3000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corde d’escalade", 3000, Type.WITHOUT_LOCATION),5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pilule volatile (2e niveau)", 3000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Linceul de désintégration", 3300, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sac à malice (gris)", 3400, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poudre de disparition", 3500, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poudre d’alourdissement", 3600, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pyxide de vigilance", 3600, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (corbeau d’argent)", 3800, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pilule volatile (3e niveau)", 3800, Type.WITHOUT_LOCATION),1));

		return res;
	}
	
	//Objet merveilleux sans emplacement rareté 2.
	public static Data<WonderfulObject> withoutLocation2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bille de bore (2e niveau)", 4000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Filière de précaution", 4000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Échelle dimensionnelle	", 4000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunette longue distance", 4000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (fuseau translucide)", 4000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pigments merveilleux", 4000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Page de connaissances magiques (2e niveau)", 4000, Type.WITHOUT_LOCATION),8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (2e niveau)", 4000, Type.WITHOUT_LOCATION),10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flasque de conservation alchimique (2e niveau)", 4000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Onguent de restauration", 4000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Onguent des roches", 4000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Compas des vents", 4400, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Tambour de feu gobelin (incendiaire)", 4500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pennon du chevalier (bataille)", 4500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pennon du chevalier (pourparler)", 4500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poudre néantisée", 4500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Encens de méditation", 4900, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fiole de mélange", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sac sans fond (2e modèle)", 5000, Type.WITHOUT_LOCATION),14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lame d’os", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corne du grand veneur", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Heurtoir de porte magique", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (prisme rose laiteux)", 5000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Maillet de bâtisseur", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bourse polymorphe", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fourreau de coagulation", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Banc d’yeux-poissons indiscrets", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fourreau de lame discrète", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre d’alliance", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fer de convocation", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Urne fumigène", 5400, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cuillère nourrissante", 5400, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Éventail enchanté", 5500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lanterne macabre", 5800, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pièce de destinée aléatoire", 6000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cor de lucidité martiale", 6000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Insigne de lien vital", 6000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Larme de martyr", 6000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flûte de hantise", 6000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corde de nouement", 6000, Type.WITHOUT_LOCATION),1));	
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bol chantant de frappe ki", 6000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Familier de pierre", 6000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Livre de convocation durable supérieur", 6126, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Baguettes divinatoires en os de dragon", 6400, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cor du Bien/du Mal", 6500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bindi en écaille de naga", 6600, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flacon d’ombres", 7000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de bravade", 7000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pont escamotable", 7000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Miroir aux reflets protecteurs", 7000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bateau pliant", 7200, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flacon d’air pur", 7250, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sac sans fond (3e modèle)", 7400, Type.WITHOUT_LOCATION),7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Baume de souplesse taquine", 7500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bougie d’air pur", 7500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Harpe de suggestion", 7500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité de guerre", 7500, Type.WITHOUT_LOCATION),3));

		return res;
	}
	
	//Objet merveilleux sans emplacement rareté 3.
	public static Data<WonderfulObject> withoutLocation3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Coupe de larmes toxiques", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Goupillon d’exorciste", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité de création des golems (de chair)", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Harpe fracassante", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Insigne de courage", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (sphère rouge sang)", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (sphère bleu incandescent)", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (rhombe bleu pâle)", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (sphère rose et verte)", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (rhombe rose vif)", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (sphère rouge et bleue)", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Aiguilles de tatouage magiques", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Outils de cambrioleur animés", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sifflet-garou", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cartes fantasmagoriques", 8100, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cierge d’invocation", 8400, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sac à malice (rouille)", 8500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bille de bore (3e niveau)", 9000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Carafe intarissable", 9000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Miroir détestable", 9000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Page de connaissances magiques (3e niveau)", 9000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (3e niveau)", 9000, Type.WITHOUT_LOCATION),6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flasque de conservation alchimique (3e niveau)", 9000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (hibou de chrysolite)", 9100, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chapelet de prières mineur", 9600, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sac sans fond (4e modèle)", 10000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Craie de délimitation", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Carillon de silence retentissant", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brique de réparation", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Harpe du destin", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Tambour de course", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fil d’embaumement", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Oeil indicible", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (griffon de bronze)", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (mouche d’ébène)", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (araignée d’ardoise)", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sablier de la dernière chance", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (rhombe bleu nuit)", 10000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Natte de ki", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bannière seigneuriale (diligence)", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Symbole sacré malléable", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Coffret du minet", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Symbole de lumière guérisseuse", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Moulin à prière de puissance morale", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cheval de pierre (coursier)", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cristal de possession", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Scellé de trésorier", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gemme d’âme noircie", 12000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité de création des golems (d’argile)", 12000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Selle du maître de guerre", 12000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flûte de dissipation", 12000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flûte de douleur", 12000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunette de détection de l’invisibilité", 12000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Livre magique", 12500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Essences de transmutation", 12500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gemme d’illumination", 13000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Harpe de contagion", 13000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lyre de bâtisseur", 13000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bannière néantisée", 14000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cheval de pierre (destrier)", 14800, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Livre du maître du savoir", 15000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaudron d’abondance", 15000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trompette du jugement", 15000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Conque des tritons", 15000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle des sirènes", 15300, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (chien d’onyx)", 15500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sac à malice (ocre)", 16000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bille de bore (4e niveau)", 16000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Page de connaissances magiques (4e niveau)", 16000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (4e niveau)", 16000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flasque de conservation alchimique (4e niveau)", 16000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fourreau d’affûtage", 16000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (lions d’or)", 16500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Carillon d’interruption", 16800, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Balai volant", 17000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (éléphant de marbre)", 17000, Type.WITHOUT_LOCATION),1));

		return res;
	}
	
	//Objet merveilleux sans emplacement rareté 4.
	public static Data<WonderfulObject> withoutLocation4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (fuseau irisé)", 18000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Orbe d’épouvante abaddonienne", 18000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Tapis volant (1,50 m × 1,50 m)", 20000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corne d’antagonisme", 20000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cor de dévastation", 20000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (ellipsoïde lavande)", 20000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (fuseau blanc laiteux)", 20000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cloche dorée de bannissement", 20000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Athamé du nécromancien", 20000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Puits portable", 20000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre porte-bonheur", 20000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (chèvres d’ivoire)", 21000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corde d’enchevêtrement", 21000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité de création des golems (de pierre)", 22000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Orbe des cieux", 22000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pioche des titans", 23348, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corne d’éternelle bravoure", 24000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bille de bore (5e niveau)", 25000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Émeraude chaotique", 25000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Page de connaissances magiques (5e niveau)", 25000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (5e niveau)", 25000, Type.WITHOUT_LOCATION),7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flasque de conservation alchimique (5e niveau)", 25000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Maillet des titans", 23305, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Liens d’acier mystiques", 26000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cube de résistance au froid", 27000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de vitalité +1", 27500, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de remise en forme +1", 27500, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de coordination physique +1", 27500, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité de perspicacité +1", 27500, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité d’autorité et d’influence +1", 27500, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité de compréhension +1", 27500, Type.WITHOUT_LOCATION),4));

		return res;
	}
	
	//Objet merveilleux sans emplacement rareté 5.
	public static Data<WonderfulObject> withoutLocation5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (destrier d’obsidienne)", 28500, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaudron des morts", 30000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Timbales de panique", 30000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (prisme orange)", 30000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (prisme vert pâle)", 30000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lanterne révélatrice", 30000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Balai volant (de course)", 30000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaudron de résurrection", 33000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Tapis volant (1,50 m × 3 m)", 35000, Type.WITHOUT_LOCATION),5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité de création des golems (de fer)", 35000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bille de bore (6e niveau)", 36000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (prisme violet vif)", 36000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Orbe de chaos absolu", 36000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Page de connaissances magiques (6e niveau)", 36000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (6e niveau)", 36000, Type.WITHOUT_LOCATION),8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flasque de conservation alchimique (6e niveau)", 36000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaudron volant", 40000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Talisman d’animosité", 40000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (ellipsoïde vert et lavande)", 40000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Anneaux de transport", 40000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaudron de vision", 42000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Boule de cristal", 42000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité de création des golems (de pierre monumentaux)", 44000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Timbales de rapidité", 45000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chapelet de prières courant", 45800, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Orbe des tempêtes", 48000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Page de connaissances magiques (7e niveau)", 49000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (7e niveau)", 49000, Type.WITHOUT_LOCATION),4));

		return res;
	}
	
	//Objet merveilleux sans emplacement rareté 6.
	public static Data<WonderfulObject> withoutLocation6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Boule de cristal (détection de l’invisibilité)", 50000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cor du Valhalla", 50000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Boule de cristal (détection des pensées)", 51000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Feuilles automnales des dryades", 52000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Forteresse instantanée", 55000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de vitalité +2", 55000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de remise en forme +2", 55000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de coordination physique +2", 55000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité de perspicacité +2", 55000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité d’autorité et d’influence +2", 55000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité de compréhension +2", 55000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bannière seigneuriale (terreur)", 56000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Tapis volant (3 m × 3 m)", 60000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Crâne des ténèbres", 60000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Orbe de loi parfaite", 60000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cube de force", 62000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Page de connaissances magiques (8e niveau)", 64000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (8e niveau)", 64000, Type.WITHOUT_LOCATION),6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Boule de cristal (télépathie)", 70000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cor de dévastation supérieur", 70000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (deux sorts)", 70000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gemme de vision", 75000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bannière seigneuriale (victoire)", 75000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Boule de cristal (vision lucide)", 80000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Page de connaissances magiques (9e niveau)", 81000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (9e niveau)", 81000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Puits des mondes", 82000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de vitalité +3", 82500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de remise en forme +3", 82500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de coordination physique +3", 82500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité de perspicacité +3", 82500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité d’autorité et d’influence +3", 82500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité de compréhension +3", 82500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Submersible du crabe", 90000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bol de convocation d’élémentaires de l’Eau", 90000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Braséro de convocation d’élémentaires du Feu", 90000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Encensoir de convocation d’élémentaires de l’Air", 90000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre de convocation d’élémentaires de la Terre", 90000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Miroir d’opposition", 92000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chapelet de prières majeur", 95800, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bannière seigneuriale (croisades)", 100000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de vitalité +4", 110000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de remise en forme +4", 110000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de coordination physique +4", 110000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité de perspicacité +4", 110000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité d’autorité et d’influence +4", 110000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité de compréhension +4", 110000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de vitalité +5", 137500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de remise en forme +5", 137500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de coordination physique +5", 137500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité de perspicacité +5", 137500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité d’autorité et d’influence +5", 137500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Traité de compréhension +5	", 137500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Urne du mauvais génie", 145000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cube des plans", 164000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flasque de fer", 170000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Miroir de prouesse mentale", 175000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Miroir d’emprisonnement", 200000, Type.WITHOUT_LOCATION),1));
		
		return res;
	}
}