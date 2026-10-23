package tester;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class BubbleVsSelection {

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
        int[] nosIS = new int[testNumber];
        int[] nosSS = new int[testNumber];
        double[] timeTakenIS = new double[testNumber];
        double[] timeTakenSS = new double[testNumber];

        for (int i = 0; i < testNumber; i++) {
            int[] arr = new int[arrayLength];
            for (int j = 0; j < arrayLength; j++) {
                arr[j] = r.nextInt(arrayLength * 4);
            }

            // Store the unsorted array
            String sARRunsorted = Arrays.toString(Arrays.copyOf(arr, arr.length));

            // Insertion Sort
            double startTimeIS = System.nanoTime();
            for (int k = 0; k < arrayLength - 1; k++) {
                for (int l = 0; l < arrayLength - 1 - k; l++) {
                    // Swap elements and print the current state of the array
                    if (arr[l] > arr[l + 1]) {
                        int temp = arr[l];
                        arr[l] = arr[l + 1];
                        arr[l + 1] = temp;
                        nosIS[i]++;
                    }
                }
            }
            double endTimeIS = System.nanoTime();
            timeTakenIS[i] = (endTimeIS - startTimeIS) * 0.001;

            // Selection Sort
            int[] arrSS = Arrays.copyOf(arr, arr.length);
            double startTimeSS = System.nanoTime();
            for (int m = 0; m < arrSS.length - 1; m++) {
                int min = m;
                for (int n = m + 1; n < arrSS.length; n++) {
                    if (arrSS[n] < arrSS[min]) {
                        min = n;
                    }
                    nosSS[i]++;
                }
                // Swap elements
                int temp = arrSS[m];
                arrSS[m] = arrSS[min];
                arrSS[min] = temp;

            }
            double endTimeSS = System.nanoTime();
            timeTakenSS[i] = (endTimeSS - startTimeSS) * 0.001;

            // Convert arrays to strings for printing
            String sARRis = Arrays.toString(arr);
            String sARRss = Arrays.toString(arrSS);

            if (YON.equals("y")) {
                testX[i] = "Unsorted: " + sARRunsorted + "\nIS: " + sARRis + "\nSS: " + sARRss;
            } else {
                testX[i] = "";
            }
        }

        int ip;
        double totalISTime = 0;
        double totalSSTime = 0;

        for (int i = 0; i < testNumber; i++) {
            ip = i + 1;
            System.out.println("#" + ip + " = " + testX[i]);
            System.out.println("BS: " + nosIS[i] + ", Time Taken: " + timeTakenIS[i] + " ms");
            System.out.println("SS: " + nosSS[i] + ", Time Taken: " + timeTakenSS[i] + " ms");

            totalISTime += timeTakenIS[i];
            totalSSTime += timeTakenSS[i];
        }

        // Calculate and display the average time
        double averageISTime = totalISTime / testNumber;
        double averageSSTime = totalSSTime / testNumber;

        System.out.println("\nAverage Time for Bubble Sort: " + averageISTime + " ms");
        System.out.println("Average Time for Selection Sort: " + averageSSTime + " ms");

        double gap = 0;
        double thatBetter = 0;
        if (averageISTime < averageSSTime) {
            gap = averageSSTime - averageISTime;
            thatBetter = (gap / averageSSTime) * 100;
            System.out.println("\nBubble Sort Wins by Being " + thatBetter + "% Faster.");
        } else {
            gap = averageISTime - averageSSTime;
            thatBetter = (gap / averageISTime) * 100;
            System.out.println("\nSelection Sort Wins by Being " + thatBetter + "% Faster.");
        }
    }
}
