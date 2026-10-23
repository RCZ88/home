package mullyINC;

import java.util.ArrayList;

public class POS {
	private int station;
	private Employee employee;
	private ArrayList<Customer> customers;
	public POS(int noPOS) {
		station = noPOS;
		employee = null;
		customers = new ArrayList<>();
	}
	public void setEmployee(Cashier casheir) {
		this.employee = casheir;
	}
}
