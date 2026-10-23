package oop;

public class PaymentMethod {
	private String type;
	private double amount;
	
	PaymentMethod(String type, double amount){
		this.type = type; 
		this.amount = amount;
	}
	
	public String getType() {
		return type;
	}
	public double getAmount() {
		return amount;
	}
}
