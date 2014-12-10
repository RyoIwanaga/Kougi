package and1107.java.oop3.ex4;

public class Ball {

	public Ball(double x, double y, double vx, double vy) {
		this.r = 10;
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}

	double r;

	double x;
	double y;
	double vx;
	double vy;

	public void desMove() {
		this.x += this.vx;
		this.y += this.vy;
	}
	public double calculateDistanceX(Ball b) {
		return this.x + this.r - b.x + b.r;
	}

	public double calculateDistanceY(Ball b) {
		return this.y + this.r - b.y + b.r;
	}

	public double calculateDistance(Ball b) {
		double xDistance = this.calculateDistanceX(b);
		double yDistance = this.calculateDistanceY(b);

		return Math.sqrt(
				xDistance * xDistance +
				yDistance * yDistance);
	}

	@Override
	public String toString()
	{
		return "Ball [r=" + this.r + ", x=" + this.x + ", y=" + this.y + ", vx=" + this.vx + ", vy=" + this.vy + "]";
	}


	public static void main(String[] args)
	{
		Ball ball = new Ball (30, 100, 50, 50);
		Ball ball2 = new Ball (50, 110, 50, 50);

		System.out.println(ball.calculateDistanceX(ball2));
		System.out.println(ball.calculateDistanceY(ball2));
		System.out.println(ball.calculateDistance(ball2));


		for (int i = 0; i < 50; i++) {
			System.out.printf("%2d 秒後 ... ", i);
			System.out.println(ball);
			ball.desMove();

			if (ball.x > 500) {
				ball.x = 500 - (ball.x - 500);
				ball.vx = -1 * ball.vx;
			}
		}
	}
}

class Line {

	double x0, y0, x1, y1;

	public Line(double x0, double y0, double x1, double y1) {
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
	}

	public boolean isInside (double x, double y) {
		return this.x0 <= x && x <= this.x1 && this.y0 <= y && y <= this.y1;
	}
}
