package projectEuler;

public class CircularPrimes {

    public static void main(String[] args) {
        int n = 2;
        int nocp = 1;

        while (n <= 100) {
            n++;
            if (isPrime(n)) {
                if (isCircularPrime(n)) {
                    nocp++;
                }
            }
        }

        System.out.println(nocp);
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isCircularPrime(int n) {
        String sn = Integer.toString(n);

        for (int i = 0; i < sn.length(); i++) {
            if (!isPrime(Integer.parseInt(sn))) {
                return false;
            }
            sn = sn.substring(1) + sn.charAt(0);
        }

        return true;
    }

}
