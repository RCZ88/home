package tester;
import java.util.Scanner; 

public class HelpfullMaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			char one = '1';
			char two = '2';
			char three = '3'; 
			
			int noo = 0;
			int not = 0;
			int noth = 0;
			
			int i = 0;
			for(i = 0; i<input.length(); i++) {
				char loc = input.charAt(i);
				if(loc == one) {
					noo++;
				}
				if(loc == two) {
					not++;
				}
				if(loc == three) {
					noth++;
				}
			}
			for (i = 0; i<noo; i++ ) {
				if(noo == 2 && not == 0 && noth == 0){
					if((i== noo-1)) {
						System.out.print("1");
					}else {
						System.out.print("1+");
					} 
				}else if( (i == noo-1 && noo == 0) || ( not == 0 && noth == 0)) {
					System.out.print("1");
				}else {
					System.out.print("1+");
				}
			}
			for ( i = 0; i<not; i++) {
				if(not == 2 && noo == 0 && noth == 0){
					if((i== not-1)) {
						System.out.print("2");
					}else {
						System.out.print("2+");
					} 
				}else if((i == not-1 && noth == 0)||(noo == 0 && noth == 0)) {
					System.out.print("2");
				}else {
					System.out.print("2+");
				}
			}
			for (i = 0; i<noth; i++) {
				if(noth == 2 && noo == 0 && not == 0){
					if((i== noth-1)) {
						System.out.print("3");
					}else {
						System.out.print("3+");
					} 
				}else if((i== noth-1)||(noo == 0 && not == 0 )) {
					System.out.print("3");
				}else {
					System.out.print("3+");
				}
			}
	}

}
