package tester;
import java.util.Scanner;
public class ToMyCritics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String [] yon = new String[t];
		
		for(int i =0; i<t ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a+b >= 10|| b+c >= 10|| c+a>= 10) {
				yon[i] = "YES";
			}else {
				yon[i] = "NO";
			}
		}
		for(int i = 0; i<t; i++) {
			System.out.println(yon[i]);
		}
	}

}
