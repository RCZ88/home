package tester;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class MMM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		
		ArrayList<Double>nums = new ArrayList<>();
		System.out.println("Data: ");
		while(true) {
			String number = sc.next();
			try{
				nums.add(Double.parseDouble(number));
			}catch(Exception e){
				break;
			}
		}
		double [] arr = new double[nums.size()];
		for(int i = 0; i<nums.size(); i++) {
			arr[i] = nums.get(i);
		}
		Arrays.sort(arr);
		double range = getRange(arr);
		double mean = getMean(arr);
		double median = getMedian(arr);
		double mode = getMode(arr);
		System.out.println("Range: "+range+ "\nMean: "+mean+ "\nMedian: "+median+"\nMode: "+mode);
		
	}
	private static double getRange(double[] arr ) {
		double range = arr[arr.length-1]-arr[0];
		return range;
	}
	private static double getMean(double[]arr) {
		double sum = 0;
		for(double i: arr) {
			sum+=i;
		}
		double mean = sum/arr.length;
		return mean;
	}
	private static double getMedian(double [] arr) {
		double median = 0;
		if(arr.length%2 == 0) {
			median = (arr[arr.length/2-1]+arr[arr.length/2])/2.0;
		}else {
			median = arr[(arr.length+1)/2-1];
		}
		return median;
	}
	private static double getMode(double[]arr) {
		double currentNumber = arr[0];
		int count = 1;
		int maxCount = 1;
		double mode = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]==currentNumber) {
				count++;
			}else {
				if(count>maxCount) {
					maxCount = count;
					mode = currentNumber;
				}
				count = 1;
				currentNumber = arr[i];
			}
		}
		if(count>maxCount) {
			mode = currentNumber;
		}
		return mode;
	}
}
