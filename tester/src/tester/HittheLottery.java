package tester;
import java.util.Scanner;

public class HittheLottery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 0;
        int r = n;

        while (r != 0) {
            if (r >= 100) {
                b += r / 100;
                r -= (r / 100) * 100;
            }
            if (r >= 20) {
                b += r / 20;
                r -= (r / 20) * 20;
            }
            if (r >= 10) {
                b += r / 10;
                r -= (r / 10) * 10;
            }
            if (r >= 5) {
                b += r / 5;
                r -= (r / 5) * 5;
            }
            if (r < 5) {
                b += r;
                r = 0;
            }
        }
        System.out.println(b);
    }
}
