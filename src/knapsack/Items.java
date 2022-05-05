package knapsack;

public class Items {
	private int weight;
	private int value;
	private int maxWeight;
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getMaxWeight() {
		return maxWeight;
	}

	public Items(int weight, int value) {
		super();
		this.weight = weight;
		this.value = value;
	}
}
