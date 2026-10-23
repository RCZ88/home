package tester;
import java.util.*;
public class AddOddSubEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int []ans = new int [t];
		for(int i =0; i<t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int dif = Math.abs(a-b);
				if(dif == 0) {
					ans[i] = 0;
				}else if(a<b) {
					if(dif % 2 == 0) {
						ans[i] = 2;
					}else {
						ans[i] = 1;
					}
				}else {
					if(dif % 2 == 0) {
						ans[i] = 1;
					}else {
						ans[i] = 2;
					}
				}
		}
		for(int i = 0; i<t; i++ ) {
			System.out.println(ans[i]);
		}
	}

}
