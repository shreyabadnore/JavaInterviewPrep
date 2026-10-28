package ProgramPractise;

import java.util.HashMap;
import java.util.Map;

public class CountNamesinString {

	public static void main(String[] args) {

		// duplicates are allowed and insertion order must be preserved
		String s = "Java is awesome";
		String lowercase=s.toLowerCase().trim();
		Map<String, Integer> nameCount = new HashMap<String, Integer>();
		String[] names = lowercase.split(" ");

		for (String name : names) {

			if (nameCount.containsKey(name)) {
				nameCount.put(name, nameCount.get(name) + 1);
			} else {

				nameCount.put(name, 1);
			}
		}

		System.out.println("Name occurrences: " + nameCount);
	}
}
