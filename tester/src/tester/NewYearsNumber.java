package tester;
import java.util.Scanner;
public class NewYearsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int [] n = new int [t];
		int a = 0;
		int b = 0;
		String []c = new String[t];
		for(int i = 0; i<t; i++) {
			n[i] = sc.nextInt();
		}
		for(int i = 0; i<t; i++) {
			if(n[i]>=2020) {
				if(n[i]%2020 == 0||n[i]%2021 == 0) {
					c[i]="YES";
				}else {
					a = n[i]/2020;
					b = n[i]-(2020*a);
					if(b < a) {
						if(2020*a<n[i]) {
							c[i]="YES";
						}
					}else {
						c[i]="NO";
					}
				}
			}else {
				c[i]= "NO";
			}
		}
		for(int i = 0; i<t; i++) {
			System.out.println(c[i]);
		}
	}

}
