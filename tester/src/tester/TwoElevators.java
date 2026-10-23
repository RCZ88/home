package tester;
import java.util.Scanner;
public class TwoElevators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int fe = a-1;
			int se = 0;
			int min = 0;
			if(b>c) {
				se = b-1;
			}else if(b<c) {
				se = ((c-b)*2)+(b-1);
			}
			
			if(fe<se) {
				min = 1;
			}else if(fe>se) {
				min = 2;
			}else {
				min = 3;
			}
			System.out.println(min);
		}
	}

}
