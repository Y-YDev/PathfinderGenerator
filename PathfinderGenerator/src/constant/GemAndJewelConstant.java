package constant;

import gemAndJewel.Gem;
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
}
