package generator;

public class Level {
	private double price;//Prix du palier.
	private double probability;//Probabilité du palier.
	private String[] reward;//Les récompenses
	
	public Level(double price,String[] reward) {
		this.setPrice(price);
		this.setProbability(-999);
		this.setReward(reward);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getProbability() {
		return probability;
	}

	public void setProbability(double probability) {
		this.probability = probability;
	}

	public String[] getReward() {
		return reward;
	}

	public void setReward(String[] reward) {
		this.reward = reward;
	}
}
