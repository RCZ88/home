package bank;

public class SavingsAccount extends Account{
	private double interest;
	public SavingsAccount(int a, String o, Employee e) {
		super(a, o, e);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double interestAmount(double percentage) {
		return (percentage/100)* getBal();
	}
	
	public double getInterest() {
		return interest;
	}
	
}
