package CollectionFrameworkRefCode;

import java.util.Hashtable;

public class B {

	public static void main(String[] args) {

//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		map.put(124, "Shyam");
//		map.put(123, "Ram");
//		map.put(125, null);
//		map.put(126, null);
////		map.put(null, "Rahul");
//		map.put(null, "Ramu");
//
//		System.out.println(map);

//		Map<Integer, String> map = new HashMap<Integer, String>();
//		map.put(124, "Shyam");
//		map.put(123, "Ram");
//		map.put(125, null);
//		map.put(126, null);
////		map.put(null, "Rahul");
//		map.put(null, "Ramu");
//
//		System.out.println(map.get(123));

//		TreeMap map = new TreeMap();
//		map.put(123, 345);
//		map.put("Shubham", 345);
//
//		System.out.println(map);

//		TreeMap<String, String> map = new TreeMap<String, String>();
//
//		map.put("python", "JBK");
//		map.put(".Net", "TKK");
//		map.put("java", null);
//		map.put("C", null);
//
//		System.out.println(map);

//		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
//
//		map.put(123, "python");
//		map.put(345, ".Net");
//		map.put(67, "java");
//		map.put(56, null);
//		map.put(56, null);
//		map.put(null, null);
//
//		System.out.println(map);

		Hashtable<Integer, String> map = new Hashtable<Integer, String>();

		map.put(123, "python");
		map.put(345, ".Net");
		map.put(67, "java");
//		map.put(56, null);
//		map.put(56, null);
//		map.put(null, "D");

		System.out.println(map.contains("java"));

//		for (Integer s : map.keySet()) {
//			System.out.println(map.get(s));
//		}

	}

}
