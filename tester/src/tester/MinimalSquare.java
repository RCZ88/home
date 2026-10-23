package tester;
import java.util.Scanner;
public class MinimalSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();  // consume the newline character

		int[] ab = new int[t];
		double[] aab = new double[t];

		for (int i = 0; i < t; i++) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    if(a==b) {
		    	ab[i] = (2*a)*(2*b);
		    }else {
		    	ab[i] = (a * b) * 2;
		    }
		}

		for (int i = 0; i < t; i++) {
		    while (aab[i] < Math.sqrt(ab[i])) {
		        aab[i] += 1; // or aab[i]++;
		    }
		}

		for (int i = 0; i < t; i++) {
		    System.out.println((int) (aab[i] * aab[i])); // casting to int for output
		}

	}

}
