package inhertancePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Characther {
	private String name;
	private ArrayList <Item> inventory;
	private HashMap<Integer, Item> equippedItems;
	private float maxWeight;
	private int health;
	private int mana;
	private int level;
	private int defense;
	private int weightCarried;
	private Item weapon;
	
	public Characther(String name, int level, float maxWeight) {
		this.name = name;
		this.maxWeight = maxWeight;
		this.inventory = new ArrayList<Item>();
		this.equippedItems = new HashMap<Integer, Item>();
		this.weightCarried = 0;
		this.health = 150;
	}
	public void findWeapon() {
	    for (Entry<Integer, Item> item : equippedItems.entrySet()) {
	        if (item.getValue() instanceof Weapon) {
	            this.weapon = item.getValue();
	            break;
	        }
	    }
	    
	    // Check if weapon was found after the loop
	    if (this.weapon == null) {
	        System.out.println("No weapon found in equipped items!");
	    }
	}
	public void addItem(Item item) {
	    if (inventory == null) {
	        inventory = new ArrayList<Item>();
	    }
	    if(weightCarried+item.getWeight()<= maxWeight) {
	    	inventory.add(item);
	    	weightCarried+= item.getWeight();
	    }else {
	    	System.out.println("Too Heavy!");
	    }
	}
	public void equipItem(Item item, int slot) {
		if (equippedItems == null) {
	        equippedItems = new HashMap<Integer, Item>();
	    }
		if(equippedItems.get(slot) == null) {
			equippedItems.put(slot, item);
			inventory.remove(item);
		}else {
			System.out.println("Slot is used!");
		}
	}
	public void inequipItem(int slot) {
		Item inequipItem = equippedItems.get(slot);
		if(inequipItem != null) {
			inventory.add(inequipItem);
			equippedItems.remove(slot);
		}else {
			System.out.println("Invalid Slot!");
		}
	}
	public void useItem(int slot, Characther target) {
		if(equippedItems.containsKey(slot)) {
			Item item = equippedItems.get(slot);
			if(item instanceof Weapon) {
				((Weapon) item).use(this, target);
				System.out.println("Item Used Successfully!");
			}
		}else {
			System.out.println("Slot not Found!");
		}
	}
	public void useItem(int slot) {
		if(equippedItems.containsKey(slot)) {
			Item item = equippedItems.get(slot);
			if(item instanceof Armor) {
				((Armor) item).use(this);
				System.out.println("Item Used Successfully!");
			}else if(item instanceof Potion){
				((Potion) item).use(this);
				System.out.println("Item Used Successfully!");
			}
		}else {
			System.out.println("Slot not Found!");
		}
	}
	public void useItem(String itemName) {
		int slot = 0;
		for(Entry<Integer, Item> item : equippedItems.entrySet()) {
			if(item.getValue().getName().equals(itemName)) {
				item.getKey();
				break;
			}
		}
		if(equippedItems.containsKey(slot)) {
			Item item = equippedItems.get(slot);
			if(item instanceof Armor) {
				((Armor) item).use(this);
				System.out.println("Item Used Successfully!");
			}else if(item instanceof Potion){
				((Potion) item).use(this);
				System.out.println("Item Used Successfully!");
			}
		}else {
			System.out.println("Slot not Found!");
		}
	}
	public Item getWeapon() {
		return weapon;
	}
	@Override
	public String toString() {
		return "Characther [name=" + name + ", inventory=" + inventory + ", equippedItems=" + equippedItems
				+ ", maxWeight=" + maxWeight + ", health=" + health + ", mana=" + mana + ", level=" + level
				+ ", defense=" + defense + ", weightCarried=" + weightCarried + "]";
	}

	public String showInventory() {
		return "Characther's Inventory: [" + inventory + "]";
	}
	
	public String showEquippedItem() {
		return "Characther's Equipped Item: [" + equippedItems + "]";
	}
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public float getMaxWeight() {
		return maxWeight;
	}

	public int getLevel() {
		return level;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getWeightCarred() {
		return weightCarried;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
}
