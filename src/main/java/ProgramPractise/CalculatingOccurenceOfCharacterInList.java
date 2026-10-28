package ProgramPractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculatingOccurenceOfCharacterInList {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("Mango");
		list.add("ORANGE");
		list.add("MuskMelon");
		// HashMap to store character occurrences
		Map<Character, Integer> map = new HashMap<>();

		// Loop through each word in the list
		for (String word : list) {

			word = word.toLowerCase();

			for (char ch : word.toCharArray()) {
				// Ignore spaces (optional)
				if (Character.isLetter(ch)) {

					map.put(ch, map.getOrDefault(ch, 0) + 1);
				}

			}

			System.out.println("Character occurrences:");
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " = " + entry.getValue());
			}
		}
	}
}
