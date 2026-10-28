package Java8;

import java.util.function.Predicate;

public class CheckIfNumberIsPositivePredicate {

	public static void main(String[] args) {
		

        Predicate<Integer> num = n -> n > 0;

        System.out.println("Is number positive? " + num.test(10));  // Output: true
        System.out.println("Is number positive? " + num.test(-5));  // Output: false
    }
}