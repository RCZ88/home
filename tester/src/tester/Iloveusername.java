package tester;
import java.util.Scanner;

public class Iloveusername {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int m = 0;
        int br = 0;
        int wr= 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (i > 0) {
                if (a[i] > br) {
                    br = a[i];
                    m++;
                } else if (a[i] < wr) {
                    wr = a[i];
                    m++;
                }
            } else {
                br = a[i];
                wr = a[i];
            }
        }

        System.out.println(m);
    }
}
