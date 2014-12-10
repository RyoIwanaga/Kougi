package and1107.meikai.chapter9;

public class Ex2
{
	public static void main(String[] args)
	{
		int[] dt = { 50, 20, 80, 30, 10, 40 };

		System.out.println(maxOfArray(dt));
	}

	static int maxOfArray(int[] n)
	{
		int max = n[0];

		for (int i=1; i < n.length; i++) {
			if (max < n[i]) {
				max = n[i];
			}
		}

		return max;
	}
}
