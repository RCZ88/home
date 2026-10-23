package tester;
import java.util.Scanner;
public class bitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = Integer.bitCount(n);//function
		
		//manual:
		//1. Convert to Binary Number
		StringBuilder sb = new StringBuilder();
		while(n!=0) {
			if(n%2 == 0) {
				sb.append(0);
			}else{
				sb.append(1);
			}
			n=n/2;
		}
		//2. Count the number of 1's in Binary
		String ns = String.valueOf(n);
		for(int i =0; i<ns.length(); i++) {
			if(ns.charAt(i)=='1') {
				count++;
			}
		}
		System.out.println(count);
	}

}
