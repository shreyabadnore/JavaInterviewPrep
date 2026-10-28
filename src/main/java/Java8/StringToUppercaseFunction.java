package Java8;

import java.util.function.Function;

public class StringToUppercaseFunction {

	public static void main(String[] args) {
	
		Function<String, String> casee= s -> s.toUpperCase();
		
		System.out.println("UpperCase is "+casee.apply("shreyaaaa"));
	}

}
