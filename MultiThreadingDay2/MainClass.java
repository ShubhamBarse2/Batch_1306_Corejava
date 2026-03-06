package MultiThreadingDay2;

public class MainClass {

	public static void main(String[] args) {

		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
		mt.m1();
		mt.m2();
		mt.m3();
		
		// diff betn wait and sleep 
		
		// Explore Thread class methods  
		
		

	}
}
