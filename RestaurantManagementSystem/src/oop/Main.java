package oop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long s = System.nanoTime();
		Restaurant McDonald = new Restaurant("McDonald", "Los Angeles, US");
		Table table1 = new Table(1, 6);
		Table table2 = new Table(2, 6);
		Table table3 = new Table(3, 8);
		Table table4 = new Table(4, 4);
		Table table5 = new Table(5, 10);
		
		Staff staff1 = new Staff("Ryan Lam", "Cleaning Service");
		Staff staff2 = new Staff("Reinhard luhur", "Cleaning Service");
		Staff staff3 = new Staff("Ivander", "Chef");
		Staff staff4 = new Staff("Jayden Hamil", "Server");
		Staff staff5 = new Staff("Clement", "Server");
		
		McDonald.addTable(table5);
		McDonald.addTable(table4);
		McDonald.addTable(table3);
		McDonald.addTable(table2);
		McDonald.addTable(table1);
		
		McDonald.hireStaff(staff1);
		McDonald.hireStaff(staff2);
		McDonald.hireStaff(staff3);
		McDonald.hireStaff(staff4);
		McDonald.hireStaff(staff5);
		
		MenuItem menu1 = new MenuItem("Spagethi MeatBALLS", "an attrocious food", 200);
		MenuItem menu2 = new MenuItem("Salmonela", "a delicious virus", 150);
		MenuItem menu3 = new MenuItem("Raw Steak", "red cepie for Disaster", 400);
		MenuItem menu4 = new MenuItem("Nasi Goreng Kuah", "sloppy, yucky, yummy", 80);
		MenuItem menu5 = new MenuItem("Spoiled milk", "nice and sour", 50);
		
		Menu menu = new Menu();
		menu.addItem(menu1);
		menu.addItem(menu2);
		menu.addItem(menu3);
		menu.addItem(menu4);
		menu.addItem(menu5);
		McDonald.updateMenu(menu);
		
		table1.reserveTable(6);
		table2.reserveTable(8);
		table3.reserveTable(8);
		
		table1.viewMenu(menu);
		MenuItem[]table1Order = {menu1, menu3, menu5};
		Staff table1S = McDonald.searchForStaff("Server");
		table1.placeOrder(table1Order);
		PaymentMethod table1PM = new PaymentMethod("Cash", 1000);
		table1.makePayment(table1PM);
		table1.getReceipt();
		table1S.taskDone();
		table1.doneEating();
		
		table2.viewMenu(menu);
		MenuItem[]table2Order = {menu1,menu1, menu2, menu4, menu3};
		Staff table2S = McDonald.searchForStaff("Server");
		table2.placeOrder(table2Order);
		Staff table2CS = McDonald.searchForStaff("Cleaning Service");
		PaymentMethod table2PM = new PaymentMethod("Credit", 3000);
		table2.makePayment(table2PM);
		table2.getReceipt();
		table2S.taskDone();
		table2CS.taskDone();
		table2.doneEating();
		long e = System.nanoTime();
		System.out.println("TIME TAKEN");
		System.out.println(e-s + "ns");
	}

}
