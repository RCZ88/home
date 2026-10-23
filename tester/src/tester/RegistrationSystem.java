package tester;
import java.util.Scanner;

public class RegistrationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] input = new String[n];
		int i = 0;
		int j =0;
		for( i = 0 ; i<n+1;i++) {
			input[i] = sc.nextLine();

		}
		for ( i = 0; i < n; i++) {
			for( i = 0; i < n; i++) {
				String f = input[j];
				if(!input[i].equals(f)) {
					System.out.println("OK");
				}else {
					System.out.println(input[i]+j); 
				}
			}
		
			j++;
		}
	
	}
}
