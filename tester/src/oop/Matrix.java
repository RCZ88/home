package oop;

public class Matrix {
	private int row;
	private int column; 
	private int[][] elements;
	
	Matrix(int row, int column){
		this.row = row;
		this.column = column;
		this.elements = new int[row][column];
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
	
	public void setElement(int r, int c, int v) {
		if(r>=0 && r<=row && c>=0 && c<=row) {
			elements[r][c] = v;
		}else {
			System.out.println("Invalid Array Position");
		}
	}
	
	public static Matrix addElements(Matrix matrix1, Matrix matrix2){
		Matrix addedMatrix = new Matrix(matrix2.row, matrix2.column);
		if(matrix1.row == matrix2.row && matrix1.column == matrix2.column) {
			for(int i = 0; i<matrix1.row; i++) {
				for(int j = 0; j<matrix1.column; j++) {
				int sum = matrix1.elements[i][j]+matrix2.elements[i][j];
				addedMatrix.setElement(i, j, sum);
				}
			}
			return addedMatrix;
		}else {
			System.out.println("Matrices cannot be added.");
			return null;
		}
		
	}
	 public void displayMatrix() {
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < column; j++) {
	                System.out.print(elements[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
