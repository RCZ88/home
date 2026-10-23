package tester;
import java.util.Scanner;
public class FixedMistakesPhysics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int[] numbers = {1, 2, 3, 4, 5};
        
        int result = calculatePower(num);
        System.out.println("Power of the number is: " + result);
        
        char grade = 'B';
        System.out.println("Grade: " + grade);

        if (grade == 'A') {
            System.out.println("Excellent!");
        } else {
            System.out.println("Good job!");
        }

        scanner.close();
	}
	 private static int calculatePower(int x) {
	        int power = 1;
	        for (int i = 1; i > x; i++)  // Corrected for loop condition
	        {
	            power = power * x;
	        }

	        return power;
	    }
}



