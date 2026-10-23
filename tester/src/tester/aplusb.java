package tester;
import java.util.Scanner;
public class aplusb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		String [] ab = new String[t];
		for(int i = 0; i<t; i++) {
			ab[i] = sc.next();
		}
		for(int i = 0; i<t; i++) {
			int a = ab[i].charAt(0)-'0';
			int b = ab[i].charAt(2)-'0';
			int sum = a+b;
			System.out.println(sum);
		}
	}

}
