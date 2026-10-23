package tester;
import java.util.Scanner;
public class RoundDownThePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
			String m = sc.next();
			int l = m.length()-1;
			int pot = (int)Math.pow(10, l);
			int p = Integer.parseInt(m) - pot;
			System.out.println(p);
		}
	}

}
