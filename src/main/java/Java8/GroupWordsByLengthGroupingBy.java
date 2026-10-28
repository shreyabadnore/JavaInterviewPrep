package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLengthGroupingBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("java", "python", "c", "go", "javascript");

		Map<Integer, List<String>> result = words.stream().collect(Collectors.groupingBy(word -> word.length()));

		System.out.println(result);

	}

}
