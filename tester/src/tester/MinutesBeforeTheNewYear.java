package tester;
import java.util.Scanner;
public class MinutesBeforeTheNewYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
			int h = sc.nextInt();
			int m = sc.nextInt();
			int total = ((23-h)*60)+(60-m);
			System.out.println(total);
		}
	}

}
