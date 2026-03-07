package SerializationProcessCode;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws Exception {

		Employee e = new Employee(123, "rahul", "pune");
//		Serialization process :
		FileOutputStream file = new FileOutputStream("C:\\java material\\employeedata.txt");
		ObjectOutputStream os = new ObjectOutputStream(file);
		os.writeObject(e); // create insert data

		os.close();
		file.close();

		System.out.println("File Created Successfully ... !");
	}

}
