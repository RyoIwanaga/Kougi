package and1107.meikai.chapter10.ex2;

public class Time
{
	int second;
	int minute;
	int hour;

	public Time() {
		this.desReset();
	}

	public Time(int hour,int minute, int second) {
		this.desSet(hour, minute, second);
	}

	protected void desReset()
	{
		this.second = 0;
		this.minute = 0;
		this.hour = 0;
	}

	public void desSet(int hour, int minute, int second)
	{
		this.desReset();

		this.desAddSecond(second);
		this.desAddMinute(minute);
		this.desAddHour(hour);
	}

	public void desAddSecond(int second)
	{
		this.second += second % 60;
		this.minute += second / 60;
	}

	public void desAddMinute(int minute)
	{
		this.minute += minute % 60;
		this.hour += minute / 60;
	}

	public void desAddHour(int hour)
	{
		this.hour += hour;
	}

	public void print()
	{
		System.out.printf("%d:%d:%d\n",
				this.hour, this.minute, this.second);
	}

	@Override
	public String toString()
	{
		return "Time [second=" + this.second + ", minute=" + this.minute + ", hour=" + this.hour + "]";
	}

	public static void main(String[] args)
	{
		Time t1 = new Time();
		Time t2 = new Time(6, 11, 22);

		t1.print();
		t2.print();
		t2.desSet(20, 100, 200);
		t2.print();
	}
}
