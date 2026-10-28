package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbersStream {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(5, 10, 15, 20, 25, 30);
		
		List<Integer> nums=list.stream()
				.filter(n -> n>=15)
				.collect(Collectors.toList());
		
		System.out.println(nums);
		
		

	}

}
