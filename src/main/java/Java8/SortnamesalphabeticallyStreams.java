package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortnamesalphabeticallyStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=Arrays.asList("apple", "banana", "orange", "avocado", "mango", "apricot");
		
		List<String> names=list.stream().filter(n->n.startsWith("a")).map(n->n.toUpperCase()).sorted().collect(Collectors.toList());
		System.out.println(names);
				

	}

}
