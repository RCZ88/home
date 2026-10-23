package tester;
import java.util.Scanner;
public class YoungPhysicist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] x = new int [n];
		int [] y = new int [n];
		int [] z = new int [n];
		
		
		for(int i = 0; i<n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			z[i] = sc.nextInt();
		}
		
		int xt = 0;
		int yt = 0;
		int zt = 0;
		
		for(int i = 0; i<n; i++) {
			xt += x[i];
			yt += y[i];
			zt += z[i];
		}
		
		if(xt == 0 && yt == 0 && zt == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
