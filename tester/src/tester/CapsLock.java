package tester;
import java.util.Scanner;
public class CapsLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner ws = new Scanner(System.in);
      		String inp = ws.nextLine();
      		inp = inp.substring(0,1).toUpperCase() + inp.substring(1).toLowerCase();
      		System.out.println(inp);
	}

}
