package Java8;

import java.util.function.BiFunction;

public class MultiplyBiFunction {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> multiply=(a,b) ->a*b;
		
		System.out.println("Multiplication is: " +multiply.apply(66, 67));

	}

}
