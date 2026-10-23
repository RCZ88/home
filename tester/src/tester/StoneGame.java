package tester;
import java.util.Scanner;
public class StoneGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0; i<t; i++) {
			int n = sc.nextInt();
			int [] a = new int [n];
			int min = 1;
			int max = n; 
			
			for(int j = 0; j<n; j++) {
				a[j] = sc.nextInt();
				if(a[j] == 1) {
					min = j;
				}
				if(a[j] == n) {
					max = j;
				}
			}
			int l = Math.min(min, max) + 1;
            int r = Math.min(n - min, n - max);
            int sts = min+(n-max);
            System.out.println(Math.min(l, Math.min(r, sts)));
		}
	}

}
