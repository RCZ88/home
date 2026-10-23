package tester;
import java.util.Scanner;
public class squreDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    String ts = String.valueOf(t);
	    int [] sq = new int [ts.length()];
	    for(int i = 0; i<ts.length(); i++){
	    	int c =  Character.getNumericValue(ts.charAt(i));
	    	int p = c*c;
	    	System.out.print(p);
	    }
	}
}
