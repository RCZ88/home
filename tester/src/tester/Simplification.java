package tester;
import java.util.Scanner;

public class Simplification {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter numerator:");
        int a = sc.nextInt();
        
        System.out.println("Enter denominator:");
        int b = sc.nextInt();
        int ans = 0;
        int k = 0;
        
        int max = 0;

        for (int i = 1; i <= a && i <= b; ++i) {
            if (a % i == 0 && b % i == 0) {
                max = i;
            }
        }

        a = a / max;
        b = b / max;
        
        if(a>b) {
        	ans = a/b;
			k = a-(ans*b);
			System.out.println("Simplified Fraction: "+ ans+" "+k+"/"+b);
        }else {
        	System.out.println("Simplified Fraction: " + a + "/" + b);
        }
        
    }
}

