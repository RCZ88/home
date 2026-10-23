package tester;
import java.util.Scanner;
public class RaisingBacteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int op = 0; 
        while (num >= 2) {
            num = (int) Math.sqrt(num);
            op++;
        }
        System.out.println(op);
        

        sc.close();
	}	

}
