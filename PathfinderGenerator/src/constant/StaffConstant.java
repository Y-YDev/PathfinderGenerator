package constant;

import item.staff.Staff;
import utility.Data;
import utility.Tuple;

/**
 * Les tableaux de tirages pour les bâtons magique
 * PAS DE RARETE EN DESSOUS DE 3
 * Rareté 3 : intermédiaire inférieur
 * Rareté 4 : intermédiaire supérieur
 * Rareté 5 : puissant inférieur
 * Rareté 6 : puissant supérieur
 * @author Mentra20
 *
 */

public class StaffConstant {
	
	//bâtons de rareté 3.
	public static Data<Staff> rarity3(){
		Data<Staff> res = new Data<Staff>();
		
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de soulagement béni", 7200), 10));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton des arcanes mineures", 8000), 10));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton d’astuces", 8800), 10));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de l’éclaireur", 9600), 14));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton des eidolons", 14400), 10));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton d’accompagnement", 14800), 13));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton d’entendement", 16000), 17));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton d’envoûtement", 17600), 16));
			
		return res;
	} 
	
	//bâtons de rareté 4.
	public static Data<Staff> rarity4(){
		Data<Staff> res = new Data<Staff>();
		
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de feu", 18950), 11));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de courage", 19200), 10));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de dénigrement", 20000), 8));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de festin et de famine", 20800), 9));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de rigueur", 20800), 11));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton du grand essaim", 22800), 11));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton d’autorité", 23000), 8));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de rayonnement", 23200), 13));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton d'altération de taille", 26150), 11));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton des voyages", 27200), 8));
			
		return res;
	} 
	
	//bâtons de rareté 5.
	public static Data<Staff> rarity5(){
		Data<Staff> res = new Data<Staff>();
		
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton d’acide", 28600), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton des hurlements", 28800), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton du Chaos", 29600), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton sacré", 29600), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de la Loi", 29600), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de guérison", 29600), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton maudit", 29600), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton du maître", 30000), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton des araignées", 30200), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton d’électricité", 31900), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Fléau de l’hérétique", 32000), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton musical", 32000), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton des âmes", 32800), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de toxines", 34200), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de discrétion", 36800), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton du justicier", 37310), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton des aspects", 37600), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de rhétorique", 39600), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de givre", 41400), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de renforcement", 41600), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton des malédictions", 43500), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de flamme noire", 47000), 7));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton des ricanements", 47200), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de représentation", 48800),4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton animé", 49800), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton des révélations", 51008), 3));
			
		return res;
	} 
	
	//bâtons de rareté 6.
	public static Data<Staff> rarity6(){
		Data<Staff> res = new Data<Staff>();
		
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de clarté", 51500), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton des obstacles", 51600), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de ciel et terre", 54000), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de déplacement", 54400), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton des trésors", 55866), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton des pièges", 56925), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton des rayons", 57200), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de puissance en mithral", 58000), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de défense", 62000), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton des plans", 63960), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton des ombres affamées", 69300), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton du dragon", 81000), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de sommeil", 81766), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton d’abjuration", 82000), 5));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton d'invocation", 82000), 5));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de divination", 82000), 5));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton d'enchantement", 82000), 5));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton d'évocation", 82000), 5));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton d'illusion", 82000), 5));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de nécromancie", 82000), 5));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de transmutation", 82000), 5));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton météo", 84066), 2));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de pierre et terre", 85800), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de vision", 86666),2));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de la forêt profonde", 100400), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de vie", 109400), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton aux cent mains", 180200), 1));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de transport", 206900), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton du hiérophante", 220000), 1));
		res.add(new Tuple<Staff, Integer>(new Staff("Bâton de surpuissance", 235000), 1));
			
		return res;
	} 
}
