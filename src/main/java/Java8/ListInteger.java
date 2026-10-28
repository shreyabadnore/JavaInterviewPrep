package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListInteger {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5, 2, 8, 1, 3, 9, 4, 6, 7);
		
		List<Integer> result=list.stream()
				.filter(n->n%2==0)
				  .map(n -> n * 5)                            // Step 2: multiply each even number by 5
	                .sorted((a, b) -> b.compareTo(a))           // Step 3: sort in descending order
	                .collect(Collectors.toList());              // Step 4: collect into a List

				
				System.out.println(result);
				

	}

}
