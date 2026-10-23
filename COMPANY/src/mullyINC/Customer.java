package mullyINC;

import java.util.ArrayList;

public class Customer {
	private ArrayList<Item>shoppingCart;
	private Member member;
	public Customer() {
		shoppingCart = new ArrayList<>();
		member = null;
	}
	public void createMembership(String name, String email, String number, String address, String birthdate) {
		member = new Member(name, email, number, address, birthdate);
	}
	public void buyItem() {
		
	}
}
