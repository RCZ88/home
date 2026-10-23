package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ContactList user1 = new ContactList();
		System.out.println("Contact Management System");
		boolean running = true;
		while(running) {
			System.out.println("MAIN MENU");
			System.out.println("[1] Add a new Contact");
			System.out.println("[2] List all Contacts");
			System.out.println("[3] Search for Contact");
			System.out.println("[4] Edit a Contact");
			System.out.println("[5] Delete a Contact");
			System.out.println("[0] Exit");
			System.out.print("Enter Your Choice: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("CREATE A NEW CONTACT: ");
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Number: ");
				int number = sc.nextInt();
				System.out.print("Description(Optional): ");
				String description = sc.next();
				if(!description.equals("")) {
					user1.addContact(name, number, description);
				}else {
					user1.addContact(name, number);
				}
			case 2:
				System.out.println("CONTACT LIST");
				user1.viewAllContact();
			case 3: 
				System.out.println("SEARCH CONTACT");
				System.out.println("Input Number or Name: ");
				String input = sc.next();
				String type = "";
				for(char c : input.toCharArray()) {
					if(Character.isDigit(c)) {
						type = "Number";
					}else {
						type = "Name";
					}
					break;
				}
				if(type.equals("Number")) {
					user1.SearchContact(input);
				}else {
					user1.SearchContact(input);
				}
			case 4: 
				
			case 5:
				
			case 0: 
				running = false;
			}
		}
	}

}
