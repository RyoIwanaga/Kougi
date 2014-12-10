package and1107.meikai.chapter6;

public class Ren7
{

	public static void main(String[] args)
	{
		System.out.println(sumTo(10));
	}

	public static int sumTo(int to)
	{
		return sumTo(to, 0);
	}

	public static int sumTo(int to, int acc)
	{
		if (to == 0)
			return acc;

		else
			return sumTo(to - 1, acc + to);
	}
}
