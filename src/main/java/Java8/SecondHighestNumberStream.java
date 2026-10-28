package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumberStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  List<Integer> nums = Arrays.asList(12, 45, 67, 23, 89, 34, 56);
 
	        int secondHighest = nums.stream()
	                .sorted(Comparator.reverseOrder()) // sort descending
	                .skip(1) // skip the highest
	                .findFirst() // get the next (second highest)
	                .get();

	        System.out.println("Second highest number is: " + secondHighest);

	}

}
