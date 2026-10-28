package ListBasedPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumbersinaList {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(4, 2, 5, 2, 3, 4, 7, 8, 4));

		Set<Integer> seen = new HashSet<>();

		Set<Integer> duplicates = new HashSet<>();

		for (Integer num : numbers) {
			if (!seen.add(num)) { // if number already in "seen"
				duplicates.add(num);
			}
		}

	}

}
