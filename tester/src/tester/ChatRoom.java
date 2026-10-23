package tester;
import java.util.Scanner;

public class ChatRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ui = sc.next();
		String hello = "hello";
		int j = 0; 
		int c = 0;
		for(int i = 0; i < ui.length();i++) {
			if(ui.charAt(i)== hello.charAt(j)) {
				j++;
				if(j == hello.length()) {
					c++;
					j=0;
				}
			}
		}
		if(c>=1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
