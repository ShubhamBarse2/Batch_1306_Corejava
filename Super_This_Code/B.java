package Super_This_Code;

public class B extends A {

	public B(int a) {
		super(a);

	}

	@Override
	public void m1() {
		super.m2();

	}

//	@Override
//	public void m2() {
// 
//	}

	public static void main(String[] args) {
//		B b = new B(12);
//		b.m1();

		A a;
		a = new B(12);
	}

}
