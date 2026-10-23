package projectEuler;
import java.math.BigInteger;

public class PowerDigitSum {

    public static void main(String[] args) {
        BigInteger base = new BigInteger("2");
        BigInteger exponent = new BigInteger("1000");

        BigInteger result = base.pow(exponent.intValue());
        String stringValue = result.toString();
        int total = 0;
        for(int i = 0; i<stringValue.length(); i++) {
        	total += Character.getNumericValue(stringValue.charAt(i));
        }
        
        //System.out.println("2^1000 is: " + result);
        System.out.println(total);
    }
}


