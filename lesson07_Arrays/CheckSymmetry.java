package lesson07_Arrays;

import java.util.Scanner;

public class CheckSymmetry {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of elements = ");
		int n = input.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("arr[%d] = ", i);
			arr[i] = input.nextInt();
		}

		boolean symmetric = true;
		for (int i = 0; i < (arr.length + 1) / 2; i++) {
			if (arr[i] != arr[n - i - 1]) {
				symmetric = false;
			}
		}
		System.out.printf("Symmetric? %b%n", symmetric);
	}

}
