package tester;

public class recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(func(5));
		System.out.println(fun(1216));
	}
	static int func(int x) {
		if(x>1) {
			System.out.println((x-1) + " + " + (x-2));
			return func(x-1) + func(x-2);
		}else {
			return x;
		}
	}
	static int fun(int x) {
		if(x>0) {
			return fun(x%10) + fun(x/10);
		}else {
			return x;
		}
	}
}
