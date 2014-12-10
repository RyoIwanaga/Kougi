package and1107.meikai.chapter6;

import java.util.Scanner;

public class Ren8
{
	public static void main(String[] args)
	{
		int first, second;
		int min, max;

		Scanner scan = new Scanner(System.in);

		System.out.println("開始値から、終了値までの値の総和を求めます。");
		System.out.print("開始値を入力してください: ");
		first = scan.nextInt();
		System.out.print("終了値を入力してください: ");
		second = scan.nextInt();

		if (first < second) {
			min = first;
			max = second;
		} else {
			min = second;
			max = first;
		}

		System.out.println("\n合計値: " + sum(min, max));
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
			return sum(min + 1, max, acc + min);
	}
}
