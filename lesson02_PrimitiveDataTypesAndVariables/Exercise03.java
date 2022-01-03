package lesson02_PrimitiveDataTypesAndVariables;

public class Exercise03 {

	/**
	 * @author Orliin
	 * 
	 * Task:
	 * How can we safely compare floating-point
	 * numbers?
	 */
	public static void main(String[] args) {
		float f1 = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
		float f2 = 1f;
		
		System.out.println((double)f1);
		System.out.println((double)f2);
		System.out.println(f1-f2);
		System.out.println((double)f1-(double)f2);
		
		System.out.println(f1 == f2);
		System.out.println(f1-f2<0.000001);
	}

}
