package StaticPractise;

public class E {

	{
		System.out.println("Non static block");
	}

	static {
		System.out.println(" static block");

	}

	public void m1() {
		System.out.println("this is m1 methods");
	}

	public E() {
		System.out.println("this is Contr of E class");
	}

	public static void main(String[] args) {
		E e = new E();
		e.m1();
	}

}
