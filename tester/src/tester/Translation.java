package tester;
import java.util.Scanner;
public class Translation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inp1 = sc.nextLine();
		String inp2 = sc.nextLine();
		char [] letters = new char[inp1.length()];
		for(int i = 0; i < inp1.length(); i++) {
			letters[i] = inp1.charAt(i);
		}
		int left = 0;
        int right = letters.length - 1;
        while (left < right) {
            char temp = letters[left];
            letters[left] = letters[right];
            letters[right] = temp;
            left++;
            right--;
        }
        
        String reversed = new String(letters);
        if (reversed.equals(inp2)) {
        	System.out.println("YES");
        }else {
        	System.out.println("NO");
        }
	}

}
