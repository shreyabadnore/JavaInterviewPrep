package Java8;

import java.util.function.Predicate;

public class CheckStringStartWithSPredicate {

	public static void main(String[] args) {
		
		Predicate<String> startWith=s->s.startsWith("S");
		
		System.out.println(startWith.test("Kartik"));
		
	
	}

}
