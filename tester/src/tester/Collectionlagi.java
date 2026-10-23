package tester;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Collectionlagi {

	public static void main(String[] args) {       
		// TODO Auto-generated method stub
		ArrayList<Integer> Data =  new ArrayList();
		Data.add(2);
		Data.add(4);
		Data.add(-1);
		Data.add(3);
		
		List<Integer> B = new ArrayList();
		List<Integer> C = new ArrayList();
		
		Iterator<Integer> Datas = Data.iterator();
		
		while(Datas.hasNext()) {
			int A = Datas.next();
			if(A>=0) {
				if(A%2 == 0) {
					B.add(A);
				}else {
					C.add(A);
				}
			}
		}
		System.out.println("Even Number: ");
		for(Integer S:B) {
			System.out.println(S);
		}
		System.out.println("Odd Number: ");
		for(Integer X:C) {
			System.out.println(X);
		}
	}

}
