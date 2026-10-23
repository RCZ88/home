package tester;
import java.util.Scanner;

public class TestRemoveDigitFromNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // The original number
        int positionToRemove = sc.nextInt(); // The position of the digit to remove
        
        int updatedNumber = removeDigit(number, positionToRemove); // Call the function to remove the digit
        
        System.out.println("Original number: " + number);
        System.out.println("Updated number: " + updatedNumber);
    }
    
    // Function to remove a specific digit from an integer based on position
    public static int removeDigit(int num, int positionToRemove) {
        String numStr = Integer.toString(num);
        StringBuilder newNumStr = new StringBuilder();
        
        for (int i = 0; i < numStr.length(); i++) {
            if (i != positionToRemove - 1) {
                newNumStr.append(numStr.charAt(i));
            }
        }
        
        return Integer.parseInt(newNumStr.toString());
    }
}
