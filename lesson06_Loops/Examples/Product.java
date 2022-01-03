package lesson06_Loops.Examples;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		System.out.print("m = ");
		int m = input.nextInt();

		if (n < m) {
			int num = n;
			long product = 1;
			do {
				product *= num;
				num++;
			} while (num <= m);

			System.out.println("product[n..m] = " + product);
		} else {
			System.out.println("Error: n should be smaller than m.");
		}
	}

}
