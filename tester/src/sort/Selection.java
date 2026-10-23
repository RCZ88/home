package sort;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public void SelectionSort(int [] arr){
		int n = arr.length;
		for(int i = 0; i<n-1; i++) {
			int min = i;
			for(int j = i; j<n; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	public void BubbleSort(int [] arr) {
		int n = arr.length;
		boolean swapped = false;
		for(int i = 0; i<n-1; i++){
			for(int j = 1; j<n; j++) {
				if(arr[j]< arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}

}
