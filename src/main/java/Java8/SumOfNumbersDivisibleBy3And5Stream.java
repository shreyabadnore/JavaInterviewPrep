package Java8;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbersDivisibleBy3And5Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  List<Integer> nums = Arrays.asList(15, 30, 45, 10, 9, 18, 25);

	        int sum = nums.stream()
	                .filter(n -> n % 3 == 0 ) // divisible by both 3 and 5
	                .reduce(0, Integer::sum); // sum up

	        System.out.println("Sum of numbers divisible by 3 and 5: " + sum);

	}

}
