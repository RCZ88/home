package tester;
import java.util.Scanner;
public class WordCapitilization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String letter = "A";
		char fl = input.charAt(0);
		if (Character.isUpperCase(fl)) {
			System.out.println(input);
		}else {
			System.out.print(input.toUpperCase().charAt(0));
			for(int i = 1; i<input.length(); i++)
			System.out.print(input.charAt(i));
		}
	}

}
