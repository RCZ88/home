package tester;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class RemoveCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = 0;
		List <Object> ml2 = new ArrayList();
		ml2.add(182);
		ml2.add(45);
		ml2.add("dog");
		ml2.add("chicken");
		for(Object g:ml2) {
			System.out.println(t+". "+g);
			t++;
		}
		System.out.println("How many do you want to remove?");
		int f = sc.nextInt();
		int []e = new int[f];
		System.out.println("Which one do you want to remove?");
		for(int i =0; i<f;i++) {
			e[i] = sc.nextInt();
		}
	
		for(int i =0; i<f; i++) {
			ml2.remove(e[i]-i);
		}
		
		for(Object g:ml2) {
			System.out.println(g);
			t++;
		}
	
		
	}

}
