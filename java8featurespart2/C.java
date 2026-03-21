package java8featurespart2;

import java.time.LocalDate;
import java.util.StringJoiner;

public class C {

//	int age;
//	String name;

	public static void main(String[] args) {

//		System.out.println(LocalDate.now());
//		System.out.println(LocalDate.of(2003, 11, 18));\\\

		StringJoiner sj = new StringJoiner("A");
		sj.add("Rahul");
		sj.add("ram");
		sj.add("ram");
		sj.add("ram");
		sj.add("ram");

		System.out.println(sj);

	}

}
