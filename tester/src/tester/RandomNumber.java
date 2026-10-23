package tester;
import java.util.Random;
import java.util.Scanner;
public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int ub = sc.nextInt();
		int [] al = new int[30];
		for(int i = 0; i<al.length; i++) {
			al[i]= r.nextInt(ub);
		}
		for(int i = 0; i<al.length; i++) {
			System.out.print(al[i]+ " ");
		}
	}

}
