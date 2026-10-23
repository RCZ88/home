package oop;

public class Heron {
	private String name;
	private int roll_no;
	private String phonenumber;
	private String adress;
	
	private int a;
	private int b;
	private int c;
	
	private int length;
	private int breadth;
	
	Heron(String name, int roll_no, String phonenumber, String adress){
		this.name = name;
		this.roll_no = roll_no;
		this.phonenumber = phonenumber;
		this.adress = adress;
	}
	Heron(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	Heron(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return roll_no;
	}
	public String getPhoneno() {
		return phonenumber;
	}
	public String getAdress() {
		return adress;
	}
	
	public int a() {
		return  a;
	}
	public int b() {
		return b;
	}
	public int c() {
		return c;
	}
	
	public int legnth() {
		return length;
	}
	public int breadth() {
		return breadth;
	}
	
	
	void printNameRoll() {
		System.out.println("\nName: "+name+"\nRoll Number: "+roll_no + "\nPhone Number: "+ phonenumber+"\nAdress: "+ adress);
	}
	
	public double getArea() {
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
	
	public double recArea() {
		double areaRec = length*breadth;
		return areaRec;
	}
	void printRec() {
		System.out.println("\nLegth: "+ length +"\nBreadth: "+ breadth + "\nRectange Area: "+ breadth*length);
	}
}
