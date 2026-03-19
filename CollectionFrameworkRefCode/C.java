package CollectionFrameworkRefCode;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class C {

	public static void main(String[] args) {

//		List<String> list = new ArrayList<String>();
//		list.add("ram");
//		list.add("ramu");
//		list.add("shyam");
//		list.add("Vraj");
//		list.add("raj");
//		list.add("ramesh");
//		list.add("rahul");

//		System.out.println(list);

//		for (String s : list) {
//			System.out.println(s);
//		}

//		Iterator<String> itr = list.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		Set<String> list = new TreeSet<String>();
//		list.add("ram");
//		list.add("ramu");
//		list.add("shyam");
//		list.add("vraj");
//		list.add("raj");
//		list.add("ramesh");
//		list.add("rahul");
//
//		Iterator<String> itr = list.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

//		List<String> list = new LinkedList<String>();
//		list.add("ram");
//		list.add("ramu");
//		list.add("shyam");
//		list.add("Vraj");
//		list.add("raj");
//		list.add("ramesh");
//		list.add("rahul");
//
//		ListIterator<String> litr = list.listIterator();
//		while (litr.hasNext()) {
//			System.out.println(litr.next());
//		}

		Vector<String> list = new Vector<String>();
		list.add("ram");
		list.add("ramu");
		list.add("shyam");
		list.add("Vraj");
		list.add("raj");
		list.add("ramesh");
		list.add("rahul");

		Enumeration<String> e = list.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}
}
