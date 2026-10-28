package ListBasedPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeList {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<String> ();
		List<String> list2=new ArrayList<String> ();
		
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Papaya");
		
		list2.add("Mango");
		list2.add("cherry");
		list2.add("Papaya");

	   List<String> mergedList = new ArrayList<>(list1);
	        mergedList.addAll(list2);
	        System.out.println("Merged List: " + mergedList);
		
	    // Remove common elements
        List<String> commonElements = new ArrayList<>(list1);
        commonElements.retainAll(list2); // keeps only common elements
        mergedList.removeAll(commonElements);
        System.out.println("After removing common elements: " + mergedList);

        // Sort in descending order
        Collections.sort(mergedList, Collections.reverseOrder());
        System.out.println("Final List in descending order: " + mergedList);
		

	}

}
