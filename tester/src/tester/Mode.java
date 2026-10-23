package tester;

import java.util.HashMap;
import java.util.Map.Entry;

public class Mode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 1, 2, 1, 2, 2, 2};
		System.out.println(mode(array));
	}
	static int mode(int[]n) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int num: n) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num) +1);
			}else {
				map.put(num, 1);
			}
		}
		int max = 0;
		int num = 0;
		for(Entry<Integer, Integer> m: map.entrySet()) {
			if(m.getValue()>max) {
				max = m.getValue();
				num = m.getKey();
			}
		}
		return num;
	}

}
