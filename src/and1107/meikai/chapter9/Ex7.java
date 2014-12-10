package and1107.meikai.chapter9;

public class Ex7
{
	public static void main(String[] args)
	{
		System.out.printf("1から10までの合計値は、%dです。", sum(10));
	}

	public static int sum(int n)
	{
		return sum(n, 0);
	}

	public static int sum(int n, int acc)
	{
		if (n <= 0)
			return acc;
		else
			return sum(
					n - 1,
					acc + n);
	}
}
