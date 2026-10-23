public class No1 {

		public static void main(String[] args) {
			
			
			
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
			
		int x = 23; 
		 x = x+24; 
		 
		 System.out.println(x);
		
			
			
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
