package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareofevennumbersStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1, 2, 3, 4, 5, 6);
		
		List<Integer> even=list.stream().filter(n-> n%2==0).map(n->n*n).collect(Collectors.toList());
		
		System.out.println(even);

	}

}
