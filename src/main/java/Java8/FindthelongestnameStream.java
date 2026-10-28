package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindthelongestnameStream {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("shreya", "neha", "meghal", "riya", "snehal");

		String name = names.stream().max(Comparator.comparingInt(String::length)).get();

		System.out.println(name);
	}

}
