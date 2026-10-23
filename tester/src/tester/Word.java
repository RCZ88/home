package tester;
import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int uc = 0;
		int lc = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isUpperCase(c)) {
				uc++;
			}else if(Character.isLowerCase(c)) {
				lc++;
			}
		}
		if(uc>lc) {
			System.out.println(s.toUpperCase());
		}else {
			System.out.println(s.toLowerCase());
		}
	}
}
