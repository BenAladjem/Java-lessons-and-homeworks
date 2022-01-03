package lesson04_UsingTheConsole;

import java.util.Scanner;

public class Homeworks {

	/**
	 * @author Orliin
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		int y = input.nextInt();

		// how many numbers between x and y divide by 5:
		System.out.println("Homework 1:");
		{
			int a = x < y ? x : y;
			int b = x > y ? x : y;
			b = b - b % 5;
			a = a % 5 == 0 ? a : (a + 5) - a % 5;
			System.out.println((b - a) / 5 + 1);
		}
		
		// print the greater number:
		System.out.println("Homework 2:");
		{
			System.out.println(x>y?x:y);
		}
		
		// how many numbers between x and y divide by 5:
		System.out.println("Homework 3:");
		{
			System.out.println("We are not able to solve this problem.");
		}
		
		// :
		System.out.println("Homework 4,5,6,7:");
		{
			System.out.println("We are not able to solve this problem.");
		}
	}

}
