package lesson06_Loops.Exercises;

import java.util.Scanner;

public class Exercise_04 {

	/**
	 * @author Orliin
	 * 
	 * Task:
	 * 4. Write a program that calculates N!/K! for given N and K (1<K<N)
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		System.out.print("k = ");
		int k = input.nextInt();
		
		// solution 1:
		long result = 1;
		for(int multiplier = 2; multiplier <= n; multiplier++) {
			result *= multiplier;
		}
		for(int multiplier = 2; multiplier <= k; multiplier++) {
			result /= multiplier;
		}
		System.out.println("N!/K! = " + result);
		
		// solution 2: N!/K! = (K+1)*(K+2)*...*(N-1)*N
		result = 1;
		for(int multiplier = k+1; multiplier <= n; multiplier++) {
			result *= multiplier;
		}
		
		System.out.println("N!/K! = " + result);
	}

}
