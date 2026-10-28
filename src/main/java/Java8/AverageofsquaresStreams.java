package Java8;

import java.util.Arrays;
import java.util.List;

public class AverageofsquaresStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

		double average = list.stream().map(n -> n * n).mapToInt(Integer::intValue).average().getAsDouble();

		System.out.println(average);

	}

}
