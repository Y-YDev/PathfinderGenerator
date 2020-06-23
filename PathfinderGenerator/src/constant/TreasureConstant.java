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
	/*
		res.add(new Level(10));
		res.add(new Level(25));
		res.add(new Level(50));
		res.add(new Level(100));
		res.add(new Level(200));
		res.add(new Level(500));
		res.add(new Level(1000));
		res.add(new Level(5000));
		res.add(new Level(10000));
		res.add(new Level(50000));
		*/
		return res;
	}
/*	
	//Palier de tresor de type B.
	public static ArrayList<Level> TypeB(){
		ArrayList<Level> res = new ArrayList<Level>();
		
		res.add(new Level(10));
		res.add(new Level(15));
		res.add(new Level(25));
		res.add(new Level(50));
		res.add(new Level(50));
		res.add(new Level(75));
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
		res.add(new Level(2500));
		res.add(new Level(5000));
		res.add(new Level(5000));
		res.add(new Level(10000));
		res.add(new Level(20000));
		res.add(new Level(50000));
		
		return res;
	}
	
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
