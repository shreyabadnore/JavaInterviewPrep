package ListBasedPrograms;

import java.util.ArrayList;
import java.util.List;

public class BasicsList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Pune");
		list.add("Mumbai");
		list.add("Nagpur");
		list.add("Nashik");
		list.add("Daund");

		System.out.println(list + " Original list");

		list.add("abc");
		list.add(1, "PQR");
		System.out.println(list + " Adding at the specific index");

		list.remove(5);

		System.out.println(list + " After Removal");

		System.out.println(list.get(4));// retrieving the element from the specific index

	}

}
