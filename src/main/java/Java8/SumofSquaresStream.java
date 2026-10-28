package Java8;

import java.util.Arrays;
import java.util.List;

public class SumofSquaresStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1, 2, 3, 4, 5);

        int sum = list.stream()
                .map(n -> n * n)              // square each number
                .reduce(0, Integer::sum);
		
		System.out.println(sum);

	}

}
