package tester;
import java.util.Scanner;
public class VustheCossackandaContest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m  = sc.nextInt();
		int k = sc.nextInt();
		if(m>=n && k>=n) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
