package inhertancePractice;

public abstract class Item {
	private String name;
	private float weight;
	private int value;
	private int rarity;
	
	public Item(String name, float weight, int value, int rarity) {
		this.name = name;
		this.weight = weight;
		this.value = value;
		this.rarity = rarity;
	}
	
	public String getName() {
		return name;
	}
	public float getWeight() {
		return weight;
	}
	public int getValue() {
		return value;
	}
	public int getRarity() {
		return rarity;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", weight=" + weight + ", value=" + value + ", rarity=" + rarity + "]";
	}
	
	
}
