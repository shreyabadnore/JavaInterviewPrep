package ListBasedPrograms;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {

		List<String> flowers = new ArrayList<String>();
		flowers.add("Poppy");
		flowers.add("Sunflower");
		flowers.add("Marigold");
		flowers.add("Rose");

		/*
		 * System.out.println(flowers + "Before sort");
		 * 
		 * Collections.sort(flowers);// sort in ascending
		 * 
		 * System.out.println(flowers + "After sort");
		 */
		
		flowers.sort(Comparator.naturalOrder());
		System.out.println(flowers);
		
		

	}

}
