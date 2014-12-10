package and1107.meikai.chapter7;

public class Ex1
{

	public static void main(String[] args)
	{
		int[] dt = { 20, 40, 10, 80, 30, 90, 50 };
		int max = dt[0];
		int min = dt[0];

		for (int i = 1; i < dt.length; i++) {
			if (max < dt[i]) max = dt[i];
			if (min > dt[i]) min = dt[i];
		}

		System.out.printf("Max value: %d\n", max);
		System.out.printf("Min value: %d\n", min);
	}
}
