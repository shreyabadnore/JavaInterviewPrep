package ProgramPractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionBasics {

	public static void main(String[] args) {
		//List: order is preserved
		List<String> fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Chickoo");
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
		//set no order is preserved
		Set<String> set=new HashSet<>();
		set.add("apple");
		set.add("Banana");
		set.add("Chickoo");
		
		for(String fruit:set) {
			System.out.println(fruit);
		}
		
		//+++++++++++++++++checkkk+++++++++++++++
		
		Map<String, Integer> map=new HashMap<>();
		map.put("Apple", 1);
		map.put("Banana", 2);
		map.put("Chickoo", 3);
		
		for(Entry<String, Integer> entrry:map.entrySet()) {
			
		}
		
		

	}

}
