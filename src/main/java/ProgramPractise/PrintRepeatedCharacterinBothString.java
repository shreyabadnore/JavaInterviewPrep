package ProgramPractise;

import java.util.HashMap;
import java.util.Map;

public class PrintRepeatedCharacterinBothString {

	public static void main(String[] args) {
		
		String a="Automation";
		String b="Testing";
		
		Map<Character, Integer> map=new HashMap<>();
		
		for(char ch: a.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		System.out.println("Common characters in both strings:");
        for (char c : b.toCharArray()) {
            if (map.containsKey(c)) {
                System.out.println(c);
            }
		
	}
	}
}

