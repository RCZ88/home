package tester;
import java.util.Scanner;
public class OddEvenIncrements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j = 0; j<n; j++) {
				arr[j] = sc.nextInt();
			}
			int odd = 0;
			int even = 0;
			for(int j = 0; j<n; j++) {
				if(arr[j]%2!=0) {
					odd++;
				}else {
					even++;
				}
			}
			if(odd == even || odd == n || even == n || odd+1 == even || even+1 == odd) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
