package learn;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		//adds from the first index
		ll.push("A");
		ll.push("C");
		//removes the last thing added
		
		
		//adds fromt the last index
		ll.offer("A");
		ll.offer("C");
		//removes the first thing added
		ll.poll();
		
		//ll.add(1, "B");
		
		//Get index of String
		System.out.println(ll.indexOf("C"));
		//Gets the first String
		System.out.println(ll.peekFirst());
		//Gets the last String
		System.out.println(ll.peekLast());
		//adds a String to the start
		ll.addFirst("First");
		//adds a String to the last
		ll.addLast("Last");
		//Store in a variable
		String first = ll.removeFirst();
		String last = ll.removeLast();
		
		//prints the entire 
		System.out.println(ll);
	}

}
