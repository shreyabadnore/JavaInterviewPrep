package ProgramPractise;

import java.util.HashMap;
import java.util.Map;

public class ArrayElementsAppearingTwice {

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 4, 5, 4, 5, 7, 7, 8, 7 };
		String[] strArray = { "apple", "banana", "apple" };

		System.out.println("Integer Array");
		printDuplicates(intArray);

		System.out.println("String Array");
		printDuplicates(strArray);

	}
	//It means the method can work with different types of arrays:T represents the type of element.
	public static <T> void printDuplicates(T[] array) {
		Map<T, Integer> map = new HashMap<>();

		for (T element : array) {
			if (map.containsKey(element)) {
				map.put(element, map.get(element) + 1);
			} else {
				map.put(element, 1);
			}
		}

		System.out.println("Element appraring twice is:");

		for (T key : map.keySet()) {
			if (map.get(key) >= 2) {
				System.out.println(key);
			}
		}
	}

}
