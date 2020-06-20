package constant;
/**
 * Les tableaux de tirages pour les objets d'arts
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

import artItem.ArtItem;
import utility.Data;
import utility.Tuple;

public class ArtItemConstant {
	
	//objet d'art de rareté 1.
	public static Data<ArtItem> rarity1(){
		Data<ArtItem> res = new Data<ArtItem>();
		
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("statuette de guerrier en bronze", 15), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("carillon en cuivre élaboré", 20), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("éventail peint en papier avec une armature en argent", 20), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("carafe en cuivre et en verre", 25), 2));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("symbole sacré en argent", 25), 8));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("idole sculptée dans la pierre", 30), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("assortiment de six dés en ivoire", 30), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("bol en ivoire gravés d’animaux", 40), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("poupée de porcelaine avec des habits de soie", 40), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("masque de porcelaine", 40), 2));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("flasque en bronze gravée de guerrier", 50), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("brasero en cuivre avec des gravures religieuses", 50), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("sceptre de cuivre avec des incrustations en or", 50), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("oeuf de cristal sur un présentoir en argent", 50), 2));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("peinture d’une noble", 50), 2));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("calice en ébénite polie", 50), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("hochet de bébé en argent", 50), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("échiquier en argent", 50), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("étui à parchemin en ivoire", 60), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("assiette en argent décorée", 60), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("corne à boire en ivoire avec un embout en cuivre", 60), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("sceau en argent d’une famille noble", 60), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("statue de dragon en argent", 65), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("encensoir en électrum avec des filigranes d’argent", 70), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("chandelier en argent avec un symbole sacré", 75), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("peigne en argent avec une poignée ornementée", 75), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("miroir à main en argent", 75), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("crâne en cristal", 80), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("flûte ornementée en argent", 80), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("scarabée gravé en jade", 85), 3));
		
		return res;
	}
	
	//objet d'art de rareté 2.
	public static Data<ArtItem> rarity2(){
		Data<ArtItem> res = new Data<ArtItem>();
		
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("carillon élaboré en argent", 60), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("scarabée en or gravé", 75), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("éventail peint en soie avec une armature en électrum", 75), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("tête d’animal empaillé montée sur une plaque", 75), 2));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("assortiment de six dés en argent", 75), 8));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("carafe en argent et en verre", 75), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("bol en argent gravé de lion", 75), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("masque en argent", 75), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("idole sculptée dans le jade", 80), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("poupée de porcelaine habillée de fourrures et de bijoux", 80), 2));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("brasero en argent avec des symboles religieux", 80), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("flasque en argent avec des symboles religieux", 80), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("encensoir d’or avec des filigranes en argent", 90), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("échiquier en or et en argent", 100), 2));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("hochet de bébé en or", 100), 2));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("symbole sacré en or", 100), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("lyre de maître", 100), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("peinture d’une princesse", 100), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("coupe en argent frappée du blason royal", 100), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("assiette décorée en électrum", 110), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("statue de dragon en or", 110), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("statue de lion en or", 110), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("corne à boire en ivoire avec un embout en argent", 110), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("miroir à main en or et en argent", 120), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("chaudron en argent avec des symboles d’animaux", 120), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("peigne en argent avec une poignée en or", 125), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("oeuf en argent avec une figurine de dragon", 125), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("sceptre en argent avec des aigles", 125), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("calice en argent avec des dragons gravés", 150), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("chandelier en or avec un symbole sacré", 200), 3));
		
		return res;
	}
	
	//objet d'art de rareté 3.
	public static Data<ArtItem> rarity3(){
		Data<ArtItem> res = new Data<ArtItem>();
			
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("crâne de démon plaqué or", 300), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("idole de marbre", 300), 10));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("luth de maître en ébénite", 300), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("scarabée gravé en mithral", 400), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("carafe en or et en ivoire", 400), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("bol en or gravé de dragons", 400), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("encensoir en or avec des incrustations de platine", 400), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("masque en or", 450), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("hochet de bébé en or et en mithral", 500), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("échiquier en or", 500), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("flasque en or avec des symboles religieux", 500), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("boîte à puzzle en or", 500), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("symbole sacré en platine", 500), 9));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("coupe en or frappé du blason royal", 550), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("calice en or gravé de griffons", 600), 8));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("sceptre en mithral avec des incrustations d’or", 600), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("assiette décorée en or", 700), 7));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("statuette de divinité en or et en platine", 750), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("chaudron en or avec des symboles alchimiques", 750), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("peinture de reine", 750), 4));
			
		return res;
	}
	
	//objet d'art de rareté 4.
	public static Data<ArtItem> rarity4(){
		Data<ArtItem> res = new Data<ArtItem>();
			
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("scarabée gravé en platine", 700), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("crâne de dragon plaqué or", 800), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("bol en platine avec des gravures ésotériques", 800), 7));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("encensoir ornementé en platine", 800), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("carafe en or décorée de grappes de raisin", 850), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("masque en platine", 900), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("échiquier en or et en mithral", 1000), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("planétaire en or et en platine", 1000), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("flûte en or", 1000), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("idole en or avec d’étranges gravures", 1000), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("hochet de bébé en platine", 1000), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("symbole sacré en platine d’un prêtre célèbre", 1000), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("assiette décorée en platine", 1100), 9));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("chaudron de platine avec d’étranges symboles", 1100), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("flasque en platine avec des symboles religieux", 1100), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("coupe en platine frappée du blason royal", 1200), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("sceptre de platine avec incrustations d’or", 1200), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("calice en platine avec des anges gravés", 1200), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("statuette de divinité en platine", 1300), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("peinture d’une reine réalisée par un maître", 1500), 7));
			
		return res;
	}
	
	//objet d'art de rareté 5.
	public static Data<ArtItem> rarity5(){
		Data<ArtItem> res = new Data<ArtItem>();
			
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("livre de chansons oubliées écrit par un célèbre barde", 3000), 8));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("boîte à musique en ébénite et en platine", 4000), 8));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("sablier en mithral avec de la poussière de diamant", 4000), 10));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("oeuf orné de gemmes contenant le sang d’un ensorceleur épique", 4500), 8));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("urne en or contenant les cendres d’un héros", 4500), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("heaume taillé dans le crâne d’un diantrefosse", 5000), 8));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("texte sacré écrit de la main d’un saint", 5000), 10));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("peinture d’une reine bien-aimée par un maître", 5000), 10));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("idole de platine avec de mystérieuses gravures", 5000), 9));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("épée d’apparat incrustée de gemmes", 6000), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("fémur de saint gravé", 6000), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("calice en platine béni par un saint", 6000), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("météore métallique luisant", 6500), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("orbe royal en or incrusté de joyaux", 7000), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("coeur de dragon cristallisé", 7500), 3));
			
		return res;
	}
	
	//objet d'art de rareté 6.
	public static Data<ArtItem> rarity6(){
		Data<ArtItem> res = new Data<ArtItem>();
			
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("âme de vampire gelée", 7000), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("corne de licorne avec incrustations de mithral", 7000), 7));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("souffle de dieu cristallisé", 10000), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("essence de vérité", 10000), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("globe d’air pur", 10000), 9));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("coeur de la montagne", 10000), 9));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("gemme d’âme inversée", 10000), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("orbe d’eau vivante", 10000), 9));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("éclat de feu pur", 10000), 9));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("glace qui ne fond jamais", 10000), 8));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("bijou temporel", 11000), 7));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("casse-tête insoluble en adamantium", 12000), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("texte sacré écrit avec le sang d’un saint", 12000), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("tribarre en mithral", 12000), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("tapisserie éthérée", 13000), 7));
			
		return res;
	}

}
