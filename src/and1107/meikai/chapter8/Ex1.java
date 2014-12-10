package and1107.meikai.chapter8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex1
{
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String s;

		try {
			System.out.print("入力文字列: ");
			s = br.readLine();
			System.out.printf("入力した文字列: %s\n", s);

			System.out.print("整数入力: ");
			s = br.readLine();
			System.out.printf("入力した整数: %d\n", Integer.parseInt(s));

		} catch (Exception e) {
			System.out.println("Error.");
		}
	}
}
