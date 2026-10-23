package sem1;

import java.util.ArrayList;
import java.util.Arrays;

public class QuestionBank {
	static double getAverage(double[]array) {
		double total = 0;
		for(double num : array) {
			total+=num;
		}
		return total/(double)array.length;
	}
	static int maxPos(double[]array) {
		double max = Integer.MIN_VALUE;
		int index = 0;
		for(int i = 0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
				index = i;
			}
		}
		return index;
	}
	static int sumOdd(int n) {
		if(n<=0) {
			return -1;
		}else {
			return n * n;
		}
	}
	static String getColor(int n) {
		String[]colors = {"red", "white", "yellow", "blue"};
		return colors[(n%4)-1];
	}
	
	static void calculate() {
		double n = 372;
		double x = n/100;
		double y = x + 10 * ((n%100)/10);
		double z = y + (n%10) * 100;
		System.out.println(x + " " + y + " " + z);
	}
	static boolean all_even(int n) {
		String sn = Integer.toString(n);
		for(int i = 0; i < sn.length(); i++) {
			if((sn.charAt(i) - '0') % 2 != 0) {
				return false;
			}
		}
		return true;
	}
	static int[] get_THREE(int[]numbers) {
		ArrayList<Integer>THREE = new ArrayList<>();
		for(int i = 0 ; i<numbers.length; i++) {
			String sf = Integer.toString(numbers[i]);
			if(sf.length() == 3) {
				int fn = sf.charAt(0) - '0';
				int sn = sf.charAt(1) - '0';
				int tn = sf.charAt(2) - '0';
				if(fn < sn && sn < tn) {
					THREE.add(numbers[i]);
				}
			}
		}
		int[]array = new int[THREE.size()];
		for(int i = 0 ; i < THREE.size(); i++) {
			array[i] = THREE.get(i);
		}
		return array;
	}
	static char[]uppercase(){
		char[] uppercaseLetters = new char[26];
        for (int i = 0; i < 26; i++) {
            uppercaseLetters[i] = (char) ('A' + i);
        }
        return uppercaseLetters;
	}
	static char[] substitude(int n, char[]alph) {
		char[]sub = new char[26];
		int index = 0;
		for(int i = n; i<26; i++) {
			sub[index]=alph[i];
			index++;
		}
		for(int i = 0; i<n; i++) {
			sub[index] = alph[i];
			index++;
		}
		return sub;
	}
	static String encode(String ch, char[]alph, int subs) {
		StringBuilder sb = new StringBuilder();
		char[]sub = substitude(subs, alph);
		for(int i = 0; i<ch.length(); i++) {
			boolean found = false;
			for(int j = 0; j<alph.length; j++) {
				if(ch.charAt(i) == alph[j]) {
					sb.append(sub[j]);
					found = true;
					break;
				}
			}
			if(!found) {
				sb.append(ch.charAt(i));
			}
		}
		return sb.toString();
	}
	static double get_BMI(double height, double weight) {
		return weight / Math.pow(height, 2);
	}
	static void print_category(double BMI) {
		if(BMI < 18.5) {
			System.out.println("UNDERWEIGHT");
		}else if(BMI>=18.5 && BMI<25) {
			System.out.println("IDEAL WEIGHT");
		}else if(BMI>= 25 && BMI<30) {
			System.out.println("OVERWEIGHT");
		}else if(BMI>=30) {
			System.out.println("OBESE");
		}
	}
	static String[] aboveAverage(String[]names, double[]weight, double[]height) {
		ArrayList<String>people = new ArrayList<>();
		int amount = names.length;
		double[]BMI = new double[amount];
		double totalBMI = 0;
		for(int i = 0; i <amount; i++) {
			BMI[i] = get_BMI(weight[i], height[i]);
			totalBMI+=get_BMI(weight[i], height[i]);
		}
		double avgBMI = totalBMI/amount;
		for(int i = 0 ; i<amount; i++) {
			if(BMI[i]>avgBMI) {
				people.add(names[i]);
			}
		}
		String[]array = new String[amount];
		for(int i = 0; i < amount; i++) {
			array[i] = people.get(i);
		}
		return array;
	}
	static void get_price(String ID, String[]ids, double[]prices) {
		boolean found = false;
		for(int i = 0; i<ids.length; i++) {
			if(ids[i] == ID){
				System.out.println(prices[i]);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("Product is not Found!");
		}
	}
	static void print_vowels(String paragraph) {
		int a = 0;
		int i = 0;
		int u = 0;
		int e = 0;
		int o = 0;
		for(int n = 0; n<paragraph.length(); n++) {
			char c = paragraph.charAt(n);
			if(c == 'a' || c == 'A') {
				a++;
			}else if(c == 'i' || c == 'I') {
				i++;
			}else if(c == 'u' || c == 'U') {
				u++;
			}else if(c == 'e' || c == 'E') {
				e++;
			}else if(c == 'o' || c == 'O') {
				o++;
			}
			
		}
		System.out.println("A: " + a + "\nI: " + i + "\nU: " + u + "\nE: " + e + "\nO: " + o);
	}
	static String[] third_warehouse(String[]first, String[]second) {
		ArrayList<String>third= new ArrayList<>();
		for(int i = 0; i<first.length; i++) {
			String id = first[i];
			for(int j = 0; j<second.length; j++) {
				if(second[i] == id) {
					third.add(second[i]);
					break;
				}
			}
		}
		String[]array = new String[third.size()];
		for(int i = 0; i<third.size(); i++) {
			array[i] = third.get(i);
		}
		return array;
	}
	static String highestDay(int[]data) {
		int max = 0;
		String day = "";
		for(int i = 0 ; i < data.length; i++) {
			if(data[i] >max) {
				max = data[i];
				day = convert(i%7);
			}
		}
		return day;
	}
	static String convert(int DAY) {
		switch(DAY) {
		case 0:
			return "Monday";
		case 1:
			return "Tuesday";
		case 2:
			return "Wednesday";
		case 3:
			return "Thursday";
		case 4:
			return "Friday";
		case 5:
			return "Saturday";
		case 6:
			return "Sunday";
		}
		return null;
	}
	
	public static boolean isPentagonal(long n) {
        double pen = (Math.sqrt(24 * n + 1) + 1) / 6;
        return pen == (int) pen;
    }

    public static boolean isHexagonal(long n) {
        double hex = (Math.sqrt(8 * n + 1) + 1) / 4;
        return hex == (int) hex;
    }

    public static long findNextTriangularPentagonalHexagonal() {
        long n = 286; // Starting point
        long triangular;
        while (true) {
            triangular = n * (n + 1) / 2;
            if (isPentagonal(triangular) && isHexagonal(triangular)) {
                return triangular;
            }
            n++;
        }
    }
	static void shapes() {
		int[]triangle = new int[100000];
		int[]pentagon = new int[100000];
		int[]hexagon = new int[100000];
		for(int i = 0; i<triangle.length; i++) {
			triangle[i] = i*(i+1)/2;
			pentagon[i] = i*(3*i - 1)/2;
			hexagon[i] = i*(2*i-1);
		}
		for (int i = 0; i < triangle.length; i++) {
		    int current = triangle[i];
		    int penIndex = -1;
		    int hexIndex = -1;

		    for (int j = 0; j < pentagon.length; j++) {
		        if (pentagon[j] == current) {
		            penIndex = j;
		        }
		    }

		    for (int j = 0; j < hexagon.length; j++) {
		        if (hexagon[j] == current) {
		            hexIndex = j;
		        }
		    }

		    if (penIndex != -1 && hexIndex != -1) {
		        System.out.println("T" + i + " = P" + penIndex + " = H" + hexIndex + " = " + current);
		    }
		}
	}
	
	static void get_spiral(int size) {
		int[][] array = new int[size][size];
		int count = 1;  // Start counting from 1
		int x = 0, y = 0;
		int borderL = 0, borderR = size - 1, borderU = 0, borderD = size - 1;

		while (count <= size * size) {
		    // Move right
		    while (x <= borderR && count <= size * size) {
		        array[y][x] = count;
		        count++;
		        x++;
		    }
		    x--; y++; borderU++;
		    
		    // Move down
		    while (y <= borderD && count <= size * size) {
		        array[y][x] = count;
		        count++;
		        y++;
		    }
		    y--; x--; borderR--;
		    
		    // Move left
		    while (x >= borderL && count <= size * size) {
		        array[y][x] = count;
		        count++;
		        x--;
		    }
		    x++; y--; borderD--;
		    
		    // Move up
		    while (y >= borderU && count <= size * size) {
		        array[y][x] = count;
		        count++;
		        y--;
		    }
		    y++; x++; borderL++;
		}
		for(int[] a : array) {
			System.out.println(Arrays.toString(a));
		}
	}
	static int[][] swap_row(int[][]array, int r1, int r2) {
		int[][]dup = array;
		for(int i = 0; i< dup[r1].length; i++) {
			int temp = dup[r1][i];
			dup[r1][i] = dup[r2][i];
			dup[r2][i] = temp;
		}
		return dup;
	}
	static void sort_row(int[][]arr, int[]totals, String[]players){
		int n = arr.length;
		for(int i = 0; i<n-1; i++) {
			int minIndex = i;
			for(int j = i+1; j<n; j++) {
				if(totals[j] < totals[minIndex]) {
					minIndex = j;
				}
			}
			swap_row(arr, i, minIndex);
			int tempT = totals[minIndex];
			String tempP = players[minIndex];
			totals[minIndex] = totals[i];
			players[minIndex] = players[i];
			totals[i] = tempT;
			players[i] = tempP;
		}
	}
	static void invert(int[][]arrays) {
		for(int[] array : arrays) {
			for(int num : array) {
				if(num == 1) {
					num = 0;
				}else {
					num = 1;
				}
			}
		}
	}
	static void print_array(int[][]array) {
		for(int[] a : array) {
			System.out.println(Arrays.toString(a));
		}
	}
	static void print_array(int[]array) {
		System.out.println(Arrays.toString(array));
	}
	static int[][] rotate(int[][]arrays, int n) {
		int count = 0;
		for(int[] array : arrays) {
			for(int num : array) {
				if(num == 1) {
					count++;
				}
			}
		}
		int[]x = new int[count];
		int[]y = new int[count];
		int index = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(arrays[i][j] == 1) {
					y[index] = j;
					x[index] = n-1-i;
					index++;
				}
			}
		}
		int[][]rotated = new int[n][n];
		for(int i = 0; i<count; i++) {
			for(int j = 0; j<n; j++) {
				for(int k = 0; k<n; k++) {
					if(j == y[i] && k == x[i]) {
						rotated[j][k] = 1;
					}
				}
			}
		}
		return rotated;
	}
	public static int[][] createLShape(int n) {
        int[][] array = new int[n][n];
        
        // Fill the array with 0s
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = 0;
            }
        }

        // Create the "L" shape with 1s
        for (int i = 0; i < n; i++) {
            array[i][0] = 1; // Vertical line of the L
        }
        for (int j = 0; j < n; j++) {
            array[n-1][j] = 1; // Horizontal line of the L
        }

        return array;
    }
	static boolean isValidMatrix(int[][]array, int n) {
		for(int i = 0; i<n; i++) {
			int width = 2;
			int start = i-1;
			if(i == 0 || i == n-1) {
				width = 1;
				if(i == 0) {
					start = i;
				}
			}else {
				start = i-1;
			}
			for(int j = 0; j<n; j++) {
				if(j>=start && j<=start+width) {
					System.out.println("("+i+","+j+")");
					if(array[i][j] == 0) {
						return false;
					}
				}else {
					if(array[i][j] != 0) {
						return false;
					}
				}
			}
		}
		return true;
	}
	static void getDistance(String station1, String station2, double[][]distances, String[]routes) {
		boolean s1Found = false;
		boolean s2Found = false;
		int s1 = 0;
		int s2 = 0;
		int index = 0;
		for(String route : routes) {
			if(route.equals(station1)) {
				s1Found = true;
				s1 = index;
			}else if(route.equals(station2)) {
				s2Found = true;
				s2 = index;
			}
			index++;
		}
		if(s1Found && s2Found) {
			System.out.println("Distance between Station "+ station1 + " with Station " + station2 + " is " + distances[s2][s1]);
		}else {
			if(!s1Found) {
				System.out.println("Station " + station1 + " not Found!");
			}
			if(!s2Found) {
				System.out.println("Station " + station2 + " not Found!");
			}
		}
	}
	static void getTime(String station1, String station2, String[]routes, int[]times) {
		boolean s1Found = false;
		boolean s2Found = false;
		int s1 = 0;
		int s2 = 0;
		int index = 0;
		for(String route : routes) {
			if(route.equals(station1)) {
				s1Found = true;
				s1 = index;
			}else if(route.equals(station2)) {
				s2Found = true;
				s2 = index;
			}
			index++;
		}
		if(s1Found && s2Found) {
			int sum = 0;
			for(int i = s1+1; i<=s2; i++) {
				sum+=times[i];
			}
			System.out.println("Time taken between "+ station1 + " with Station " + station2 + " is " + sum + " minutes.");
		}else {
			if(!s1Found) {
				System.out.println("Station " + station1 + " not Found!");
			}
			if(!s2Found) {
				System.out.println("Station " + station2 + " not Found!");
			}
		}
	}
	static int getMinMoves(int[][]matrix) {
		int oX = 2, oY = 2;
		int mX = 0, mY = 0;
		int len = matrix.length;
		for(int i = 0; i<len; i++) {
			for(int j =0 ; j<len; j++) {
				if(matrix[i][j] == 1) {
					mX = j;
					mY = i;
					break;
				}
			}
		}
		if(mX == oX) {
			return Math.abs(oY-mY);
		}else if(mY == oY) {
			return Math.abs(oX-mX);
		}else {
			return Math.abs(oX-mX) + Math.abs(oY-mY);
		}
	}
	static String getXCondition(char[][]ttt) {
		for(int i = 0; i<3; i++) {
			if(ttt[i][0] == ttt[i][1] && ttt[i][1] == ttt[1][2]) {
				if(ttt[i][0] == 'X') {
					return "WIN";
				}else {
					return "LOSE";
				}
			}else if(ttt[0][i] == ttt[1][i] && ttt[1][i] == ttt[2][i]) {
				if(ttt[0][i] == 'X') {
					return "WIN";
				}else {
					return "LOSE";
				}
			}
		}
		boolean w = true;
		char xo = 0;
		for(int i = 0; i<3; i++) {
			if(i>0) {
				if(ttt[i][i] != xo) {
					w = false;
					break;
				}
			}
			xo = ttt[i][i];
		}
		if(w) {
			if(xo == 'X') {
				return "WIN";
			}else {
				return "LOSE";
			}
		}
		w = true;
		xo = 0;
		for(int i = 2; i>=0; i--) {
			if(i<2) {
				if(ttt[i][i] != xo) {
					w = false;
					break;
				}
			}
			xo = ttt[i][i];
		}
		if(w) {
			if(xo == 'X') {
				return "WIN";
			}else {
				return "LOSE";
			}
		}
		return "";
	}
	public static void main(String[]args) {
		Util u = new Util();
		u.print(getColor(882));	
		calculate();
		System.out.println(all_even(24608));
		System.out.println(all_even(256));
		int[]array = {9, 3456, 12, 237, 45679, 368, 296};
		System.out.println(Arrays.toString(get_THREE(array)));
		System.out.println(Arrays.toString(substitude(5, uppercase())));
		System.out.println(encode("ARS LONGA, VITA BREVIS.", uppercase(), 7));
		print_vowels("I LOVE ALPHABET SOO MUCH");
		long result = findNextTriangularPentagonalHexagonal();
        System.out.println(result);
        get_spiral(5);
        int[][] MAT = {{7,1,2,3},{4,0,0,0},{6,0,-3,0},{4,0,0,4},{5,0,-1,0},{5,-6,0,9}};
        print_array(swap_row(MAT, 2, 4));
        int[][]lShape = createLShape(5);
        print_array(lShape);
        print_array(rotate(lShape,lShape.length));
        int[][]diagonal = {{7,7,0,0,0,0}, {1,2,1,0,0,0}, {0,9,-3,5,0,0}, {0,0,-5,6,4,0}, {0,0,0,7,7,2}, {0,0,0,0,5,1}};
        System.out.println(isValidMatrix(diagonal, 6));
	}
}
