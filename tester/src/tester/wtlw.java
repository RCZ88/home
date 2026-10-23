package tester;
import java.util.Scanner;
public class wtlw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String [] cw = new String[3];
		for(int i =0; i<t; i++) {
			String w = sc.next();
			if(w.length()>10) {
				int n = w.length()-2;
				String firstLetter = String.valueOf(w.charAt(0));
				String lastLetter = String.valueOf(w.charAt(w.length()-1));
				System.out.println(firstLetter+n+lastLetter);
			}else {
				System.out.println(w);
			}
		}
	}	

}
