package ProgramPractise;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 3, 3, 3, 3, 3, 8, 9, 10 };
		frequencyOfElementInArray(arr);

	}

	public static void frequencyOfElementInArray(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int e : arr) {
			if (map.containsKey(e)) {
				map.put(e, map.get(e) + 1);
			} else {
				map.put(e, 1);
			}
		}

		int maxFrequesncy = 0;

		for (int freq : map.values()) {
			if (freq > maxFrequesncy) {
				maxFrequesncy = freq;
			}
		}

		boolean allfrequency = true;

		for (int freq : map.values()) {
			if (freq != maxFrequesncy) {
				allfrequency = false;
				break;
			}
		}

		if (allfrequency) {
			System.out.println("All elements have the same frequency");
			for (int e : arr) {
				System.out.print(e + " ");
			}
		} else {
			int minElement = Integer.MAX_VALUE;
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if (entry.getValue() == maxFrequesncy) {
					if (entry.getKey() < minElement) {
						minElement = entry.getKey();
					}
				}
			}
			System.out.println("Element with highest frequency is: " + minElement);
		}

	}

}
