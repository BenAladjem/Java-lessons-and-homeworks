package lesson07_Arrays;

import java.util.Scanner;

public class ReadMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Read the matrix dimensions
		System.out.print("Number of rows = ");
		int rows = input.nextInt();
		System.out.print("Number of columns = ");
		int cols = input.nextInt();

		// Allocate the matrix
		int[][] matrix = new int[rows][cols];

		// Enter the matrix elements
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				System.out.printf("matrix[%d,%d] = ", row, col);
				int element = input.nextInt();
				matrix[row][col] = element;
			}
		}

		// Print the matrix on the console
		System.out.println();
		System.out.println("The matrix is as follows:");
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				System.out.printf("%d ", matrix[row][col]);
			}
			System.out.println();
		}
	}
}
