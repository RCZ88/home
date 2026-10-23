package tester;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BMIcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		System.out.print("Enter Your Height(Meters): ");
		double fn = sc.nextDouble();
		System.out.print("Enter Your Weight(KG): ");
		double sn = sc.nextDouble();
		double BMI = calcBMI(fn,sn);
		String FBMI = decimalFormat.format(BMI);
		System.out.println("Your BMI is: "+FBMI);
		if(BMI<18.5) {
			System.out.println("Your are underweight!");
		}else if(BMI>=18.5 && BMI<=24.9) {
			System.out.println("You are normal!");
		}else if(BMI>=25&&BMI<=29.9){
			System.out.println("You are overweight!");
		}else if(BMI>30){
			System.out.println("You have obesity!");
		}
	}
	private static double calcBMI(double h, double w) {
		double x = h*h;
		double b = (double)w/x;
		return b;
	
	}

}
