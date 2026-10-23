package tester;
import java.util.*;
public class compositefunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input x: ");
		int x = sc.nextInt();
		System.out.println("Choose Method: ");
		System.out.println("1. (f o g)(x)");
		System.out.println("2. (g o f)(x)");
		System.out.print("Input Method: ");
		int m = sc.nextInt();
		int fx = 0;
		int gx = 0;
		if(m == 1) {
			gx = 3+x;
			fx = (2*gx)-1;
		}else if(m ==2) {
			gx = (2*x)-1;
			fx = 3+gx;
		}
		System.out.println("Output: "+fx);
		
	}

}
