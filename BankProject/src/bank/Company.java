package bank;

import java.util.ArrayList;

public class Company {
	private String name;
	protected ArrayList<Employee> employees;
	
	public Company (String n) {
		name = n;
		employees = new ArrayList<>();
	}
	
	public String printEmployees() {
		return employees.toString();
	}
	
	public String getName() {
		return name;
	}
	
	public void paySalary() {
		for(Employee employee : employees) {
			employee.getAccount().deposit(employee.getAnnualSalary());
		}
	}
	
	public void fireEmployee(String name) {
		for(Employee e : employees) {
			if(e.getName().equals(name)) {
				employees.remove(e);
				break;
			}
		}
	}
	
	public String getAllEmployees() {
		return employees.toString();
	}
}
