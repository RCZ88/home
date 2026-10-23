package tester;
import java.util.Scanner;
import java.util.Random;
public class ThreeSortingMethods {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Random r = new Random();
        System.out.print("Input the Size of Array: ");
        int size = sc.nextInt();
        System.out.println("Input Number Boundary: ");
        int ub = sc.nextInt();
        int[] arr = new int[size];
        double min = 1000000000; 
        String minN = "";
        double tt = 0; 

        System.out.println("Input your " + size + " Numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(ub);
        }
        
        System.out.println("\n");
        System.out.println("Here are the 3 Methods of Sorting:");
        System.out.println("\n");

        // Selection Sort
        double startTime = System.nanoTime();
        int[] selection = selectionSort(arr.clone());
        double endTime = System.nanoTime();
        tt = endTime - startTime;
        System.out.println("Time taken for Selection Sort: " + tt + " nanoseconds");
        System.out.println("\n");
        if(tt<min) {
        	min = tt;
        	minN = "SELECTION";
        }

        // Insertion Sort
        startTime = System.nanoTime();
        int[] insertion = insertionSort(arr.clone());
        endTime = System.nanoTime();
        tt = endTime - startTime;
        System.out.println("Time taken for Insertion Sort: " + tt + " nanoseconds");
        System.out.println("\n");
        if(tt<min) {
        	min = tt;
        	minN = "INSERTION";
        }

        // Bubble Sort
        startTime = System.nanoTime();
        int[] bubble = bubbleSort(arr.clone());
        endTime = System.nanoTime();
        tt = endTime - startTime;
        System.out.println("Time taken for Bubble Sort: " + tt + " nanoseconds");
        System.out.println("\n");
        if(tt<min) {
        	min = tt;
        	minN = "BUBBLE";
        }
        
        System.out.println("The Most Efficient method is "+ minN + " with a time of "+ min+" nanoseconds.");
        
        // Print the original unsorted array
        System.out.println("Unsorted: ");
        for (int d : arr) {
            System.out.print(d + " ");
        }
        System.out.println("\n");

        // Print the sorted arrays
        System.out.println("Selection Sorting: ");
        System.out.println("Find minimum, Swap location with arr[0], Exclude from Scanning");

        System.out.println("\n");
        System.out.println("Insertion Sorting: ");
        System.out.println("Starts from arr[1], Swap with left if Smaller, Stop when on place");
        
        System.out.println("\n");
        System.out.println("Bubble Sorting: ");
        System.out.println("Starts from arr[0], Swap with right if Bigger, Manual 1 by 1");
    }
    public static int[] selectionSort(int[] arrA) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Include Steps(y or n) for Selection: ");
        String yon = sc.nextLine();
    	int nos = 0; 
        System.out.println("1. Selection Sort: ");
        for (int i = 0; i < arrA.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arrA.length; j++) {
                if (arrA[j] < arrA[min]) {
                    min = j;
                }
            }
            // Swap elements and print the current state of the array
            int temp = arrA[i];
            arrA[i] = arrA[min];
            arrA[min] = temp;
            if(yon.equals("y")) {
            	printArray(arrA);
            }
            nos++;
            
        }
        System.out.println("2. Sorted Array: ");
        printArray(arrA);
        System.out.println("Number of Steps: "+nos);
        System.out.println("\n");
        return arrA;
    }

    public static int[] insertionSort(int[] arrB) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Include Steps(y or n) for Insertion: ");
        String yon = sc.nextLine();
    	int nos = 0; 
        System.out.println("3. Insertion Sort: ");
        for (int i = 0; i < arrB.length - 1; i++) {
            int j = i;
            while (j > 0 && arrB[j - 1] > arrB[j]) {
                // Swap elements and print the current state of the array
                int temp = arrB[j - 1];
                arrB[j - 1] = arrB[j];
                arrB[j] = temp;
                if(yon.equals("y")) {
                	printArray(arrB);
                }
                nos++;
                j--;
            }
        }
        // Print the final sorted array
        System.out.println("Sorted Array: ");
        printArray(arrB);
        System.out.println("Number of Steps: "+nos);
        System.out.println("\n");
        return arrB;
    }

    public static int[] bubbleSort(int[] arrC) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Include Steps(y or n) for Bubble: ");
        String yon = sc.nextLine();
    	int nos = 0; 
        System.out.println("Bubble Sort: ");
        for (int i = 0; i < arrC.length - 1; i++) {
            for (int j = 0; j < arrC.length - 1 - i; j++) {
                // Swap elements and print the current state of the array
                if (arrC[j] > arrC[j + 1]) {
                    int temp = arrC[j];
                    arrC[j] = arrC[j + 1];
                    arrC[j + 1] = temp;
                    if(yon.equals("y")) {
                    	printArray(arrC);
                    }
                    nos++;
                }
            }
        }
        // Print the final sorted array
        System.out.println("Sorted Array: ");
        printArray(arrC);
        System.out.println("Number of Steps: "+nos);
        System.out.println("\n");
        return arrC;
    }

    public static void printArray(int[] arr) {
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.println();
    }
}

