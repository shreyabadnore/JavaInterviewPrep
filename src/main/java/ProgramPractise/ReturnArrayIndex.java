package ProgramPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReturnArrayIndex {

	public static <T> List<Integer> findIndexes(List<T> list, T target) {//<T>: This is a generic type parameter. It lets the method work with any object type (like Integer, String, Double, etc.).
		List<Integer> indexes = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(target)) {
				indexes.add(i);
			}
		}
		return indexes;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> intList = Arrays.asList(1, 3, 0, 6, 7, 4, 3, 2, 2, 6, 7);
		System.out.println("Enter an Integer to search:");
		Integer intTarget = scanner.nextInt();
		List<Integer> intIndexes = findIndexes(intList, intTarget);
		if (!intIndexes.isEmpty()) {
			System.out.println("Indexes: " + intIndexes);
		} else {
			System.out.println("Element not found");
		}

		scanner.close();
	}
}

////
//// String list example
//List<String> strList = Arrays.asList("apple", "banana", "mango", "apple", "kiwi");
//System.out.println("\nEnter a String to search:");
//String strTarget = scanner.next();
//List<Integer> strIndexes = findIndexes(strList, strTarget);
//if (!strIndexes.isEmpty()) {
//    System.out.println("Indexes: " + strIndexes);
//} else {
//    System.out.println("Element not found");
//}
