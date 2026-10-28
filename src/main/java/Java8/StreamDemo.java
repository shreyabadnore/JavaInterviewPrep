package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   List<String> list = Arrays.asList("Shreya", "Sam", "Ria");

	        // 1. from Collection
	        Stream<String> s1 = list.stream();
	        s1.forEach(System.out::println);

	        // 2. from array
	        String[] arr = {"Java","Python","JS"};
	        Stream<String> s2 = Arrays.stream(arr);
	        s2.forEach(System.out::println);

	        // 3. from values
	        Stream<String> s3 = Stream.of("one","two","three");
	        s3.forEach(System.out::println);

	        // 4. primitive stream
	        IntStream ints = IntStream.rangeClosed(1,5); // 1..5 inclusive
	        ints.forEach(System.out::println);

	}

}
