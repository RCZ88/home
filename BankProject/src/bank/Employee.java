package bank;

public class Employee extends Person{
	private double annualSalary;
	private int startYear;
	private String nasionalInsuranceNumber;
	private Account account;
	protected double wallet;
	
	public Employee(String n, double annualSalary, int startYear, String number, double wallet) {
		super(n);
		this.annualSalary = annualSalary;
		this.startYear = startYear;
		nasionalInsuranceNumber = number;
		this.wallet = wallet;
	}
	
	public boolean equals(Person person) {
		return this == person;
	}
	
	public double getAnnualSalary() {
		return annualSalary;
	}
	
	public int getStartYear() {
		return startYear;
	}
	public String getNasionalInsuranceNumber() {
		return nasionalInsuranceNumber;
	}
	public void setBankAccount(Account a) {
		account = a;
	}
	public Account getAccount() {
		return account;
	}
	public double getWallet() {
		return wallet;
	}

}
