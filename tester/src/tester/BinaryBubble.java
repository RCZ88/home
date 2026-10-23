package tester;
import java.util.*;
public class BinaryBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int as = sc.nextInt();
		int [] arr = new int[as];
		for(int i = 0; i<as; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i =0; i<arr.length-1; i++) {
			for(int j = 0; j<arr.length-1-i; j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp = 	arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		
		System.out.println("After Sorted:");
		for(int i = 0; i<arr.length-1; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(arr[arr.length-1]);
		
		System.out.print("Input a Target: ");
		int t = sc.nextInt();
		int ans = binarySearch(arr, t);
		System.out.println(ans);
	}
	private static int binarySearch(int[] arr, int t) {
		// TODO Auto-generated method stub
		int sn = 0; //smallest number
		int bn = arr.length -1; //biggest number
		
		while (sn <= bn) {
			int m = (sn+bn)/2;
			if(t < arr[m]) {
				bn = m - 1;
			}else if(t >arr[m]) {
				sn = m+1;
			}else {
				return m; 
			}
		}
		return -1; 
	}

}
