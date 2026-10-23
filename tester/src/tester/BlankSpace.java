package tester;
import java.util.Scanner;
public class BlankSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
			int max = 0 ;
			int e = 0;
			int n = sc.nextInt();
			int [] a = new int[n];
			for(int j = 0; j<n ;j++) {
				a[j] = sc.nextInt();
				if(a[j] == 0) {
					e++;
				}else {
					e = 0 ;
				}
				if(e>max) {
					max = e;
				}
			}
			System.out.println(max);
		}
	}

}
