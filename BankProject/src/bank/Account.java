package bank;

public class Account {
	private double bal;
	private int accnum;
	private String owner;
	private Employee employee;
	
	
	public Account(int a, String o, Employee e) {
		bal = 0.0;
		accnum = a;
		owner = o;
		employee = e;
	}
	
	public void deposit(double sum) {
		if(sum>0) {
			if(employee.getWallet() >= sum) {
				setBal(getBal() + sum);
				employee.wallet -= sum;
			}
		}else {
			System.err.println("Cannot deposit a Negative Amount!");
		}
	}
	
	public void withdraw(double sum) {
		if(sum>0) {
			if(getBal()>= sum) {
				setBal(getBal() - sum);
				employee.wallet+=sum;
			}else {
				System.out.println("Not enough Balance!");
			}
		}else {
			System.err.println("Cannot withdraw a Negative Amount!");
		}
	}
	
	public double getAccountNumber() {
		return accnum;
	}
	
	public String toString() {
		return "Owner: " + owner +  "Account Number:  " + accnum + ": " + "balance: " + getBal();
	}
	
	public final void print() {
		//Don't override this,
		//override the toString method
		System.out.println(toString() ); 
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}
	
	public double interestAmount(double percentage) {
		return 0.0;
	}
	
	public String getOwner() {
		return owner;
	}
}
