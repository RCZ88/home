package oop;

import java.util.ArrayList;

public class Order {
	private ArrayList<MenuItem>orderedItems;
	private double totalCost;
	private PaymentMethod paymentMethod;
	Order(ArrayList<MenuItem> orders){
		orderedItems = orders;
	}
	public void addItem(MenuItem menuItem) {
		orderedItems.add(menuItem);
	}
	public void removeItem(MenuItem menuItem) {
		orderedItems.remove(menuItem);
	}
	public double calculateTotal() {
		double total = 0;
		for(MenuItem mi : orderedItems) {
			total+=mi.getPrice();
		}
		totalCost = total;
		return total;
	}
	public ArrayList<MenuItem> getOrderedItems() {
		return orderedItems;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	
}
