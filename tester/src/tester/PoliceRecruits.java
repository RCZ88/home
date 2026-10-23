package tester;

import java.util.Scanner;

public class PoliceRecruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int policeCount = 0;
		int untreated = 0;
		for(int i = 0; i<n; i++) {
			int c = sc.nextInt();
			if(c<0) {
				if(policeCount == 0) {
					untreated++;
				}else {
					policeCount--;
				}
			}else {
				policeCount+=c;
			}
		}
		System.out.println(untreated);
	}

}
