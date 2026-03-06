package MultiThreadingDay2;

public class MyThread implements Runnable, A, B, C {

	@Override
	public void run() {

		for (int i = 400; i <= 500; i++) {
			System.out.println("RUN method = " + i);
			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
			}
		}

	}

	@Override
	public void m3() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("m3 method = " + i);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
			}
		}

	}

	@Override
	public void m2() {
		for (int i = 210; i <= 300; i++) {
			System.out.println("m2 method = " + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
		}

	}

	@Override
	public void m1() {
		for (int i = 111; i <= 200; i++) {
			System.out.println("m1 method = " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}

}
