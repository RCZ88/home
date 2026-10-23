package oop;
import java.util.Scanner;
public class OPPsp1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Amount of Dogs: ");
		int dogAmount = sc.nextInt();
		OPPsp1 [] dogs = new OPPsp1 [dogAmount];
		
		 for (int i = 0; i < dogAmount; i++) {
	            System.out.println("Enter traits for dog " + (i + 1) + ":");
	            System.out.print("Name: ");
	            String name = sc.next();
	            System.out.print("Dog Breeds: ");
	            String dogBreeds = sc.next();
	            System.out.print("Age: ");
	            int age = sc.nextInt();
	            System.out.print("Color: ");
	            String color = sc.next();
	            System.out.print("Size: ");
	            int size = sc.nextInt();
	            System.out.print("Origin: ");
	            String origin = sc.next();

	            // Create a new OPPsp1 object and store it in the array
	            dogs[i] = new OPPsp1(dogBreeds, age, color, size, origin);
	        }
		 OPPsp1 [] getBrownArr = OPPsp1.getBrown(dogs);
		 System.out.println("\nDogs with Brown Color:");
		 if(getBrownArr != null) {
		        for (OPPsp1 getBrown : getBrownArr) {
		            System.out.println("Dog Breeds: " + getBrown.getDB());
		            System.out.println("Age: " + getBrown.getAge());
		            System.out.println("Color: " + getBrown.getColor());
		            System.out.println("Size: " + getBrown.getSize());
		            System.out.println("Origin: " + getBrown.origin());
		            System.out.println();
		        }
		 }else {
			System.out.println("No Brown Dog Found");
		 }
		 
	}

}
