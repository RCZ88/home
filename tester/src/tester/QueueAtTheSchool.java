package tester;
import java.util.Scanner;
public class QueueAtTheSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int t = sc.nextInt();
		String bg = sc.nextLine();
		
		String [] l = new String[a];
		int i = 0; 
		int j = 0;
		
		for(i = 0; i<a; i++) {
			for(j = 0; i<t; j++) {
				if(l[i]== "B"&&l[i-1] == "G") {
					l[i] = "G";
					l[i+1] = "B";
				}
			}
		}
		for(i = 0; i<a; i++) {
			System.out.print(l[i]);
		}
		
	}

}
