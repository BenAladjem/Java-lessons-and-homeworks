package lesson03_OperatorsAndExpressions;

public class Homeworks {

	/**
	 * @author Orliin
	 */
	public static void main(String[] args) {
		int x = 1;
		int y = -2;

		// check whether (x,y) is inside K(O, 5):
		System.out.println("Homework 1:");
		System.out.println(x*x + y*y <= 25 ? "inside" : "outside");
		
		// check whether n<=100 is prime:
		System.out.println("Homework 2:");
		{
			int n = 101;
			System.out.println(n%2 != 0 && n%3 != 0 && n%5 != 0 && n%7 != 0 ? "prime" : "not prime");
		}
		
		// check whether n<=100 is prime:
		System.out.println("Homework 3:");
		{
			int a = 5;
			int b = 8;
			int h = 3;
			
			System.out.println((a+b)*h/2.);
		}
		
		// check whether (x,y) is inside K((1,1), 4) and outside the rectangle ((-1,1),(5,5)):
		System.out.println("Homework 4:");
		System.out.println((((x-1)*(x-1) + (y-1)*(y-1) <= 16) && (x>4 || x<-1 || y>6 || y<-4)) ? "inside" : "outside");
		
		
	}

}
