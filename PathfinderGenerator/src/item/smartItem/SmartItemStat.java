package item.smartItem;

import java.io.Serializable;

/**
 * Représente une statistiques d'un objet
 * @author Mentra20
 *
 */
public class SmartItemStat implements Serializable {
	private int stat;//valeur de la statistique (int, sag ,char)
	private double price;//prix ajouté 
	private int ego;//Ego à ajouté
	
	public SmartItemStat(int stat,double price,int ego) {
		this.setStat(stat);
		this.setEgo(ego);
		this.setPrice(price);
	}

	public int getStat() {
		return stat;
	}

	public void setStat(int stat) {
		this.stat = stat;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getEgo() {
		return ego;
	}

	public void setEgo(int ego) {
		this.ego = ego;
	}
}

