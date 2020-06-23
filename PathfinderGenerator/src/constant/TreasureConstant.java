package constant;

import java.util.ArrayList;

import generator.Level;

/**
 * Contient les constantes de type de trésor.
 * @author Mentra20
 *
 */
public class TreasureConstant {
	
	//Palier de tresor de type A.
	public static ArrayList<Level> TypeA(){
		ArrayList<Level> res = new ArrayList<Level>();
		
		res.add(new Level(1,new String[]{"5d10-C","3d4-S"}));
		res.add(new Level(5,new String[]{"2d6x10-C","4d8-S","1d4-G"}));
		res.add(new Level(10,new String[] {"5d10x10-C","5d10-S","1d8-G"}));
		res.add(new Level(25,new String[] {"2d4x100-C","3d6x10-S","4d4-G"}));//Erreur sur le site
		res.add(new Level(50,new String[] {"4d4x100-C","4d6x10-S","8d6-G"}));
		res.add(new Level(100,new String[] {"6d8x10-S","3d4x10-G"}));
		res.add(new Level(200,new String[] {"2d4x100-S","4d4x10-G","2d4-P"}));
		res.add(new Level(500,new String[] {"6d6x10-G","8d6-P"}));
		res.add(new Level(1000,new String[] {"2d4x100-G","10d10-P"}));
		res.add(new Level(5000,new String[] {"4d8x100-G","6d10x10-P"}));
		res.add(new Level(10000,new String[] {"2d4x1000-G","12d8x10-P"}));
		res.add(new Level(50000,new String[] {"2d6x1000-G","8d10x100-P"}));

		return res;
	}

	//Palier de tresor de type B.
	public static ArrayList<Level> TypeB(){
		ArrayList<Level> res = new ArrayList<Level>();
		
		res.add(new Level(10,new String[] {"GEM1"}));
		res.add(new Level(15,new String[] {"2d6x10-C","4d8-S","GEM1"}));
		res.add(new Level(25,new String[] {"5d10-S","1d4-G","GEM1","GEM1"}));
		res.add(new Level(50,new String[] {"GEM2"}));
		res.add(new Level(50,new String[] {"3d6x10-S","3d6-G","GEM1","GEM1","GEM1"}));
		res.add(new Level(75,new String[] {"1d4x10-S","1d4-G","GEM1","GEM1","GEM2"}));
		res.add(new Level(100,new String[] {"GEM3"}));
		res.add(new Level(100,new String[] {"3d8x10-S","4d8-G","GEM1","GEM1","GEM2"}));
		res.add(new Level(150,new String[] {"GEM2","GEM3"}));
		res.add(new Level(200,new String[] {"3d6x10-S","2d4x10-G","GEM1","GEM1","GEM1","GEM1","GEM3"}));
		res.add(new Level(250,new String[] {"2d4x10-G","GEM2","GEM2","GEM3"}));
		res.add(new Level(500,new String[] {"GEM4"}));
		res.add(new Level(500,new String[] {"2d4x10-G","2d4-P","GEM2","GEM2","GEM3","GEM3","GEM3"}));
		res.add(new Level(750,new String[] {"2d4x10-G","GEM2","GEM2","GEM3","GEM4"}));
		res.add(new Level(1000,new String[] {"GEM5"}));
		res.add(new Level(1000,new String[] {"3d6x10-G","4d4-P","GEM3","GEM3","GEM3","GEM4"}));
		res.add(new Level(2500,new String[] {"2d4x100-G","GEM4","GEM4","GEM5"}));
		res.add(new Level(5000,new String[] {"GEM6"}));
		res.add(new Level(5000,new String[] {"2d4x100-G","2d4x10-P","GEM4","GEM4","GEM5","GEM5","GEM5"}));
		res.add(new Level(10000,new String[] {"GEM5","GEM5","GEM5","GEM5","GEM5","GEM6"}));
		res.add(new Level(20000,new String[] {"4d8x100-G","6d10x10-P","GEM6","GEM6","GEM6"}));
		res.add(new Level(50000,new String[] {"4d4x10-P","GEM3","GEM3","GEM3","GEM3","GEM3","GEM3","GEM3",
				"GEM3","GEM3","GEM3","GEM4","GEM4","GEM4","GEM4","GEM5","GEM5","GEM5","GEM5","GEM5","GEM5",
				"GEM6","GEM6","GEM6","GEM6","GEM6","GEM6","GEM6","GEM6"}));
		
		return res;
	}
	/*
	//Palier de tresor de type C.
	public static ArrayList<Level> TypeC(){
		ArrayList<Level> res = new ArrayList<Level>();
		
		res.add(new Level(50));
		res.add(new Level(100));
		res.add(new Level(100));
		res.add(new Level(150));
		res.add(new Level(200));
		res.add(new Level(250));
		res.add(new Level(500));
		res.add(new Level(500));
		res.add(new Level(750));
		res.add(new Level(1000));
		res.add(new Level(1000));
		res.add(new Level(1500));
		res.add(new Level(2000));
		res.add(new Level(2500));
		res.add(new Level(5000));
		res.add(new Level(5000));
		res.add(new Level(7500));
		res.add(new Level(10000));
		res.add(new Level(10000));
		res.add(new Level(15000));
		res.add(new Level(20000));
		res.add(new Level(50000));
		
		return res;
	}
	*/
}
