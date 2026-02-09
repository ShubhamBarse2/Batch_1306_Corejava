package CopyContr_AND_POJO;

public class Student {

//	int a = 5;
//	Student s = new Student();

	private Student() {
		System.out.println("I am Constr...");
	}

	public static Student m1() {
		return new Student();
	}
}
