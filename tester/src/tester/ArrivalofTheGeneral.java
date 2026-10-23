package tester;
import java.util.Scanner;
public class ArrivalofTheGeneral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] x = new int [n];
		int max = 0;
		int min = 999999999;
		int imax = 0;
		int imin = 0;
		for(int i = 0; i<n; i++) {
			x[i] = sc.nextInt();
			if(x[i]>max) {
				max = x[i];
				imax = i;
			}
			if(x[i]<=min) {
				min = x[i];
				imin = i; 
			}
		}
		imin = n-imin-1;
		System.out.println(imin);
		int total = imin+imax;
		System.out.println(total);
	}

}
