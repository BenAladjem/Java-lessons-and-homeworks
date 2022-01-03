package lesson07_Arrays;

public class PrintMatrix {

	public static void main(String[] args) {
		// Declare and initialize a matrix of size 2 x 4 (2 rows, 4 cols)
		int[][] matrix = { { 1, 2, 3, 4 }, // row 0 values
				{ 5, 6, 7, 8 }, // row 1 values
		};

		// Print the matrix on the console
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.printf("%d ", matrix[row][col]);
			}
			System.out.println();
		}
	}

}
