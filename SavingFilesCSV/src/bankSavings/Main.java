package bankSavings;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Banking System!");

        // Create accounts
        System.out.print("Enter the name for the first account: ");
        String owner1 = scanner.nextLine();
        Account account1 = new Account(owner1);

        System.out.print("Enter the name for the second account: ");
        String owner2 = scanner.nextLine();
        Account account2 = new Account(owner2);

        // Print initial account information
        System.out.println("\nInitial Account Information:");
        printAccountInfo(account1);
        printAccountInfo(account2);

        // Perform transactions based on user input
        performTransactions(scanner, account1, account2);

        // Print final account information
        System.out.println("\nFinal Account Information:");
        printAccountInfo(account1);
        printAccountInfo(account2);

        scanner.close();
    }

    private static void performTransactions(Scanner scanner, Account sourceAccount, Account destinationAccount) {
        System.out.println("\nPerforming Transactions...");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    sourceAccount.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter the withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    sourceAccount.withdraw(withdrawalAmount);
                    break;

                case 3:
                    System.out.print("Enter the destination account number for the transfer: ");
                    int destinationAccountNumber = scanner.nextInt();
                    System.out.print("Enter the transfer amount: ");
                    double transferAmount = scanner.nextDouble();
                    sourceAccount.transfer(destinationAccountNumber, transferAmount, true);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

            // Print updated account information after each transaction
            System.out.println("\nUpdated Account Information:");
            printAccountInfo(sourceAccount);
            printAccountInfo(destinationAccount);
        }
    }

    private static void printAccountInfo(Account account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Owner: " + account.getOwner());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("----------");
    }

}
