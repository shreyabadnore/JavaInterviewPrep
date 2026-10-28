package Java8;

import java.util.function.Function;

public class ConvertStringtoUppercaseGetLengthMultiplyFunctionChaining {

	public static void main(String[] args) {

		Function<String, String> uppercase = s -> s.toUpperCase();

		Function<String, Integer> lengthh = s -> s.length();

		Function<Integer, Integer> multiplyy = s -> (s * 10);

		Function<String, Integer> combined = uppercase.andThen(lengthh).andThen(multiplyy);

		System.out.println("ConvertStringtoUppercaseGetLengthMultiplyFunctionChaining " + combined.apply("Shreya"));

	}

}
