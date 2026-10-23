package tester;
import java.util.Scanner;

public class SpyDetected {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] dn = new int[t]; 

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
 
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (a[j] != a[j + 1] && a[j] != a[j + 2]) {
                        dn[i] = j + 1; 
                        break;
                    }
                } else if (j == n - 1) {
                    if (a[j] != a[j - 1] && a[j] != a[j - 2]) {
                        dn[i] = j + 1; 
                        break;
                    }
                } else {
                    if (a[j] != a[j - 1] && a[j] != a[j + 1]) {
                    	dn[i] = j + 1; 
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < t; i++) {
            System.out.println(dn[i]);
        }
    }
}
