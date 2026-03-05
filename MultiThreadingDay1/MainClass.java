package MultiThreadingDay1;

public class MainClass {

	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.start();
		t.m1();

	}
}
