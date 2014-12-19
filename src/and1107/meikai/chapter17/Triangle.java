package and1107.meikai.chapter17;

public class Triangle
{
	public static void main(String[] args) throws InterruptedException
	{
		final int TIME = 50;

		for (int y = 1; y <= 100; y++) {
			final int currentY = y;

			new Thread(new Runnable() {

				@Override
				public void run()
				{
					for (int x = 1;  x <= currentY; x++) {

						System.out.print("*");
						try {
							Thread.sleep(TIME);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}).
			start();

			Thread.sleep((long) (TIME * y * 1.3));

			System.out.println("");
		}
	}
}
