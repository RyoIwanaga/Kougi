package and1107.meikai.chapter9;

public class Ex13
{

	public static void main(String[] args)
	{
		print99Row(3);
	}

	public static void print99Row(int n)
	{
		final int MAX = 9;

		for (int x=1; x <= MAX; x++)
			System.out.printf("%d ", x*n);

	}
}
