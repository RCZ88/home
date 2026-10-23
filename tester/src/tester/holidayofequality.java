package tester;
import java.util.Scanner; 

public class holidayofequality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int[] S = new int[n];
        int bn = 0;
        int m = 0;
        
        for (i = 0; i < n; i++) {
            S[i] = sc.nextInt();
            if (S[i] > bn) {
                bn = S[i];
            }
        }
        
        for (i = 0; i < n; i++) {
            if (S[i] < bn) {
                m += (bn - S[i]);
            }
        }
        
        System.out.println(m);
    }
}
