package tester;
import java.util.Scanner;

public class bitPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0; 
		for(int i =0; i<n+1;i++) {
			String bit = sc.nextLine();
			if (bit.equals("X++")||bit.equals("++X")) {
				x++;
			}else if(bit.equals("--X")||bit.equals("X--")) {
				x--;
			}
		}
		System.out.println(x);
	}

}
