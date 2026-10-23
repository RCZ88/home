package tester;
import java.util.Scanner;
public class Books {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int []ith = new int [n];
		int i = 0;
		int o = 0;
		int k =0;
		int sum = 0;
		for(i = 0;i<n;i++) {
			ith[i] = sc.nextInt();
		}
		for(i = 0;i<n; i++) {
			sum = sum+ith[i];
			if(sum<=t) {
				o++;
			}else {
				sum = sum-ith[k];
				k++;
			}
		}
		System.out.println(o);
	}
 
}