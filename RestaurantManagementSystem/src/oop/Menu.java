package oop;

import java.util.ArrayList;

public class Menu {
	public ArrayList<MenuItem>menuItems;
	Menu(){
		menuItems = new ArrayList<>();
	}
	public void addItem(MenuItem menuItem) {
		menuItems.add(menuItem);
	}
	public void removeItem(MenuItem menuItem) {
		menuItems.remove(menuItem);
	}
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
}
