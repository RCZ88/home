package tester;
import java.util.Scanner;

public class expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int fn = scan.nextInt();
		int sn = scan.nextInt();
		int tn = scan.nextInt();
		
		
		int fiC = (fn+sn)*tn;
		int seC = (tn+sn)*fn;
		int thC = (fn+tn)*sn;
		int foC = (fn*sn)+tn;
		int fifC = (fn*tn)+sn;
		int siC = (sn*tn)+fn;
		int sevC = sn*tn*fn; 
		int eiC = sn+tn+fn;
		
		
		int [] combinations = {fiC,seC,thC,foC,fifC,siC,sevC,eiC};
		
		int max  = combinations[0];
		
		for(int i = 0; i<combinations.length;i++) {
			if (combinations[i]>max) {
				 max = combinations[i];
			}
		}
		System.out.println(max);
	}

}
