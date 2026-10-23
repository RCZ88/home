package owoBot;

public class Animal extends Zoo{
	private String name;
	private String rarity;
	protected int amount;
	protected boolean discovered;
	protected static final String [] RARITIES = {"Common", "Uncommon", "Rare", "Epic", "Legendary", "Mythical"};
	
	
	public Animal(String name, String rarity) {
		this.name = name;
		this.rarity = rarity;
		discovered = false;
		amount = 0;
	}

	public String getName() {
		return name;
	}

	public String getRarity() {
		return rarity;
	}
	
}
