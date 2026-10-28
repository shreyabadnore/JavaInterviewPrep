package Java8;

import java.util.Arrays;
import java.util.List;

public class FindmaxandminStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(8, 3, 12, 5, 9);

		int max = list.stream().max(Integer::compare).get();

		System.out.println("Max number in list is " + max);

		int min = list.stream().min(Integer::compare).get();

		System.out.println("Min number in the list is " + min);

	}

}
