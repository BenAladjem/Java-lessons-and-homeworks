package lesson13_DefiningClassesAndObjects.ComplexNumbers;


public class ComplexNumbersExample {

	public static void main(String[] args) {
		ImmutableComplexNumber immA = new ImmutableComplexNumber(0,1);
		ImmutableComplexNumber immB = new ImmutableComplexNumber(0,1);
		
		System.out.printf("%s * %s = %s\n", immA, immB, ImmutableComplexNumber.multiply(immA, immB));
		System.out.printf("%s + %s = %s\n", immA, immB, ImmutableComplexNumber.add(immA, immB));
		
		/*****************************************/
		
		MutableComplexNumber mutA = new MutableComplexNumber(0,1);
		MutableComplexNumber mutB = new MutableComplexNumber(0,1);
		
		mutA.multiply(mutB);
		System.out.printf("a = %s\nb = %s\n", mutA, mutB);
	}

}
