package and1107.meikai.chapter7;

import java.util.Scanner;

public class Ren5
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n;
		
		String[] greetings = { "おはよう", "こんにちわ", "こんばんわ" };
		
		do {
			System.out.println("出力するメッセージを選んでください。(0~2)");
			System.out.print("99を入力した場合は終了します。\n> ");
			n = scan.nextInt();
			
			if (0 <= n && n <= 2) {
				System.out.println(greetings[n]);
			}
			
		} while (n != 99);
		
		System.out.print("\nプログラムを終了しました。");
	}
}
