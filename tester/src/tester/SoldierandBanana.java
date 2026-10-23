package tester;
import java.util.Scanner;

public class SoldierandBanana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		
		int tc = 0;
		int brw = 0;
		for(int i = 1; i<w+1; i++) {
			tc += i*k;
		}
		if(tc>n) {
			brw = tc-n;
		}else {
			brw = 0; 
		}
		System.out.println(brw);
	}

}
