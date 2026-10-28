package Java8;

import java.util.function.Function;

public class EvenOddFunction {

	public static void main(String[] args) {
		Function<Integer, String> evenOdd = n -> {
			if (n % 2 == 0) {
				return "Even";
			} else {
				return "Odd";
			}
		};

		System.out.println("10 is " + evenOdd.apply(10));
		System.out.println("15 is " + evenOdd.apply(15));
	}
}