package and1107.meikai.chapter11.ex2;

public class Person
{
	String name;
	int age;

	public Person()
	{
		this.desSet("---", 0);
	}

	public Person(String name, int age)
	{
		this.desSet(name, age);
	}

	public void desSet(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public void print()
	{
		System.out.printf("name=%s&age=%d",
				this.name, this.age);
	}
}
