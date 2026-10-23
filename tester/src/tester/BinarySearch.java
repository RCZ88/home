package tester;
import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] arr = {1,3,6,8,12,30,67,87,92,103};
		int target = sc.nextInt();
		int ans = binarySearch(arr, target);
		System.out.println(ans);
	}

	private static int binarySearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		int sn = 0; //smallest number
		int bn = arr.length -1; //biggest number
		
		while (sn <= bn) {
			int m = (sn+bn)/2; //find middle point. always updates with the smallest and biggest number
			if(target < arr[m]) {
				bn = m - 1; //if target is smaller, set the biggest number to the number below middle number
			}else if(target >arr[m]) {
				sn = m+1; //if target is bigger, set the smallest number to the number above the middle number
			}else {
				return m; //if the target is equal to m then return m
			}
		}
		return -1; //if not found return -1
	}

}
