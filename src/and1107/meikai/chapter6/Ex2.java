package and1107.meikai.chapter6;

public class Ex2
{
	public static void main(String[] args)
	{
		int minYear = 2000;
		int maxYear = 2200;
		
		for (int y = minYear, i = 0; y <= maxYear; y++) {
			
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
				
				if (i % 14 == 0) {
					System.out.println();
				}
				
				System.out.printf("%d ", y);
				i++;
			}
		}
	}
}
