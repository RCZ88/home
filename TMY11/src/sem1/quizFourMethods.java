package sem1;

import java.util.Arrays;
import java.util.Scanner;

public class quizFourMethods {
	static int countDataLessThan(int value, int[]data) {
		int count = 0;
		for(int temp: data) {
			if(temp < value) {
				count++;
			}
		}
		return count;
	}
	static double getPercentage(int n, int d) {
		return (double) n/d * 100;
	}
	static int getMax(int[]data) {
		int max = 0;
		for(int temp: data) {
			if(temp>max) {
				max = temp;
			}
		}
		return max;
	}
	static int getMin(int[]data) {
		int min = Integer.MAX_VALUE;
		for(int temp: data) {
			if(temp<min) {
				min = temp;
			}
		}
		return min;
	}
	static int getSum(int[]data) {
		int sum = 0;
		for(int temp: data) {
			sum+=temp;
		}
		return sum;
	}
	static double getAverage(int sum, int n) {
		return sum/n;
	}
	static void printArray(int[]data) {
		System.out.println("Temperatures: ");
		System.out.println(Arrays.toString(data));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i, nDays, nCold, nWarm;
		int[]temp;
		System.out.print("Number of Days: ");
		nDays = input.nextInt();
		temp = new int[nDays];
		for(i = 0; i<nDays; i++) {
			System.out.println("Temperature on Day " + (i+1) + ":");
			temp[i] = input.nextInt();
		}
		nCold = countDataLessThan(20, temp);
		nWarm = nDays-nCold;
		printArray(temp);
		System.out.println("Cold-Warm: " + nCold + "-" + nWarm);
		System.out.println("Cold Days Percentage = " + getPercentage(nCold, nDays) + "%");
		System.out.println("Warm Days Percentage = " + getPercentage(nWarm, nDays) + "%");
		System.out.println("Highest Temperature = " + getMax(temp));
		System.out.println("Lowest Temperature = " + getMin(temp));
		System.out.println("Average Temperature = " + getAverage(getSum(temp), nDays));
		
	}

}
