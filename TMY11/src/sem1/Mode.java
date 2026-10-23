package sem1;

import java.util.ArrayList;
import java.util.Arrays;

public class Mode {
	static double[] get_mode(double[]array) {
		ArrayList<Double> mode = new ArrayList<>();
		double[]d = new double[array.length];
		for(int i = 0 ; i<array.length; i++) {
			d[i] = array[i];
		}
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
		int counter = 0;
		double max = Integer.MIN_VALUE;
		double n = d[0];
		for(int i = 1; i<d.length; i++) {
			if(d[i] == n) {
				counter++;
				if(counter > max) {
					max = counter;
				}
			}else {
				counter = 0;
			}
			n = d[i];
		}
		counter = 0;
		n = d[0];
		for(int i = 0; i<d.length; i++) {
			if(d[i] == n) {
				counter++;
			}else {
				counter = 0;
			}
			if(counter == max) {
				mode.add(d[i]);
			}
			n = d[i];
		}
		double[]a = new double[mode.size()];
		for(int i = 0; i<mode.size(); i++) {
			a[i] = mode.get(i);
		}
		return a;
	}
	public static void main(String[]args) {
		double[]array = {4 ,6, 7, 2, 7, 2, 8, 6, 9, 8, 7, 7, 8, 8};
		System.out.println(Arrays.toString(get_mode(array)));
	}
}
