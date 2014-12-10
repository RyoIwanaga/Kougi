package and1107.meikai.chapter10.ex3;

public class MyTool
{
	public static double minData(double a, double b)
	{
		return Math.min(a, b);
	}

	public static double maxData(double a, double b)
	{
		return Math.max(a, b);
	}

	public static double averageData(double a, double b)
	{
		return (a + b) / 2;
	}

	public static void main(String[] args)
	{
		System.out.printf("Min data: %.2f\n",
				MyTool.minData(12.34, 56.78));
		System.out.printf("Max data: %.2f\n",
				MyTool.maxData(12.34, 56.78));
		System.out.printf("Average : %.2f\n",
				MyTool.averageData(11.11, 33.33));
	}
}
