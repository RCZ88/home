package tester;
import java.util.Scanner;
public class MishkaandGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0;
		int c = 0;
		for(int i = 0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a>b) {
				m++;
			}else if(b>a) {
				c++;
			}else {
				m++;
				c++;
			}
		}
		if(m>c) {
			System.out.println("Mishka");
		}else if(c>m) {
			System.out.println("Chris");
		}else {
			System.out.println("Friendship is magic!^^");
		}
	}

}
