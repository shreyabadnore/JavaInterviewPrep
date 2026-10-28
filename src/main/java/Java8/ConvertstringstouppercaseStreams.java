package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertstringstouppercaseStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=Arrays.asList("shreya", "neha", "riya", "megha");
		
		List<String> names=list.stream().map(n->n.trim().toUpperCase()).collect(Collectors.toList());
		System.out.println(names);
				

	}

}
