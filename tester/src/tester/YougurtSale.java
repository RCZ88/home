package tester;

import java.util.Scanner;

public class YougurtSale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
			int minCost = 0;
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(b<a*2) {
				minCost += (n/2*b);
				if(n % 2 != 0) {
					minCost += a;
				}
			}else {
				minCost += a*n;
			}
			System.out.println(minCost);
		}
	}

}
