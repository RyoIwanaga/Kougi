package and1107.meikai.chapter10.ex1;

public class XYData
{
	int x, y;

	public XYData(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int area(int n)
	{
		if (n == 3) {
			return this.x * this.y / 2;
		} else {
			return this.x * this.y;
		}
	}


	public static void main(String[] args)
	{
		XYData dt = new XYData(3, 4);

		System.out.println(dt.area(3));;
		System.out.println(dt.area(4));;
	}
}
