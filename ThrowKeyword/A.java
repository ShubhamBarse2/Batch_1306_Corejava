package ThrowKeyword;

public class A {

	public void m1() {

		int a = 3;
		int b = 0;

		if (b == 0) {
			throw new VishalException("Own Exception : This is Not Allowed in JAVA");

		}

		System.out.println(a / b);

	}

}
