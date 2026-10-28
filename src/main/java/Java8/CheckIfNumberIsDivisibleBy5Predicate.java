package Java8;

import java.util.function.Predicate;

public class CheckIfNumberIsDivisibleBy5Predicate {

	public static void main(String[] args) {
		Predicate<Integer> number=n->n%5==0;
		
		System.out.println("Number is divisible by 5 " + number.test(25));
		
		System.out.println("Number is divisible by 5 " + number.test(63));
		
		

	}

}
