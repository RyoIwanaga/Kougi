package and1107.meikai.chapter9;

public class Ex5
{

	public static void main(String[] args)
	{
		printKurikaesiNtimes(3);
	}

	public static void printKurikaesi()
	{
		System.out.println("繰り返し文だ?");
	}

	public static void printKurikaesiNtimes(int n)
	{
		for (int i= 0; i < n; i++) {
			printKurikaesi();
		}
	}
}
