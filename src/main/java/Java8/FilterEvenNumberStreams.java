package Java8;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumberStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(3, 8, 12, 5, 7, 10);

		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

	}

}
