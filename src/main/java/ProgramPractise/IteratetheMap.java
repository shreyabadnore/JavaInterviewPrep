package ProgramPractise;

import java.util.HashMap;
import java.util.Map;

public class IteratetheMap {

	public static void main(String[] args) {
	
		Map<Character, String> map=new HashMap<Character, String>();
		
		map.put('A', "Apple");
		map.put('B', "Bacardi");
		map.put('C', "Clavin");
		map.put('D', "DavidOff");
		
		   map.forEach(
		            (key, value)
		                -> System.out.println(key + " = " + value));

	}

}
