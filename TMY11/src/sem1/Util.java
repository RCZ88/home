package sem1;

import java.util.Scanner;

public class Util {
	public void print(String s) {
		System.out.println(s);
	}
	public void print(int n) {
		System.out.println(n);
	}
	public void print(double f) {
		System.out.println(f);
	}
	public void print(boolean b) {
		System.out.println(b);
	}
	public String input(String s) {
		Scanner sc = new Scanner(System.in);
		System.out.print(s);
		return sc.next();
	}
	public String input() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	public int i(String s) {
		return Integer.parseInt(s);
	}
	public double f(String s) {
		return Double.parseDouble(s);
	}
}
