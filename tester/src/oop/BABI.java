package oop;

public class BABI {
	int age;
	int weight;
	String color;
	String name;
	BABI(int babiAge, int babiWeight, String babiColor, String babiName){
		age = babiAge;
		weight = babiWeight;
		color = babiColor;
		name = babiName;
	}
	void mati (){
		System.out.println(name + " MATI with the weight of "+ weight +" tons.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BABI myBabi = new BABI (5, 290, "BLACK", "REINHARD");
			BABI yourBabi = new BABI(6,239, "WHITE", "Raynard" );
			yourBabi.mati();
	}

}
