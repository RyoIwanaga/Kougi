package and1107.meikai.chapter9;

public class Ex10
{
	public static void main(String[] args)
	{
		int a = 3;
		int b = 2;

		System.out.printf("%dと%dは%dがおおきい。", a, b, big(a, b));
	}

	public static int big(int a, int b)
	{
		if (a >= b)
			return a;
		else
			return b;
	}
}
