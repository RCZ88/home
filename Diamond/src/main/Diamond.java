package main;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int max = size*2+1;
		int amount = 1;
		for(int i = 0; i<max/2+1; i++) {
			for(int j = 0; j<(max-amount)/2; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<amount; j++) {
				System.out.print("*");
			}
			amount+=2;
			System.out.println();
		}
		amount = amount-4;
		for(int i = 0; i<max/2; i++) {
			for(int j = 0; j<(max-amount)/2; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<amount; j++) {
				System.out.print("*");
			}
			System.out.println();
			amount-=2;
		}
	}

}
