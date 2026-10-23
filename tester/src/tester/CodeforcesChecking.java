package tester;
import java.util.Scanner;
public class CodeforcesChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		String [] yon = new String [t];
		for(int i = 0; i<t ; i++) {
			String c = sc.next();
			if(c.equals("c")|| c.equals("o") || c.equals("d") || c.equals("e") 
					|| c.equals("f") || c.equals("r") || c.equals("s")) {
				yon[i] ="YES";
			}else {
				yon[i] = "NO";
			}
		}
		for(int i = 0; i<t ; i++) {
			System.out.println(yon[i]);
		}
	}

}
