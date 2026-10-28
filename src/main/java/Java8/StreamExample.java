package Java8;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		list.stream()
		.filter(n-> n%2== 0)
		.map(n->n*3)
		.forEach(System.out::println);//print each result
		
		
		
		

	}

}
