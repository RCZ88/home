package tester;
import java.util.Scanner;
public class VasyatheHipster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		int d = 0;
		if(a!=0&& b>a) {
			c = a;
			d = b-a;
			if(d>=2) {
				d = d/2;
			}else {
				d=0;
			}
		}else if(b!=0 && a>b) {
			c = b;
			d = a-b;
			if(d>=2) {
				d=d/2;
			}else {
				d=0;
			}
		}else if (a!=0&&b!=0&& a==b) {
			c = a;
			d = 0;
		}
		System.out.print(c+" "+d);
	}

}
