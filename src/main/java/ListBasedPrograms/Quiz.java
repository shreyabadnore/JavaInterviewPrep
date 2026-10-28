package ListBasedPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz {

	public static void main(String[] args) {
		
		List<String> country=new ArrayList<String> ();
		country.add("India");
		country.add("Japan");
		country.add("USA");
		country.add("Brazil");
		country.add("Australia");
		
		System.out.println("Original List"+country);
		country.add("Canada");
		System.out.println("Added the country in the end"+ country);
		country.add(2, "UK");
		System.out.println("Adding the country at index 2"+country);
		country.remove(4);
		System.out.println("Removing the country at index 4"+ country);
		System.out.println("Country at inex 3"+country.get(3));
		
		System.out.println("Final list"+country);
		
		

	}

}
