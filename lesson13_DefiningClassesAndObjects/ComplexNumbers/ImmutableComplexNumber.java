package lesson13_DefiningClassesAndObjects.ComplexNumbers;
public class ImmutableComplexNumber {
	private double real;
	private double img;

	public ImmutableComplexNumber(double real, double img) {
		this.real = real;
		this.img = img;
	}

	static ImmutableComplexNumber add(ImmutableComplexNumber a,
			ImmutableComplexNumber b) {
		return new ImmutableComplexNumber(a.real + b.real, a.img + b.img);
	}

	static ImmutableComplexNumber multiply(ImmutableComplexNumber a, ImmutableComplexNumber b) {
		return new ImmutableComplexNumber(a.real * b.real - a.img * b.img,
				a.real * b.img + b.real * a.img);
	}

	public String toString() {
		return "( " + real + " , " + img + " )";
	}
}
