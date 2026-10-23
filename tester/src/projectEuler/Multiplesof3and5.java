package projectEuler;

public class Multiplesof3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		int total = 0;
		for(int i = 0; i<n; i++) {
			if(i%3 == 0 || i%5 == 0) {
				total+=i;
			}
		}
		System.out.println(total);
	}

}
