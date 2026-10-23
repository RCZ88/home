package tester;
import java.util.Scanner;
public class AntonAndDanik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String AD = sc.nextLine();
		
		int as = 0;
		int ds = 0;
		for(int i = 0; i<n; i++) {
			if(AD.charAt(i) =='A') {
				as++;
			}else if(AD.charAt(i) == 'D') {
				ds++;
			}
		}
		if(as>ds) {
			System.out.println("Anton");
		}else if(ds>as) {
			System.out.println("Danik");
		}else {
			System.out.println("Friendship");
		}
	}

}
