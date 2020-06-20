package smartItem;

/**
 * represente un pouvoir d'un objet intelligent.
 * @author Mentra20
 *
 */
public class SmartItemSkill {

	private String skill;//Le nom du skill
	private double price;//prix ajouté 
	private int ego;//Ego à ajouté
	
	public SmartItemSkill(String skill,double price,int ego) {
		this.setSkill(skill);
		this.setEgo(ego);
		this.setPrice(price);
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
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
