package tester;
import java.util.*;
public class diceprobdivfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice1 = 1;
		int dice2 = 1;
		int dice3 = 1;
		int dice4 = 1;
		int dice5 = 1;
		int dice6 = 1;
		int sides = 6;
		int total = 0;
		int index = 0;
		int div = 0;
		ArrayList<String> codes = new ArrayList<>();
		codes.clear();
		System.out.println("Possible Combinations: ");
		while(index<=Math.pow(6, 6)) {
			String code = dice6 + " " + dice5 + " " + dice3 + " " + dice4 + " " + dice5 + " " + dice6;
			System.out.println(index + ". " + code);
			if(codes.contains(code)) {
				System.out.println("duplicate!");
			}
			codes.add(code);
			index++;
			total = dice1+dice2+dice3;
			if(dice1<sides) {
				dice1++;
			}else {
				dice1 = 1;
			}
			if(index % Math.pow(sides, 5) == 0) {
				dice6++;
			}else if(index % Math.pow(sides, 4) == 0) {
				if(dice5<6) {
					dice5++;
				}else {
					dice5 = 1;
				}
			}else if(index % Math.pow(sides, 3) == 0) {
				if(dice4<6) {
					dice4++;
				}else {
					dice4 = 1;
				}
			}else if(index % Math.pow(sides, 2) == 0) {
				if(dice3<6) {
					dice3++;
				}else {
					dice3 = 1;
				}
			}else if(index % Math.pow(sides, 1) == 0) {
				if(dice2<6) {
					dice2++;
				}else {
					dice2 = 1;
				}
			}
			if(total % 5 == 0) {
				div++;
			}
		}
		System.out.println("\nTotal sum that is divisible by 5: ");
		System.out.println(div);
	}

}
