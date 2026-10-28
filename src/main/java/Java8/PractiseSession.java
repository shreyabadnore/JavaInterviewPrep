package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PractiseSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums = Arrays.asList(10, 20, 10, 30, 40, 30, 50, 60, 70);

		List<Integer> list = nums.stream().distinct().skip(2).limit(3).collect(Collectors.toList());

		System.out.println(list);

	}

}
