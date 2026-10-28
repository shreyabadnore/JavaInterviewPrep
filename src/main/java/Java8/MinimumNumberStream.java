package Java8;

import java.util.Arrays;
import java.util.List;

public class MinimumNumberStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = Arrays.asList(12, 45, 23, 67, 89, 34, 56);
		
		int min=nums.stream()
				.min(Integer::compare)
				.get();
		System.out.println("Minimum Number in the given list is " + min);


	}

}
