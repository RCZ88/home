package projectEuler;

public class LargetPalindromeProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		for(int i = 100; i<1000; i++) {
			for(int j = 100; j<1000; j++) {
				int sum = i*j;
				if(isPalindrome(sum) && sum > max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
	}
	public static boolean isPalindrome(int n) {
		String e = Integer.toString(n);
		StringBuilder palindrome = new StringBuilder();
		for(int i = e.length()-1; i>=0; i--) {
			palindrome.append(e.charAt(i));
		}
		if(e.equals(palindrome.toString())) {
			return true;
		}
		return false;
	}

}
