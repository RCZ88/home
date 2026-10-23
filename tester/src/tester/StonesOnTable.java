	package tester;
	import java.util.Scanner;
	public class StonesOnTable {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc =  new Scanner(System.in);
			int n = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();
			int o = 0;
			
			for(int i = 1; i<n;i++) {
				if(s.charAt(i)== s.charAt(i-1)) {
					o++;
				}
			}
			System.out.println(o);
		}
	
	}
