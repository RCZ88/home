package tester;
import java.util.Scanner;
public class FinalExamNumber3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = (h*60)+m;
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		int lcm = max;
		while(lcm%min!=0) {
			lcm+=max;
		}
		t+=lcm;
		int ht = t/60;
		int mt = t%60;
		System.out.println(ht+":"+mt);
	}
}
