package and1107.meikai.chapter6;

public class Ex1
{
	public static void main(String[] args)
	{
		int min = 0;
		int max = 100;
		int sum, i;
		
		/*** for ***/
		
		System.out.print("for: ");
		sum = 0;
		
		for (i = min; i < max; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		/*** while ***/
		
		System.out.print("while: ");
		i = min;
		sum = 0;
		
		while (i < max) {
			sum += i;
			i++;
		}
		
		System.out.println(sum);
		
		/*** do-while ***/
		
		System.out.print("do-while: ");
		i = min;
		sum = 0;
		
		do {
			sum += i;
			i++;
		} while (i < max);
		
		System.out.println(sum);
		
	}
}
