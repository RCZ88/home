package mullyINC;

import java.util.ArrayList;

public class Company {
	private String company_name;
	private ArrayList<Branch>branches = new ArrayList<>();
	public Company(String cn) {
		company_name = cn;
	}
}
