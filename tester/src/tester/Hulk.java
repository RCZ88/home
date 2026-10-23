package tester;
import java.util.Scanner;
public class Hulk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			if(i == n-1) {
				if(i%2 == 0) {
					System.out.print("I hate it");
				}else {
					System.out.print("I love it");
				}
			}else {
				
					if(i%2 == 0) {
						System.out.print("I hate that ");
					}else {
						System.out.print("I love that ");
					}
				
			}
		}
	}	

}
