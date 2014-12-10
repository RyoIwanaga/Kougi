package and1107.meikai.chapter9;

import java.util.Scanner;

public class Ex11
{
	static final int MAX = 3;

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int array[] = new int[MAX];

		for (int i = 0; i < MAX; i++) {
			System.out.printf("値%d: ", i);
			array[i] = scan.nextInt();
		}

		System.out.printf("でかい値%d: ", best(array));
	}

	public static int big(int a, int b)
	{
		if (a >= b)
			return a;
		else
			return b;
	}

	public static int best(int[] array)
	{
		int best = array[0];

		for (int i=1; i < array.length; i++) {
			if (best < array[i])
				best = array[i];
		}

		return best;
	}
}
