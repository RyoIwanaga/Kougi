package and1107.meikai.chapter7;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ren8
{
	public static final int MAX_SUBJECTS = 5;
	public static final String[] SUBJECTS = { "英語", "数学", "物理", "科学", "歴史" };
	
	public static void main(String[] args)
	{
		
		int[] scores = new int[MAX_SUBJECTS];
		int score;
		
		int maxScore, minScore, sum;
		List<Integer> maxList, minList;
		
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
		
		/*** max min average ***/
		
		maxScore = scores[0];
		minScore = scores[0];
		maxList = new ArrayList<Integer>();
		maxList.add(0);
		minList = new ArrayList<Integer>();
		minList.add(0);
		
		sum = scores[0];
		
		for (int i = 1; i < MAX_SUBJECTS; i++) {
			
			score = scores[i];
			
			// update max
			if (score == maxScore) {
				maxList.add(i);
			} else if (score > maxScore) {
				maxScore = score;
				maxList = new ArrayList<Integer>();
				maxList.add(i);
			}
			
			// update min
			if (score == minScore) {
				minList.add(i);
			} else if (score < minScore) {
				minScore = score;
				minList = new ArrayList<Integer>();
				minList.add(i);
			}
			
			sum += scores[i];
		}
		
		System.out.printf("\n最高得点の科目は%sで「%d」点です。", makeStrSubjects(maxList), maxScore);
		System.out.printf("\n最低得点の科目は%sで「%d」点です。", makeStrSubjects(minList), minScore);
		System.out.printf("\n平均点は「%d」点です。", sum / MAX_SUBJECTS);
	}
	
	static String makeStrSubjects(List<Integer> lst)
	{
		StringBuffer buff = new StringBuffer();
		
		for (int i : lst) {
			buff.append('「');
			buff.append(SUBJECTS[i]);
			buff.append('」');
		}
		
		return buff.toString();
	}
}
