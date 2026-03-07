package SerializationProcessCode;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) throws Exception {

//		DeSerialization process :	
		
		FileInputStream file = new FileInputStream("C:\\java material\\employeedata.txt");
		ObjectInputStream os = new ObjectInputStream(file);

		Employee e = (Employee) os.readObject(); // Read/fetch Data

		System.out.println(e.empId + "  " + e.name + "    " + e.city);
		os.close();
		file.close();

	}

}
