package tester;
import java.util.Scanner;

public class Keyboard {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        // Read the direction of shifting ('L' or 'R')
        char direction = sc.next().charAt(0);

        // Read the sequence of characters written by Mole
        String sequence = sc.next();

        // Define the keyboard layout
        String k1 = "qwertyuiop";
        String k2 = "asdfghjkl;";
        String k3 = "zxcvbnm,./";

        String[] as = new String[sequence.length()];

        for (int i = 0; i < sequence.length(); i++) {
            char c = sequence.charAt(i);

            // Check if the character is in any of the keyboard rows
            boolean inK1 = k1.indexOf(c) != -1;
            boolean inK2 = k2.indexOf(c) != -1;
            boolean inK3 = k3.indexOf(c) != -1;

            if (inK1) {
                int ca = k1.indexOf(c); // location of input at k1
                if (direction == 'R') {
                    char a = (ca > 0) ? k1.charAt(ca - 1) : c;
                    as[i] = String.valueOf(a);
                } else {
                    char a = (ca < k1.length() - 1) ? k1.charAt(ca + 1) : c;
                    as[i] = String.valueOf(a);
                }
            } else if (inK2) {
                int ca = k2.indexOf(c); // location of input at k2
                if (direction == 'R') {
                    char a = (ca > 0) ? k2.charAt(ca - 1) : c;
                    as[i] = String.valueOf(a);
                } else {
                    char a = (ca < k2.length() - 1) ? k2.charAt(ca + 1) : c;
                    as[i] = String.valueOf(a);
                }
            } else if (inK3) {
                int ca = k3.indexOf(c); // location of input at k3
                if (direction == 'R') {
                    char a = (ca > 0) ? k3.charAt(ca - 1) : c;
                    as[i] = String.valueOf(a);
                } else {
                    char a = (ca < k3.length() - 1) ? k3.charAt(ca + 1) : c;
                    as[i] = String.valueOf(a);
                }
            } else {
                as[i] = String.valueOf(c);
            }
        }

        for (int i = 0; i < sequence.length(); i++) {
            System.out.print(as[i]);
        }
    }
}
