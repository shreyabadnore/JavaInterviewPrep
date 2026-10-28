package Java8;

import java.util.Arrays;
import java.util.List;

public class MatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("shreya", "neha", "riya", "snehal");

		boolean match = names.stream().anyMatch(n -> n.startsWith("s"));
		boolean length = names.stream().allMatch(n -> n.length() > 3);
		boolean nomatch = names.stream().noneMatch(n -> n.startsWith("z"));

		System.out.println(match);
		System.out.println(length);
		System.out.println(nomatch);

	}

}
