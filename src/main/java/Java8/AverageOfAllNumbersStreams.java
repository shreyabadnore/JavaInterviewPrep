package Java8;

import java.util.Arrays;
import java.util.List;

public class AverageOfAllNumbersStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = Arrays.asList(12, 45, 23, 67, 89, 34, 56);
		
		double average=nums.stream()
				.mapToInt(Integer::intValue)
				.average()
				.getAsDouble();
		
		System.out.println(average);


	}

}
