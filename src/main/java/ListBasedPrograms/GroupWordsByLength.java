package ListBasedPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupWordsByLength {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("CAT", "DOG", "TIGER", "LION", "PIGG", "OWL", "ANT", "FOX");

		Map<Integer, List<String>> map = new HashMap<>();

		for (String word : words) {
			int len = word.length();

			if (!map.containsKey(len)) {
				map.put(len, new ArrayList<>());
			}
			map.get(len).add(word);
		}

		for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());

		}

		Collections.reverse(words);

		System.out.println(words);

	}

}
