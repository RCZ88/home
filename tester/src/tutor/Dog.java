package tutor;

public class Dog {
	private String name;
	private int age;
	private String type;
	
	Dog(String name, int age, String type){
		this.name = name;
		this.age = age;
		this.type = type;
	}
	public String toString() {
		return " Name: " + name + " Age: " + age + " Type: " + type;
	}
}
