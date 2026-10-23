package tester;
import java.util.Scanner;

public class GeorgeandAccommodation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nor = sc.nextInt();
		int ar = 0;
		for(int i = 0; i< nor; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			if(q-p >= 2) {
				ar++;
			}
		}
		System.out.println(ar);
	}
}
