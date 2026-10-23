package leetCode;

public class RemoveProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {3,2,2,3,2,5,6,1,3,1,23,3,5,7,8,64,3,3,3};
		System.out.println(removeElement(numbers, 3));
		for(int i = 0; i<numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}
	}
	public static int removeElement(int[]nums, int val) {
		int k = nums.length;
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] == val) {
				k--;
				nums[i] = '_';
			}
		}
		return k;
	}

}
