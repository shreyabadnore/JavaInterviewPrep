package ProgramPractise;

import java.util.HashMap;

public class CalculateCharacterOccurenceInString {

	public static void calOccurence(String s) {
		
		String p=s.toLowerCase();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (char ch : p.toCharArray()) {
			if (hm.containsKey(ch)) {
			
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);

	}

	public static void main(String[] args) {
		calOccurence("Hridhaan");

	}

}
