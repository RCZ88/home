package tester;
import java.util.Scanner;

public class TheaterSquare {

    public static void main(String[] args) {
        Scanner tss = new Scanner(System.in);

        long fn = tss.nextLong();
        long sn = tss.nextLong();
        long tn = tss.nextLong();

        long hr = (fn + tn - 1) / tn;
        long vr = (sn + tn - 1) / tn;

        long fa = hr * vr;
        System.out.println(fa);
    }
}
