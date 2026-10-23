package tester;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,6,1,3,9,2,7};
		System.out.println("Selection Sorting");
		int [] sortedarr = selectionSort(arr);
		
		System.out.println("\nSorted Array: ");
		for(int num: sortedarr) {
			System.out.println(num + " ");
		}
	}
	public static int[] selectionSort(int[] arr) {
		for(int i = 0; i<arr.length-1; i++) {
			int min = i;
			for(int j = i+1; j<arr.length; j++ ) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			System.out.println("\nIteration"+i+", minimum element is "+ 
			arr[min]+", swapping it with "+ arr[i]);
			int temp = arr[i];
			arr[i]= arr[min];
			arr[min] = temp;
		}
		return arr;
	}
	

}
