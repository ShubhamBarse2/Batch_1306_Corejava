package MultiThreadingDay1;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			System.out.println("Run method = " + i);
		}
	}

	public void m1() {
		for (int i = 100; i <= 200; i++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
			}
			System.out.println("m1 method = " + i);
		}
	}

}
