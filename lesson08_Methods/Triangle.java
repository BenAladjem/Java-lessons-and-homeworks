package lesson08_Methods;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		System.out.println();

		for (int line = 1; line <= n; line++) {
			printLine(1, line);
		}
		for (int line = n - 1; line >= 1; line--) {
			printLine(1, line);
		}
		input.close();
	}

	private static void printLine(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(" " + i);
		}
		System.out.println();
	}
}
