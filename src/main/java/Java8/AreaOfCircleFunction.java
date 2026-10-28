package Java8;

import java.util.function.Function;

public class AreaOfCircleFunction {

	public static void main(String[] args) {
		Function<Double, Double> area=n -> (3.147*n*n);
		System.out.println(area.apply(4.5));
		

	}

}
