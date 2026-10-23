package tester;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {6,29,85,34,16,5,33,50,73,1};
		int half = arr.length/2;
		int leftsize = half;
		int rightsize = arr.length-half;
		int [] left = new int [leftsize];
		int [] right = new int [rightsize];
		for(int i = 0; i<leftsize; i++) {
			left[i] = arr[i];
		}
		for(int i = leftsize; i<arr.length; i++) {
			right[i] = arr[i];
		}
		while(left.length != 1) {
			
		}
	}

}
