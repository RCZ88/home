package tester;
import java.util.Scanner;
public class DominoDisaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
			int n = sc.nextInt();
			String s = sc.next();
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j<n; j++) {
				if(s.charAt(j) == 'U') {
					sb.append("D");
				}else if(s.charAt(j) == 'D'){
					sb.append("U");
				}else {
					sb.append(s.charAt(j));
				}
			}
			System.out.println(sb);
		}
	}

}
