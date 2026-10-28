package Java8;

import java.util.function.Function;

public class SquareFunction {

	public static void main(String[] args) {
		
		Function<Integer, Integer> square=n->(n*n);
		
		System.out.println("The square is "+square.apply(5));
		
	
	}

}
