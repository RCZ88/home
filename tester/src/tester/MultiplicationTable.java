package tester;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int r = 0;
		if(x!=1) {
			for(int i = 1; i<=n; i++) {
				for(int j = 1; j<=n; j++) {
					int m = j*i;
					if(m == x) {
						r++;
					}
				}
			}
		}else {
			r = 1;
		}
		
		System.out.println(r);
	}

}
