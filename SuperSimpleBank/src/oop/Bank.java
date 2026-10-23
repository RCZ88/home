package oop;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts;
	private String name;
	
	public Bank(String name) {
		this.name = name;
	}
	public void addAccount(Account account) {
		accounts.add(account);
	}
	public void removeAccount(Account account) {
		accounts.remove(account);
	}
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	public String getName() {
		return name;
	}
	
}
