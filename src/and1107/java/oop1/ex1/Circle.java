package and1107.java.oop1.ex1;

public class Circle
{
	int radias;

	Circle (int r) {
		this.radias = r;
	}

	int area ()
	{
		return (int)((this.radias * this.radias) * Math.PI);
	}

	int circumference ()
	{
		return (int)((this.radias + this.radias) * Math.PI);
	}

	public static void main(String[] args)
	{
		System.out.println(new Circle(2).area());
		System.out.println(new Circle(3).area());
		System.out.println(new Circle(2).circumference());
		System.out.println(new Circle(3).circumference());
	}
}