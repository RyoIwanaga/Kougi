package and1107.java.oop1.ex4;

class PETBottleDrinker
{
	public static void main(String[] args)
	{
		PETBottle gogo = new PETBottle();

		// 名前と容量の登録
		gogo.setName("午後も紅茶");
		gogo.setVolume(500);

		System.out.println(gogo.getName() + " の残量は " + gogo.getVolume() + " です");

		// 100ml 飲む
		gogo.drunk(100);
		System.out.println(gogo.getName() + " の残量は " + gogo.getVolume() + " です");

		// 150ml 飲む
		gogo.drunk(150);
		System.out.println(gogo.getName() + " の残量は " + gogo.getVolume() + " です");

		// 250ml 飲む
		gogo.drunk(250);
		System.out.println(gogo.getName() + " の残量は " + gogo.getVolume() + " です");
	}
}

class PETBottle
{
	String name;
	int volume;

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

	void drunk (int n)
	{
		this.volume -= n;
	}
}
