package ProgramPractise;

import java.util.HashMap;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String str = "ApplePoppyCherry";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		char[] k = str.toCharArray();

		for (char c : k) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			} else {
				map.put(c, 1);
			}
		}

		for (char c : k) {
			if (map.get(c) == 1) {
				System.out.println(c);
				break;

			}

			else {
				System.out.println("No non repeated chatacter");
			}
		}

	}

}
