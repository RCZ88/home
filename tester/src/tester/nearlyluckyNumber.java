package tester;
import java.util.Scanner;

public class nearlyluckyNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int aoln = 0; 
		for(int i = 0; i<n.length();i++) {
			if(n.charAt(i)== '7'||n.charAt(i)== '4') {
				aoln++;
			}
		}
		if(aoln == 7||aoln == 4) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
