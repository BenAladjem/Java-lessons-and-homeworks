package lesson02_PrimitiveDataTypesAndVariables;

public class Exercise02 {

	/**
	 * @author Orliin
	 * 
	 * Task:
	 * Which of the following values can be assigned
	 * to a variable of type float and which to a
	 * variable of type double: 34.567839023, 12.345,
	 * 8923.1234857, 3456.091?
	 */
	
	public static void main(String[] args) {
		float f1 = 34.567839023f;
		float f2 = 12.345f;
		float f3 = 8923.1234857f;
		float f4 = 3456.091f;
		
		System.out.println("Float:");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		
		double d1 = 34.567839023f;
		double d2 = 12.345f;
		double d3 = 8923.1234857f;
		double d4 = 3456.091f;
		
		System.out.println("Double with float values:");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		d1 = 34.567839023;
		d2 = 12.345;
		d3 = 8923.1234857;
		d4 = 3456.091;
		
		System.out.println("Double:");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
	}

}
