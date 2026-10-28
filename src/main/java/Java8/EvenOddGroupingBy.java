package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddGroupingBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

		Map<String, List<Integer>> result = numbers.stream()
				.collect(Collectors.groupingBy(n -> (n % 2 == 0 ? "Even" : "Odd")));

		System.out.println(result);

	}

}

