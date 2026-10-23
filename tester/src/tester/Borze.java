package tester;
import java.util.Scanner;
public class Borze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String b = sc.nextLine();
		int i = 0; 
		int r = 0;
		for(i = 0; i<b.length(); i++) {
			char c = b.charAt(i);
			if(c == '.'){
				System.out.print("0");
				r++;
			}else{
				if(c=='-'&&b.charAt(i+1) == '.') {
					System.out.print("1");
					i++;
				}else if(c=='-'&&b.charAt(i+1)== '-') {
					System.out.print("2");
					i++;
				}
			}	
		}
		
	}

}
