package tester;
import java.util.Scanner;
public class SumofRoundNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextInt();
		int i = 0;
		for(i = 0; i<t; i++) {
			int n = sc.nextInt();
			String ns = Integer.toString(n);
			for(int j = 0; j<ns.length();j++) {
				if(ns.charAt(j)== '0') {
					int e  = ns.length()-j+1;
					for(int k = 1; k<e;k++) {
						if(ns.charAt(j+k) == 0) {
							
						}
					}
				}
			}
		}
	}

}
