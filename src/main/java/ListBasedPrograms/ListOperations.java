package ListBasedPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListOperations {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Mumbai");
		list.add("Delhi");
		list.add("Pune");
		list.add("Chennai");
		list.add("Kolkata");
		System.out.println("--------------FOR---------------");
		for (String city : list) {
			System.out.println(city);
		}

		System.out.println("-----------------ITERATOR------------");

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String city = it.next();
			System.out.println(city);

		}

		System.out.println("-----------------SORTING IN ASCENDING------------");
		Collections.sort(list);
		System.out.println(list);

		System.out.println("-----------------SORTING IN DESCENDING------------");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		System.out.println("----------------- REVERSE THE LIST WITHOUT SORTING------------");
	
			Collections.reverse(list);
			System.out.println(list);
			System.out.println("-----------------LOOKING FOR SPECIFIC VALUE------------");
			
			if(list.contains("Pune")) {
				System.out.println("Pune is present");
			}
			else {
				System.out.println("Pls pass correct value");
			}

	}
	

	

}
