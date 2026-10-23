package tester;
import java.util.Scanner;
public class GameWithSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int o = 0; 
		if(n>m) {
			o = m;
		}else if(n<m) {
			o = n;
		}else {
			o = n;
		}
		if(o%2 == 0) {
			System.out.println("Malvika");
		}else{
			System.out.println("Akshat");
		}
	}

}
