package mullyINC;

import java.util.ArrayList;

public class Branch {
	private String address;
	private String phoneNumber;
	private ArrayList<Employee> employees;
	private Inventory inventory;
	private ArrayList<Item>shelfItems;
	private ArrayList<Member> members;
	public Branch(String a, String pn) {
		address = a;
		phoneNumber = pn;
		employees = new ArrayList<>();
		members = new ArrayList<>();
		inventory = new Inventory();
	}
	public void addEmployee(String name, String number, String address) {
		employees.add(new Employee(name, number, address));
	}
	public void addMember(String name, String email, String number, String address, String birthdate) {
		members.add(new Member(name, email, number, address, birthdate));
	}
	public void addItemSelf(String id, int quantity) {
		int count = 0;
		Item[]items = new Item[quantity];
		for(Item i : inventory.getItems()) {
			if(i.getId().equals(id)) {
				items[count] = i;
				count++;
			}
		}
		if(count == quantity-1) {
			for(int i = 0; i<count; i++) {
				for(Item j : inventory.getItems()) {
					if(j.getId().equals(id)) {
						inventory.removeItem(j);
						break;
					}
				}
			}
			for(int i = 0; i<quantity; i++) {
				shelfItems.add(items[i]);
			}
		}else {
			System.out.println("Not enough Item from the inventory!");
		}
	}
	public void changeNumber(String number) {
		phoneNumber = number;
	}
	
}
