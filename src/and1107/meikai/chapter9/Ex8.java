package and1107.meikai.chapter9;

public class Ex8
{
	public static void main(String[] args)
	{
		System.out.printf("1から10までの合計値は、%dです。", sum(1, 10));
	}

	public static int sum(int min, int max)
	{
		return sum(min, max, 0);
	}

	public static int sum(int min, int max, int acc)
	{
		if (min > max)
			return acc;
		else
			return sum(
					min + 1,
					max,
					acc + min);
	}
}
