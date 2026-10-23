package tester;
import java.util.Scanner;
public class CalculatingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long total = 0; 
			if(num%2 == 0 ) {
				total = num/2;

			}else {
				total = (-1)*(num/2+1);
			}
			System.out.println(total);
	}

}
