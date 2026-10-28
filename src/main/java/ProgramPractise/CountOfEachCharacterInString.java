package ProgramPractise;

import java.util.HashMap;
import java.util.Map;

public class CountOfEachCharacterInString {

	public static void main(String[] args) {
		String s="rtdsghtrwsarsfdgsrty";
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(char ch:s.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
			
			
			
		}
		System.out.println(map);
		
		
	}

}
