package tester;
import java.util.Scanner;

public class Elections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int z = Math.max(a, Math.max(b, c));
            int addedVotesA = 0;
            int addedVotesB = 0;
            int addedVotesC = 0;

            if (!(a == b && b == c)) {
                addedVotesA = (z > a) ? z - a + 1 : 0;
                addedVotesB = (z > b) ? z - b + 1 : 0;
                addedVotesC = (z > c) ? z - c + 1 : 0;
            } else {
                addedVotesA = 1;
                addedVotesB = 1;
                addedVotesC = 1;
            }

            System.out.println(addedVotesA + " " + addedVotesB + " " + addedVotesC);
        }

        sc.close();
    }
}
