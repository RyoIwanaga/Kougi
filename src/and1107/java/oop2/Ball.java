package and1107.java.oop2;

public class Ball
{
	double x;
	double y;
	double vx;
	double vy;

	public Ball(double x, double y, double vx, double vy) {
		super();
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}

	public void wait(int second)
	{
		if (second > 0) {
			this.x += this.vx;
			this.y += this.vy;
			this.vy -= 9.8;

			this.wait(second - 1);
		}
	}

	public void print ()
	{
		System.out.printf("position (%f, %f), speed (%f, %f)\n",
				this.x, this.y,
				this.vx, this.vy);
	}

	public static void main(String[] args)
	{
		Ball ball = new Ball(0, 0, 3, 0);

		ball.wait(1); ball.print();
		ball.wait(1); ball.print();
		ball.wait(3); ball.print();
		ball.wait(1); ball.print();

		ball = new Ball(0, 0, 3, 20);

		ball.wait(1); ball.print();
		ball.wait(1); ball.print();
		ball.wait(3); ball.print();
		ball.wait(1); ball.print();
	}
}
