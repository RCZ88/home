package tester;
import java.util.Scanner;


public class stringTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st = new Scanner(System.in);
		String word = st.nextLine();
		int i = 0;
		
		int wl = word.length();
		for( i=0; i<wl; i++)
		{
		    char c = word.toLowerCase().charAt(i);
		    if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y') {
		    	System.out.print(".");
		    	System.out.print(c);
		    	}
		     
			}
	
		}

	}


