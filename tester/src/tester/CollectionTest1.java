package tester;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CollectionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> ml1 = new ArrayList();
		ml1.add("this is arraylist");
		ml1.add("test 1 2 3 4");
		for(Object e:ml1){
			System.out.println(e);
		}
		List <Object> ml2 = new ArrayList();
		ml2.add(23134);
		ml2.add(846.2347);
		ml2.add(86312);
		ml2.remove(2);
		for(Object e:ml2) {
			System.out.println(e);
		}
	}

}
