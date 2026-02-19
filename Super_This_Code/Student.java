package Super_This_Code;

public class Student {

	private String name;

//	int id;
//
//	public Student() {
//		this.id = 45;
//		System.out.println("this is Constr of Student class student ID = " + id);
//		this.display();
//	}
//
//	public void display() {
//		System.out.println("this is method of Student class");
//	}

	public Student() {
		System.out.println("this is Constr of Student class ");
	}

	public Student(String name) {
		this();
		this.name = name;
		System.out.println("this is Constr of Student class Student Name = " + name);
	}

	public Student(String name, int id) {
		this("Ram");
		System.out.println("this is Constr of Student class Student Name = " + name + " " + id);
	}

	public Student(String name, int id, String city) {
		this("Ram", 45);
		System.out.println("this is Constr of Student class Student Name = " + name + "  " + id + "  " + city);
	}

}
