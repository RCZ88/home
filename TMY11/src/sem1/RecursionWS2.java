package sem1;

public class RecursionWS2 {
	public static void main(String[]args) {
		System.out.println(sumEvens(15));
	}
	/*public static int sumEvens(int num) {
		if(num >= 2 && num <= 2000000000) {
			if(num % 2 == 0) {
				return num + sumEvens(num-2);
			}else {
				return sumEvens(num-1);
			}
		}else {
			return num;
		}
	}*/
	public static int sumEvens(int num) {
		int sum = 0;
		while(num >= 2 && num <= 2000000000) {
			if(num%2 == 0) {
				sum+= num;
			}
			num--;
		}
		return sum;
	}
	public static int mystery(int num) {
		int sum = 0;
		for(int i = num; i>0 ; i--) {
			sum += i;
		}
		return sum;
	}
	/*
	public static long factoria_r(int n) {
		return n * factoria_r(n-1);
	}*/
	public static long factoria_r(int n) {
		long fac = n;
		for(int i = n-1; i>0; i--) {
			fac = fac * i;
		}
		return fac;
	}
}
