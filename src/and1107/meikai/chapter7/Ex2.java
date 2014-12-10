package and1107.meikai.chapter7;

public class Ex2
{
	public static void main(String[] args)
	{
		int[] dt = { 10, 20, -30, 40, -50, 60 };
		int sum = 0;

		for (int item : dt) {
			if (item > 0) sum += item;
		}

		System.out.printf("Sum of positive value is %d.\n", sum);
	}
}
