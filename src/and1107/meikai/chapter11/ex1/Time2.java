package and1107.meikai.chapter11.ex1;

import and1107.meikai.chapter10.ex2.Time;

public class Time2 extends Time
{
	public Time2(int hour, int minute, int second)
	{
		super(hour, minute, second);
	}

	public void desAddTime (int hour, int minute, int second)
	{
		this.desAddSecond(second);
		this.desAddMinute(minute);
		this.desAddHour(hour);
	}

	public void desSubTime (int hour, int minute, int second)
	{
		this.desAddSecond(- second);
		this.desAddMinute(- minute);
		this.desAddHour(- hour);
	}

	public static void main(String[] args)
	{
		Time2 t = new Time2(10, 20, 30);
		t.print();

		t.desAddTime(2, 20, 50);
		t.print();

		t.desSubTime(2, 20, 50);
		t.print();
	}
}

