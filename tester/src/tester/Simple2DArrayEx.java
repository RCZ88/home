package tester;

public class Simple2DArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//No.1
		int[][] arr1 = { {47,3,12},{51,74,20} };
		
		//47
		System.out.println(arr1[0][0]);
		//51
		System.out.println(arr1[1][0]);
		//20
		System.out.println(arr1[1][2]);
		
		//No.2
		int[][] arr2 = { {10,39,8},{3},{35,87},{22},{34} };
		
		//8
		System.out.println(arr2[0][2]);
		//3
		System.out.println(arr2[1][0]);
		//87
		System.out.println(arr2[2][1]);
		//34
		System.out.println(arr2[4][0]);
		
		//No.3
		//Declare and Initialize
		String [][] names = {{"Brice", "Marvin", "Anna"},{"Kamal", "Maria", "Elissa"}};
		
		//print all names
		for(int i = 0; i<names.length; i++) {
			for(int j = 0; j<names[i].length; j++) {
				System.out.print(names[i][j]+ " ");
			}
			System.out.println();
		}
		
		//No.4
		//count variable
		int count = 1;
		//initialize array
		int [][]num = new int [3][3];
		//adds and print all names
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				num[i][j] = count++;
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
		//No.5
		int [][] s7 = createMagicSquare(7);
		//advanced loop
		print(s7);
		
		//a.
		int d1 = 0;
		int d2 = 0;
		for(int i = 0 ;i<s7.length; i++) {
			d1+= s7[i][i];
			d2+=s7[s7.length-1-i][i];
		}
		System.out.println(d1 == s7.length*s7.length && d2 == s7.length*s7.length);
		
		//b.
		System.out.println(checkMagicSquare(s7));
		
		//c.
		int [][]s5 = createMagicSquare(5);
		print(s5);
		System.out.println(checkMagicSquare(s5));
	}
	public static int[][] createMagicSquare(int size){
		int Z = 1;
		int [][] magicArray = new int [size][size];
		int ix = 0;
		int iy = 0;
		int x = 0;
		int y = 0;
		x = magicArray.length/2;
		y = 0;
		magicArray[y][x] = Z;
		ix = x;
		iy = y;
		while(Z++<(size*size)) {
			if(iy-1>=0) {
				y--;
				
			}else {
				y = size-1;
			}
			if(ix+1<=size-1) {
				x++;
			}else {
				x = 0;
			}
			if(magicArray[y][x]!=0) {
				y = iy+1;
				x = ix;
			}
			magicArray[y][x] = Z;
			ix = x; 
			iy = y;
		}
		return magicArray;
	}
	//b.
	public static boolean checkMagicSquare(int[][]array) {
		int s = 0;
		int size = array.length;
		for(int i = 0; i<size; i++ ) {
			int sh = 0;
			int sv = 0;
			for(int j = 0; j<size; j++) {
				sh+=array[i][j];
				sv+=array[j][i];
			}
			if(i!= 0) {
				if(sh!=s || sv !=s) {
					return false;
				}
			}else {
				s = sh;
			}
		}
		return true;
	}
	public static void print(int[][]array) {
		for(int[] i : array) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}


