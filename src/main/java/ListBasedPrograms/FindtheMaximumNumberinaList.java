package ListBasedPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindtheMaximumNumberinaList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(5);
		list.add(3);
		list.add(1);

		System.out.println("Original list" + list);

		 int max = Collections.max(list);

	        System.out.println("Max number in list: " + max);
	}

}
