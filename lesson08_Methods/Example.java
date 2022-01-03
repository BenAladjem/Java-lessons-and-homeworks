package lesson08_Methods;

public class Example {

	/*
	 * Task: ƒаден е двумерен масив с цели числа. ƒа се сортират редовете му в
	 * нарастващ ред спр€мо средното аритметично от елементите им.
	 */
	public static void main(String[] args) {
		int[][] array = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 1, 2, 3 },
				{ 2, 4, 6 } };

		sort(array);
		print(array);
	}

	private static void print(int[][] array) {
		System.out.println("{");
		for(int row = 0; row < array.length; row++) {
			System.out.print("\t");
			printRow(array[row]);
			System.out.println();
		}
		System.out.println("}");
		
	}

	private static void printRow(int[] row) {
		System.out.print("{");
		for(int i = 0; i<row.length-1; i++) {
			System.out.print(row[i]+", ");
		}
		System.out.print(row[row.length-1]+"} :\t" + getAverage(row));
	}

	private static void sort(int[][] array) {

		for (int row = 0; row < array.length; row++) {
			int index = findTheSmallestAverage(row, array);
			swapRows(index, row, array);
		}

	}

	private static void swapRows(int r1, int r2, int[][] array) {
		int[] tmp = array[r1];
		array[r1] = array[r2];
		array[r2] = tmp;
	}

	private static int findTheSmallestAverage(int start, int[][] array) {
		double min = getAverage(array[start]);
		int minIndex = start;

		double average;

		for (int row = start + 1; row < array.length; row++) {
			average = getAverage(array[row]);
			if (average < min) {
				min = average;
				minIndex = row;
			}
		}

		return minIndex;
	}

	private static double getAverage(int[] row) {
		int sum = 0;
		for (int i = 0; i < row.length; i++) {
			sum += row[i];
		}
		return ((double)sum)/row.length;
	}

}
