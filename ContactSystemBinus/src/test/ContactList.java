package test;

import java.util.ArrayList;

public class ContactList {
	protected ArrayList<Contact>contacts = new ArrayList<>();
	
	public void addContact(String name, int number) {
		contacts.add(new Contact(name, number));
	}
	public void addContact(String name, int number, String description) {
		contacts.add(new Contact(name, number, description));
	}
	public void removeContact(String name) {
		contacts.remove(findUser(name));
	}
	public void removeContact(int number) {
		contacts.remove(findUser(number));
	}
	public void viewAllContact() {
		for(Contact c : contacts) {
			System.out.println("Name: " + c.getName());
			System.out.println("Number: " + c.getNumber());
			System.out.println("------------");
		}
	}
	public void editName(String name, String change) {
		Contact user = findUser(name);
		if(user != null) {
			user.setName(change);
		}
	}
	public void editName(int number, String change) {
		Contact user = findUser(number);
		if(user != null) {
			user.setName(change);
		}
	}
	public void editNumber(String name, int change) {
		Contact user = findUser(name);
		if(user != null) {
			user.setNumber(change);
		}
	}
	public void editNumber(int number, int change) {
		Contact user = findUser(number);
		if(user != null) {
			user.setNumber(change);
		}
	}
	public void SearchContact(String name) {
		Contact user = findUser(name);
		if(user != null) {
			System.out.println("Name: " + user.getName());
			System.out.println("Number: " + user.getNumber());
			System.out.println("Description: " + user.getDescription());
		}
	}
	public void SearchContact(int number) {
		Contact user = findUser(number);
		if(user != null) {
			System.out.println("Name: " + user.getName());
			System.out.println("Number: " + user.getNumber());
			System.out.println("Description: " + user.getDescription());
		}
	}
	private Contact findUser(String name) {
		for(Contact c : contacts) {
			if(c.getName().equals(name)) {
				return c;
			}
		}
		System.out.println("Contact not Found!");
		return null;
	}
	private Contact findUser(int number) {
		for(Contact c : contacts) {
			if(c.getNumber() == number) {
				return c;
			}
		}
		System.out.println("Contact not Found!");
		return null;
	}
}
