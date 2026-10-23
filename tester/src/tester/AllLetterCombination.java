package tester;

import java.util.ArrayList;
import java.util.Scanner;

public class AllLetterCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		ArrayList<Character>characters = new ArrayList<>();
		int unuiqeChar = 0;
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(!(characters.contains(c))) {
				characters.add(c);
				unuiqeChar++;
			}
		}
	}

}
