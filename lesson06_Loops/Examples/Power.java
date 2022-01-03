package lesson06_Loops.Examples;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = input.nextInt();
		
		System.out.print("m = ");
		int m = input.nextInt();
		
		// Calculate n^m
		long result = 1;
		for (int i = 0; i < m; i++) {
			result *= n;
		}

		System.out.println("n^m = " + result);
	}

}
