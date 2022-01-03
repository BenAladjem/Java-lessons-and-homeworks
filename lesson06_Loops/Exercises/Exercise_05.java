package lesson06_Loops.Exercises;

import java.util.Scanner;

public class Exercise_05 {

	/**
	 * @author Orliin
	 * 
	 * Task:
	 * 5. Write a program that calculates N!*K! / (N-K)! for given N and K
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		System.out.print("k = ");
		int k = input.nextInt();
		
		// solution 1: N!*K!/(N-K)! = ((N-K+1)*(N-K+2)*...*(N-1)*N)*K!
		long result = 1;
		for(int multiplier = n-k+1; multiplier <= n; multiplier++) {
			result *= multiplier;
		}
		for(int multiplier = 2; multiplier <= k; multiplier++) {
			result *= multiplier;
		}
		
		System.out.println("N!*K!/(N-K)! = " + result);
	}

}
