package oop;

public class JavaConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human1 = new Human("Clement", 165, 42.54, 15); //java constructor
		Human human2 = new Human("Edward", 130, 26.2, 11);
		System.out.println(human1.age);
		System.out.println(human2.height);
		human1.drink();
		human2.eat();
		System.out.println(human1);//the same
		System.out.println(human1.toString());
	}

}
