package lesson06_Loops.Exercises;

import java.util.Scanner;

public class Exercise_0123 {

	/**
	 * @author Orliin
	 * 
	 * Tasks:
	 * 1. Write a program that prints all the numbers from 1 to N.
	 * 2. Write a program that prints all the numbers from 1 to N, that are not divisible by 3 and 7.
	 * 3. Write a program that reads from the console a sequence of N integer numbers and returns the minimal and maximal of them.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("n = ");
		int n = input.nextInt();
		
		System.out.println("Homework 1:");
		{
			
			
			// solution 1:
			for (int i = 0; i < n; i++) {
				System.out.print((i + 1) + " ");
			}
			System.out.println();

			// solution 2:
			for (int i = 1; i <= n; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("Homework 2:");
		{
			// solution 1:
			for(int i = 1; i<= n; i++) {
				if(i%3==0 && i%7 ==0) continue;
				System.out.print(i + " ");
			}
			System.out.println();
			
			// solution 2:
			for(int i = 1; i<= n; i++) {
				if(i%3!=0 || i%7 !=0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}

		System.out.println("Homework 3:");
		{
			int min, max, current;
			System.out.println("Enter " + n + " numbers:");
			min = max = input.nextInt();
			
			for(int i = 1; i < n; i++) {
				current = input.nextInt();
				if(current > max) max = current;
				if(current < min) min = current;
			}
			
			System.out.println("minimal value: " + min);
			System.out.println("maximal value: " + max);
			
		}

	}

}
