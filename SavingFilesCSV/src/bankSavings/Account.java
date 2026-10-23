package bankSavings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;

public class Account {
    private int accountNumber;
    private double balance;
    private static int accountID;
    private String owner;
    private String fileName;
    private static AccountManager accountManager = new AccountManager();
    private static List<Account> accounts;
    private static Bank bank = new Bank();
    private static final int idStartNumber = 7777;
    private LocalDateTime time;
    private static final DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    static {
        accountID = accountManager.getAllAccountIDs().size() + idStartNumber;
        accounts =  bank.getAllAccount();
       
    }

    public Account(String name) {
        accountNumber = accountID; 
        accountManager.addAccountID(accountID);
        owner = name;

        try {
        	fileName = "Account" + Integer.toString(accountID) + ".txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(accountNumber);
            writer.write(Double.toString(balance));
            writer.write(owner);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        initialize();
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void deposit(double amount) {
    	balance+= amount;
    	update();
    }
    public void withdraw(double amount) {
    	if(balance >= amount) {
    		balance -= amount;
    	}else {
    		System.out.println("Issuficient Amount!");
    	}
    }
    public void transfer(int accountNumber, double amount, boolean printReceipt) {
        Account destinationAccount = null;
        boolean accountFound = false;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));  // Use append mode
            for (Account account : accounts) {
                if (account.getAccountNumber() == accountNumber) {
                    accountFound = true;
                    destinationAccount = account;
                    break;
                }
            }
            if (accountFound) {
                if (this.balance >= amount) {
                    destinationAccount.deposit(amount);
                    this.balance -= amount;
                    destinationAccount.update();
                    this.update();
                    if (printReceipt) {
                        time = LocalDateTime.now();
                        printReceipt(destinationAccount, amount);
                    }
                } else {
                    System.out.println("Insufficient Amount!");
                }
            } else {
                System.out.println("Account not Found!");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void update() {
    	try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Account" + Integer.toString(accountID) + ".txt"));
            writer.write(accountNumber);
            writer.write(Double.toString(balance));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void initialize() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            accountNumber = Integer.parseInt(reader.readLine());

            // Handle the balance parsing
            try {
                balance = Double.parseDouble(reader.readLine());
            } catch (NumberFormatException e) {
                balance = 0.0;  // Default value or handle it differently
            }

            owner = reader.readLine();
            reader.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void printReceipt(Account account, double amount) {
    	System.out.println("TRANSFER RECIEPT");
    	System.out.println("Transfer Succesfull!");
    	String formattedTime = time.format(timeFormat);
    	System.out.println(formattedTime);
    	System.out.println("To: " + account.getAccountNumber());
    	System.out.println(account.getOwner());
    	System.out.println("Transfer Amount: Rp."+ amount);
    }
    public String getOwner() {
    	return owner;
    }

	public double getBalance() {
		return balance;
	}
}
