package and1107.meikai.chapter9;

public class Ex14
{

	public static void main(String[] args)
	{
		for (int i = 1; i < 100; i++) {
			if (isPrimeNumber(i))
				System.out.println(i + " is Prime.");
		}
	}

	public static boolean isPrimeNumber(int n)
	{
		if (n <= 1) {
			return false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}

			return true;
		}
	}
}
