package oop;

import java.util.ArrayList;

public class Restaurant {
	private String name;
	private String address;
	private ArrayList<Table>tables;
	private Menu menu;
	private ArrayList<Staff>staffs;
	
	Restaurant(String name, String address){
		this.name = name;
		this.address = address; 
		tables = new ArrayList<>();
		staffs = new ArrayList<>();
	}
	
	public void addTable(Table table) {
		if(tables.contains(table)) {
			System.out.println("Cannot Add duplicate Table");
		}else {
			tables.add(table);
		}
	}
	public void removeTable(Table table) {
		tables.remove(table);
	}
	public void hireStaff(Staff staff) {
		if(staffs.contains(staff)) {
			System.out.println("Cannot Add duplicate Staff!");
		}else {
			staffs.add(staff);
		}
	}
	public void fireStaff(Staff staff) {
		staffs.remove(staff);
	}
	public void updateMenu(Menu menu) {
		this.menu = menu;
	}
	public Staff searchForStaff(String type) {
		boolean typeFound = false;
		for(Staff s : staffs) {
			if(typeFound == false) {
				if(s.getRole().equals(type)) {
					typeFound = true;
				}
			}
			if(s.getRole().equals(type) && s.isBusy() == false) {
				s.assignTask(type);
				return s;
			}
		}
		if(typeFound) {
			System.out.println("All " + type + " staffs are busy");
		}else {
			System.out.println("We dont have " + type + " in this restaurant!");
		}	
		return null;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public ArrayList<Table> getTables() {
		return tables;
	}

	public Menu getMenu() {
		return menu;
	}

	public ArrayList<Staff> getStaffs() {
		return staffs;
	}
}
