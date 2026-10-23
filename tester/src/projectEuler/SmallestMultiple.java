package projectEuler;

public class SmallestMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i = 1;
			boolean divisible = divisible(i);
			while(!divisible) {
				divisible = divisible(i++);
			}
			System.out.println(i-1);
			
	}
	private static boolean divisible(int n) {
		for(int i = 1; i<20; i++) {
			if(n % i != 0) {
				return false;
			}
		}
		return true;
	}

}
