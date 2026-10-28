package Java8;

import java.util.function.Function;

public class ReverseStringAppendConvertToUppercaseFunctionChaining {

	public static void main(String[] args) {

		Function<String, String> reverse = s -> {
			String rslt = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				rslt = rslt + s.charAt(i);
			}
			return rslt;
		};

		Function<String, String> append = s -> s.concat("JAVA");

		Function<String, String> uppercase = s -> s.toUpperCase();

		Function<String, String> combined = reverse.andThen(append).andThen(uppercase);

		System.out.println(combined.apply("Java"));

	}

}

