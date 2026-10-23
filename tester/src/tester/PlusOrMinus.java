package tester;
import java.util.*;
public class PlusOrMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		String [] pom = new String[t];
		for(int i = 0; i<t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a+b==c) {
				pom[i] = "+";
			}else {
				pom[i] = "-";
			}
		}
		for(int i = 0; i<t; i++) {
			System.out.println(pom[i]);
		}
	}

}
