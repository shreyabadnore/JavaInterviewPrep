package ProgramPractise;

import java.util.*;

public class GroupWordsByLength {
	public static void main(String[] args) {

		List<String> words = Arrays.asList("CAT", "DOG", "TIGER", "LION", "PIGG");

		Map<Integer, List<String>> lengthMap = new HashMap<>();

		for (String word : words) {
			int len = word.length();

			if (!lengthMap.containsKey(len)) {
				lengthMap.put(len, new ArrayList<>());
			}
			lengthMap.get(len).add(word);
		}

		for (Integer key : lengthMap.keySet()) {                                                                                                                                     
			List<String> wordList = lengthMap.get(key);
			String joinedWords = String.join(",", wordList);
			System.out.println(key + "=" + joinedWords);
		}
	}
}
