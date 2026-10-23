package proceedural;

import java.util.ArrayList;


public class Bank {

    // Define global variables for accounts
    static ArrayList<Account> accounts = new ArrayList<>();
    
    // Define structure for an Account
    static class Account {
        String name;
        long id;
        double balance;

        Account(String name, long id, double balance) {
            this.name = name;
            this.id = id;
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        int a = 11;
        ArrayList<Long> times = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            long start = System.nanoTime();

            // Create accounts
            Account acc1 = new Account("Samuel Kiswanto", 937756210, 3000);
            Account acc2 = new Account("Jason Harjono", 163403372, 5000);
            accounts.add(acc1);
            accounts.add(acc2);

            // Perform operations
            deposit(acc1, 2000);
            transfer(acc1, acc2, 500);
            withdraw(acc2, 1500);
            transfer(acc2, acc1, 750);
            withdraw(acc1, 2000);

            System.out.println(acc1.name + " balance: " + acc1.balance);
            System.out.println(acc2.name + " balance: " + acc2.balance);
            
            long end = System.nanoTime();
            long time = end - start;
            times.add(time);
        }

        // Calculate and print average time
        int count = 0;
        long sum = 0;
        for (long time : times) {
        	System.out.println(count + ". " + time);
        	if(count>0) {
        		sum += time;
        	}
            count++;  
        }
        long avg = sum / (a-1);
        System.out.println("Average time: " + avg + " nanoseconds");
    }

    // Define deposit function
    public static void deposit(Account acc, double amount) {
        acc.balance += amount;
    }

    // Define withdraw function
    public static void withdraw(Account acc, double amount) {
        if (acc.balance >= amount) {
            acc.balance -= amount;
        } else {
            System.out.println("Not enough Balance");
        }
    }

    // Define transfer function
    public static void transfer(Account fromAcc, Account toAcc, double amount) {
        if (fromAcc.balance >= amount) {
            fromAcc.balance -= amount;
            toAcc.balance += amount;
        } else {
            System.out.println("Not enough Balance");
        }
    }
}

