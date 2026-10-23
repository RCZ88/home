package tester;
import java.util.Scanner;
public class MediumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int [] m = new int [t];
		for(int i =0; i<t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a>b&&c>a||a>c&&b>a) {
				m[i]=a;
			}else if(b>a&&c>b || b>c&&a>b) {
				m[i]=b;
			}else if(c>a&&b>c || c>b&&a>c) {
				m[i]= c; 
			}
		}
		for(int i =0; i<t; i++) {
			System.out.println(m[i]);
		}
	}

}
