package tester;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int amount = sc.nextInt();
		String [] yon = new String [amount];
		for(int i = 0; i < amount; i++) {
			int fn = sc.nextInt();
			int sn = sc.nextInt();
			int tn = sc.nextInt();
			if(fn+sn == tn || sn+tn == fn || fn+tn == sn) {
				yon[i]= "YES";
			}else {
				yon[i] = "NO";
			}
		}
		for(int j = 0; j < amount; j++) {
			System.out.println(yon[j]);
		}

	}

}
