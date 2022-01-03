package lesson04_UsingTheConsole;

import java.util.Scanner;

public class Exercises {

	/**
	 * @author Orliin
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// read 3 numbers and print the sum:
		System.out.println("Exercise 1:");
		System.out.print("Enter 3 integers: ");
		System.out.println(input.nextInt() + input.nextInt() + input.nextInt());

		// read radius r and print perimeter and area:
		System.out.println("Exercise 2:");
		{
			System.out.print("Enter radius (format it 1,2 not 1.2): ");
			double r = input.nextDouble();
			System.out.printf("perimeter is %f\narea is %f\n", 2 * Math.PI * r,
					Math.PI * r * r);
		}

		// read 3 numbers and print the sum:
		System.out.println("Exercise 3:");
		{
			System.out.print("name:\t\t");
			String name = input.next();
			input.nextLine();

			System.out.print("address:\t");
			String address = input.nextLine();

			System.out.print("phone number\t");
			String phoneNumber = input.next();

			System.out.print("fax number\t");
			String faxNumber = input.next();

			System.out.print("web site:\t");
			String site = input.next();

			System.out.print("manager:\n\tfirst name:\t");
			String managerName = input.next();

			System.out.print("\tlast name:\t");
			String managerLastName = input.next();

			System.out.print("\tage:\t\t");
			byte age = input.nextByte();

			System.out.print("\tphone number:\t");
			String managerPhoneNumber = input.next();

			System.out.printf("name: %s\naddress: %s\nphone number: %s\n"
									+ "fax number: %s\nweb site: %s\nmanager:\n\tfirst name: %s\n"
									+ "\tlast name: %s\n\tage: %d\n\tphone number: %s\n",
							name, address, phoneNumber, 
							faxNumber, site, managerName, 
							managerLastName, age, managerPhoneNumber);
		}
	}

}
