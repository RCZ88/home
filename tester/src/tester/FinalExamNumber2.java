package tester;
import java.util.Scanner;
public class FinalExamNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = {10,20,30,40,50,60,70,80,90,100};
		int ni = sc.nextInt();
		int p = sc.nextInt();
		jamesMethod(arr,ni,p);
		 for (int number : arr) {
		        System.out.print(number + " ");
		    }
	}
	public static int[] jamesMethod(int[]arr, int n, int p) {
		if(p>0&&p<10) {
			arr[p-1] = n;
			for(int i = p; i<arr.length-1; i++) {
				arr[i] = i*10;
			}
		}
		return arr;
		
	}
	public static int[] officialMethod(int[]arr, int n, int p) {
		if(p>0&&p<10) {
			arr[p-1] = n;
			for(int i = arr.length-2; i>p; i--) {
				arr[i+1]  = arr[i];
			}
		}
		return arr;
	}
}
