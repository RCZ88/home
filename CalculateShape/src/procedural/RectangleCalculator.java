package procedural;
public class RectangleCalculator {
    public static void main(String[] args) {
    	long startTime = System.nanoTime();
        double length = 5.0;
        double width = 3.0;

        double area = calculateArea(length, width);
        double perimeter = calculatePerimeter(length, width);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        long endTime = System.nanoTime();
        long time = endTime-startTime;
        System.out.println("Time Taken: " + time);
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}