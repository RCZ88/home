package tester;
import java.util.Scanner;

public class paswdgpt {
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
				 Scanner scanner = new Scanner(System.in);
			        int n = scanner.nextInt();
			        int k = scanner.nextInt();
			        scanner.close();

			        StringBuilder password = new StringBuilder();

			        // Fill the password with distinct symbols
			        for (int i = 0; i < k; i++) {
			            char symbol = (char) ('a' + i);
			            password.append(symbol);
			        }

			        // Fill the rest of the password with the first symbol again
			        for (int i = k; i < n; i++) {
			            password.append(password.charAt(0));
			        }

			        System.out.println(password.toString());

	 }
}
