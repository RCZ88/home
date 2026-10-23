package tester;
import java.util.Scanner;
public class CombinationLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = sc.next();
		String b = sc.next();
		int total = 0;
		for(int  i= 0; i<n; i++) {
			int ma = Math.abs(Integer.valueOf(a.charAt(i)-b.charAt(i)));
			int mb = 10-ma;
			total+= Math.min(ma, mb);
		}
		System.out.println(total);
	}

}
