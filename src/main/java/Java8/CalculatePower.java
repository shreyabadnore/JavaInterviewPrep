package Java8;

import java.util.function.BiFunction;

public class CalculatePower {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> power=(a, b) -> (int) Math.pow(a, b);
		
		System.out.println(power.apply(2, 3));
		

	}

}
