package bank;

public class CurrentAccount extends Account{
	double overdraftLimit;
	public CurrentAccount(int a, String o, Employee e) {
		super(a, o, e);
		overdraftLimit = super.getBal();
		// TODO Auto-generated constructor stub
	}
	public void setOverdraftLimit(double amount) {
		overdraftLimit = amount;
	}
	
	@Override
	public void deposit(double sum) {
		if(sum > 0) {
			if(sum<=overdraftLimit) {
				setBal(getBal() - sum);
			}else {
				System.out.println("Not enough overdraft Amount!");
			}
		}else {
			System.out.println("Cannot deposit negative amount.");
		}
	}
	
}

