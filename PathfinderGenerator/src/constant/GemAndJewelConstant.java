package constant;

import gemAndJewel.Gem;
import gemAndJewel.TypeSize;
import utility.Data;
import utility.Tuple;

public class GemAndJewelConstant {
	
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
}



