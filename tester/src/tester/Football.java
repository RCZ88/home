package tester;
import java.util.Scanner;
public class Football {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String oo = sc.nextLine();
		int l = oo.length();
		
		int sn = 0; 
		
		boolean as = false;
		for(int i = 1; i<l; i++) {
			if(oo.charAt(i)== oo.charAt(i-1)) {
				sn++;
			}else {
				sn = 0;
			}
			if(sn >= 6) {
				as = true;
			}
		}
		if(as == true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
