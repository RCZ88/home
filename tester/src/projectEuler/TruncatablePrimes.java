package projectEuler;


public class TruncatablePrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int count = 0;
		for(int i = 10; i<1000000; i++) {
			if(isTP(i)) {
				System.out.println(count + ". " + i);
				count++;
				total+=i;
			}
		}
		System.out.println("Total: " + total);
	}
	static boolean isTP(int n) {
	    String sn = Integer.toString(n);
	    
	    // Check left truncations
	    for (int i = 0; i < sn.length(); i++) {
	        if (!isPrime(Integer.parseInt(sn.substring(i)))) {
	            return false;
	        }
	    }
	    
	    // Check right truncations
	    for (int i = sn.length(); i > 0; i--) {
	        if (!isPrime(Integer.parseInt(sn.substring(0, i)))) {
	            return false;
	        }
	    }
	    
	    return true;
	}
	static boolean isPrime(int num) {
	    if (num <= 1) return false;
	    if (num <= 3) return true;
	    if (num % 2 == 0 || num % 3 == 0) return false;
	    for (int i = 5; i * i <= num; i += 6) {
	        if (num % i == 0 || num % (i + 2) == 0) return false;
	    }
	    return true;
	}

}
