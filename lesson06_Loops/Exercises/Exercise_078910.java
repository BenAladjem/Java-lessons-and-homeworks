package lesson06_Loops.Exercises;

import java.io.IOException;
import java.util.Scanner;

public class Exercise_078910 {

	/**
	 * @author Orliin
	 * 
	 * Task:
	 * 7. Write a program that converts a decimal number to its binary representation.
	 * 8. Write a program that converts à binary number to its decimal representation.
	 * 9. Write a program that converts a decimal number to a hexadecimal number.
	 * 10.Write a program that converts a hexadecimal number to a decimal number.
	 * 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Homework 7:");
		{
			System.out.print("n = ");
		
			int n = input.nextInt();
			
			do {
				System.out.println(n%2);
				n/=2;
			} while(n>0);
		}
		
		System.out.println("Homework 8:");
		{
			System.out.print("binry = ");
			String binary = input.next();
			
			int n = 0;
			for(int i = 0; i < binary.length(); i++) {
				n *= 2;
				n += binary.charAt(i)-'0';
			}
			
			System.out.println(n);
		}
		
		System.out.println("Homework 9:");
		{
			System.out.print("n = ");
		
			int n = input.nextInt();
			
			do {
				System.out.println(n%16 < 10 ? (char)('0' + n%16) : (char)('A' + n%16 - 10));
				n/=2;
			} while(n>0);
		}
		
		System.out.println("Homework 10:");
		{
			System.out.print("hex = ");
			String hex = input.next();
			
			int n = 0;
			for(int i = 0; i < hex.length(); i++) {
				n *= 16;
				if(hex.charAt(i) >= '0' && hex.charAt(i) <= '9') {
					n += hex.charAt(i)-'0';
				} else {
					n += hex.charAt(i)-'A'+10;
				}
				
			}
			
			System.out.println(n);
		}
	}

}
