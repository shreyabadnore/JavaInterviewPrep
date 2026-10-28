package ProgramPractise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfNumbersinGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frequencyofNumber(1734151111121L);
	}

	public static void frequencyofNumber(Long num) {
		Map<Long, Integer> map = new HashMap<>();

		while (num != 0) {
			Long lastDigit = num % 10;
			if (map.containsKey(lastDigit)) {
				map.put(lastDigit, map.get(lastDigit+ 1));
			} else {
				map.put(lastDigit, 1);
			}
			num = num / 10;
		}
		Set<Long> keys = map.keySet();

		for (Long key : keys) {
			System.out.println(key + " : " + map.get(key));

		}

	}

}
