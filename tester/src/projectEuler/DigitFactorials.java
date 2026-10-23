package projectEuler;

import java.util.ArrayList;

public class DigitFactorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		ArrayList<Integer>nums = new ArrayList<>();
		for(int i = 145; i<=40585; i+=5) {
			boolean check = isDF(i);
			System.out.println(i + " is " + check);
			if(check) {
				count++;
				nums.add(i);
			}
		}
		System.out.println(count);
		System.out.println("The DigitFactorials Number Are: ");
		int sum = 0;
		for(int n:nums) {
			System.out.println(n);
			sum+=n;
		}
		System.out.println("Sum: " + sum);
	}
	static boolean isDF(int num) {
		String numS = Integer.toString(num);
		int len = numS.length();
		int[] nums = new int[len];
		for(int i = 0 ;i<len; i++) {
			nums[i] = numS.charAt(i) - '0';
		}
		int[]facts = new int[len];
		for(int i = 0; i<len; i++) {
			facts[i] = factorial(nums[i]);
		}
		int total = 0;
		for(int n : facts) {
			total+=n;
		}
		return num == total;
		
	}
	static int factorial(int num) {
		int sum = 1;
		for(int i = num; i>0; i--) {
			sum = sum*i;
		}
		return sum;
	}

}
