package calculator;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}

	public int multiply(int a, int b) {
		return a*b;
	}

	public double divide(double a, double b) {
		if(b==0)
		{
			throw new IllegalArgumentException("Number cannot be divided by zero");
		}
		return a/b;
	}
}
