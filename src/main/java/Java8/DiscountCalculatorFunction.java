package Java8;

import java.util.function.Function;

public class DiscountCalculatorFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        
		        // Define a Function to calculate 10% discount
		        Function<Double, Double> discount = price -> price - (price * 0.10);

		        // Test the function
		        System.out.println("Original Price: 1000.0");
		        System.out.println("Discounted Price: " + discount.apply(1000.0));

		        System.out.println("Original Price: 2500.0");
		        System.out.println("Discounted Price: " + discount.apply(2500.0));
		    }
		

}


