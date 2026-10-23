package tester;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Arrays;
public class CollectionEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> Number = new ArrayList<>(Arrays.asList(1,5,7,4,10));

		int i = 0;

		Iterator<Integer> Inumber = Number.iterator();
		
		int[] d = new int[5];
		while (Inumber.hasNext() && i < 5) {
		    d[i] = Inumber.next(); //converting collection to array
		    i++; 
		}
		
		int u = 0;

		System.out.println("Which number do you want to check:");
		int s = sc.nextInt();
		boolean a = false;
		for (i = 0; i < 5; i++) {
		    if (d[i] == s) {
		        a = true;
		        u = i;
		        break; 
		    }
		}

		if (a) {
		    System.out.println("Found at index "+u);
		} else {
		    System.out.println("Not Found");
		}

		
	}

}
