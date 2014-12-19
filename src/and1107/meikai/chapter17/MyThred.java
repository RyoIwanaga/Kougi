package and1107.meikai.chapter17;

public class MyThred extends Thread
{

	public static void main(String[] args)
	{
//		MyThred a = new MyThred();
		new Thread(new Runnable() {

			@Override
			public void run()
			{
				for (int i = 1; i <= 100; i++) {
					System.out.println("Sub: " + i);

					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {

					}
				}
			}
		}).start();

		for (int i = 1; i <= 100; i++) {
			System.out.println("Main: " + i);

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {

			}
		}
	}
}
