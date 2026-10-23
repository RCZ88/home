package oop;

public class Human {
	
	String name;
	int height;
	double weight;
	int age;
	
	Human(String name, int height, double weight, int age){
		this.name = name;
		this.height = height; 
		this.weight = weight; 
		this.age = age;
	}
	void eat() {
		System.out.println(this.name+" is eating");
	}
	void drink() {
		System.out.println(this.name+" is drinking");
	}
	public String toString() {
		return name+"\n"+height+"\n"+weight;
	}

}
