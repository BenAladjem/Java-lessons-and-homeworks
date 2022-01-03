package lesson02_PrimitiveDataTypesAndVariables;

public class Exercise0456 {

	/**
	 * @author Orliin
	 * 
	 * Task:
	 * Declare an integer variable and assign it with
	 * the value 256 in hexadecimal format (256 is 100
	 * in base 16).
	 * 
	 * Task:
	 * Declare a character variable and assign it with
	 * the symbol with code 72 (72 is 48 in base 16).
	 * 
	 * Task:
	 * Declare a boolean variable called isFemale
	 * and assign an appropriate value corresponding
	 * to your gender.
	 */
	public static void main(String[] args) {
		int x = 0x100;
		System.out.println(x);
		
		char c = '\u0048';
		System.out.println((int)c);
		System.out.println(c);
		
		boolean isFemale = false;
		System.out.println(isFemale);
	}

}
