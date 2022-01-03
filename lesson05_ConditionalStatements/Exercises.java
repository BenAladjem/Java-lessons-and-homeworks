package lesson05_ConditionalStatements;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.GOTO;

public class Exercises {

	/**
	 * @author Orliin
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a, b, c;

		// read 2 numbers and print the greater:
		System.out.println("Exercise 1:");
		System.out.print("Enter 2 integers: ");
		a = input.nextInt();
		b = input.nextInt();
		int max = a > b ? a : b;
		int min = a < b ? a : b;
		a = min;
		b = max;
		System.out.printf("a: %d\nb: %d\n", a, b);

		// read 3 numbers and print the sign of the product:
		/*
		 * System.out.println("Exercise 2:"); {
		 * System.out.print("Enter 3 integers: "); a = input.nextInt(); b =
		 * input.nextInt(); c = input.nextInt(); int count = 0;
		 * 
		 * if (a < 0) count++; if (b < 0) count++; if (c < 0) count++;
		 * System.out.println(count % 2 == 0 ? "+" : "-"); }
		 * 
		 * // read 3 numbers and print the sum:
		 * System.out.println("Exercise 3:"); {
		 * System.out.print("Enter 3 integers: "); a = input.nextInt(); b =
		 * input.nextInt(); c = input.nextInt();
		 * 
		 * if (a > b) { if (a > c) { System.out.println(a); } else {
		 * System.out.println(c); } } else { if (b > c) { System.out.println(b);
		 * } else { System.out.println(c); } } }
		 * 
		 * // read 3 numbers and print the sum:
		 * System.out.println("Exercise 4:"); {
		 * System.out.print("Enter 3 integers: "); a = input.nextInt(); b =
		 * input.nextInt(); c = input.nextInt(); int tmp;
		 * 
		 * if (a < b) { tmp = a; a = b; b = tmp; } if (b < c) { tmp = c; c = b;
		 * b = tmp; } if (a < b) { tmp = a; a = b; b = tmp; }
		 * System.out.printf("%d >= %d >= %d\n", a, b, c); }
		 * 
		 * // read a digit and print it in Bulgarian:
		 * System.out.println("Exercise 5:"); {
		 * System.out.print("Enter a digit: "); int digit = input.nextInt();
		 * 
		 * switch (digit) { case 0: System.out.println("нула"); break; case 1:
		 * System.out.println("едно"); break; case 2: System.out.println("две");
		 * break; case 3: System.out.println("три"); break; case 4:
		 * System.out.println("четири"); break; case 5:
		 * System.out.println("пет"); break; case 6: System.out.println("шест");
		 * break; case 7: System.out.println("седем"); break; case 8:
		 * System.out.println("осем"); break; case 9:
		 * System.out.println("девет"); break; default:
		 * System.out.println("не е цифра!"); } }
		 * 
		 * // read 3 numbers and solve axx+bx+c=0:
		 * System.out.println("Exercise 6:"); {
		 * System.out.print("Enter 3 numbers: "); double A = input.nextDouble();
		 * double B = input.nextDouble(); double C = input.nextDouble();
		 * 
		 * double D = B * B - 4 * A * C;
		 * 
		 * if (D > 0) { double x1 = (-B - Math.sqrt(D)) / (2 * A); double x2 =
		 * (-B + Math.sqrt(D)) / (2 * A);
		 * System.out.printf("x1 = %.2f\nx2 = %.2f\n", x1, x2); } else if (D ==
		 * 0) { System.out.println("x = " + (-B / (2 * A))); } else {
		 * System.out.println("Уравнението няма решения!"); } }
		 * 
		 * // read 5 numbers and find the greatest:
		 * System.out.println("Exercise 7:"); {
		 * System.out.print("Enter 5 numbers: "); int a1 = input.nextInt(); int
		 * a2 = input.nextInt(); int a3 = input.nextInt(); int a4 =
		 * input.nextInt(); int a5 = input.nextInt();
		 * 
		 * max = a1;
		 * 
		 * if (max < a2) max = a2; if (max < a3) max = a3; if (max < a4) max =
		 * a4; if (max < a5) max = a5;
		 * 
		 * System.out.println(max); }
		 * 
		 * // read 3 numbers and find a subset with sum 0:
		 * System.out.println("Exercise 8:"); {
		 * System.out.print("Enter 3 numbers: "); a = input.nextInt(); b =
		 * input.nextInt(); c = input.nextInt();
		 * 
		 * System.out.println(a == 0 || b == 0 || c == 0 || a + b == 0 || a + c
		 * == 0 || b + c == 0 || a + b + c == 0 ? "Yes" : "No"); }
		 * 
		 * // read a score and give a bonus: System.out.println("Exercise 9:");
		 * { System.out.print("Enter the score: "); int score = input.nextInt();
		 * 
		 * switch (score) { case 1: case 2: case 3: score *= 10; break; case 4:
		 * case 5: case 6: score *= 100; break; case 7: case 8: case 9: score *=
		 * 1000; break; default: System.out.println("грешка!"); } }
		 */
		// pronounce a number:
		System.out.println("Exercise 10:");
		{
			while (true) {
				System.out.print("Enter a number (up to 3 digits): ");
				int number = input.nextInt();

				String result = "";

				int n0 = number % 10;
				int n1 = (number / 10) % 10;
				int n2 = (number / 100) % 10;

				switch (n2) {
				case 9:
					result = "деветстотин";
					break;
				case 8:
					result = "осемстотин";
					break;
				case 7:
					result = "седемстотин";
					break;
				case 6:
					result = "шестстотин";
					break;
				case 5:
					result = "петстотин";
					break;
				case 4:
					result = "четиристотин";
					break;
				case 3:
					result = "триста";
					break;
				case 2:
					result = "двеста";
					break;
				case 1:
					result = "сто";
					break;
				}

				if (n1 != 0 || n0 != 0) {
					if (n0 == 0) {
						result += " и ";
						switch (n1) {
						case 9:
							result += "деветдесет";
							break;
						case 8:
							result += "осемдесет";
							break;
						case 7:
							result += "седемдесет";
							break;
						case 6:
							result += "шестдесет";
							break;
						case 5:
							result += "петдесет";
							break;
						case 4:
							result += "четиридесет";
							break;
						case 3:
							result += "тридесет";
							break;
						case 2:
							result += "двадесет";
							break;
						case 1:
							result += "десет";
							break;
						}
					} else {
						switch (n1) {
						case 9:
							result += " деветдесет";
							break;
						case 8:
							result += " осемдесет";
							break;
						case 7:
							result += " седемдесет";
							break;
						case 6:
							result += " шестдесет";
							break;
						case 5:
							result += " петдесет";
							break;
						case 4:
							result += " четиридесет";
							break;
						case 3:
							result += " тридесет";
							break;
						case 2:
							result += " двадесет";
							break;
						case 1:
							result += " десет";
							break;
						}
						result += " и ";
						switch (n0) {
						case 9:
							result += "девет";
							break;
						case 8:
							result += "осем";
							break;
						case 7:
							result += "седем";
							break;
						case 6:
							result += "шест";
							break;
						case 5:
							result += "пет";
							break;
						case 4:
							result += "четири";
							break;
						case 3:
							result += "три";
							break;
						case 2:
							result += "две";
							break;
						case 1:
							result += "едно";
							break;
						}
					}
				}
				System.out.println(result);
			}
		}

	}

}
