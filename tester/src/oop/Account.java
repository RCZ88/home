package oop;

public class Account {
	private String id;
	private String name;
	private int balance;
	
	Account(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	Account(String id, String name, int balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public void credit(int amount) {
		balance+=amount;
	}
	public void debit(int amount) {
		if(amount<= balance) {
			balance-=amount;
		}else {
			System.out.println("Amount exeeded balance");
		}
	}
	public void transferTo(Account another, int amount) {
		if(amount<= balance) {
			balance-=amount;
			another.balance+=amount;
		}else {
			System.out.println("Amount exeeded balance");
		}
	}
	public String toString() {
		return "Account[id = "+ id+ ",Name = "+name + ",Balance = "+balance+"]";
	}
}
