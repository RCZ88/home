package tester;
import java.util.Scanner;

public class LuckyV2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String n = sc.next();
            int len = n.length();
            int a = 0;
            int b = 0;

            for (int j = 0; j < len / 2; j++) {
                a += Character.getNumericValue(n.charAt(j));
            }

            for (int j = len / 2; j < len; j++) {
                b += Character.getNumericValue(n.charAt(j));
            }

            if (a == b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
