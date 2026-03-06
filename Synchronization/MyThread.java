package Synchronization;

public class MyThread extends Thread {

	@Override
	public synchronized void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Run method = " + i);
		}
	}

	public synchronized void m1() {
		for (int i = 100; i <= 200; i++) {
			System.out.println("m1 method = " + i);
		}
	}

	public synchronized void m2() {
		for (int i = 200; i <= 300; i++) {
			System.out.println("m2 method = " + i);
		}
	}

}
