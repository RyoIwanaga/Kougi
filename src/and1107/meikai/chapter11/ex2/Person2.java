package and1107.meikai.chapter11.ex2;

public class Person2 extends Person
{
	int height;
	int weight;

	public Person2 ()
	{
		super();
		this.height = this.weight = 0;
	}

	public void desSet(String name, int age, int height, int weight)
	{
		super.desSet(name, age);
		this.height = height;
		this.weight = weight;
	}

	@Override
	public void print()
	{
		System.out.printf("name=%s&age=%d",
				this.name, this.age, this.height, this.weight);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
