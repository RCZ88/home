package oop;

public class Account {
	private String name;
	private long id;
	private double balance;
	
	public Account (String name, long id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	public void transfer(Account acc, double amount) {
		if(balance>= amount) {
			acc.balance += amount;
			balance-=amount;
		}else {
			System.out.println("Not enough Balance");
		}
	}
	public void deposit(double amount) {
		balance+=amount;
		
	}
	public void withdraw(double amount) {
		if(balance>= amount) {
			balance-=amount;
		}else {
			System.out.println("Not enough Balance");
		}
	}
	public String getName() {
		return name;
	}
	public long getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	
}
