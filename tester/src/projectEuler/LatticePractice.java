package projectEuler;
import java.math.BigInteger;
public class LatticePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 20; 
		System.out.println(getPath(size));
		
	}
	public static BigInteger getPath(int size) {
		int twoSize = size*2;
		BigInteger numerator = BigInteger.valueOf(twoSize);
		for(int i = twoSize-1; i>size; i--) {
			numerator = numerator.multiply(BigInteger.valueOf(i));
		}
		BigInteger denumerator = BigInteger.valueOf(size);
		for(int i = size-1; i>0; i--) {
			denumerator = denumerator.multiply(BigInteger.valueOf(i));
		}
		return numerator.divide(denumerator);
		
	}

}
