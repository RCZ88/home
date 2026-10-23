package byOOP;

import java.util.ArrayList;

public class Canteen {
	private ArrayList <Item> items; 
	private ArrayList <IDCard> ids;
	
	Canteen(){
		items = new ArrayList<>();
		ids = new ArrayList<>();
	}
	
	public void addItem(Item i) {
		items.add(i);
	}
	public void removeItem(Item i) {
		items.remove(i);
	}
	
	public void registerID(IDCard id) {
		ids.add(id);
	}
	public void removeID(IDCard id) {
		ids.remove(id);
	}
	
	public ArrayList<IDCard> getIds(){
		return ids;
	}
	public ArrayList<Item> getItems(){
		return items;
	}
	
	public void displayItems() {
		System.out.println("---Canteen System---");
		for(Item i : items) {
			System.out.println(i.getName() + "\nRp. " + i.getPrice());
			if(i.getStock()>0) {
				System.out.println("Stock: " + i.getStock());
			}else {
				System.out.println("Out of Stock!");
			}
			System.out.println("");
		}
	}
	
	public boolean isIdRegistered(IDCard id) {
		for(IDCard i : ids) {
			if(i == id) {
				return true;
			}
		}
		return false;
	}
}
