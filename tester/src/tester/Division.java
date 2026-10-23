package tester;
import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i = 0;
		int []r = new int[t];
		for(i = 0; i<t; i++) {
			r[i] = sc.nextInt();
		}
		for(i = 0; i<t; i++) {
			if(r[i]>=1900) {
				System.out.println("Division 1");
			}else if(r[i]<1900&&r[i]>=1600) {
				System.out.println("Division 2");
			}else if (r[i]<1600&&r[i]>=1400){
				System.out.println("Division 3");
			}else if(r[i]<1400) {
				System.out.println("Division 4");
			}
		}
	}

}
