package tester;
import java.util.Scanner;
import java.util.TreeSet;
public class PhysicsPresentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        for (String number : numbers) {
            treeSet.add(Integer.parseInt(number));
        }

        System.out.println("Sorted List: " + treeSet);

        System.out.println("Enter a number to search:");
        int numberToSearch = scanner.nextInt();

        if (treeSet.contains(numberToSearch)) {
            System.out.println(numberToSearch + " is available in the list.");
        } else {
            System.out.println(numberToSearch + " is not available in the list.");
        }
	}

}
