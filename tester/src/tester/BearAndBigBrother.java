package tester;
import java.util.Scanner;
public class BearAndBigBrother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fn = sc.nextInt();
		int sn = sc.nextInt();
		int i = 0; 
		while(fn<=sn) {
			fn=fn*3;
			sn=sn*2;
			i++;

		}
		System.out.println(i);
	}

}
