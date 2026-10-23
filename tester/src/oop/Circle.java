package oop;

import java.lang.Math;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}
	Circle(double radius){
		this.radius = radius;
		this.color = "red";
	}
	Circle(){
		this.radius  = 1.0;
		this.color = "red";
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}	
	
	public static double getArea(double radius) {
		return Math.PI * radius * radius;
	}
	
	public String toString() {
		return "Cirlce[radius=" + radius + "color= " + color + "]";
	}
}
