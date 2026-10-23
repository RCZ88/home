package projectEuler;

public class FibonacciNumbers {

    public static void main(String[] args) {
        int limit = 4000000;
        int fn = 1;
        int sn = 2;
        int total = 0;  // Initialize total to 0 to represent the sum of even terms

        while (sn <= limit) {
            if (sn % 2 == 0) {
                total += sn;  // Sum only even-valued terms
            }

            // Calculate the next Fibonacci term
            int nextTerm = fn + sn;
            fn = sn;
            sn = nextTerm;
        }

        System.out.println("Sum of even-valued terms in Fibonacci sequence below 4 million: " + total);
    }
}
