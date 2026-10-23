package bank;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> es = new ArrayList<>();
		
		System.out.println("\n---Create a Bank---");
		System.out.print("Enter Bank Name: ");
		String bankName = sc.next();
		System.out.print("Enter a Password(for Accessing Data): ");
		String bankPassword = sc.next();
		System.out.print("Enter Bank Interest Percentage: ");
		double interest = sc.nextDouble();
		Bank bank = new Bank(bankName, bankPassword, interest);
		System.out.println("Bank successfully Created!");
		System.out.println(bank);
		
		System.out.println("\n---Create a Company---");
		System.out.print("Enter Company Name: ");
		String companyName = sc.next();
		Company company = new Company(companyName);
		System.out.println("Company Succesfully Created!");
		
		while(true) {
			System.out.println("\n---Recuit an Employee to " + company.getName() + "---");
			System.out.print("Employee Name: ");
			String employeeName = sc.nextLine();
			System.out.print("Salary: ");
			double employeeSalary = sc.nextDouble();
			System.out.print("Start Year: ");
			int startYear = sc.nextInt();
			System.out.println("National Insurance Number(NIN): ");
			String number = sc.next();
			System.out.println("Money In vallet to Start: ");
			double wallet = sc.nextDouble();
			Employee employee = new Employee(employeeName, employeeSalary, startYear, number, wallet);
			company.employees.add(employee);
			System.out.println("Employee Successfully Added to the Company!");
			boolean stop = false;
			while(!stop) {
				System.out.println("Add more to the Company? : ");
				System.out.println("NO(0)\nYES(1)");
				System.out.print("Choice: ");
				int choice = sc.nextInt();
				if(choice == 0) {
					stop = true;
					break;
				}else if(choice == 1) {
					stop = false;
					break;
				}else {
					System.out.println("Invalid Choice!");
				}
			}
			if(stop) {
				break;
			}
		}
		
		System.out.println("\n---Create Account for All Employees---");
		for(Employee employee : company.employees) {
			System.out.println("Choose Bank for: " + employee.getName());
			int choice;
			while(true) {
				System.out.println("Normal (1)\nCurrent (2)\nSavings (3)");
				System.out.print("Choice: ");
				choice = sc.nextInt();
				if(choice == 1 || choice == 2 || choice == 3) {
					break;
				}else {
					System.out.println("Invalid Choice!");
				}
			}
			Account account = employee.createAccount(choice, employee);
			employee.setBankAccount(account);
			bank.openAccount(account);
			System.out.println("Employee Succesfully added to the Bank!");
			System.out.println("Bank Account Details: " + account.toString());
		}
		int c = 0;
		boolean game = true;
		while(game) {
			System.out.println("Select Role: ");
			System.out.println("Exit (0)\nBank (1)\nCompany (2)\nEmployee(3)");
			int choice  = sc.nextInt();
			boolean subgame = true;
			if(choice == 1) {
				while(subgame) {
					System.out.println("---Bank Cooperation System---");
					System.out.println("Choose the following Actions: ");
					System.out.println("Exit (0)\nClose an Account(1)\nPay Devidend (2)\nView all Accounts(3)");
					c = sc.nextInt();
					switch(c) {
					case 0:
						subgame = false;
						break;
					case 1:
						System.out.println("Input Account Number to Close: ");
						int an = sc.nextInt();
						bank.closeAccount(an);
						break;
					case 2:
						System.out.println("Input Amount to Devidend: ");
						double amt = sc.nextDouble();
						bank.payDivident(amt);
						break;
					case 3: 
						System.out.println("!!Data is Locked!!");
						System.out.println("Enter Password to Proceed: ");
						String password = sc.next();
						if(password.equals(bank.getPassword())) {
							System.out.println("Access Granted!");
							System.out.println("Accounts:");
							for(Account account: bank.accounts) {
								account.toString();
							}
						}
						
					}
				}
				
			}else if(choice == 2) {
				System.out.println("---Company Cooperation System---");
				subgame = true;
				while(subgame) {
					System.out.println("Choose the Following Actions: ");
					System.out.println("Exit (0)\n Pay Salary(1)\n Fire Employee(2)\n All Employees (3)");
					c = sc.nextInt();
					switch(c) {
					case 0:
						subgame = false; 
						break;
					case 1: 
						company.paySalary();
						System.out.println("All Employees have been Paid Successfully!");
						break;
					case 2:
						String name = sc.next();
						company.fireEmployee(name);
						System.out.println(name + " has Successfully been Fired");
					case 3:
						System.out.println(company.getName() + "'s Employees: ");
						company.getAllEmployees();
					}
				}
				
			}else if(choice == 3) {
				System.out.println("---Employee's POV---");
				boolean userFound = false;
				subgame = true;
				while(subgame) {
					boolean loggedIn = false;
					Employee emp = null;
					while(!userFound) {
						System.out.print("Employee Name: ");
						String en = sc.next();
						for(Employee e: company.employees) {
							if(e.getName().equals(en)) {
								emp = e;
								userFound = true;
								break;
							}
						}
						System.out.println("No User found");
					}
					System.out.println("Employee Successfully Applied");
					loggedIn = true;
					while(loggedIn) {
						System.out.println("Choose Following Actions: ");
						System.out.println("Exit (0)\nCheckBalance (1)\nDeposit (2)\nWithdraw (3)");
						choice = sc.nextInt();
						switch(choice) {
						case 0:
							subgame = false; 
							break;
						case 1: 
							System.out.println("Balance: " + emp.getAccount().getBal());
							break;
						case 2:
							System.out.print("Enter amount to Deposit: ");
							double amount = sc.nextDouble();
							emp.getAccount().deposit(amount);
						case 3: 
							System.out.println("Enter amount to Withdraw: ");
							amount = sc.nextDouble();
							emp.getAccount().withdraw(amount);
						}
					}
					
				}
				
			}
		}
		
	}

}
