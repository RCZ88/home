package tester;
import java.util.Scanner;
public class FollowingDirection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int t = sc.nextInt();
		boolean candy = false;
		for(int i = 0; i<t; i++) {
			candy = false;
			x=0;
			y=0;
			int n = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();
			for(int j = 0; j<n; j++) {
				if(s.charAt(j)=='U') {
					y++;
				}else if(s.charAt(j)=='D') {
					y--;
				}else if(s.charAt(j)=='R') {
					x++;
				}else if(s.charAt(j)=='L') {
					x--;
				}
				if(x == 1 && y == 1) {
					candy = true;
				}
			}
			if(candy) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
