package projectEuler;

public class SpecialPythagoreanTriplet {

    public static void main(String[] args) {
        for (int a = 1; a < 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                int c = 1000 - a - b;
                if (c > 0 && a * a + b * b == c * c) {
                    System.out.println("a: " + a + ", b: " + b + ", c: " + c);
                    System.out.println("Product abc: " + (a * b * c));
                    return;
                }
            }
        }
    }
}
