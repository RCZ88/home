package tester;
import java.util.Scanner;

public class ultraFastMathematician {
	public static void main(String[] args) {
		Scanner oo = new Scanner(System.in);
		String fni = oo.nextLine();
		String sni = oo.nextLine();
		int nl = fni.length();
		
		for(int i=0; i<nl; i++) {
			if(fni.charAt(i)!=sni.charAt(i)) {
				System.out.print("1");
			}else {
				System.out.print("0");
			}
		}
	}
}
