package mullyINC;

import java.util.ArrayList;

public class Inventory {
	private ArrayList<Item>items;
	
	public void addItem(String nameID, int quantity) {
		for(Item item : items) {
			if(item.getName().equals(nameID) || item.getId().equals(nameID)) {
				item.addQuantity(quantity);
				break;
			}
		}
	}
	public void addItem(String name, int quantity, double price) {
		items.add(new Item(name, quantity, price));
	}
	public void editPrice(String nameID, double price) {
		Item i = null;
		for(Item item : items) {
			if(item.getName().equals(nameID) || item.getId().equals(nameID)) {
				i = item;
			}
		}
		i.editPrice(price);
	}
	public void removeItem(Item item) {
		items.remove(item);
	}
	public ArrayList<Item> getItems(){
		return items;
	}
}
