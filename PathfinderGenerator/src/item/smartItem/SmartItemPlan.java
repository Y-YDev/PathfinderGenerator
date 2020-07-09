package item.smartItem;

/**
 * represente le but d'un objet intelligent
 * @author Mentra20
 *
 */
public class SmartItemPlan {
	private String plan;//Le nom de l'objectif de l'objet
	private int ego;//Ego à ajouté
	
	public SmartItemPlan(String plan,int ego) {
		this.setPlan(plan);
		this.setEgo(ego);

	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public int getEgo() {
		return ego;
	}

	public void setEgo(int ego) {
		this.ego = ego;
	}
}
