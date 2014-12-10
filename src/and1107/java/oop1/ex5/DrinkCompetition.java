package and1107.java.oop1.ex5;

import java.util.Scanner;

public class DrinkCompetition
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		PETBottle johnsBottle = new PETBottle(500);
		PETBottle paulBottle = new PETBottle(500);

		int second = 0;
		do {
			System.out.println(second + ">>>");
			System.out.print("jhonの飲む量 -> ");
		    System.out.println(second +"秒後のJohnのボトル残量: " + johnsBottle.drunk(scan.nextInt()));

			System.out.print("paulの飲む量 -> ");
		    System.out.println(second +"秒後のpaulのボトル残量: " + paulBottle.drunk(scan.nextInt()));

		    second++;

		} while (johnsBottle.getVolume() > 0 && paulBottle.getVolume() > 0);

		if (johnsBottle.getVolume() == 0) {
			System.out.println("Johnは" + second + "秒で飲み干した");
		}

		if (johnsBottle.getVolume() == 0) {
			System.out.println("Paulは" + second + "秒で飲み干した");
		}
	}
}

class PETBottle
{
	String name;
	int volume;

	public PETBottle(int volume) {
		this.volume = volume;
	}

	void setName (String name)
	{
		this.name = name;
	}

	void setVolume (int volume)
	{
		this.volume = volume;
	}

	String getName ()
	{
		return this.name;
	}

	int getVolume ()
	{
		return this.volume;
	}

	int drunk (int n)
	{
		this.volume -= n;
		return Math.max(this.volume, 0);
	}
}
