package tester;
import java.util.Scanner;

public class WhosOpposite {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int n = Math.abs(a - b) * 2; 

            if (c > n || a > n || b > n || c <= 0 || a <= 0 || b <= 0 || n % 2 != 0) {
                System.out.println(-1); 
            } else {
                int d = c + n / 2;
                if (d > n) {
                    d -= n;
                }
                System.out.println(d);
            }
        }
    }
}
