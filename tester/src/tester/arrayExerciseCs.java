package tester;
import java.util.Scanner;

public class arrayExerciseCs {
	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		int[] NA = {3,7,54,23,42};
		int max  = NA[0];
		int min = NA[0]; 
		int i = 0; 
		for(i=0;i<NA.length;i++) {
			
			if(i==4) {
				System.out.println(NA[i]);
			}else {
				System.out.print(NA[i]+ ", ");
			}
		}
	
		double sumOfArray = 0;
		for( i = 0; i<NA.length;i++) {
			sumOfArray = sumOfArray+ NA[i];
		}
		System.out.println("sum: "+sumOfArray);
		double average = sumOfArray/NA.length;
		System.out.println("average: "+average);
		
		int inputIndex = scan.nextInt();
		int inputMinusOne = inputIndex-1;
		int index  = NA[inputMinusOne];
		System.out.println(index);
		System.out.println("reverse: ");
		
		for (i=4;i>=0;i--) {//num4//
			int reverse = NA[i];
			if(i==0) {
				System.out.println(reverse);
			}else {
				System.out.print(reverse+", ");
			}	
		}

		for(i=0;i<NA.length;i++) {//num5//
			if (NA[i]>max) {
				 max = NA[i];
			}
			if(NA[i]<min) {
				 min = NA[i];
			}
		}
		
		System.out.println("Smallest Number: "+min);
		System.out.println("Biggest Number: "+max);
		
		double[] Radio = {100.4 ,88.7,90.2,104.5,93.8,106.2};//num6//

		double maxr = Radio[0];
		double minr = Radio[0];
		
		for(i=1;i<Radio.length;i++) {
			if (Radio[i]>maxr) {
				 maxr = Radio[i];
			}
			if(Radio[i]<minr) {
				 minr =Radio[i];
			}
		}
	
		double range = maxr - minr;
		System.out.println("The Range of the radio is "+range);
	}
	
}
