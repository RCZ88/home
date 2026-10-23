package oop;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee(123, "Clement", "Zhao", 50000);
		int raisePercentage = 25;
		System.out.println(employee1.raiseSalary(raisePercentage) + "(" + raisePercentage + "% Increase in Salary)");
		System.out.println(employee1.toString());
	}

}
