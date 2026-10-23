package tester;
import java.util.Scanner;
public class DivisibilityProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        int [] a = new int[t];
	        int [] b = new int[t];
	        int [] c = new int[t];
	        int nom = 0;
	        boolean yon = false;
	        for(int i = 0; i<t; i++){
	            a[i] = sc.nextInt();
	            b[i] = sc.nextInt();
	        }
	        for(int i = 0 ; i<t; i++) {
	        	if (a[i] % b[i] == 0) {
	                c[i] = 0;
	            } else {
	                c[i] = b[i] - a[i] % b[i];
	            }
	        }
	        for(int i = 0; i<t; i++) {
	        	System.out.println(c[i]);
	        }
	}

}
