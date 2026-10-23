package tester;
import java.util.Scanner;
import java.util.Arrays;
public class Triple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
			int n = sc.nextInt();
			int [] a = new int[n];
			for(int j = 0; j<n; j++) {
				a[j] = sc.nextInt();
			}
			Three(a,n);
		}
	}
	public static int Three (int []arr, int n) {
		Arrays.sort(arr);
		int e = 0;
		for(int i = 0; i<n-1; i++) {
			if(arr[i]==arr[i+1]) {
				if(e<=3) {
					e++;
				}else {
					break;
				}
			}
		}
	}

}
