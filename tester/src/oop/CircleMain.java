package oop;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle(72, "BLUE");
		Circle circle2 = new Circle(12);
		Circle circle3 = new Circle();
		circle1.setColor("black");
		circle1.setRadius(circle1.getRadius()+ 5);
		System.out.println(circle1.toString());
		System.out.println(circle2.toString());
		System.out.println(circle3.toString());
	}

}
