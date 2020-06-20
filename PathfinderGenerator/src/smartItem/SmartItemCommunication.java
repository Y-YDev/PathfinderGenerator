package smartItem;

/**
 * represente un pouvoir de communication d'un objet intelligent
 * @author Mentra20
 *
 */
public class SmartItemCommunication {

	private String communication;//Le nom de la communication
	private double price;//prix ajouté 
	private int ego;//Ego à ajouté
	
	public SmartItemCommunication(String communication,double price,int ego) {
		this.setCommunication(communication);
		this.setEgo(ego);
		this.setPrice(price);
	}

	public String getCommunication() {
		return communication;
	}

	public void setCommunication(String communication) {
		this.communication = communication;
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