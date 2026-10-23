package oop;

public class Rectangle {
	private double length;
	private double height;
	
	public Rectangle(double l, double h) {
		length = l;
		height = h;
	}
	
	public double getArea() {
		return length*height;
	}
	public double getPerimeter() {
		return 2*(length+height);
	}
}
