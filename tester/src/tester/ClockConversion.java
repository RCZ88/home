package tester;

import java.util.Scanner;

public class ClockConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine(); // Consume the newline after the integer input
		for (int i = 0; i < n; i++) {
			String time = sc.nextLine();
			String hour = time.substring(0, 2);
			String minute = time.substring(3, 5);
			int h = Integer.parseInt(hour);
			String period = "AM";
			
			if (h == 0) {
				h = 12; // Midnight case
			} else if (h == 12) {
				period = "PM"; // Noon case
			} else if (h > 12) {
				h -= 12;
				period = "PM";
			}
			
			if (h < 10) {
				System.out.print("0");
			}
			System.out.println(h + ":" + minute + " " + period);
		}
		sc.close(); // Close the scanner to prevent resource leak
	}
}
