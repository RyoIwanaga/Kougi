package and1107.meikai.chapter9;

public class Ex9
{
	public static void main(String[] args)
	{
		int a = 3;
		int b = 4;

		System.out.printf("a=%d\n", a);
		System.out.printf("b=%d\n", b);
		System.out.printf("aとbの合計値=%d\n", sum(a, b));
	}

	public static int sum(int min, int max)
	{
		return min + max;
	}
}
