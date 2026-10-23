package oop;

import java.util.ArrayList;

public class Table {
	private int tableNumber;
	private int capacity;
	private boolean isOccupied;
	private Order currentOrder;
	private PaymentMethod pm;
	
	public Table(int tableNumber, int capacity) {
		this.tableNumber = tableNumber;
		this.capacity = capacity;
	}
	
	public void reserveTable(int people) {
		if(people <= capacity) {
			isOccupied = true;
		}else {
			System.out.println("Too many people!");
		}
	}
	public void placeOrder(MenuItem[] items) {
		ArrayList<MenuItem>order = new ArrayList<>();
		for(MenuItem i : items) {
			order.add(i);
		}
		currentOrder = new Order(order);
	}
	public boolean makePayment(PaymentMethod paymentMethod) {
		pm = paymentMethod;
		if(currentOrder == null) {
			return false;
		}
		
		if(paymentMethod.getAmount()>=currentOrder.calculateTotal()) {
			System.out.println("Payment Succesffull!");
			return true;
		}
		System.out.println("Not enough Balance!");
		return false;
	}
	public void viewMenu(Menu menu) {
		for(MenuItem m : menu.getMenuItems()) {
			System.out.println(m.getName() + "\n" + m.getDescription() + "\n" + m.getPrice());;
		}
	}
	public void getReceipt() {
		System.out.println("Table " + tableNumber + "'s Receipt: ");
		for(MenuItem m : currentOrder.getOrderedItems()) {
			System.out.println(m.getName() + "\n" + m.getPrice());
		}
		System.out.println("Total: " + currentOrder.getTotalCost());
		System.out.println("Payment Method" + pm.getType()+ " - " + pm.getAmount());
		if(pm.getType().equals("Cash")) {
			double r = currentOrder.getTotalCost()-pm.getAmount();
			System.out.println("Return: " + r);
		}
	}
	
	public void doneEating() {
		System.out.println("Thank you for Eating at Table" + tableNumber);
		isOccupied = false;
		currentOrder = null;
		pm = null;
	}
	
	public int getTableNumber() {
		return tableNumber;
	}

	public int getCapacity() {
		return capacity;
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	public Order getCurrentOrder() {
		return currentOrder;
	}
	
}
