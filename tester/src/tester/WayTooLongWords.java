package tester;
import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        sc.nextLine(); 

        String a = "";
        String[] c = new String[b];
        for (int i = 0; i < b; i++) {
            a = sc.nextLine();
            if (a.length() > 10) {
                char fl = a.charAt(0);
                char ll = a.charAt(a.length() - 1);
                int ml = a.length() - 2;
                c[i] = "" + fl + ml + ll;
            } else {
                c[i] = a;
            }
        }
        for (int j = 0; j < b; j++) {
            System.out.println(c[j]);
        }
    }
}