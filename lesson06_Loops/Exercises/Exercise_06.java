package lesson06_Loops.Exercises;

import java.util.Scanner;

public class Exercise_06 {

	/**
	 * @author Orliin
	 * 
	 * Task:
	 * 6. Write a program that, for a given integer numbers N and x calculates the sum
	 * S = 1 + 1!/x + 2!/x2 + ... + n!/xn
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("N = ");
		int n = input.nextInt();
		System.out.print("x = ");
		int x = input.nextInt();
		
		
		double sum = 0.;
		for(int i = 0; i<= n; i++) {
			// calculate N!
			long factorial = 1;
			for(int multiplier = 1; multiplier <= n; multiplier++) {
				factorial *= multiplier;
			}
			
			// calculate x^n!
			long power = 1;
			for(int count = 0; count < n; count++) {
				power *= x;
			}
			
			sum += (double)factorial/power;
		}
		System.out.println("S = " + sum);
	}

}
