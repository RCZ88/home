package sem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class quizThreeSetsAndVenn {
	
	static int[] getUnion(int[]A, int[]B) {
		ArrayList<Integer>union = new ArrayList<>();
		for(int n: A) {
			if(!union.contains(n)) {
				union.add(n);
			}
		}
		for(int n: B) {
			if(!union.contains(n)) {
				union.add(n);
			}
		}
		return convertToArray(union);

	}
	
	static int[] getIntersection(int[]a, int[]b) {
		int[]union = getUnion(a, b);
		List<Integer> A = convertToList(a);
		List<Integer> B = convertToList(b);
		ArrayList<Integer> intersection = new ArrayList<>();
		for(int i = 0; i<union.length; i++) {
			int num = union[i];
			if(A.contains(num) && B.contains(num)) {
				intersection.add(num);
			}
		}
		return convertToArray(intersection);
	}
	static int[] getComplement(int[]a, int[]u) {
		List<Integer> A = convertToList(a);
		ArrayList<Integer>complement = new ArrayList<>();
		for(int n : u) {
			if(!A.contains(n)) {
				complement.add(n);
			}
		}
		return convertToArray(complement);
	}
	static int[] getDiffrence(int[]a, int[]b) { //nums on a that is not on b
		List<Integer> B = convertToList(b);
		ArrayList<Integer>diffrence = new ArrayList<>();
		for(int n : a) {
			if(!B.contains(n)) {
				diffrence.add(n);
			}
		}
		return convertToArray(diffrence);
	}
	
	static int[] convertToArray(List<Integer> list) {
		int[]array = new int[list.size()];
		int i = 0;
		for(int n : list) {
			array[i] = n;
			i++;
		}
		return array;
	}
	static List<Integer> convertToList(int[] array){
		List<Integer> li = new ArrayList<>();
		for(int n : array) {
			li.add(n);
		}
		return li;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("nU = ");
		int nu = sc.nextInt();
		int[]u = new int[nu];
		System.out.print("U = ");
		for(int i = 0; i<nu; i++) {
			u[i] = sc.nextInt();
		}
		System.out.print("nA = ");
		int na = sc.nextInt();
		int[] a = new int[na];
		System.out.print("A = ");
		for(int i = 0; i<na; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("nB = ");
		int nb = sc.nextInt();
		int[] b = new int[nb];
		System.out.print("B = ");
		for(int i = 0; i<nb; i++) {
			b[i] = sc.nextInt();
		}
		int[]union = getUnion(a, b);
		int[]intersection = getIntersection(a,b);
		int[]complementA = getComplement(a, u);
		int[]complementB = getComplement(b, u);
		int[]diffrenceA = getDiffrence(a,b);
		int[]diffrenceB = getDiffrence(b,a);
		System.out.println("Union is " + Arrays.toString(union));
		System.out.println("Intersection is " + Arrays.toString(intersection));
		System.out.println("A' is " + Arrays.toString(complementA));
		System.out.println("B' is " + Arrays.toString(complementB));
		System.out.println("A-B is " + Arrays.toString(diffrenceA));
		System.out.println("B-A is " + Arrays.toString(diffrenceB));
	}

}
