package tester;
import java.util.Scanner;

public class IlyaandBankAccount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxWithoutLast = n / 10;
        int lastDigit = n % 10;
        int maxWithoutSecondLast = n / 100 * 10 + lastDigit;

        int result = Math.max(n, Math.max(maxWithoutLast, maxWithoutSecondLast));
        
        System.out.println(result);
    }
}





