package lesson06_Loops.Examples;

import java.util.Scanner;

public class FactorialDoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		long factorial = 1;

		do {
			factorial *= n;
			n--;
		} while (n > 0);

		System.out.println("n! = " + factorial);
	}

}
