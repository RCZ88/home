package oop;

public class RectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1 = new Rectangle(30, 55);
		String info = rec1.toString();
		System.out.println(info);
		double area = rec1.getArea();
		double perimeter = rec1.getPerimeter();
		System.out.println("Area: "+area+ " Perimeter"+perimeter);
	}

}
