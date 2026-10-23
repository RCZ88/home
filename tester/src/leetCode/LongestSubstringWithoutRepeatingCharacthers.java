package leetCode;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacthers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println(lengthOfLongestSubstring(a));
	}
	public static int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String>substrings = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            if(i>0){
                int j = i;
                while(s.charAt(j)!=s.charAt(j-1)){
                    sb.append(s.charAt(j));
                    j++;
                }
                substrings.add(sb.toString());
                sb.setLength(0);
            }else {
            	sb.append(s.charAt(i));
            }
        }
        String longestString = "";
        for(String u : substrings){
            if(s.length()>longestString.length()){
                longestString = s;
            }
        }
        return longestString.length();
    }
}
