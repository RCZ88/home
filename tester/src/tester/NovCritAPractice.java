package tester;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class NovCritAPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Size of Array: ");
		int arrSize = sc.nextInt();
		int [] arr = new int[arrSize];
		System.out.println("Input Array: ");
		for(int i = 0; i<arrSize; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array: ");
		for(int a:arr) {
			System.out.print(a +" ");
		}
		System.out.println("\nSelection Sort: ");
		selectionSort(arr);
		for(int a: arr) {
			System.out.print(a+ " ");
		}
		
		System.out.println("\nBubble Sort: ");
		bubbleSort(arr);
		for(int a: arr) {
			System.out.print(a+ " ");
		}
		
		System.out.println("\nNumber to Find: ");
		int target = sc.nextInt();
		int ans = binarySearch(target,arr);
		System.out.print("Index of number "+target+": ");
		System.out.print(ans);
		
		ArrayList<Integer> Data =  new ArrayList();
		
		List<Integer> B = new ArrayList();
		List<Integer> C = new ArrayList();
		int [] data = {2,4,1,-2,-4,1,0};
		for(int a:data) {
			Data.add(a);
		}
		Iterator<Integer> DataI = Data.iterator();
		
		while(DataI.hasNext()) {
			int A = DataI.next();
			if(A>=0) {
				if(A%2 == 0) {
					B.add(A);
				}else {
					C.add(A);
				}
			}
		}
		System.out.println("\nEven Number: ");
		for(Integer S:B) {
			System.out.println(S);
		}
		System.out.println("Odd Number: ");
		for(Integer X:C) {
			System.out.println(X);
		}
		
		List <Object> farm = new ArrayList();
		int num = 0;
		farm.add("Cow");
		farm.add("Sheep");
		farm.add("Duck");
		farm.add("Chicken");
		farm.add("Goat");
		System.out.println("\nList of Animals: ");
		for(Object g:farm) {
			System.out.println(num+". "+g);
			num++;
		}
		System.out.println("Amount to Kill: ");
		int f = sc.nextInt();
		int []e = new int[f];
		System.out.println("Which to Kill: ");
		for(int i =0; i<f;i++) {
			e[i] = sc.nextInt();
		}
	
		for(int i =0; i<f; i++) {
			farm.remove(e[i]-i);
		}
		
		int al = farm.size()-f;
		System.out.println("Animal Left: "+al);
		for(Object g:farm) {
			System.out.println(g);
		}
	}
	public static int[] selectionSort(int[]arr) {
		for(int i = 0; i<arr.length-1; i++) {
			int min = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}
	public static int binarySearch(int target, int []arr) {
		int sn = 0;
		int bn = arr.length-1;
		while(sn<= bn) {
			int m = (sn+bn)/2;
			if(target<arr[m]) {
				bn = m-1;
			}
			if(target>arr[m]) {
				sn = m+1;
			}
			else {
				return m;
			}
		}
		return -1;
	}
	public static int [] bubbleSort(int [] arr) {
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
