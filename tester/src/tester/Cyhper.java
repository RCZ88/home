package tester;
import java.util.Scanner;
public class Cyhper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
			int n = sc.nextInt();
			int [] lock = new int[n];
			for(int j = 0; j<n; j++) {
				lock[j] = sc.nextInt();
			}
			for(int j = 0; j<n; j++) {
				int mn = sc.nextInt();
				String m = sc.next();
				for(int k = 0; k<mn; k++) {
					if(m.charAt(k)== 'D') {
						lock[j] = (lock[j]+1)%10;
					}else {
						lock[j] = (lock[j]-1+10)%10;
					}
				}
			}
			for(int j = 0; j<n; j++) {
				System.out.print(lock[j]+" ");
			}
			System.out.println();
		}
	}

}
