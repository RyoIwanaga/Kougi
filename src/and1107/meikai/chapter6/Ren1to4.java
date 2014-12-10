package and1107.meikai.chapter6;

import java.util.Scanner;

public class Ren1to4
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int sansu, kokugo;

		System.out.print("算数の点数を入力してください: ");
		sansu = scan.nextInt();

		System.out.print("国語の点数を入力してください: ");
		kokugo = scan.nextInt();

		if (sansu >= 80 && kokugo >= 80) {
			System.out.println("合格");
		} else if (sansu >= 80 || kokugo >= 80) {
			System.out.println("もうすこし");
		} else {
			System.out.println("残念");
		}

		System.out.printf("\n平均点は%.1fです。\n", (double) (sansu + kokugo) / 2);

		System.out.print("国語の点数が、");
		if (kokugo == 100)
			System.out.println("満点です。");
		else if (kokugo > 95)
			System.out.println("おしい。");
		else if (kokugo > 80)
			System.out.println("そこそこ。");
		else if (kokugo > 60)
			System.out.println("まあまあ。");
		else
			System.out.println("ひどい。");

		/*** 季節 ***/

		System.out.print("\n月を入力してください: ");
		int month = scan.nextInt();

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("冬ですね。");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("春ですね。");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏ですね。");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋ですね。");
			break;
		default:
			System.out.println("月は1～12までの数値を入力してください。");
		}
	}
}
