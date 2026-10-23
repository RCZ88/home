package oop;

public class OPPsp1 {
	private String name;
	private String dogbreeds;
	private int age;
	private String color; 
	private int size;
	private String origin;
	
	OPPsp1(String dogbreeds, int age, String color, int size, String origin){
		this.name = name;
		this.dogbreeds = dogbreeds;
		this.age = age;
		this.color = color; 
		this.size = size;
		this.origin = origin;
	}
	public String name() {
		return name;
	}
	public String getDB(){
		return dogbreeds;
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return color; 
	}
	public int getSize() {
		return size;
	}
	public String origin() {
		return origin;
	}
	
	public static OPPsp1[] getBrown (OPPsp1[] dogArr) {
		int noBrownDog = 0;
		for(OPPsp1 dog: dogArr) { //for every dog in dog array:
			if(dog.getColor().equalsIgnoreCase("Brown")) {
				noBrownDog++;
			}
		}
		if(noBrownDog == 0) {
			return null;
		}
		OPPsp1 [] brownDogArr = new OPPsp1 [noBrownDog];
		int index = 0; 
		for(OPPsp1 dog: dogArr) {
			if(dog.getColor().equalsIgnoreCase("Brown")) {
				brownDogArr[index] = dog;
				index++;
			}
		}
		return brownDogArr;
		
	}
}
