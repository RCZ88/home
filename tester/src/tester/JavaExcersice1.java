package tester;
import java.util.*;
public class JavaExcersice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner psgr = new Scanner (System.in); 
		
		System.out.println("2$ per person");
		System.out.println("3 person or more = 10% off to the total cost");
		//info//
		
		System.out.print("Number of passenger?");
		String nop = psgr.nextLine();
		int inop = Integer.parseInt(nop);
		//number of passenger input//
		
		System.out.print("Pick a starting station(1-10)"); 
		String ss = psgr.nextLine();
		int iss = Integer.parseInt(ss);
		//starting station input//
		
		System.out.print("Pick a ending station(1-10)");
		String es = psgr.nextLine();
		int ies = Integer.parseInt(es);
		//ending station input//
		
		int dsto = iss-ies;
		double dstp2 = Math.pow(dsto, 2);
		double dstF = Math.pow(dstp2, 0.5);
		//making the distance number to always be positive//
		
		if (inop > 3 || inop == 3) {
			double prc = 0.9 * inop * dstF *2; 
			System.out.println("The total cost of ticket= $" + prc);
			double ttd = 0.1* inop * dstF *2;
			System.out.println("You save a total of " + ttd +" dollars!");
		} 
		else if (inop < 3) {
			double prc = inop * dstF*2;
			System.out.println("The total cost of ticket= $" + prc);
		}
		//if else price, discount amount, and print//
		
	}
}


