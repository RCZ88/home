package owoBot;

public abstract class Item extends Inventory{
	private String type;
	private String itemName;
	private String itemRarity;
	private int invIndex;
	private int durability;
	protected int amount;
	
	public abstract void useItem(Item item); /*{
		if(item.getType().contains("Gem")) {
			
			}else if(item.getType().equals("DiamondGem")) {
				
			}else if(item.getType().equals("RoundGem")) {
				
			}
		}
		
	}*/
	public String getType() {
		return type;
	}
	public String getItemName() {
		return itemName;
	}
	public String getItemRarity() {
		return itemRarity;
	}
	
}
