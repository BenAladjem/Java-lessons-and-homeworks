package lesson08_Methods;

import java.util.Scanner;

public class Temperature {
	public static double fahrenheitToCelsius(double degrees) {
		double celsius = (degrees - 32) * 5 / 9;
		return celsius;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter your body temperature in Fahrenheit degrees: ");
		double temperature = input.nextDouble();

		temperature = fahrenheitToCelsius(temperature);

		System.out.printf("Your body temperature in Celsius degrees is %f.%n",
				temperature);

		if (temperature >= 37)
			System.out.println("You are ill!");

		input.close();
	}

}
