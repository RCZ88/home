package tester;
import java.util.Scanner;
public class SpellCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
			int n = sc.nextInt();
			String s = sc.next();
			char[] c = new char[n];
			int Tn = 0;
			int in = 0;
			int mn = 0; 
			int un = 0;
			int rn = 0;
			boolean col = false;
			for(int j=  0; j<n; j++) {
				if(s.charAt(j) == 'T') {
					Tn++;
				}else if(s.charAt(j)=='i') {
					in++;
				}else if(s.charAt(j)=='m') {
					mn++;
				}else if(s.charAt(j)=='u') {
					un++;
				}else if(s.charAt(j)=='r') {
					rn++;
				}else {
					col = true;
				}
			}
			if(Tn == 1 && in == 1 && mn == 1 && un == 1 && rn == 1 && col == false) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
