package tester;
import java.util.Scanner;
public class Multiplyby2divideby6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int [] n = new int[t];
		int s = 0;
		for(int i = 0; i<t; i++) {
			n[i] = sc.nextInt();
		}
		for(int i = 0; i<t; i++) {
			s=0;
				while(n[i]>1) {
					if(n[i]%6 == 0) {
						n[i]=n[i]/6;
					}else {
						n[i]= n[i]*2;
					}
					s++;
				}
			System.out.println(s);
		}
		
	}

}
