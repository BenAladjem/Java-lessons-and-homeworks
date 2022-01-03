package lesson03_OperatorsAndExpressions;

public class Exercises {

	/**
	 * @author Orliin
	 */
	public static void main(String[] args) {
		int x = 725;
		
		//check whether x is odd or even:
		System.out.println("Exercise 1:");
		System.out.println(x%2==0? "even" : "odd");
		
		//check whether x is divided by 7 and 5:
		System.out.println("Exercise 2:");
		System.out.println(x%5==0 && x%7==0 ? "yes" : "no");
		
		//calculate rectangular area:
		System.out.println("Exercise 3:");
		{
			int width = 3;
			int height = 4;
			System.out.println(width*height);
		}
		
		//check third digit:
		System.out.println("Exercise 4:");
		System.out.println((x/100)%10 == 7);
		
		//check third bit:
		System.out.println("Exercise 5:");
		System.out.println((x/4)%2);
		
	}

}
