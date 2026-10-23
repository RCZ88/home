package tester;
import java.util.Scanner;

public class antonAndPolyhedrons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("How many shapes to you want to combine? ");
		int nos = s.nextInt();
		System.out.println("Great now input "+ nos + " shapes!");
		int side = 0;
		for(int i = 0; i<nos+1; i++) {
		String ph = s.nextLine();
			if(ph.equals("Tetrahedron")) {
				side +=4;
			}
			if(ph.equals("Cube")) {
				side += 6;
			}
			if(ph.equals("Octahedron")) {
				side += 8;
			}
			if(ph.equals("Dodecahedron")) {
				side +=12;
			}
			if(ph.equals("Icosahedron")) {
				side +=20;
			}
			
		}	
		System.out.println(side);
	}

}
