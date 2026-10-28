package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExampleStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<List<Integer>> numbers = Arrays.asList(
	                Arrays.asList(1, 2, 3),
	                Arrays.asList(4, 5),
	                Arrays.asList(6, 7, 8)
	        );

	        List<Integer> flatList = numbers.stream()
	                .flatMap(list -> list.stream())  // 👈 Converts each inner list to a stream
	                .collect(Collectors.toList());

	        System.out.println(flatList);

	}

}
