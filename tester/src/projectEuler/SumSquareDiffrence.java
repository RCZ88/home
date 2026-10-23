package projectEuler;

public class SumSquareDiffrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int total1 = 0;
		int total2 = 0; 
		for(int i = 1; i<n+1; i++) {
			total1+= i;
			total2+=(i*i);
		}
		int total1Square = total1 * total1;
		int sum = total1Square - total2;
		System.out.println(sum);
	}

}
