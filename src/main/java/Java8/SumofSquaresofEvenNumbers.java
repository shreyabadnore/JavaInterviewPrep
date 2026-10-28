package Java8;

import java.util.Arrays;
import java.util.List;

public class SumofSquaresofEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1, 2, 3, 4, 5, 6);
		
		int numbers=list.stream()
				.filter(n-> n%2==0)
				.map(n-> n*n)
			      .reduce(0, Integer::sum);  // sum all squares

        System.out.println("Sum of squares of even numbers: " + numbers);
		

	}

}
