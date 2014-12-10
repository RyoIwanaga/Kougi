package and1107.meikai.chapter7;

import java.util.Scanner;

public class Ren7
{
	public static void main(String[] args)
	{
		final int MAX_SUBJECTS = 5;
		final String[] SUBJECTS = { "英語", "数学", "物理", "科学", "歴史" };
		
		int[] scores = new int[MAX_SUBJECTS];
		int score;
		
		Scanner scan = new Scanner(System.in);
		
		/*** get scores ***/
		
		for (int i = 0; i < MAX_SUBJECTS; i++) {
			
			do {
				System.out.printf("「%s」の得点を入力してください。 > ", SUBJECTS[i]);
				score = scan.nextInt();
			} while (score < 0 || 100 < score);
			
			scores[i] = score;
		}
		
		System.out.print("\n結果");
		
		for (int i = 0; i < MAX_SUBJECTS; i++) {
			
			System.out.printf("\n「%s」の得点は「%3d」点です。", SUBJECTS[i], scores[i]);
		}
	}
}
