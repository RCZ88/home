package tester;
import java.util.Scanner;
public class luckyDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lns = new Scanner(System.in);
		int lnc = lns.nextInt();
		if (containsOnly47(lnc)||lnc%7==0||lnc%4==0) {
			System.out.print("YES");
		}else {
			System.out.println("NO");
		}
			
	}
	public static boolean containsOnly47(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit != 4 && digit != 7) {
                return false;
            }
            number /= 10;
        }
        
        return true;
    }
}


