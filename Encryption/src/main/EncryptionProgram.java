package main;

import java.util.*;

public class EncryptionProgram {
	private Scanner scanner;
	private Random random;
	private ArrayList <Character> list;
	private ArrayList <Character> shuffledList;
	private char characther;
	private String line;
	private char[] letters;
	private char[] secretLetters;
	
	EncryptionProgram(){
		scanner = new Scanner(System.in);
		random = new Random();
		list = new ArrayList<Character>();
		shuffledList = new ArrayList<Character>();
		characther = ' ';
		
		newKey();
		askQuestion();
	}
	private void askQuestion() {
		while(true) {
			System.out.println("\n************************************************");
			System.out.println("What do you want to do?");
			System.out.println("(N)ewKey, (G)etKey, (S)etShuffle, (E)ncrypt, (D)ecrypt, (Q)uit");
			char response = Character.toUpperCase(scanner.nextLine().charAt(0));
			switch(response) {
			case 'N': 
				newKey();
				break;
			case 'G': 
				getKey();
				break;
			case 'S':
				setShuffle();
				break;
			case 'E':
				encrypt();
				break;
			case 'D':
				decrypt();
				break;
			case 'Q':
				quit();
				break;
			default:
				System.out.println("Invalid Input");
					
			}
		}
	}
	private void newKey() {
		
		characther = ' ';
		list.clear();
		shuffledList.clear();
		
		for(int i = 32; i<127; i++) {
			list.add(Character.valueOf(characther));
			characther++;
		}
		
		shuffledList = new ArrayList(list);
		Collections.shuffle(shuffledList);
		System.out.println("A new key has been generated!");
		
	}
	private void getKey() {
		System.out.println("Key: ");
		for(Character x: list) {
			System.out.print(x);
		}
		System.out.println("");
		for(Character x: shuffledList) {
			System.out.print(x);
		}
		System.out.println("");
	}
	private void encrypt() {
		System.out.println("Enter a message to be encrypted: ");
		String message = scanner.nextLine();
		
		letters = message.toCharArray();
		
		for(int i = 0; i<letters.length; i++) {
			for(int j = 0; j<list.size(); j++) {
				if(letters[i] == list.get(j)) {
					letters[i] = shuffledList.get(j);
					break;
				}
			}
		}
		System.out.println("Encrypted: ");
		for(int i = 0; i<letters.length; i++) {
			System.out.print(letters[i]);
		}
	}
	private void decrypt() {
		System.out.println("Enter a message to be decrypted: ");
		String message = scanner.nextLine();
		
		letters = message.toCharArray();
		
		for(int i = 0; i<letters.length; i++) {
			for(int j = 0; j<shuffledList.size(); j++) {
				if(letters[i] == shuffledList.get(j)) {
					letters[i] = list.get(j);
					break;
				}
			}
		}
		System.out.println("Dencrypted: ");
		for(int i = 0; i<letters.length; i++) {
			System.out.print(letters[i]);
		}
	}
	private void setShuffle() {
		System.out.println("Enter a shuffle Code: ");
		String shuffleCode = scanner.nextLine();
		if(validShuffle(shuffleCode)) {
			shuffledList.clear();
			for(int i = 0; i<shuffleCode.length(); i++) {
				shuffledList.add(shuffleCode.charAt(i));
			}
			System.out.println("Shuffle code successfullly Applied!");
		}else {
			System.out.println("Invalid Shuffle");
		}
	}
	public boolean validShuffle(String shuffle) {
		if(shuffle.length() != 95) {
			return false;
		}else {
			ArrayList<Character>unuiqeChar = new ArrayList<Character>();
			ArrayList<Character> sChar = new ArrayList<Character>();
			for(int i = 0; i<shuffle.length(); i++) {
				sChar.add(shuffle.charAt(i));
			}
			for(char characther : sChar) {
				if(!(unuiqeChar.contains(characther))) {
					unuiqeChar.add(characther);
				}else {
					return false;
				}
			}
			for(int i = 0; i<unuiqeChar.size(); i++) {
				boolean charFound = false;
				for(char list: list) {
					if(unuiqeChar.get(i) == list) {
						charFound = true;
					}
				}
				if(!(charFound)) {
					return false;
				}
			}
			return true;
		}
	}
	private void quit() {
		System.out.println("Thank You for using ENCRYPTIONPROGRAM!");
		System.exit(0);
	}
}
