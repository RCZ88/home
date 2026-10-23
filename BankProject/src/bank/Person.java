package bank;

import java.util.Random;

public class Person {
	private String name;
	
	public Person() {
		name = "No name yet.";
	}
	public Person(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void print() {
		System.out.println("Name: "+ name);
	}
	public boolean equals(Person p) {
		return name.equals(p.name);
	}
	
	public Account createAccount(int accType, Employee employee) {
		Random r = new Random();
		int accNumber = r.nextInt()*9999 + 1111;
		if(accType == 1) {
			Account account = new Account(accNumber, name, employee);
			return account;
		}else if(accType == 2) {
			CurrentAccount account = new CurrentAccount(accNumber, name, employee);
			return account;
		}else if(accType == 3) {
			SavingsAccount account = new SavingsAccount(accNumber, name, employee);
			return account;
		}else {
			return null;
		}
	}
	
}
