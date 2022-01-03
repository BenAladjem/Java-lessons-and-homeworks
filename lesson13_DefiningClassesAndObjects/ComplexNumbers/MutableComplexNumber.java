package lesson13_DefiningClassesAndObjects.ComplexNumbers;

public class MutableComplexNumber {
	private double real;
	private double img;

	public MutableComplexNumber(double real, double img) {
		this.real = real;
		this.img = img;
	}

	public void add(MutableComplexNumber other) {
		double newReal = this.real + other.real;
		double newImg = this.img + other.img;
		
		this.real = newReal;
		this.img = newImg;
	}
	
	public void multiply(MutableComplexNumber other) {
		double newReal = this.real * other.real - this.img * other.img;
		double newImg = this.real * other.img - this.img * other.real;
		
		this.real = newReal;
		this.img = newImg;
	}
	
	public String toString() {
		return "( " + real + " , " + img + " )";
	}
	
}
