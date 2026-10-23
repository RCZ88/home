package bankSavings;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private String bankName;
	private ArrayList<Account> Accounts;
	
	public void addAccount(Account account) {
		Accounts.add(account);
	}
	public void removeAccount(int accNumber) {
		for(Account account : Accounts) {
			if(account.getAccountNumber() == accNumber) {
				Accounts.remove(account);
				break;
			}
		}
	}
	public Account getAccount(int accNumber) {
		Account theAccount = null;
		for(Account account : Accounts) {
			if(account.getAccountNumber() == accNumber) {
				theAccount = account;
				break;
			}
		}
		return theAccount;
	}
	public List<Account> getAllAccount() {
		return Accounts;
	}
}
