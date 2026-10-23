package tester;
import java.util.Scanner;
public class Elephant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
        int steps = (input + 4) / 5; // Calculate the minimum steps needed
        
        System.out.println(steps);

	}

}
