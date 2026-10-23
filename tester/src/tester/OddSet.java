package tester;
import java.util.Scanner;
public class OddSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
			int n = sc.nextInt();
			int [] arr = new int [2*n];
			int oddN = 0;
			for(int j = 0; j<arr.length; j++) {
				arr[j] = sc.nextInt();
				if(arr[j]%2 != 0) {
					oddN++;
				}
			}
			if(oddN == n) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
		}
	}

}
