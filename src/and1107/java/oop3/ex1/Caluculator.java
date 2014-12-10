package and1107.java.oop3.ex1;

public class Caluculator
{
	public int add (int a, int b) {
		return a + b;
	}

	public double add (double a, double b) {
		return a + b;
	}

	public double add (int a, double b) {
		return a + b;
	}

	public double add (double a, int b) {
		return a + b;
	}

	public int diff (int a, int b) {
		return a - b;
	}

	public double diff (double a, double b) {
		return a - b;
	}

	public double diff (int a, double b) {
		return a - b;
	}

	public double diff (double a, int b) {
		return a - b;
	}

	public static void main(String[] args)
	{
		Caluculator calc = new Caluculator();

		System.out.printf("1 + 2 = %d\n", calc.add(1, 2));
		System.out.printf("1.1 + 2 = %f\n", calc.add(1.1, 2));
		System.out.printf("1 + 2.2 = %f\n", calc.add(1, 2.2));
		System.out.printf("1.1 + 2.2 = %f\n", calc.add(1.1, 2.2));

		System.out.printf("1 - 2 = %d\n", calc.diff(1, 2));
		System.out.printf("1.1 - 2 = %f\n", calc.diff(1.1, 2));
		System.out.printf("1 - 2.2 = %f\n", calc.diff(1, 2.2));
		System.out.printf("1.1 - 2.2 = %f\n", calc.diff(1.1, 2.2));
	}
}
