package tester;
import java.util.Scanner;
import java.util.Arrays;

public class Increasing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] yn = new String[t];

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            boolean tof = true;  // Initialize to true

            if (a.length > 1) {
                Arrays.sort(a);

                for (int k = 0; k < n - 1; k++) {
                    if (a[k + 1] <= a[k]) {
                        tof = false;  // Set to false if the condition doesn't hold
                        break;  // Exit the loop early
                    }
                }

                if (tof) {
                    yn[i] = "YES";
                } else {
                    yn[i] = "NO";
                }
            } else if (a.length == 1) {
                yn[i] = "YES";
            }
        }

        for (String result : yn) {
            System.out.println(result);
        }
    }
}
