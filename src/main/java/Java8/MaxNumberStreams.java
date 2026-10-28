package Java8;

import java.util.Arrays;
import java.util.List;

public class MaxNumberStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(12, 45, 23, 67, 89, 34, 56);
		
		int max=list.stream()
				.max(Integer::compare)
				.get();
		
		System.out.println("Max number in the given list is" + max);

	}

}
