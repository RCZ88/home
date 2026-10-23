package twoDarray;

import java.util.Random;
import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int start = sc.nextInt();
		int finish = sc.nextInt();
		
		int total = 0;
		
		int [][] array = new int[x][y];
		
		
		for(int k = 0; k<y-1; k++) {
			System.out.print("----");
		}
		System.out.println("----");
		
		for(int i = 0; i<x; i++) {
			for(int j = 0; j<y; j++) {
				array[i][j] = r.nextInt(finish) + start;
				total+= array[i][j];
				System.out.print(array[i][j]+" | ");
			}
			
			System.out.print("\n");	
			for(int k = 0; k<y-1; k++) {
				System.out.print("----");
			}
			System.out.println("----");
		}
		System.out.println("Average: " + total/(x*y));
		
	}

}
