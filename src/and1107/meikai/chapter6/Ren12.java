package and1107.meikai.chapter6;

public class Ren12
{
	public static void main(String[] args)
	{
		int height = 20;
		int width = height * 2 - 1;
		int start, end;

		for (int y = 0; y < height; y++) {

			start = width / 2 - y;
			end = width / 2 + y;

			for (int x = 0; x < width; x++) {

				if (start <= x && x <= end) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
