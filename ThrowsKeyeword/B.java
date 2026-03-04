package ThrowsKeyeword;

public class B {

	// dnyanesh

	public void m2() {
		A a = new A();
		try {
			a.m1();
		} catch (Exception e) {
			System.out.println("this is Not Allowed ");
		}
	}

}
