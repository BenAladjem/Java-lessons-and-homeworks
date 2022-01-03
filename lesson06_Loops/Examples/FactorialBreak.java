package lesson06_Loops.Examples;

import java.util.Scanner;

public class FactorialBreak {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();

		System.out.print("n! = ");

		// "long" is the biggest integer type
		long factorial = 1;

		// Perform an infinite loop
		while (true) {
			System.out.print(n);
			if (n == 1) {
				break;
			}
			System.out.print(" * ");
			factorial *= n;
			n--;
		}
		System.out.println(" = " + factorial);		
	}

}
