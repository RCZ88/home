package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][]scoreTable = {{3,3,2,2,0}, 
							 {3,2,2,1,0}, 
							 {2,2,1,0,0}, 
							 {2,1,0,0,0}};
		System.out.println("Enter TOK Score: ");
		char TOK = (sc.next().toLowerCase()).charAt(0);
		System.out.println("Enter EE Score: ");
		char EE = (sc.next().toLowerCase()).charAt(0);
		System.out.println("Your IB Score: " + getScore(charToInt(TOK), charToInt(EE), scoreTable));
	}
	public static int getScore(int tok, int ee, int[][]table) {
		return table[ee][tok];
	}
	public static int charToInt(char grade) {
		char[]grades = {'a','b','c','d','e'};
		for(int i =0; i<grades.length; i++) {
			if(grades[i] == grade) {
				return i;
			}
		}
		return -1;
	}

}
