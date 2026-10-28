package ProgramPractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountNamesinListAndAlsoKeyValue {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("shreya");
		names.add("SHREYA");
		names.add(" Shreya");
		names.add("shreya  ");
		names.add("lotus");
		names.add("rose");
		names.add("diya");
		names.add("tulip");
		names.add("daisy");
		names.add("poppy");
		names.add("daisy");
		names.add("daisy");
		names.add("daisy");
		names.add("carnation");
		names.add("orchid");

		System.out.println(names);

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//to count the key and values in the map

		for (int i = 0; i < names.size(); i++) {

			String name = names.get(i).trim().toLowerCase();

			if (map.containsKey(name)) {
				map.put(name, map.get(name) + 1);
			} else {
				map.put(name, 1);
			}

		}
		System.out.println(map);
		// to print keys only
		for (String k : map.keySet()) {
			System.out.println(k);
		}
		//to print values only
		for (int m : map.values()) {
			System.out.println(m);
		}
	}

}
