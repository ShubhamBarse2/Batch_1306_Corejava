package Java8Features;

public interface Meta {

	default void logo() {
		System.out.println("this is logo of Meta <0> ");
	}

	public static void privacy() {
		System.out.println("this is static method which cotnains privacy related data  ");
	}

	public abstract void login();

}
