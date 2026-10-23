package tester;

public class FinalExamNumber4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean locateNumber(int arr2[], int target) {
		boolean tof = false;
		for(int i = 0; i<arr2.length-1; i++) {
			if(arr2[i] == target) {
				tof = true;
			}
		}
		return tof;
	}
	public static int[] thirdBarn(int arr1[], int arr2[]) {
		int[]arr3 = new int[arr1.length];
		int index = 0;
		for(int i = 0; i<arr1.length-1; i++) {
			if(locateNumber(arr2,arr1[i])) {
				arr3[index] = arr1[i];
				index++;
			}
		}
		return arr3;
	}
}
