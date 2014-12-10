package and1107.meikai.chapter7;

import java.util.Scanner;

public class Ren6
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s;
		
		String[] greetings = { "GoodMorning", "Hello", "GoodEvening" };
		
		do {
			System.out.println("「GoodMorning」「Hello」「GoodEvening」のうちいずれかの文字列を入力すると挨拶を出力します。");
			;
			System.out.print("「end」と入力した場合は終了します。\n> ");
			s = scan.next();
			
			if (s.equals(greetings[0]) || s.equals(greetings[1]) || s.equals(greetings[2])) {
				System.out.println(s);
			}
			
		} while (!s.equals("end"));
		
		System.out.print("\nプログラムを終了しました。");
	}
}
