package item.smartItem;

/**
 * Represente un pouvoir dédié d'un objet intelligent
 * @author Mentra20
 *
 */
public class SmartItemDedicatePower {

	private String power;//Le nom du pouvoir dédié
	private double price;//prix ajouté 
	private int ego;//Ego à ajouté
	
	public SmartItemDedicatePower(String power,double price,int ego) {
		this.setPower(power);
		this.setEgo(ego);
		this.setPrice(price);
	}

	public String getPower() {
		return power;
	}

	public void setPower(String communication) {
		this.power = communication;
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