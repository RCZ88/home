package tester;

import java.util.Scanner;

public class LE2 {

	public static void main(String[] args) {
		Scanner tnb = new Scanner (System.in); 
		System.out.print("Insert First Number=>");
		int fn = tnb.nextInt();
		System.out.print("Insert Second Number=>");
		int sn = tnb.nextInt();
		int gcd = 1;
		
		
		for(int i = 1; i <= fn && i <= sn; i++)  {  
			if(fn % i == 0 && sn % i == 0)  
				gcd = i;  
			}  
		int lcm = (fn*sn)/gcd;
		System.out.println("The Least Common Multiplier of "+ fn+ " and "+ sn + "= "+lcm+".");
		}
	}
