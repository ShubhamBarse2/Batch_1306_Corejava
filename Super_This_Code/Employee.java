package Super_This_Code;

public class Employee extends Company {
//
//	public void view() {
//		super.cName = "TCS";
//		System.out.println(cName);
//	}

	public Employee() {
		super();
		super.info();
		System.out.println("this is Employee class Constr");

	}
	public Employee(int a) {
		super.info();
		System.out.println("this is Employee class Constr");

	}

	public static void main(String[] args) {
		Employee e = new Employee();
//		e.view();
	}

}
