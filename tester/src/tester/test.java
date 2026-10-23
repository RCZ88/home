package tester;


import java.util.Scanner; 

public class test {

	public static void main(String[] args) {
		
		car mycar = new car();
		mycar.headlightcolor = "black";
		mycar.numberofseats = 4; 
		
		System.out.println(mycar.headlightcolor + mycar.numberofseats);
		
		Dog myDog = new Dog();
		myDog.color = "red";
		myDog.eyes = "blue";
		Dog mysecondDog = new Dog();
		mysecondDog.color = "yellow";
		mysecondDog.eyes = "gray"; 
		
		System.out.println("my dog color is " + myDog.color);	

		Dog.dingdong();
		
		int var1 = 21;
		double var2 = 3.5; 
		
		double result = var1 * var2 - var1;
		
		System.out.println(result);
		
		String myName = "orgil"; 
		
		System.out.println(myName.toUpperCase());
		
		printNamenAge("kenzo" , 15); 
		
		
		Scanner Username =  new Scanner(System.in);
		System.out.println("Enter Username Here"); 
		String answer;
		answer = Username.nextLine();
		System.out.println("Welcome " +answer); 
		
		
		System.out.println("Enter password:");
		
		 Scanner sc = new Scanner(System.in); 
		 
		String cpass = "Clement08";
		
		var att = 0;
	
		while (true) {
			
			
		String pass = sc.next();
		if(pass.equals(cpass)) {
			System.out.println("access granted!");
			break;
		}else if(att == 2) {
				System.out.println("Too many attems! Try again later!");break;
				}
		 else { 
			System.out.println("access denied!"); 
			att += 1;
			}
		 
		}
		if(att < 3) {
		
		System.out.println("test!");
	}
		
		
}

	
		
		
	
	private static void printNamenAge(String name, int age) {
		System.out.println("My name is"+name+ ", age"+age);
		
	
		if (name.equals("Clement")) {
		System.out.println ("you are a smart!");
		}
	
		else {
			for (int i = 0; i < 3; i++) {System.out.println ("you are gay af");
			}	
	
		if(age == 14) {
			System.out.println ("ok");
		}
	
		else if(age>14) {
			System.out.println ("too old!");
		
		}

		else if (age<14) {
			System.out.println ("too young!");
		}
	  }
	}
	

}
