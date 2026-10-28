package Java8;

import java.util.Arrays;
import java.util.List;

public class CountnamesstartingwithSorsStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("shreya", "neha", "meghal", "riya", "snehal");
		long count = names.stream().filter(n -> n.toLowerCase().startsWith("s"))

				.count();

		System.out.println(count);

	}

}
