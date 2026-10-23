package oop;
import java.util.Scanner;
public class HeronMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Heron john = new Heron("John",2,"+62 8265 2373","rumah Raynard");
		Heron sam = new Heron("Sam", 0, "+1 5263 9231", "rumah REINHARD");
		john.printNameRoll();
		sam.printNameRoll();
		
		System.out.println("\n");
		boolean cont = true;
		while(cont) {
			System.out.print("Input value of A: ");
			int al = sc.nextInt();
			System.out.print("Input value of B: ");
			int bl = sc.nextInt();
			System.out.print("Input value of C: ");
			int cl = sc.nextInt();
			Heron Triangle = new Heron(al,bl,cl);
			System.out.println("\nArea of Triangle: "+Triangle.getArea());
			System.out.println("Continue?(y or n): ");
			String c = sc.next();
			if(c.equals("y")) {
				cont = true;
			}else {
				cont = false;
			}
		}
		
		Heron recA = new Heron(4,5);
		Heron recB = new Heron(5,8);
		recA.printRec();
		recB.printRec();
		
		boolean contRec = true;
		while(contRec) {
			System.out.println("Input Length of Rectangle: ");
			int lr = sc.nextInt();
			System.out.println("input Breadth of Rectangle: ");
			int br = sc.nextInt();
			Heron rec = new Heron(lr,br);
			rec.printRec();
			System.out.println("Continue?(y or n): ");
			String c = sc.next();
			if(c.equals("y")) {
				contRec = true;
			}else {
				contRec = false;
			}
		}
		
		
	}

}
