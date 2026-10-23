package bank;

import java.util.ArrayList;

public class Bank {
	ArrayList<Account>accounts;
	private String name;
	private String password;
	private double interestPercentage;
	
	public Bank(String name, String password, double interest) {
		accounts = new ArrayList<>();
		this.name = name;
		interestPercentage = interest;
	}
	
	public void update() {
		for(Account account: accounts) {
			if(account instanceof SavingsAccount) {
				account.setBal(account.getBal() + account.interestAmount(interestPercentage));
			}
		}
	}
	
	public void openAccount(Account account) {
		accounts.add(account);
	}
	public void closeAccount(int accountNumber) {
		for(Account account: accounts) {
			if(account.getAccountNumber() == accountNumber) {
				accounts.remove(account);
				break;
			}
		}
	}
	
	public void payDivident(double amount) {
		for(Account account: accounts) {
			account.setBal(account.getBal()+amount);
		}
	}

	public String toString() {
		return "Bank Name: " + name + "Bank Interest Percentage: " + interestPercentage;
	}
	
	public String getPassword() {
		return password;
	}
}
