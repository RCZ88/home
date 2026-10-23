package tester;

public class removeDuplicate {

	public static void main(String[] args) {
		 int[] arr = {1, 1, 4, 5, 7, 7, 8, 9, 9, 9};
	        int[] result = removeDuplicates(arr);
	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	    }

	    public static int[] removeDuplicates(int[] nums) {
	        int[] dn = new int[nums.length];
	        int e = 0;

	        for (int i = 0; i < nums.length; i++) {
	            boolean duplicate = false;

	            for (int j = 0; j < e; j++) {
	                if (nums[i] == dn[j]) {
	                    duplicate = true;
	                    break;
	                }
	            }

	            if (!duplicate) {
	                dn[e++] = nums[i];
	            }
	        }

	        int[] result = new int[e];
	        System.arraycopy(dn, 0, result, 0, e);

	        return result;
	    }
	}