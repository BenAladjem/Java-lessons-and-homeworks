package lesson02_PrimitiveDataTypesAndVariables;

public class Exercise07 {

	/**
	 * @author Orliin
	 * 
	 * Task:
	 * Declare two string variables and assign them
	 * with following value:
	 * * The "use" of quotations causes difficulties.
	 * Do the above in two different ways.
	 */
	public static void main(String[] args) {
		String s1 = "The \"use\" of quotations causes difficulties.";
		String s2 = "The " + '"' + "use" + '"' + " of quotations causes difficulties.";

		System.out.println(s1);
		System.out.println(s2);
		
		
	}

}
