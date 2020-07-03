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

	//Palier de tresor de type C.
	public static ArrayList<Level> TypeC(){
		ArrayList<Level> res = new ArrayList<Level>();
		
		res.add(new Level(50,new String[] {"ART1"}));
		res.add(new Level(100,new String[] {"ART2"}));
		res.add(new Level(100,new String[] {"ART1","ART1"}));
		res.add(new Level(150,new String[] {"ART1","ART2"}));
		res.add(new Level(200,new String[] {"ART2","ART2"}));
		res.add(new Level(250,new String[] {"ART1","ART1","ART1","ART2"}));
		res.add(new Level(500,new String[] {"ART3"}));
		res.add(new Level(500,new String[] {"ART1","ART1","ART1","ART1","ART2","ART2","ART2"}));
		res.add(new Level(750,new String[] {"ART1","ART1","ART1","ART2","ART2","ART3"}));
		res.add(new Level(1000,new String[] {"ART4"}));
		res.add(new Level(1000,new String[] {"ART3","ART3"}));
		res.add(new Level(1500,new String[] {"ART3","ART4"}));
		res.add(new Level(2000,new String[] {"ART4","ART4"}));
		res.add(new Level(2500,new String[] {"ART2","ART2","ART2","ART2","ART2","ART3","ART3","ART4"}));
		res.add(new Level(5000,new String[] {"ART5"}));
		res.add(new Level(5000,new String[] {"ART3","ART3","ART3","ART3","ART4","ART4","ART4"}));
		res.add(new Level(7500,new String[] {"ART3","ART4","ART4","ART5"}));
		res.add(new Level(10000,new String[] {"ART6"}));
		res.add(new Level(10000,new String[] {"ART4","ART4","ART4","ART4","ART4","ART5"}));
		res.add(new Level(15000,new String[] {"ART5","ART6"}));
		res.add(new Level(20000,new String[] {"ART5","ART5","ART6"}));
		res.add(new Level(50000,new String[] {"ART3","ART3","ART3","ART3","ART3","ART3","ART3","ART3","ART3","ART3",
				"ART4","ART4","ART4","ART4","ART4","ART5","ART5","ART5","ART5","ART6","ART6"}));
		
		return res;
	}
	
	//Palier de tresor de type D.
	public static ArrayList<Level> TypeD(){
		ArrayList<Level> res = new ArrayList<Level>();
		
		res.add(new Level(50,new String[] {"3d6x10-S","4d4-G","PAR1"}));
		res.add(new Level(50,new String[] {"2d4x10-S","2d4-G","POT1"}));
		res.add(new Level(100,new String[] {"4d6x10-S","3d10-G","POT1","PAR1"}));
		res.add(new Level(150,new String[] {"2d4x10-S","6d6-G","PAR2"}));
		res.add(new Level(200,new String[] {"2d4x10-S","4d6-G","POT2","PAR1"}));
		res.add(new Level(250,new String[] {"3d6x10-S","3d6-G","1d4-P","POT1","POT1","PAR2"}));
		res.add(new Level(300,new String[] {"2d4x10-S","6d6-G","POT2","PAR2"}));
		res.add(new Level(400,new String[] {"POT2","PAR2","PAR2"}));
		res.add(new Level(500,new String[] {"2d4x10-G","1d4-P","POT3","PAR2"}));
		res.add(new Level(500,new String[] {"2d4x10-G","1d4-P","POT2","POT2","PAR2"}));
		res.add(new Level(750,new String[] {"7d6-G","PAR2","WAN1"}));
		res.add(new Level(1000,new String[] {"4d4x10-G","3d6-P","POT3","PAR3"}));
		res.add(new Level(1000,new String[] {"2d4x10-G","2d4-P","POT3","WAN1"}));
		res.add(new Level(1500,new String[] {"WAN2"}));
		res.add(new Level(1500,new String[] {"4d4x10-G","3d6-P","POT4","PAR4"}));
		res.add(new Level(2000,new String[] {"POT4","WAN2"}));
		res.add(new Level(2000,new String[] {"2d4x10-G","2d4-P","POT3","PAR4","PAR4"}));
		res.add(new Level(3000,new String[] {"3d6x10-G","4d4-P","POT4","PAR4","WAN2"}));
		res.add(new Level(4000,new String[] {"3d6x10-G","4d4-P","PAR4","WAN2","WAN2"}));
		res.add(new Level(5000,new String[] {"2d4x10-G","2d4-P","POT3","POT3","POT3","PAR4","PAR4","WAN2"}));
		res.add(new Level(7500,new String[] {"2d6-P","PAR5","WAN3"}));
		res.add(new Level(7500,new String[] {"5d6-P","POT6","POT6","PAR6","PAR6"}));
		res.add(new Level(10000,new String[] {"WAN4"}));
		res.add(new Level(10000,new String[] {"4d6-P","POT6","PAR6","WAN3"}));
		res.add(new Level(15000,new String[] {"WAN5"}));
		res.add(new Level(15000,new String[] {"9d10-P","POT6","POT6","POT6","PAR5","PAR5","WAN4"}));
		res.add(new Level(20000,new String[] {"4d4x10-G","2d4x10-P","POT6","POT6","PAR6","WAN5"}));
		res.add(new Level(20000,new String[] {"6d6x10-G","POT5","POT5","POT5","WAN6"}));
		res.add(new Level(25000,new String[] {"PAR6","PAR6","PAR6","PAR6","PAR6","WAN4"}));
		res.add(new Level(30000,new String[] {"6d6-P","POT6","POT6","POT6","POT6","PAR6","PAR6","PAR6","WAN6"}));
		res.add(new Level(50000,new String[] {"8d4x10-P","PAR6","PAR6","PAR6","PAR6","WAN6","WAN6"}));

		return res;
	}

	//Palier de tresor de type E.
	public static ArrayList<Level> TypeE(){
		ArrayList<Level> res = new ArrayList<Level>();
		
		res.add(new Level(200,new String[] {"LIG0"}));
		res.add(new Level(300,new String[] {"INT0"}));
		res.add(new Level(350,new String[] {"MWE0"}));
		res.add(new Level(1000,new String[] {"HEA0"}));
		res.add(new Level(1500,new String[] {"ARM1"}));
		res.add(new Level(2500,new String[] {"WEA1"}));
		res.add(new Level(3000,new String[] {"ARM2"}));
		res.add(new Level(3000,new String[] {"INT0","LIG0","WEA1"}));//Une virgule perdue suggère que c'est comme le prix 200
		res.add(new Level(4000,new String[] {"ARM1","WEA1"}));
		res.add(new Level(5500,new String[] {"ARM2","WEA1"}));
		res.add(new Level(6000,new String[] {"WEA2"}));
		res.add(new Level(7500,new String[] {"ARM1","WEA2"}));
		res.add(new Level(8000,new String[] {"ARM2","WEA1","WEA1"}));
		res.add(new Level(9000,new String[] {"ARM2","WEA2"}));
		res.add(new Level(10000,new String[] {"ARM3","WEA1"}));
		res.add(new Level(13000,new String[] {"WEA3"}));
		res.add(new Level(13000,new String[] {"ARM3","WEA2"}));//meme que 10 000 surement erreur donc augemnté ici
		res.add(new Level(15000,new String[] {"ARM4","WEA1"}));
		res.add(new Level(20000,new String[] {"ARM3","WEA3"}));
		res.add(new Level(25000,new String[] {"ARM2","WEA4"}));
		res.add(new Level(30000,new String[] {"ARM5","WEA1","WEA2"}));
		res.add(new Level(30000,new String[] {"ARM3","WEA4"}));
		res.add(new Level(35000,new String[] {"ARM5","WEA3"}));
		res.add(new Level(35000,new String[] {"ARM1","WEA5"}));
		res.add(new Level(40000,new String[] {"ARM6","WEA1"}));
		res.add(new Level(50000,new String[] {"ARM6","WEA3"}));
		res.add(new Level(75000,new String[] {"ARM2","WEA6"}));
		res.add(new Level(100000,new String[] {"ARM6","WEA6"}));

		return res;
	}
	
	//Palier de tresor de type F.
	public static ArrayList<Level> TypeF(){
		ArrayList<Level> res = new ArrayList<Level>();
		
		res.add(new Level(50,new String[] {"2d4x10-S","2d4-G","POT1"}));
		res.add(new Level(250,new String[] {"2d4x10-S","2d4-G","LIG0","POT1"}));
		res.add(new Level(350,new String[] {"2d4x10-S","2d4-G","INT0","POT1"}));
		res.add(new Level(400,new String[] {"2d4x10-S","2d4-G","MWE0","POT1"}));
		res.add(new Level(500,new String[] {"MWE0","POT2"}));
		res.add(new Level(750,new String[] {"6d6-G","INT0","MWE0","POT1","POT1"}));
		res.add(new Level(1000,new String[] {"HEA0"}));
		res.add(new Level(1500,new String[] {"HEA0","MWE0","POT2"}));
		res.add(new Level(2000,new String[] {"ARM1","MWE0","POT2","POT2"}));
		res.add(new Level(3000,new String[] {"INT0","WEA1","POT2"}));
		res.add(new Level(4000,new String[] {"ARM1","MWE0","WON1","POT2"}));
		res.add(new Level(5000,new String[] {"INT0","WEA1","WON1","POT2"}));
		res.add(new Level(6000,new String[] {"ARM1","WEA1","WON1"}));
		res.add(new Level(7500,new String[] {"ARM2","WEA1","RIN1"}));
		res.add(new Level(10000,new String[] {"ARM2","WEA1","RIN1","WIN1","POT2","POT2","POT2"}));
		res.add(new Level(10000,new String[] {"ARM2","WEA2","POT4","POT4"}));
		res.add(new Level(12500,new String[] {"ARM2","WEA1","WON2","POT4","POT4"}));
		res.add(new Level(15000,new String[] {"ARM2","WEA2","RIN2"}));
		res.add(new Level(20000,new String[] {"ARM3","WEA2","WON2","POT4","POT4"}));
		res.add(new Level(25000,new String[] {"ARM3","WEA3","RIN1","WON1","POT4","POT4"}));
		res.add(new Level(30000,new String[] {"ARM3","WEA3","RIN1","RIN1","WON2"}));
		res.add(new Level(40000,new String[] {"ARM3","WEA3","RIN3","WON2","POT4","POT4"}));
		res.add(new Level(50000,new String[] {"ARM4","WEA4","WON3","POT5","POT5"}));
		res.add(new Level(60000,new String[] {"ARM4","WEA4","RIN2","RIN2","WON2","WON2"}));
		res.add(new Level(75000,new String[] {"ARM5","WEA4","RIN2","WON4","POT6","POT6","POT6"}));
		res.add(new Level(100000,new String[] {"ARM5","WEA5","RIN3","RIN2","WON3","WON3"}));

		return res;
	}
	
	//Palier de tresor de type G.
	public static ArrayList<Level> TypeG(){
		ArrayList<Level> res = new ArrayList<Level>();
		
		res.add(new Level(50,new String[] {"2d4x10-S","2d4-G","POT1"}));
		res.add(new Level(75,new String[] {"2d4-G","POT1","PAR1"}));
		res.add(new Level(100,new String[] {"POT1","PAR1","PAR1"}));
		res.add(new Level(150,new String[] {"PAR1","PAR2"}));
		res.add(new Level(200,new String[] {"POT1","POT1","PAR2"}));
		res.add(new Level(250,new String[] {"PAR2","PAR2"}));
		res.add(new Level(500,new String[] {"POT1","POT1","POT1","PAR2","PAR2","PAR2"}));
		res.add(new Level(750,new String[] {"POT2","WAN1"}));
		res.add(new Level(1000,new String[] {"7d6-G","PAR2","PAR2","PAR2","WAN1"}));
		res.add(new Level(1500,new String[] {"3d6x10-G","POT3","PAR3","WAN1"}));
		res.add(new Level(2000,new String[] {"2d4x10-G","MWE0","PAR3","PAR3","WAN1"}));
		res.add(new Level(2500,new String[] {"POT4","POT4","WAN2"}));
		res.add(new Level(3000,new String[] {"POT4","PAR3","PAR3","WAN2"}));
		res.add(new Level(4000,new String[] {"WON1","POT4","WAN2"}));
		res.add(new Level(5000,new String[] {"RIN1","WON1","PAR3","PAR3"}));
		res.add(new Level(6000,new String[] {"RIN1","WON1","POT4","WAN2"}));
		res.add(new Level(7500,new String[] {"POT4","POT4","PAR1","WAN3"}));
		res.add(new Level(10000,new String[] {"RIN1","WON1","WAN3"}));
		res.add(new Level(12500,new String[] {"RIN1","WON2","PAR4","PAR4","WAN2","WAN2"}));
		res.add(new Level(15000,new String[] {"RIN1","SCE3","WAN3"}));
		res.add(new Level(20000,new String[] {"RIN2","WON2","POT4","PAR4","PAR4","WAN3"}));
		res.add(new Level(25000,new String[] {"RIN1","WAN3","WAN4","WON2"}));
		res.add(new Level(30000,new String[] {"RIN2","WON3","PAR5","WAN4"}));
		res.add(new Level(40000,new String[] {"WEA1","STA3","SCE4","WON1","WON1","WAN3"}));
		res.add(new Level(50000,new String[] {"RIN2","WON3","WON3","POT5","PAR4","PAR4","PAR4","WAN5"}));
		res.add(new Level(60000,new String[] {"STA3","SCE4","WON4","POT4","PAR5","PAR5","WAN3"}));
		res.add(new Level(75000,new String[] {"WEA1","STA4","WON4","PAR6","PAR6","PAR6","WAN6"}));
		res.add(new Level(100000,new String[] {"RIN6","SCE4","STA5","PAR5","WAN4"}));

		return res;
	}
	
	//Palier de tresor de type H.
	public static ArrayList<Level> TypeH(){
		ArrayList<Level> res = new ArrayList<Level>();
		
		res.add(new Level(500,new String[] {"4d4x100-C","3d6x10-S","2d4x10-G","MWE0","POT1","PAR1","GEM2"}));
		res.add(new Level(1000,new String[] {"2d4x100-C","2d6x100-S","6d6-G","POT2","PAR2","WAN1","GEM1","GEM1","GEM1"}));
		res.add(new Level(2500,new String[] {"3d6x10-S","2d4-G","HEA0","MWE0","POT4","POT4","PAR3","GEM2"}));
		res.add(new Level(5000,new String[] {"2d4x10-G","4d6-P","MWE0","RIN1","POT4","PAR3","WAN2"}));
		res.add(new Level(7500,new String[] {"4d4x10-G","6d6-P","WEA1","WON1","POT4","POT4","WAN2","GEM3","GEM3"}));
		res.add(new Level(10000,new String[] {"4d8x10-G","6d10-P","ARM2","RIN1","WON1","PAR3","WAN2","GEM4"}));
		res.add(new Level(15000,new String[] {"4d4x10-G","4d4x10-P","ARM2","WON1","POT4","POT4","PAR4","PAR4","WAN3","GEM3"}));
		res.add(new Level(20000,new String[] {"2d4x10-P","RIN2","WON1","WON1","POT4","POT4","PAR5","PAR5","WAN3"}));
		res.add(new Level(25000,new String[] {"6d10x10-G","6d6-P","ARM3","WEA1","WON2","PAR5","PAR5","WAN3","GEM4"}));
		res.add(new Level(30000,new String[] {"6d6x10-G","2d4x10-P","WEA2","WON3","WAN4","GEM3","GEM3","GEM3"}));
		res.add(new Level(40000,new String[] {"4d4x10-G","4d4x10-P","RIN3","SCE3","POT6","POT6","PAR5","PAR5","WAN5"}));
		res.add(new Level(50000,new String[] {"4d4x10-P","ARM4","STA3","WON3","PAR6","WAN3","GEM5"}));
		res.add(new Level(75000,new String[] {"2d8x100-G","4d4x10-P","WEA2","RIN4","STA4","POT6","POT6","POT6","PAR6","WAN5","GEM5"}));
		res.add(new Level(100000,new String[] {"8d6x100-G","4d4x10-P","RIN5","WON5","POT6","POT6","POT6","PAR6","WAN3","GEM5","GEM5","GEM6"}));
		
		return res;
	}
	
	//Palier de tresor de type I.
	public static ArrayList<Level> TypeI(){
		ArrayList<Level> res = new ArrayList<Level>();
		
		res.add(new Level(5000,new String[] {"4d4x1000-C","6d6x100-S","2d4x100-G","6d6-P","ARM1","WAN2","GEM3","GEM3","GEM3","GEM3","GEM3","ART3"}));
		res.add(new Level(10000,new String[] {"4d4x1000-C","6d6x100-S","2d4x100-G","6d6-P","ARM2","WEA1","WON1","PAR4","GEM4","ART3"}));
		res.add(new Level(15000,new String[] {"2d4x1000-C","6d4x100-S","3d6x10-G","6d6-P","RIN2","WON1","WON1","POT4","POT4","WAN2","GEM4","ART3"}));
		res.add(new Level(20000,new String[] {"2d4x1000-C","6d4x100-S","3d6x10-G","6d6-P","ARM2","SCE3","WON2","POT5","POT5","PAR4","ART3","ART3","ART3"}));
		res.add(new Level(25000,new String[] {"2d4x1000-C","6d4x100-S","3d6x10-G","6d6-P","STA3","WON1","WON1","POT4","WAN3","GEM2","GEM2","GEM3","GEM3","GEM4"}));
		res.add(new Level(30000,new String[] {"2d4x1000-C","6d4x100-S","3d6x10-G","6d6-P","ARM3","WEA2","WON3","PAR5","PAR5","ART4"}));
		res.add(new Level(40000,new String[] {"4d4x1000-C","6d6x100-S","2d4x100-G","6d6-P","WEA3","SCE4","POT6","PAR4","WAN3","ART3","ART3","ART3","ART4","ART4"}));
		res.add(new Level(50000,new String[] {"4d4x10000-C","6d6x1000-S","4d4x100-G","2d4x10-P","ARM2","WEA2","WEA2","STA4","WON2","GEM5"}));
		res.add(new Level(60000,new String[] {"2d4x10000-C","2d4x1000-S","2d4x100-G","2d4x10-P","ARM4","SCE4","WON3","PAR6","WAN2","WAN2","GEM4","ART2","ART2","ART2","ART2","ART2"}));
		res.add(new Level(75000,new String[] {"2d4x10000-C","2d4x1000-S","2d4x100-G","2d4x10-P","ARM5","RIN4","STA3","WAN4","GEM6","ART4"}));
		res.add(new Level(100000,new String[] {"2d4x10000-C","2d4x1000-S","2d4x100-G","2d4x10-P","WEA3","RIN4","SCE5","WON4","POT6","POT6","PAR3","ART4","ART4"}));
		res.add(new Level(125000,new String[] {"4d4x10000-C","6d6x1000-S","4d4x100-G","2d8x10-P","ARM6","WEA3","STA5","PAR6","PAR6","WAN6","GEM6","ART4","ART4","ART4"}));
		res.add(new Level(150000,new String[] {"4d4x10000-C","6d6x1000-S","4d4x100-G","2d8x10-P","ARM4","RIN5","WON6","WAN6"}));
		res.add(new Level(200000,new String[] {"4d4x10000-C","6d6x1000-S","4d4x100-G","2d8x10-P","WEA6","RIN3","RIN3","STA5","WON5","WAN5","GEM5","GEM5","GEM5","GEM4"}));
		res.add(new Level(300000,new String[] {"8d4x10000-C","12d6x1000-S","8d4x100-G","2d8x10-P","RIN5","WEA6","RIN5","STA6","WON6","WAN6","GEM6","ART6"}));

		return res;
	}
}
