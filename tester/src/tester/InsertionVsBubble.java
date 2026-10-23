package tester;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertionVsBubble {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Input Array Length: ");
        int arrayLength = sc.nextInt();
        System.out.print("Input Amount of Test: ");
        int testNumber = sc.nextInt();
        System.out.print("Show Array (y or n): ");
        String YON = sc.next();
        System.out.println("\n");

        String[] testX = new String[testNumber];
        int[] nosBS = new int[testNumber];
        int[] nosIS = new int[testNumber];
        double[] timeTakenBS = new double[testNumber];
        double[] timeTakenIS = new double[testNumber];

        for (int i = 0; i < testNumber; i++) {
            int[] arr = new int[arrayLength];
            for (int j = 0; j < arrayLength; j++) {
                arr[j] = r.nextInt(arrayLength * 4);
            }

            // Store the unsorted array
            String sARRunsorted = Arrays.toString(Arrays.copyOf(arr, arr.length));

            // Bubble Sort
            int[] arrBS = Arrays.copyOf(arr, arr.length);  // Copy the array for Bubble Sort
            double startTimeBS = System.nanoTime();
            for (int k = 0; k < arrayLength - 1; k++) {
                for (int l = 0; l < arrayLength - 1 - k; l++) {
                    // Swap elements
                    if (arrBS[l] > arrBS[l + 1]) {
                        int temp = arrBS[l];
                        arrBS[l] = arrBS[l + 1];
                        arrBS[l + 1] = temp;
                        nosBS[i]++;
                    }
                }
            }
            double endTimeBS = System.nanoTime();
            timeTakenBS[i] = (endTimeBS - startTimeBS) * 0.001;

            // Insertion Sort
            int[] arrIS = Arrays.copyOf(arr, arr.length);
            double startTimeIS = System.nanoTime();
            for (int m = 1; m < arrayLength; m++) {
                int key = arrIS[m];
                int n = m - 1;

                while (n >= 0 && arrIS[n] > key) {
                    arrIS[n + 1] = arrIS[n];
                    n--;
                    nosIS[i]++;
                }
                arrIS[n + 1] = key;
            }
            double endTimeIS = System.nanoTime();
            timeTakenIS[i] = (endTimeIS - startTimeIS) * 0.001;

            // Convert arrays to strings for printing
            String sARRbs = Arrays.toString(arrBS);
            String sARRis = Arrays.toString(arrIS);

            if (YON.equals("y")) {
                testX[i] = "Unsorted: " + sARRunsorted + "\nBS: " + sARRbs + "\nIS: " + sARRis;
            } else {
                testX[i] = "";
            }
        }

        int ip;
        double totalBSTime = 0;
        double totalISTime = 0;

        for (int i = 0; i < testNumber; i++) {
            ip = i + 1;
            System.out.println("#" + ip + " = " + testX[i]);
            System.out.println("BS: " + nosBS[i] + ", Time Taken: " + timeTakenBS[i] + " ms");
            System.out.println("IS: " + nosIS[i] + ", Time Taken: " + timeTakenIS[i] + " ms");

            totalBSTime += timeTakenBS[i];
            totalISTime += timeTakenIS[i];
        }

        // Calculate and display the average time
        double averageBSTime = totalBSTime / testNumber;
        double averageISTime = totalISTime / testNumber;

        System.out.println("\nAverage Time for Bubble Sort: " + averageBSTime + " ms");
        System.out.println("Average Time for Insertion Sort: " + averageISTime + " ms");

        double gap = Math.abs(averageBSTime - averageISTime);
        double thatBetter = 0;

        if (averageBSTime < averageISTime) {
            thatBetter = (gap / averageISTime) * 100;
            System.out.println("\nBubble Sort Wins by Being " + thatBetter + "% Faster.");
        } else {
            thatBetter = (gap / averageBSTime) * 100;
            System.out.println("\nInsertion Sort Wins by Being " + thatBetter + "% Faster.");
        }
    }
}



