package tester;
import java.util.Scanner;
public class Marathon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			for(int i = 0; i<t; i++) {
				int fot = 0;
				int a = sc.nextInt();
				int [] bcd = new int[3];
				for(int j = 0; j<3; j++) {
					bcd[j] = sc.nextInt();
					if(bcd[j]>a) {
						fot++;
					}
				}
				System.out.println(fot);
			}
	}

}
