package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Countnumbersgreaterthan50Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(12, 78, 45, 89, 33, 99, 52);

		long nums = list.stream().filter(n -> n >= 50).count();

		System.out.println(nums);

	}

}
