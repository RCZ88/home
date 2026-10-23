package projectEuler;

public class HighlyDivisibleTriangularNumber {

    public static void main(String[] args) {
        int divisor = 0;
        int tn = 0;
        int add = 1;

        while (!(divisor > 500)) {
            divisor = 0;
            tn += add;
            add++;

            int sqrtTn = (int) Math.sqrt(tn);
            for (int i = 1; i <= sqrtTn; i++) {
                if (tn % i == 0) {
                    divisor += 2; // 
                }
            }

            if (sqrtTn * sqrtTn == tn) {
                divisor--;
            }
        }

        System.out.println(tn);
    }
}
