package tester;
import java.util.Scanner;
public class Tram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mc = 0;
		int hn = 0;
		for( int i = 0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			mc -= a;
			mc +=b;
			if(mc>hn) {
				hn = mc;
			}
		}
		System.out.println(hn);
	}

}
