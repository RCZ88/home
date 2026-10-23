package tester;
import java.util.Scanner; 

public class YESorYES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		scan.nextLine();
		
		int i = 0; 
		String []YON = new String [number]; 
		for(i = 0; i<number; i++) {
			YON[i] = scan.nextLine().toLowerCase();
		}
		for(i = 0; i<number; i++) {
			if(YON[i].equals("yes")) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
