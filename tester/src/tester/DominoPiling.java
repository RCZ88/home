package tester;
import java.util.Scanner;
public class DominoPiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int fn = scan.nextInt();
		int sn = scan.nextInt();
		
		double tile = fn*sn; 
		int output = (int) (tile/2);
		System.out.println(output);
	}

}
