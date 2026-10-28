package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByMarksGroupingBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> marks = Arrays.asList(95, 70, 45, 82, 99, 55, 63);

		Map<String, List<Integer>> result = marks.stream()
				.collect(Collectors.groupingBy(n -> n >= 90 ? "Excellent" : n >= 60 ? "Average" : "Needs Improvement"));

		System.out.println(result);
		
	

	}
	
		
		
	

}
