package tester;
import java.util.*;
public class LoopExersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hss = new Scanner (System.in); 
		System.out.println("Taxes For 5 House In a Private Island");
		double st = 0;
		double tax =0;
		double nbr = 0;
		int i = 0;
		for (  i = 1; i < 6; i++) {
			System.out.print("Value of House Number "+ i+"=>");
			int voh = hss.nextInt();
			st += tax; 
			if (voh > 200000) {
				 tax = 0.02 * voh;
				 
			}else if (voh>100000 && voh<200000) {
				 tax = 0.015 * voh;
			}else if (voh>50000 && voh<100000) {
				 tax = 0.01 * voh;
			}else {
				tax = 0;
			}
			 nbr += 1;
		}

	}
		
		
	}
	
}



