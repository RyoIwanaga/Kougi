package and1107.meikai.chapter7;

import java.util.Scanner;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class Ren11
{
	static final int PASSWORD = 1234;
	static final int LIMIT_MISS = 3;

	static int zandaka = 1000;
	static List<History> history = new ArrayList<History>();

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

	public static String makeStrDateTime()
	{
		Date date1 = new Date(); //(1)Dateオブジェクトを生成
		//(2)SimpleDateFormatオブジェクトを生成
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy'年'MM'月'dd'日'　hh':'mm':'ss");

		return sdf1.format(date1).toString();
	}

	private static void printZandaka()
	{
		System.out.printf("\n残り残高は %d 円です。\n", zandaka);
	}

	private static void goMenu()
	{
		Scanner scan = new Scanner(System.in);

		System.out.print(
				"\n以下のメニューから選択してください。\n[1]入金 \n[2]残高照会 \n[3]出金 \n[4]履歴 \n[5]終了 \n> ");

		switch (scan.nextInt()) {
		case 1:
			goNyukin();
			goMenu();
			break;
		case 2:
			goShyoukai();
			goMenu();
			break;
		case 3:
			goShukkin();
			goMenu();
			break;
		case 4:
			goDisplayHistory();
			goMenu();
			break;
		case 5:
			if (!goQuit()) {
				goMenu();
			}

			break;
		default:
			goMenu();
		}
	}

	private static void goShyoukai()
	{
		System.out.println("=== 預金残高表示画面 ===\n");

		printZandaka();
		history.add(
				new ShoukaiHistory(makeStrDateTime(), zandaka));
	}

	private static void goNyukin()
	{
		Scanner scan = new Scanner(System.in);
		int n;

		System.out.println("=== 入金画面 ===\n");

		System.out.print("\n入金額\n> ");
		n = scan.nextInt();

		System.out.printf("\n%d 円を入金しますがよろしいですか。\nよろしければ「Y」を入力してください。\n> ", n);

		if (scan.next().equals("Y")) {
			zandaka += n;
			history.add(
					new NyukinHistory(makeStrDateTime(), zandaka, n));
		}

		printZandaka();
	}

	private static void goShukkin()
	{
		Scanner scan = new Scanner(System.in);
		int n;

		System.out.println("=== 出金画面 ===\n");


		System.out.print("\n出金額\n> ");
		n = scan.nextInt();

		if (n > zandaka)
			return;

		System.out.printf("\n%d 円を出金しますがよろしいですか。\nよろしければ「Y」を入力してください。\n> ", n);

		if (scan.next().equals("Y")) {
			zandaka -= n;
			history.add(
					new ShukkinHistory(makeStrDateTime(), zandaka, n));
		}

		printZandaka();
	}

	private static void goDisplayHistory()
	{
		System.out.println("=== 履歴表示画面 ===\n");

		if (history.isEmpty()) {
			System.out.println("履歴が空です。\n");
		} else
			for (History h: history) {
				h.print();
			}
	}


	private static boolean goQuit()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("=== 終了確認画面 ===\n");


		System.out.print("本当に終了してもよろしいですか？\nよろしければ「Y」を入力してください。 \n > ");

		if (scan.next().equals("Y")) {
			return true;
		} else {
			return false;
		}
	}
}

abstract class History
{
	String date;

	History(String date) {
		this.date = date;
	}

	abstract void print();

	protected void printDate()
	{
		System.out.printf("[%s]", this.date);
	}
}

class ShoukaiHistory extends History
{
	int zandaka;

	public ShoukaiHistory(String date, int zandaka) {
		super(date);
		this.zandaka = zandaka;
	}

	@Override
	void print()
	{
		this.printDate();
		System.out.printf("残高照会:残高=%d\n", this.zandaka);
	}
}

class NyukinHistory extends History
{
	int zandaka;
	int nyukin;

	public NyukinHistory(String date, int zandaka, int nyukin) {
		super(date);
		this.zandaka = zandaka;
		this.nyukin = nyukin;
	}

	@Override
	void print()
	{
		this.printDate();
		System.out.printf("入金:入金額=%d, 残高=%d\n", this.nyukin, this.zandaka);
	}
}

class ShukkinHistory extends History
{
	int zandaka;
	int shukkin;

	public ShukkinHistory(String date, int zandaka, int shukkin) {
		super(date);
		this.zandaka = zandaka;
		this.shukkin = shukkin;
	}

	@Override
	void print()
	{
		this.printDate();
		System.out.printf("出金:出金額=%d, 残高=%d\n", this.shukkin, this.zandaka);
	}
}
