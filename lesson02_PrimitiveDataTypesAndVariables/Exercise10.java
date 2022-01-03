package lesson02_PrimitiveDataTypesAndVariables;

public class Exercise10 {

	/**
	 * @author Orliin
	 * 
	 * Task: A marketing firm wants to keep record of its employees. Each record
	 * would have the following characteristics – first name, family name, age,
	 * gender (m or f), ID number, unique employee number (27560000 to
	 * 27569999). Declare the variables needed to keep the information for a
	 * single employee using appropriate data types and descriptive names.
	 */
	public static void main(String[] args) {
		String firstName = "Orlin";
		String familyName = "Tenchev";
		byte age = 26;
		char gender = 'm';
		short ID = 1234; // or int ID = 27561234
		short employeeNumber = 9876; // or int employeeNumber = 27569876

		System.out.printf("Name:\t%s %s\nAge:\t%d\nGender:\t%c\nID:\t2756%d\neNum:\t2756%d\n",
						firstName, familyName, age, gender, ID, employeeNumber);
	}

}
