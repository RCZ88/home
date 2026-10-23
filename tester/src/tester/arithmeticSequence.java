package tester;
import java.util.Scanner;

public class arithmeticSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner as = new Scanner(System.in);
			System.out.println("Pattern Calculator");
			System.out.print("Input first number => ");
			int fn = as.nextInt();
			System.out.print("Input second number => ");
			int sn = as.nextInt();
			System.out.print("Input third number => ");
			int tn = as.nextInt();
			int fps = 0;
			
		System.out.print("Which number do you want to find? ");
			int uN = as.nextInt();
			if(fn>sn) {
				fps = fn-sn;
			}else {
				fps = sn-fn;
			}
			double an = fn+(uN-1)*(fps);
			double s = uN/2*(2*fn+(uN-1)*(fps));
			System.out.println("Number " + uN +" in the pattern is "+an);
			System.out.println("The total amount from the patter is " + s );
			
			
	}

}
