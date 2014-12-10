package and1107.meikai.chapter6;

/*
 Eｘ９.自分専用のATM画面を作成してください。
 １.パスワード数字４桁を決めてその入力を確認する。
 ここで３回失敗したらプログラムを終了させてください。
 ２.メニュー画面を作成する。
 １.入金画面
 金額を入力し、その後、金額の確認をして入金する。
 ２.残高照会画面
 現在の残高を表示する。
 ３.出金画面
 金額を入力し、その後、金額の確認をして入金する。
 ４.終了画面
 確認メッセージにて、Y　入力で終了
 */

import java.util.Scanner;

public class Ren9
{
	private static final int PASSWORD = 1234;
	private static final int LIMIT_MISS = 3;

	static int zandaka = 1000;

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		int input;

		System.out.println("*** ようこそ！　岩永銀行へ！***\n");

		for (int i = 0; i < LIMIT_MISS; i++) {
			System.out.print("4桁の暗証番号を入力してください。 > ");
			input = scan.nextInt();

			if (input == PASSWORD) {
				goMenu();
				break;
			}

			System.out.println("* ログインに失敗しました *");
		}

		System.out.println("\nまたのご利用をお待ちしております。");
	}

	private static void goMenu()
	{
		Scanner scan = new Scanner(System.in);

		System.out
				.print("\n以下のメニューから選択してください。\n[1]入金 \n[2]残高照会 \n[3]出金 \n[4]終了 \n> ");

		switch (scan.nextInt()) {
		case 1:
			goNyukin();
			goMenu();
			break;
		case 2:
			goDisplay();
			goMenu();
			break;
		case 3:
			goDe();
			goMenu();
			break;
		case 4:
			if (!goQuit()) {
				goMenu();
			}

			break;
		default:
			goMenu();
		}
	}

	private static void goDisplay()
	{
		System.out.printf("\n残り残高は %d 円です。\n", zandaka);
	}

	private static boolean goQuit()
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("\n本当に終了してもよろしいですか？\nよろしければ「Y」を入力してください。 \n > ");

		if (scan.next().equals("Y")) {
			return true;
		} else {
			return false;
		}

	}

	private static void goNyukin()
	{
		Scanner scan = new Scanner(System.in);
		int n;

		System.out.print("\n入金額\n> ");
		n = scan.nextInt();

		System.out.printf("\n%d 円を入金しますがよろしいですか。\nよろしければ「Y」を入力してください。\n> ", n);

		if (scan.next().equals("Y")) {
			zandaka += n;
		}

		goDisplay();
	}

	private static void goDe()
	{
		Scanner scan = new Scanner(System.in);
		int n;

		System.out.print("\n出金額\n> ");
		n = scan.nextInt();

		if (n > zandaka)
			return;

		System.out.printf("\n%d 円を出金しますがよろしいですか。\nよろしければ「Y」を入力してください。\n> ", n);

		if (scan.next().equals("Y")) {
			zandaka -= n;
		}

		goDisplay();
	}
}
