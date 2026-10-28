package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupnamesbasedonlengthGroupingby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("apple", "banana", "kiwi", "mango", "orange", "papaya");

		Map<Integer, List<String>> result = names.stream().collect(Collectors.groupingBy(n -> n.length()));

		System.out.println(result);

	}

}
