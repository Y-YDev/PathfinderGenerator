package constant;

import gemAndJewel.Gem;
import gemAndJewel.Material;
import gemAndJewel.TypeJewel;
import gemAndJewel.TypeSize;
import utility.Data;
import utility.Tuple;

/**
 * GemAndJewelConstant contient toutes les constantes utiles 
 * pour la création de gemmes et de bijoux.
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
		res.add(new Tuple<Gem, Integer>(new Gem("quartz cristal de roche"), 8));
		res.add(new Tuple<Gem, Integer>(new Gem("coquillage"), 6));
		res.add(new Tuple<Gem, Integer>(new Gem("oeil de tigre"), 8));
		res.add(new Tuple<Gem, Integer>(new Gem("turquoise"), 8));
		
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
}



