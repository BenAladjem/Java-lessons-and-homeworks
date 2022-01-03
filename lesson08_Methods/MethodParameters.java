package lesson08_Methods;

import java.util.Scanner;

public class MethodParameters {
	public static void printSign(int number)
	{
		if (number > 0)
			System.out.printf("The number %d is positive.", number);
		else if (number < 0)
			System.out.printf("The number %d is negative.", number);
		else
			System.out.printf("The number %d is zero.", number);
	}

	static void printMax(float number1, float number2)
	{
		float max = number1;
		if (number2 > number1)
			max = number2;
		System.out.println("Maximal number: " + max);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
        
		System.out.print("m = ");
		int m = input.nextInt();

		printSign(n);
		printSign(m);
		printMax(n, m);
	}

}
