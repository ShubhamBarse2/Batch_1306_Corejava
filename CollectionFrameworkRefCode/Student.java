package CollectionFrameworkRefCode;

public class Student {

	int studId;
	String name;
	double marks;

	public Student(int studId, String name, double marks) {
		super();
		this.studId = studId;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", marks=" + marks + "]";
	}

}
