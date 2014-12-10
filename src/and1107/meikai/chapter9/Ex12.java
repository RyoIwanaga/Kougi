package and1107.meikai.chapter9;

public class Ex12
{
	public static void main(String[] args)
	{
		printTriangle(3, '$');
		printTriangle(4, 'o');
		printTriangle(5, 'x');
	}

	public static void printTriangle(int height, char c)
	{
		for (int y = 1; y <= height; y++) {
			for (int x = 1; x <= y; x++) {
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println();
	}
}
