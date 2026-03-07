package SerializationProcessCode;

import java.io.Serializable;

public class Employee implements Serializable {

	int empId;
	String name;
	String city;

	public Employee(int empId, String name, String city) {
		super();
		this.empId = empId;
		this.name = name;
		this.city = city;
	}

}
