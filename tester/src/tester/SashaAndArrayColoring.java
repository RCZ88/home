package tester;
import java.util.Arrays;
import java.util.Scanner;
public class SashaAndArrayColoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
			int n = sc.nextInt();
			int [] a = new int[n];
			for(int j = 0; j<n; j++ ) {
				a[j] = sc.nextInt();
			}
			Arrays.sort(a);
			int max = 0;
			int k = n-1;
			for(int j = 0; j<(n/2); j++) {
				max+= a[k--]-a[j];
			}
			System.out.println(max);
		}
	}

}
