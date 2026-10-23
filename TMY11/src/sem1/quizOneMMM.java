package sem1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class quizOneMMM {
	static int getRange(int[]data) {
		int[]duplicate = data;
		Arrays.sort(duplicate);
		return duplicate[duplicate.length-1] - duplicate[0];
	}
	static double getMean(int[]data) {
		int sum = 0;
		for(int num : data) {
			sum+=num;
		}
		return (double)sum/(double)data.length;
	}
	static double getMedian(int[]data) {
		int[]duplicate = data;
		Arrays.sort(duplicate);
		int length = data.length;
		if(length % 2 == 0 ) {
			return (duplicate[length/2] + duplicate[length/2+1])/2;
		}else {
			return duplicate[(length+1)/2];
		}
	}
	static int getMode(int[]data) {
		int[] duplicate = Arrays.copyOf(data, data.length);
        Arrays.sort(duplicate);
        
        int maxCount = 0;
        int mode = duplicate[0];
        int currentCount = 1;

        for (int i = 1; i < duplicate.length; i++) {
            if (duplicate[i] == duplicate[i - 1]) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                mode = duplicate[i];
            }
        }

        return mode;
	}
	static void printArray(int[]data, int len) {
		System.out.print("Data: ");
		if(len > 0) {
			int[] duplicate = new int[len];
			for(int i = 0; i<len; i++) {
				duplicate[i] = data[i];
			}
			System.out.println(Arrays.toString(duplicate));
		}else {
			System.out.println("<<N/A>>");
		}
	}
	static boolean checkIfContain(int number, int[]data) {
		for(int n : data) {
			if(n == number) {
				return true;
			}
		}
		return false;
	}
	static int[] getRealArray(int[]data, int len) {
		int[] duplicate = new int[len];
		for(int i = 0; i<len; i++) {
			duplicate[i] = data[i];
		}
		return duplicate;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[]data = new int[10];
		int amtOfData = 0;
		while(true) {
			System.out.println("Menu:\r\n"
					+ "1. Add data [Max. 10 data]\r\n"
					+ "2. Edit data\r\n"
					+ "3. Remove data\r\n"
					+ "4. Get Range\r\n"
					+ "5. Get Mean\r\n"
					+ "6. Get Median\r\n"
					+ "7. Get Mode\r\n"
					+ "8. Data Summary\r\n"
					+ "9. Reset data\r\n"
					+ "0. Exit");
			System.out.println("Please Enter the Option[0...9]: ");
			int menu = 0;
			while(true) {
				menu = sc.nextInt();
				if(menu >=0 && menu <=9) {
					break;
				}else {
					System.out.println("Please choose between 0 and 9!");
				}
			}
			printArray(data, amtOfData);
			
			if(menu == 0) {
				break;
			}
			switch(menu) {
			case 1:
				System.out.println("ADD NUMBERS\n-----------");
				System.out.print("Enter number of Items: ");
				int noi = 0;
				while(true) {
					noi =  sc.nextInt();
					if(amtOfData+noi <= 10) {
						break;
					}else {
						System.out.println("Data cant hold more then 10 Items!");
					}
				}
				for(int i = 0 ; i<noi; i++) {
					System.out.println("Data["+amtOfData+"]: ");
					data[amtOfData] = sc.nextInt();
					amtOfData++;
				}
				System.out.println("Data Succesfully Added!");
				break;
			case 2:
				System.out.println("REPLACE NUMBER\n-------------");
				boolean found = false;
				int number = 0;
				while(!found) {
					System.out.println("Enter a Number to be Replaced: ");
					number = sc.nextInt();
					found = checkIfContain(number, data);
					if(!found) {
						System.out.println("Data not Found! Try Again!");
					}
				}
				System.out.print("Please enter an integer: ");
	            int replacement = sc.nextInt();
				for(int i = 0; i<data.length; i++) {
					if(data[i] == number) {
						data[i] = replacement;
						break;
					}
				}
				System.out.println("Data Succesfully Replaced!");
				break;
			case 3:
				System.out.println("REMOVE NUMBER\n-----------");
				int rNumber = 0;
				while(true) {
					System.out.println("Enter the Number to be removed: ");
					rNumber = sc.nextInt();
					if(checkIfContain(rNumber, data)) {
						break;
					}else {
						System.out.println("Number not found in Data!");
					}
				}
				int[]rData = new int[data.length-1];
				boolean removed = false;
				int i = 0;
				for(int n : data) {
					if(!removed) {
						if(n != rNumber) {
							rData[i] = n;
							i++;
						}
					}else {
						rData[i] = n;
						i++;
					}
				}
				data = rData;
				amtOfData--;
				System.out.println("Data succesfully Removed!");
				break;
			case 4:
				System.out.println("GET RANGE\n------------");
				System.out.println("The range is: " + getRange(getRealArray(data, amtOfData)));
				break;
			case 5:
				System.out.println("GET MEAN\n------------");
				System.out.println("The Mean is: " + getMean(getRealArray(data, amtOfData)));
				break;
			case 6:
				System.out.println("GET MEDIAN\n-----------");
				System.out.println("The Media is " + getMedian(getRealArray(data, amtOfData)));
				break;
			case 7:
				System.out.println("GET MODE\n----------");
				System.out.println("The Mode is " + getMode(getRealArray(data, amtOfData)));
				break;
			case 8:
				System.out.println("DATA SUMMARY\n-----------");
				System.out.println("The range is: " + getRange(getRealArray(data, amtOfData)));
				System.out.println("The Mean is: " + getMean(getRealArray(data, amtOfData)));
				System.out.println("The Median is " + getMedian(getRealArray(data, amtOfData)));
				System.out.println("The Mode is " + getMode(getRealArray(data, amtOfData)));
				break;
			case 9:
				System.out.println("RESET DATA\n-----------");
				data = new int[10];
				amtOfData = 0;
				System.out.println("Data Successfully Removed!");
				break;
			}
			printArray(data, amtOfData);
		}
	}
}
