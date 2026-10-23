package tester;
import java.util.Scanner;
public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0;
		int j = 0;
		for(k = 1; k<n; k++) {
			for(j = 1; j<n; j++) {
				if(k == j) {
					k++;
				}
			}
		}
		System.out.println(k);
	}

}
