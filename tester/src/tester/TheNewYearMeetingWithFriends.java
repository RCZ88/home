package tester;
import java.util.Arrays;
import java.util.Scanner;
public class TheNewYearMeetingWithFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] x = new int[3];
		for(int i = 0; i<3;i++) {
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);
		int sum = (x[1]-x[0])+(x[2]-x[1]);
		System.out.println(sum);
	}

}
