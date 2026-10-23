package tester;

import java.util.Scanner;
import java.util.ArrayList;

public class Sorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> numbers = new ArrayList<Double>();
		
		System.out.println("Enter the numbers ('s' to sort) ('q' to stop): ");
		while(true) {
			String ni = sc.nextLine();
			if(!(ni.equals("s")) && !( ni.equals("q"))) {
				double n = Double.parseDouble(ni);
				numbers.add(n);
			}else if(ni.equals("s")){
				numbers.sort(null);
				for(double number: numbers) {
					System.out.println(number);
				}
			}else if(ni.equals("q")){
				System.out.println("Thank You for Sorting");
				break;
			}
		}
		sc.close();
	}

}
