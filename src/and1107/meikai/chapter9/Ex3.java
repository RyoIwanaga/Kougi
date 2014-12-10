package and1107.meikai.chapter9;

public class Ex3
{
	static int hour = 0, minut = 0, sec = 0;

	public static void main(String[] args)
	{
		timeSet(10);
		timeDisp();

		timeSet(11, 22);
		timeDisp();

		timeSet(22, 44, 55);
		timeDisp();
	}

	static void timeSet (int hour)
	{
		Ex3.hour = hour;
	}

	static void timeSet (int hour, int minut)
	{
		Ex3.hour = hour;
		Ex3.minut = minut;
	}

	static void timeSet (int hour, int minut, int sec)
	{
		Ex3.hour = hour;
		Ex3.minut = minut;
		Ex3.sec = sec;
	}

	static void timeDisp()
	{
		System.out.printf("%2d:%2d:%2d\n",
				hour, minut, sec);
	}
}
