package tester;
import java.util.Scanner;
public class BinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Number -> Binary");
		System.out.println("2. Binary -> Number");
		System.out.print("Choose Convertion:");
		int t = sc.nextInt();
		if(t == 1) {
			System.out.println("Input a Number: ");
			int n = sc.nextInt();
			while(n!=1) {
				if(n%2 == 0) {
					System.out.print("0");
				}else {
					System.out.print("1");
				}
				n  = n/2;
			}
		}else {
			System.out.println("Input a Binary: ");
			long m = sc.nextLong();
			String ms = String.valueOf(m);
			int l = ms.length();
			int e = 1;
			for(int i = l-1; i >=0; i--) {
				if(ms.charAt(i)=='0') {
					e = e*2;
				}else {
					e = (e*2)+1;
				}
			}
			System.out.println(e);
		}
	}

}
