package leetCode;

public class Rotate2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
	}
	public static void rotate(int[][] matrix) {
        
		int n = matrix.length; // Get the size of the square matrix

	    // Create a new copy of the matrix
	    int[][] copy = new int[n][n];
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            copy[i][j] = matrix[i][j];
	        }
	    }
		
        for(int i  = 0; i< matrix.length; i++){ 
            for(int j = 0; j <matrix.length; j++){
                matrix[i][j] = copy[matrix.length-1-j][i];
                System.out.print("(" + (matrix.length - j-1) + ", " + (i) + ")");
                System.out.println(matrix[i][j]);
            }
        }
    }
}
