package tester;
import java.util.Scanner;
public class Magnets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int []oo = new int[n];
		int g = 1;
		for(int i=0 ; i<n ; i++) {
			oo[i] = sc.nextInt(); 
			if(i > 0 && oo[i]!= oo[i-1]) {
				g++;
			}
		}
		System.out.println(g);
	}

}
