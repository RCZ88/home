package sem1;

import java.util.Scanner;

public class quizFiveMatrix {
	static void printMatrix(int[][]matrix) {
		for(int[]row : matrix) {
			for(int col : row) {
				System.out.print(col + " ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row A: ");
		int rowA = sc.nextInt();
		System.out.println("Enter Column A");
		int colA = sc.nextInt();
		int[][]matrixA = new int[rowA][colA];
		System.out.println("Input Matrix A of " + rowA + "x" + colA);
		for(int i = 0; i < rowA; i++) {
			for(int j = 0; j < colA; j++) {
				matrixA[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Row B: ");
		int rowB = sc.nextInt();
		System.out.println("Enter Column B");
		int colB = sc.nextInt();
		int[][]matrixB = new int[rowB][colB];
		System.out.println("Input Matrix B of " + rowB + "x" + colB);
		for(int i = 0 ; i< rowB; i++) {
			for(int j = 0; j < colB; j++) {
				matrixB[i][j] = sc.nextInt();
			}
		}
		if(rowA == rowB & colA == colB) {
			int[][] addition = new int[rowA][colA];
			int[][] substraction = new int[rowA][colA];
			for(int i = 0; i< rowA; i++) {
				for(int j = 0; j< colA; j++) {
					addition[i][j] = matrixA[i][j] + matrixB[i][j];
				}
			}
			for(int i = 0; i < rowA; i++) {
				for(int j = 0; j< colA; j++) {
					substraction[i][j] = matrixA[i][j] - matrixB[i][j];
				}
			}
			System.out.println("Addition Result:");
			printMatrix(addition);
			System.out.println("Substraction Reuslt: ");
			printMatrix(substraction);
		}else {
			System.out.println("Cacnnot do Addition/Substraction");
		}
		int[][]transA = new int[colA][rowA];
		for(int i = 0; i< rowA; i++) {
			for(int j = 0; j<colA; j++) {
				transA[j][i] = matrixA[i][j];
			}
		}
		int[][]transB = new int[colB][rowA];
		for(int i = 0; i< rowB; i++) {
			for(int j = 0;j <colB; j++) {
				transB[j][i] = matrixB[i][j];
			}
		}
		System.out.println("Matrix A Transposition: ");
		printMatrix(transA);
		System.out.println("Matrix B Transposition: ");
		printMatrix(transB);
		
		if(colA == rowB) {
			System.out.println("Multiplication Result: ");
			int[][]multiplication = new int[rowA][colB];
			for(int i = 0 ; i<colB; i++) {
				for(int j = 0; j < rowB; j++) {
					int sum = 0;
					for(int k = 0; k<colA; k++) {
						sum+= matrixA[i][k] * matrixB[k][j];
					}
					multiplication[i][j] = sum;
				}
			}
			printMatrix(multiplication);
		}else {
			System.out.println("Cannot do Multiplcation");
		}
		
	}

}
