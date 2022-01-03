package lesson06_Loops.Examples;

import java.util.Scanner;

public class SumOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i += 2) {
			if (i % 7 == 0)
				continue;
			sum += i;
		}
		System.out.println("sum = " + sum);
	}

}
