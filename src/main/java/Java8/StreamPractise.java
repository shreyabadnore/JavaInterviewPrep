package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=Arrays.asList("shreya", "neha", "riya", "sneha", "megha");
		
		names.stream()
		.map(name -> name.toUpperCase())       // convert to uppercase
        .filter(name -> name.startsWith("S"))  // keep names starting with S
        .collect(Collectors.toList());         // collect into a new List

// Step 4: Print the final result
System.out.println(names);
				

	}

}
