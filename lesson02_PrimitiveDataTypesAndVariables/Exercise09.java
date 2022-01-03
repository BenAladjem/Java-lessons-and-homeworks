package lesson02_PrimitiveDataTypesAndVariables;

public class Exercise09 {

	/**
	 * @author Orliin
	 * 
	 * Task: Declare two integer variables and assign them with 5 and 10. Write
	 * a program that exchanges their values.
	 */
	public static void main(String[] args) {
		int x = 5;
		int y = 10;

		System.out.printf("x=%d y=%d\n", x, y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.printf("x=%d y=%d\n", x, y);

		int z;

		z = x;
		x = y;
		y = z;

		System.out.printf("x=%d y=%d\n", x, y);

		x = x ^ y;
		y = x ^ y;
		x = x ^ y;

		System.out.printf("x=%d y=%d\n", x, y);
	}

}
