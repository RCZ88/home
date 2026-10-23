package tester;
import java.util.Scanner; 
public class H9Plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String p = sc.nextLine();
		if(p.contains("H")||p.contains("Q")||p.contains("9")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
