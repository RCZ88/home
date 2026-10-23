package tester;
import java.util.*;
public class Design {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner fn = new Scanner (System.in);
		System.out.println("enter you first number!");
		String answer1= fn.nextLine();
		double num1 = Double.parseDouble(answer1);
		System.out.println("enter you second number!");
		String answer2= fn.nextLine();
		double num2 = Double.parseDouble(answer2);
		
		
		
		Scanner wtd = new Scanner (System.in);
		System.out.println("what to do with the numbers? "); 
		String answer3 = wtd.nextLine();
		
		if(answer3.equalsIgnoreCase("add")) {
			System.out.print("if added, the value will be: ");
			System.out.println(num1+=num2);

		}else if(answer3.equalsIgnoreCase("substract")) {
			System.out.print("if substracted, the value will be: ");
			System.out.print(num1-=num2);
		}
		else if(answer3.equalsIgnoreCase("divide")) {
			System.out.print("if multiplied, the value will be: ");
			double dvd = (double)(num1/=num2);
			System.out.print(dvd);
			
		}
		else if (answer3.equalsIgnoreCase("multiply")) {
			System.out.print("if multiplied, the value will be: ");
			System.out.print(num1*=num2);
		}
	}
}

	
