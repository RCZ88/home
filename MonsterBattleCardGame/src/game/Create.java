package game;
import java.util.*;

public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("CHOOSE WHAT TO CREATE!\n1. Monster\n2. Abilities");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Choose Monster's Element!\n1. Ice Monster\n2. Fire Monster\n3. Water Monster");
				int c1 = sc.nextInt();
				switch(c1) {
				case 1:
					System.out.println("Create Ice Monster!");
				case 2:
					System.out.println("Create Fire Monster!");
				}
			}
		}
	}

}
