package tester;
import java.util.Scanner;
public class LoveStory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		char [] cfs = {'c','o','d','e','f','o','r','c','e','s'};
		int d = 0;
		for(int i= 0; i<t; i++) {
			String s = sc.next();
			d=0;
			for(int j = 0; j<cfs.length; j++) {
				if(!(s.charAt(j)==cfs[j])) {
					d++;
				}
			}
			System.out.println(d);
		}
	}

}
