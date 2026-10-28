package ProgramPractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTheOccurenceOfCharacterInList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("ORANGE");
		list.add("banana");
		list.add("12hol5");

		Map<Character, Integer> map = new HashMap<>();

		for (String word : list) {
			word = word.toLowerCase();

			for (char ch : word.toCharArray()) {
				if (Character.isLetter(ch)) {
					

					map.put(ch, map.get(ch)+1);

				}

			}
		}

		map.forEach((key, value) -> System.out.println(key + " " + value));

	}

}
