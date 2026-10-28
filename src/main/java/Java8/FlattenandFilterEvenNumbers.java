package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenandFilterEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> numbers = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5, 6),
			    Arrays.asList(7, 8, 9)
			);
		
		
		List<Integer> flatlist=numbers.stream().flatMap(list -> list.stream()).filter(n ->n%2==0).collect(Collectors.toList());
		
		System.out.println(flatlist);


	}

}
