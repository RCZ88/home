package owoBot;

public class Gem extends Item{
	private String type;
	private String rarity;
	private int durability;
	protected int amount;
	protected static final String [] RARITIES = {"Common", "Uncommon", "Rare", "Epic", "Legendary", "Mythical"};
	
	Gem(String type, String rarity, int durability){
		this.type = type;
		this.rarity = rarity;
		this.durability = durability;
	}
	
	public String getType() {
		return type;
	}
	public String getRarity() {
		return rarity;
	}
	public int getDurability() {
		return durability;
	}

	@Override
	public void useItem(Item item) {
		// TODO Auto-generated method stub
		if(itemInInv(item)) {
			char rarity = getRarity().charAt(0);
			boolean slotAvailable = false;
			if(getType().equals("Heart Gem")) {
				if(Bot.usedGems[0] == null) {
					slotAvailable = true;
					switch(rarity) {
					case 'C':
						Bot.usedGems[0] = (Gem) item;
						this.durability = getDurability('C', item.getType());
					case 'U':
						Bot.usedGems[0] = (Gem) item;
						this.durability = getDurability('U', item.getType());
					}
				}
			}else {
				System.out.println("Slot Used!");
			}
			if(item.amount>0 || slotAvailable == true) {
				item.amount--;
				Bot.huntAmount = Bot.huntAmount * 2;
			}
		}
		
	}
	
	private boolean itemInInv(Item item) {
		for(Item items: Inventory.inventory) {
			if(items.equals(item)) {
				return true;
			}
		}
		return false;
	}
	
	private int getDurability(char rarity, String type) {
		for(Gem gem : Gems.gems) {
			if(gem.getRarity().charAt(0) == rarity && gem.getType().equals(type)) {
				return gem.getDurability();
			}
		}
		return -1;
	}
}
