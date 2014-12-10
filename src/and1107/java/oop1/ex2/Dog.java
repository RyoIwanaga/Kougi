package and1107.java.oop1.ex2;

public class Dog
{
	protected int name;
	protected int year;

	public int getName()
	{
		return this.name;
	}

	public void setName(int name)
	{
		this.name = name;
	}

	public int getYear()
	{
		return this.year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public void bark ()
	{
		String str;

		if (this.year < 5) str = "cancan";
		else if (this.year < 10) str = "wanwan";
		else str = "kunkun";

		System.out.println(str);
	}
}
