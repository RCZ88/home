package tester;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class BoyOrGirl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String bog = sc.nextLine();
		int dc = countDistinctCharacters(bog);
		if(dc%2 == 0) {
			System.out.println("CHAT WITH HER!");
		}else {
			System.out.println("IGNORE HIM!");
		}
		
	}
	 public static int countDistinctCharacters(String word) {
	        Set<Character> distinctChars = new HashSet<>();

	        for (int i = 0; i < word.length(); i++) {
	            char character = word.charAt(i);
	            distinctChars.add(character); // Add each character to the Set
	        }

	        return distinctChars.size(); // Return the size of the Set, which is the count of distinct characters
	    }

}
