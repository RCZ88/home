package tester;
import java.util.Scanner;

public class WordonthePaper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            StringBuilder sb = new StringBuilder(); 
            for (int j = 0; j < 8; j++) {
            	String row = sc.next();
                for(int k = 0; k<8; k++) {
                	if(row.charAt(k)!='.') {
                		sb.append(row.charAt(k));
                	}
                }
            }

            System.out.println(sb); 
        }

        sc.close();
    }
}
