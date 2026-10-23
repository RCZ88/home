package tester;
import java.util.Scanner;
public class ConstructString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i  = 0; i <t; i++) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			String result = constString(n,a,b);
			System.out.println(result);
		}
	}
	private static String constString (int n, int a, int b) {
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<n; i+=a) {
			char cc = 'a';
			for(int j = 0; j<b; j++) {
				sb.append(cc);
				cc++;
			}
		}
		return sb.toString();
	}
}
