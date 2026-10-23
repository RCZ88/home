package oop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int loopAmount = sc.nextInt();
		for(int i = 0; i<loopAmount; i++) {
			long startTime = System.nanoTime();
			Rectangle rectangle = new Rectangle(5.0, 3.0);

	        double area = rectangle.getArea();
	        double perimeter = rectangle.getPerimeter();

	        System.out.println("Area of the rectangle: " + area);
	        System.out.println("Perimeter of the rectangle: " + perimeter);
	        long endTime = System.nanoTime();
	        long time = endTime-startTime;
	        System.out.println("Time Taken: " + time);
		}
	}

}
