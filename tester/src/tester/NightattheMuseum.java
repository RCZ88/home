package tester;
import java.util.Scanner;

public class NightattheMuseum {

    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         char[] az = "abcdefghijklmnopqrstuvwxyz".toCharArray();
         String s = sc.nextLine();
         int rotations = 0;
         char currentLetter = 'a';

         for (int i = 0; i < s.length(); i++) {
             char targetLetter = s.charAt(i);
             int clockwise = Math.abs(currentLetter - targetLetter);
             int counterclockwise = 26 - clockwise;
             rotations += Math.min(clockwise, counterclockwise);
             currentLetter = targetLetter;
         }

         System.out.println(rotations);
    }
}
