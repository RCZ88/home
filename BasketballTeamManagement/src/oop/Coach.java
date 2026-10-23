package oop;

public class Coach {
	private String name;
	private int age;
	private int yearsOfExperience;
	
	public Coach(String name, int age, int yearsOfExperience) {
		this.name = name;
		this.age = age;
		this.yearsOfExperience = yearsOfExperience;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public String printInfo() {
		return "Coach name:" + name + ", age=" + age + ", yearsOfExperience=" + yearsOfExperience;
	}
	
}
