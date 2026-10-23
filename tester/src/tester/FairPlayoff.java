package tester;
import java.util.Scanner;
import java.util.Arrays;
public class FairPlayoff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int [] s = new int[4];
		int bn = 0;
		int sbn = 0;
		String [] yon = new String[t];
		for(int i = 0; i<t; i++) {
			for(int j = 0; j<4; j++) {
				s[j] = sc.nextInt();
			}
			
			int fo = 0;
			int ft = 0; 
			if(s[0]>s[1]) {
				fo = s[0];
			}else {
				fo = s[1];
			}
			if(s[2]>s[3]) {
				ft = s[2];
			}else {
				ft = s[3];
			}
			
			Arrays.sort(s);
			bn = s[3];
			sbn = s[2];
			if((fo == bn || fo == sbn)&&(ft == bn || ft == sbn)) {
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
