package tester;
import java.util.Scanner;

public class WrongSubstraction {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        while (k > 0) {
            if (n % 10 != 0) {
                n--; // Subtract 1 from n if the last digit is non-zero
            } else {
                n /= 10; // Divide n by 10 to remove the last digit
            }
            k--; // Decrement k
        }

        System.out.println(n); // Print the final result
    }
}

