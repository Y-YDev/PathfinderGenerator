package constant;

import item.gemAndJewel.Gem;
import item.gemAndJewel.Material;
import item.gemAndJewel.TypeJewel;
import item.gemAndJewel.TypeSize;
import utility.Data;
import utility.Tuple;

/**
 * GemAndJewelConstant contient toutes les constantes utiles 
 * pour la création de gemmes et de bijoux.
 * Basé sur le tableau : Generateur_de_tresor.ods (en lien sur Github).
 * Grade 1 : faible inférieur
 * Grade 2 : faible supérieur
 * Grade 3 : intermédiaire inférieur
 * Grade 4 : intermédiaire supérieur
 * Grade 5 : puissant inférieur
 * Grade 6 : puissant supérieur
 * @author Mentra20
 *
 */
public class GemAndJewelConstant {
	
	// Tableau de drop de creation des gemmes ou bijoux de grade 1.
	public static Data<Integer> grade1(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(1, 20));
		res.add(new Tuple<Integer, Integer>(2, 40));
		res.add(new Tuple<Integer, Integer>(3, 40));
		
		return res;
	}
	
	// Tableau de drop de creation des gemmes ou bijoux de grade 2.
	public static Data<Integer> grade2(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(1, 25));
		res.add(new Tuple<Integer, Integer>(2, 30));
		res.add(new Tuple<Integer, Integer>(3, 45));
		
		return res;
	}
	
	// Tableau de drop de creation des gemmes ou bijoux de grade 3.
	public static Data<Integer> grade3(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(1, 25));
		res.add(new Tuple<Integer, Integer>(2, 25));
		res.add(new Tuple<Integer, Integer>(3, 50));
		
		return res;
	}
	
	// Tableau de drop de creation des gemmes ou bijoux de grade 4.
	public static Data<Integer> grade4(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(1, 25));
		res.add(new Tuple<Integer, Integer>(2, 20));
		res.add(new Tuple<Integer, Integer>(3, 55));
		
		return res;
	}
	
	// Tableau de drop de creation des gemmes ou bijoux de grade 5.
	public static Data<Integer> grade5(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(1, 22));
		res.add(new Tuple<Integer, Integer>(2, 18));
		res.add(new Tuple<Integer, Integer>(3, 60));
		
		return res;
	}
	
	// Tableau de drop de creation des gemmes ou bijoux de grade 6.
	public static Data<Integer> grade6(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(1, 20));
		res.add(new Tuple<Integer, Integer>(2, 15));
		res.add(new Tuple<Integer, Integer>(3, 65));
		
		return res;
	}
	
	
	// Tableau de drop des gemmes de grade 1.
	public static Data<Gem> gemGrade1(){
		Data<Gem> res = new Data<Gem>();
		res.add(new Tuple<Gem, Integer>(new Gem("agate"), 8));
		res.add(new Tuple<Gem, Integer>(new Gem("albâtre"), 6));
		res.add(new Tuple<Gem, Integer>(new Gem("azurite"), 6));
		res.add(new Tuple<Gem, Integer>(new Gem("hématite"), 6));
		res.add(new Tuple<Gem, Integer>(new Gem("lapis lazuli"), 8));
		res.add(new Tuple<Gem, Integer>(new Gem("malachite"), 6));
		res.add(new Tuple<Gem, Integer>(new Gem("obsidienne"), 8));
		res.add(new Tuple<Gem, Integer>(new Gem("perle d’eau douce"), 8));
		res.add(new Tuple<Gem, Integer>(new Gem("pyrite"), 6));
		res.add(new Tuple<Gem, Integer>(new Gem("rhodocrosite"), 8));
		res.add(new Tuple<Gem, Integer>(new Gem("quartz cristal ou de roche"), 8));
		res.add(new Tuple<Gem, Integer>(new Gem("coquillage"), 6));
		res.add(new Tuple<Gem, Integer>(new Gem("oeil de tigre"), 8));
		res.add(new Tuple<Gem, Integer>(new Gem("turquoise"), 8));
		
		return res;
	}
	
	// Tableau de drop des gemmes de grade 2.
	public static Data<Gem> gemGrade2(){
		Data<Gem> res = new Data<Gem>();
		res.add(new Tuple<Gem, Integer>(new Gem("héliotrope"), 6));
		res.add(new Tuple<Gem, Integer>(new Gem("cornaline"), 6));
		res.add(new Tuple<Gem, Integer>(new Gem("chrysoprase"), 6));
		res.add(new Tuple<Gem, Integer>(new Gem("citrine"), 6));
		res.add(new Tuple<Gem, Integer>(new Gem("ivoire"), 8));
		res.add(new Tuple<Gem, Integer>(new Gem("jaspe"), 6));
		res.add(new Tuple<Gem, Integer>(new Gem("pierre de lune"), 6));
		res.add(new Tuple<Gem, Integer>(new Gem("onyx"), 6));
		res.add(new Tuple<Gem, Integer>(new Gem("péridot "), 6));
		res.add(new Tuple<Gem, Integer>(new Gem("quartz, laiteux, rose ou fumé"), 18));
		res.add(new Tuple<Gem, Integer>(new Gem("sardoine"), 6));
		res.add(new Tuple<Gem, Integer>(new Gem("sardonyx"), 6));
		res.add(new Tuple<Gem, Integer>(new Gem("spinelle, rouge ou verte"), 7));
		res.add(new Tuple<Gem, Integer>(new Gem("zircon"), 7));
		
		return res;
	}
	
	// Tableau de drop des gemmes de grade 3.
	public static Data<Gem> gemGrade3(){
		Data<Gem> res = new Data<Gem>();
		res.add(new Tuple<Gem, Integer>(new Gem("ambre"), 10));
		res.add(new Tuple<Gem, Integer>(new Gem("améthyste"), 10));
		res.add(new Tuple<Gem, Integer>(new Gem("chrysobéryl"), 10));
		res.add(new Tuple<Gem, Integer>(new Gem("corail"), 10));
		res.add(new Tuple<Gem, Integer>(new Gem("grenat"), 10));
		res.add(new Tuple<Gem, Integer>(new Gem("jade"), 10));
		res.add(new Tuple<Gem, Integer>(new Gem("jais"), 10));
		res.add(new Tuple<Gem, Integer>(new Gem("perle d’eau de mer"), 10));
		res.add(new Tuple<Gem, Integer>(new Gem("spinelle bleue foncée "), 10));
		res.add(new Tuple<Gem, Integer>(new Gem("tourmaline"), 10));
		
		return res;
	}
	
	// Tableau de drop des gemmes de grade 4.
	public static Data<Gem> gemGrade4(){
		Data<Gem> res = new Data<Gem>();
		res.add(new Tuple<Gem, Integer>(new Gem("aigue-marine"), 25));
		res.add(new Tuple<Gem, Integer>(new Gem("opale"), 25));
		res.add(new Tuple<Gem, Integer>(new Gem("perle noire"), 25));
		res.add(new Tuple<Gem, Integer>(new Gem("topaze"), 25));
		
		return res;
	}
	
	// Tableau de drop des gemmes de grade 5.
	public static Data<Gem> gemGrade5(){
		Data<Gem> res = new Data<Gem>();
		res.add(new Tuple<Gem, Integer>(new Gem("petit diamant"), 25));
		res.add(new Tuple<Gem, Integer>(new Gem("émeraude"), 25));
		res.add(new Tuple<Gem, Integer>(new Gem("petit rubis"), 25));
		res.add(new Tuple<Gem, Integer>(new Gem("saphir"), 25));
		
		return res;
	}
	
	// Tableau de drop des gemmes de grade 6.
	public static Data<Gem> gemGrade6(){
		Data<Gem> res = new Data<Gem>();
		res.add(new Tuple<Gem, Integer>(new Gem("gros diamant"), 25));
		res.add(new Tuple<Gem, Integer>(new Gem("émeraude verte luisante"), 25));
		res.add(new Tuple<Gem, Integer>(new Gem("gros rubis"), 25));
		res.add(new Tuple<Gem, Integer>(new Gem("saphir étoilé"), 25));
		
		return res;
	}
	
	// Tableau de tirage des tailles de bijoux.
	public static Data<TypeSize> jewelSize(){
		Data<TypeSize> res = new Data<TypeSize>();
		res.add(new Tuple<TypeSize, Integer>(TypeSize.MIN, 1));
		res.add(new Tuple<TypeSize, Integer>(TypeSize.P, 24));
		res.add(new Tuple<TypeSize, Integer>(TypeSize.M, 60));
		res.add(new Tuple<TypeSize, Integer>(TypeSize.G, 8));
		res.add(new Tuple<TypeSize, Integer>(TypeSize.TG, 4));
		res.add(new Tuple<TypeSize, Integer>(TypeSize.GIG, 2));
		res.add(new Tuple<TypeSize, Integer>(TypeSize.COL, 1));
		
		return res;
	}
	
	// Tableau de tirage des types de bijoux de grade 1.
	public static Data<TypeJewel> jewelType1(){
		Data<TypeJewel> res = new Data<TypeJewel>();
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BAGUE, 22));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.EPINGLE_A_CHAPEAU, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.MEDAILLE, 4));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BOUCLES_D_OREILLES, 8));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.PIERCING, 2));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BOUTON_DE_MANCHETTE, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.FAUSSE_DENT, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BRACELET_DE_CHEVILLES, 4));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BIJOUX_DE_CHEVEUX, 6));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.COLLIER, 17));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BRACELET, 14));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.MEDAILLON, 6));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BROCHE, 7));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BAGUE_ARMURE, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BOUCLE_DE_CEINTURE, 4));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.SCEAU, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.CEINTURE, 1));
		
		return res;
	}
	
	// Tableau de tirage des types de bijoux de grade 2.
	public static Data<TypeJewel> jewelType2(){
		Data<TypeJewel> res = new Data<TypeJewel>();
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BAGUE, 18));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.EPINGLE_A_CHAPEAU, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.MEDAILLE, 3));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BOUCLES_D_OREILLES, 7));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.PIERCING, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BOUTON_DE_MANCHETTE, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.FAUSSE_DENT, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BRACELET_DE_CHEVILLES, 5));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BIJOUX_DE_CHEVEUX, 7));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.COLLIER, 15));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BRACELET, 9));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.MEDAILLON, 8));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BROCHE, 9));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BAGUE_ARMURE, 2));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BOUCLE_DE_CEINTURE, 6));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.SCEAU, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.CEINTURE, 3));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BRACELET_BAGUE, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.CHEVALIERE, 2));
		
		return res;
	}
	
	// Tableau de tirage des types de bijoux de grade 3.
	public static Data<TypeJewel> jewelType3(){
		Data<TypeJewel> res = new Data<TypeJewel>();
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BAGUE, 16));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.EPINGLE_A_CHAPEAU, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.MEDAILLE, 5));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BOUCLES_D_OREILLES, 8));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.PIERCING, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BOUTON_DE_MANCHETTE, 3));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.FAUSSE_DENT, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BRACELET_DE_CHEVILLES, 3));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BIJOUX_DE_CHEVEUX, 8));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.COLLIER, 13));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BRACELET, 7));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.MEDAILLON, 7));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BROCHE, 9));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BAGUE_ARMURE, 2));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BOUCLE_DE_CEINTURE, 5));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.SCEAU, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.CEINTURE, 3));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BRACELET_BAGUE, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.CHEVALIERE, 4));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BIJOU_DE_PEAU, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.PECTORAL, 1));
		
		return res;
	}
	
	// Tableau de tirage des types de bijoux de grade 4.
	public static Data<TypeJewel> jewelType4(){
		Data<TypeJewel> res = new Data<TypeJewel>();
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BAGUE, 12));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.EPINGLE_A_CHAPEAU, 2));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.MEDAILLE, 4));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BOUCLES_D_OREILLES, 6));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.PIERCING, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BOUTON_DE_MANCHETTE, 2));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.FAUSSE_DENT, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BRACELET_DE_CHEVILLES, 4));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BIJOUX_DE_CHEVEUX, 9));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.COLLIER, 11));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BRACELET, 7));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.MEDAILLON, 6));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BROCHE, 8));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BAGUE_ARMURE, 2));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BOUCLE_DE_CEINTURE, 3));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.SCEAU, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.CEINTURE, 6));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BRACELET_BAGUE, 3));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.CHEVALIERE, 7));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BIJOU_DE_PEAU, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.PECTORAL, 2));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.POMME_DE_SENTEUR, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.TIARE, 1));
		
		return res;
	}
	
	// Tableau de tirage des types de bijoux de grade 5.
	public static Data<TypeJewel> jewelType5(){
		Data<TypeJewel> res = new Data<TypeJewel>();
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BAGUE, 11));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.EPINGLE_A_CHAPEAU, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.MEDAILLE, 7));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BOUCLES_D_OREILLES, 7));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.PIERCING, 2));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BOUTON_DE_MANCHETTE, 2));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.FAUSSE_DENT, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BRACELET_DE_CHEVILLES, 4));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BIJOUX_DE_CHEVEUX, 8));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.COLLIER, 10));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BRACELET, 9));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.MEDAILLON, 5));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BROCHE, 7));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BAGUE_ARMURE, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BOUCLE_DE_CEINTURE, 3));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.SCEAU, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.CEINTURE, 5));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BRACELET_BAGUE, 4));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.CHEVALIERE, 5));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BIJOU_DE_PEAU, 2));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.PECTORAL, 2));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.POMME_DE_SENTEUR, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.TIARE, 2));
		
		return res;
	}
	
	// Tableau de tirage des types de bijoux de grade 6.
	public static Data<TypeJewel> jewelType6(){
		Data<TypeJewel> res = new Data<TypeJewel>();
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BAGUE, 12));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.EPINGLE_A_CHAPEAU, 2));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.MEDAILLE, 4));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BOUCLES_D_OREILLES, 6));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.PIERCING, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BOUTON_DE_MANCHETTE, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.FAUSSE_DENT, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BRACELET_DE_CHEVILLES, 4));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BIJOUX_DE_CHEVEUX, 8));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.COLLIER, 8));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BRACELET, 7));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.MEDAILLON, 5));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BROCHE, 7));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BAGUE_ARMURE, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BOUCLE_DE_CEINTURE, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.SCEAU, 1));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.CEINTURE, 6));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BRACELET_BAGUE, 7));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.CHEVALIERE, 4));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.BIJOU_DE_PEAU, 5));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.PECTORAL, 2));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.POMME_DE_SENTEUR, 3));
		res.add(new Tuple<TypeJewel, Integer>(TypeJewel.TIARE, 4));
		
		return res;
	}
	
	// Tableau de tirage des matériaux de bijoux de grade 1.
	public static Data<Material> jewelMaterial1(){
		Data<Material> res = new Data<Material>();
		res.add(new Tuple<Material, Integer>(Material.BRONZE, 25));
		res.add(new Tuple<Material, Integer>(Material.EBENITE, 6));
		res.add(new Tuple<Material, Integer>(Material.IVOIRE, 6));
		res.add(new Tuple<Material, Integer>(Material.FER_FROID, 14));
		res.add(new Tuple<Material, Integer>(Material.VIRIDIUM, 1));
		res.add(new Tuple<Material, Integer>(Material.ARGENT, 20));
		res.add(new Tuple<Material, Integer>(Material.ELECTRUM, 8));
		res.add(new Tuple<Material, Integer>(Material.OR, 20));
		
		return res;
	}
	
	// Tableau de tirage des matériaux de bijoux de grade 2.
	public static Data<Material> jewelMaterial2(){
		Data<Material> res = new Data<Material>();
		res.add(new Tuple<Material, Integer>(Material.BRONZE, 18));
		res.add(new Tuple<Material, Integer>(Material.EBENITE, 8));
		res.add(new Tuple<Material, Integer>(Material.IVOIRE, 8));
		res.add(new Tuple<Material, Integer>(Material.FER_FROID, 12));
		res.add(new Tuple<Material, Integer>(Material.ACIER_VIVANT, 6));
		res.add(new Tuple<Material, Integer>(Material.VIRIDIUM, 1));
		res.add(new Tuple<Material, Integer>(Material.ARGENT, 14));
		res.add(new Tuple<Material, Integer>(Material.ELECTRUM, 10));
		res.add(new Tuple<Material, Integer>(Material.OR, 19));
		res.add(new Tuple<Material, Integer>(Material.MITHRAL, 4));
		
		return res;
	}
	
	// Tableau de tirage des matériaux de bijoux de grade 3.
	public static Data<Material> jewelMaterial3(){
		Data<Material> res = new Data<Material>();
		res.add(new Tuple<Material, Integer>(Material.BRONZE, 15));
		res.add(new Tuple<Material, Integer>(Material.EBENITE, 6));
		res.add(new Tuple<Material, Integer>(Material.IVOIRE, 5));
		res.add(new Tuple<Material, Integer>(Material.FER_FROID, 8));
		res.add(new Tuple<Material, Integer>(Material.ACIER_VIVANT, 8));
		res.add(new Tuple<Material, Integer>(Material.VIRIDIUM, 1));
		res.add(new Tuple<Material, Integer>(Material.ARGENT, 12));
		res.add(new Tuple<Material, Integer>(Material.BRONZE_ELIZEEN, 3));
		res.add(new Tuple<Material, Integer>(Material.ELECTRUM, 10));
		res.add(new Tuple<Material, Integer>(Material.ADAMENTIUM, 3));
		res.add(new Tuple<Material, Integer>(Material.OR, 20));
		res.add(new Tuple<Material, Integer>(Material.MITHRAL, 5));
		res.add(new Tuple<Material, Integer>(Material.OR_BLANC, 4));
		
		return res;
	}
	
	// Tableau de tirage des matériaux de bijoux de grade 4.
	public static Data<Material> jewelMaterial4(){
		Data<Material> res = new Data<Material>();
		res.add(new Tuple<Material, Integer>(Material.BRONZE, 10));
		res.add(new Tuple<Material, Integer>(Material.EBENITE, 5));
		res.add(new Tuple<Material, Integer>(Material.IVOIRE, 4));
		res.add(new Tuple<Material, Integer>(Material.FER_FROID, 6));
		res.add(new Tuple<Material, Integer>(Material.ACIER_VIVANT, 8));
		res.add(new Tuple<Material, Integer>(Material.ACIER_ARDENT, 4));
		res.add(new Tuple<Material, Integer>(Material.VIRIDIUM, 1));
		res.add(new Tuple<Material, Integer>(Material.ACIER_GLACE, 1));
		res.add(new Tuple<Material, Integer>(Material.ARGENT, 12));
		res.add(new Tuple<Material, Integer>(Material.BRONZE_ELIZEEN, 3));
		res.add(new Tuple<Material, Integer>(Material.ELECTRUM, 11));
		res.add(new Tuple<Material, Integer>(Material.ADAMENTIUM, 3));
		res.add(new Tuple<Material, Integer>(Material.OR, 16));
		res.add(new Tuple<Material, Integer>(Material.MITHRAL, 6));
		res.add(new Tuple<Material, Integer>(Material.OR_BLANC, 8));
		res.add(new Tuple<Material, Integer>(Material.PLATINE, 2));
		
		return res;
	}
	
	// Tableau de tirage des matériaux de bijoux de grade 5.
	public static Data<Material> jewelMaterial5(){
		Data<Material> res = new Data<Material>();
		res.add(new Tuple<Material, Integer>(Material.BRONZE, 8));
		res.add(new Tuple<Material, Integer>(Material.EBENITE, 4));
		res.add(new Tuple<Material, Integer>(Material.IVOIRE, 3));
		res.add(new Tuple<Material, Integer>(Material.FER_FROID, 4));
		res.add(new Tuple<Material, Integer>(Material.ACIER_VIVANT, 6));
		res.add(new Tuple<Material, Integer>(Material.ACIER_ARDENT, 3));
		res.add(new Tuple<Material, Integer>(Material.VIRIDIUM, 1));
		res.add(new Tuple<Material, Integer>(Material.ACIER_GLACE, 2));
		res.add(new Tuple<Material, Integer>(Material.ARGENT, 12));
		res.add(new Tuple<Material, Integer>(Material.BRONZE_ELIZEEN, 4));
		res.add(new Tuple<Material, Integer>(Material.ELECTRUM, 12));
		res.add(new Tuple<Material, Integer>(Material.ADAMENTIUM, 2));
		res.add(new Tuple<Material, Integer>(Material.OR, 15));
		res.add(new Tuple<Material, Integer>(Material.MITHRAL, 7));
		res.add(new Tuple<Material, Integer>(Material.OR_BLANC, 12));
		res.add(new Tuple<Material, Integer>(Material.PLATINE, 5));
		
		return res;
	}
	
	// Tableau de tirage des matériaux de bijoux de grade 6.
	public static Data<Material> jewelMaterial6(){
		Data<Material> res = new Data<Material>();
		res.add(new Tuple<Material, Integer>(Material.BRONZE, 6));
		res.add(new Tuple<Material, Integer>(Material.EBENITE, 3));
		res.add(new Tuple<Material, Integer>(Material.IVOIRE, 2));
		res.add(new Tuple<Material, Integer>(Material.FER_FROID, 2));
		res.add(new Tuple<Material, Integer>(Material.ACIER_VIVANT, 5));
		res.add(new Tuple<Material, Integer>(Material.ACIER_ARDENT, 2));
		res.add(new Tuple<Material, Integer>(Material.VIRIDIUM, 1));
		res.add(new Tuple<Material, Integer>(Material.ACIER_GLACE, 3));
		res.add(new Tuple<Material, Integer>(Material.ARGENT, 12));
		res.add(new Tuple<Material, Integer>(Material.BRONZE_ELIZEEN, 4));
		res.add(new Tuple<Material, Integer>(Material.ELECTRUM, 10));
		res.add(new Tuple<Material, Integer>(Material.ADAMENTIUM, 2));
		res.add(new Tuple<Material, Integer>(Material.OR, 15));
		res.add(new Tuple<Material, Integer>(Material.MITHRAL, 8));
		res.add(new Tuple<Material, Integer>(Material.OR_BLANC, 16));
		res.add(new Tuple<Material, Integer>(Material.PLATINE, 9));
		
		return res;
	}
}



