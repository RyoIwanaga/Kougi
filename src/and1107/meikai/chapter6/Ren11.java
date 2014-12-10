package and1107.meikai.chapter6;

public class Ren11
{
	public static void main(String[] args)
	{
		int n = 30;
		int nn = n * n;
		int nLength = Integer.toString(n).length();
		int nnLength = Integer.toString(nn).length();

		String line = makeStrLine(n, nLength, nnLength);

		/*** Print title ***/
		System.out.println(makeStrTitle(n, nLength, nnLength));
		System.out.println(line);

		for (int i = 0; i < nLength + 1; i++)
			System.out.print(" ");

		System.out.print("|");

		for (int x = 1; x <= n; x++) {
			System.out.printf(makeStrNumber(x, nnLength));
			System.out.print("|");
		}
		System.out.println();
		System.out.println(line);

		/*** Start print table ***/
		for (int y = 1; y <= n; y++) {

			System.out.printf(makeStrNumberLeft(y, nLength));
			System.out.print("|");

			for (int x = 1; x <= n; x++) {

				System.out.printf(makeStrNumber(x * y, nnLength));
				System.out.print("|");
			}
			System.out.println();
			System.out.println(line);
		}
	}

	static String makeStrWidth(int nnLength)
	{
		StringBuffer buf = new StringBuffer();

		for (int i = 0; i < nnLength + 2; i++)
			buf.append('-');

		return buf.toString();
	}

	static String makeStrLine(int n, int nLen, int nnLen)
	{
		StringBuffer buf = new StringBuffer();

		for (int i = 0; i < nLen + 1; i++) {
			buf.append('-');
		}
		buf.append('+');

		for (int i = 0; i < n; i++) {
			buf.append(makeStrWidth(nnLen));
			buf.append('+');
		}

		return buf.toString();
	}

	static String makeStrNumber(int n, int width)
	{
		StringBuffer buf = new StringBuffer();
		int len = Integer.toString(n).length();

		for (int i = 0; i < width - len + 1; i++) {
			buf.append(' ');
		}
		buf.append(n);
		buf.append(" ");

		return buf.toString();
	}

	static String makeStrNumberLeft(int n, int width)
	{
		StringBuffer buf = new StringBuffer();
		int len = Integer.toString(n).length();

		for (int i = 0; i < width - len; i++) {
			buf.append(' ');
		}
		buf.append(n);
		buf.append(" ");

		return buf.toString();
	}

	static String makeStrTitle(int n, int nLength, int nnLength)
	{
		StringBuffer buf = new StringBuffer();

		String titleStr = "java繰り返し文の練習　九九表　　　二重ループ";

		int titleStrLength = 24;
		int len = nLength + 2;
		int width = nnLength + 3;

		len += width * n;

		buf.append(titleStr);

		for (int i = 0; i < len - titleStrLength - 1; i++) {
			buf.append(" ");
		}
		buf.append("+");

		return titleStr;
	}
}
