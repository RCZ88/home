package tester;
import java.util.Scanner;
public class ArrayWithOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String [] yon = new String [t];
		for(int i = 0; i<t; i++) {
			int as = sc.nextInt();
			int []a = new int[as];
			int ttl = 0;
			for(int j = 0; j<as; j++) {
				a[j] = sc.nextInt();
				ttl= ttl+ a[j];
			}
			if(ttl % 2 == 0) {
				yon[i] = "NO";
			}else {
				yon[i] = "YES";
			}
		}
		for(int i=0; i<t; i++) {
			System.out.println(yon[i]);
		}
	}

}
