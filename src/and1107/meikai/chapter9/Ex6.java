package and1107.meikai.chapter9;

public class Ex6
{
	public static void main(String[] args)
	{
		printToN(5);
	}

	public static void printN(int n)
	{
		System.out.println(n);
	}

	public static void printToN(int n)
	{
		for (int i= 0; i < n; i++) {
			printN(i);
		}
	}
}
