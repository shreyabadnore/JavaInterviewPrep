package Java8;

import java.util.function.Function;

public class SquareDoubleAdd50FunctionalChaining {

	public static void main(String[] args) {
		
		Function<Integer, Integer> square = n -> n * n;

		Function<Integer, Integer> doubler = n -> n * 2;

		Function<Integer, Integer> add = n -> n + 50;

		Function<Integer, Integer> combined = square.andThen(doubler).andThen(add);

		System.out.println("Square double and the add 50 for the given number is "+combined.apply(5));

	}

}
