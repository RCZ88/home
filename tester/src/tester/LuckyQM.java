package tester;
import java.util.Scanner;
public class LuckyQM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        sc.nextLine(); 

	        String[] t = new String[n];
	        String[] yon = new String[n];
	        int i = 0;
	        int j = 0;
	        int tt = 0;
	        int st = 0; 

	        for (i = 0; i < n; i++) {
	            t[i] = sc.nextLine();
	        }

	        for (i = 0; i < n; i++) {
	            tt = 0;
	            st = 0;

	            for (j = 0; j < 3; j++) {
	                char ftn = t[i].charAt(j);
	                tt = tt + (int) ftn;
	            }
	            for (j = 3; j < 6; j++) {
	                char fsn = t[i].charAt(j);
	                st = st + (int) fsn;
	            }
	            if (tt == st) {
	                yon[i] = "YES";
	            } else {
	                yon[i] = "NO";
	            }
	        }

	        for (i = 0; i < n; i++) {
	            System.out.println(yon[i]);
	        }
		
	}

}
