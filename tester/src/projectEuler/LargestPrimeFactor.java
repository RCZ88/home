package projectEuler;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 600851475143L;
		long maxPrime = 0;
		
		for(long i = 2; i<n; i++) {
			if(isPrime(i)) {
				if(n % i == 0) {
					maxPrime = i;
					System.out.println(maxPrime);
				}
			}
		}
		
		
	}
	private static boolean isPrime(long n) {
		for(int i = 2; i<Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
