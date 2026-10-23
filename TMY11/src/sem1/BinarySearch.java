package sem1;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Harry", "Ivy", "Jack"};
		double[] scores = {85, 92, 77, 98, 68, 79, 88, 95, 72, 83};
		System.out.println(getScore("Charlie", names, scores));
	}
	static double getScore(String name, String[]names, double[]scores) {
		char fl = name.charAt(0);
		int min = 0;
		int max = names.length-1;
		int mid = (min+max)/2;
		while(min <= max) {
			if(fl > names[mid].charAt(0)) {
				min = mid+1;
			}else if(fl < names[mid].charAt(0)) {
				max = mid-1;
			}else {
				if(names[mid].equals(name)) {
					return scores[mid];
				}
			}
			mid = (min+max)/2;
		}
		System.out.println("Name not Found!");
		return -1;
	}

}
