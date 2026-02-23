package StaticPractise;

public class Outer { // Outer class

	public static void main(String[] args) {
		Outer.Inner oi = new Outer.Inner();
		oi.m1();

	}

	public static class Inner { // Inner class

		public void m1() {
			System.out.println("inner class m1 static method");
		}
	}

}
