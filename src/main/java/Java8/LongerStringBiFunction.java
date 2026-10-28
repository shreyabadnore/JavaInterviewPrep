package Java8;

import java.util.function.BiFunction;

public class LongerStringBiFunction {

	public static void main(String[] args) {
		BiFunction<String, String, String> longer=(s1, s2) -> (s1.length() >= s2.length()) ? s1 : s2;
		
		//? ternary operator 
		//(condition) ? value_if_true : value_if_false;

        
        System.out.println("Longer String is: " + longer.apply("Java", "Programming"));
        System.out.println("Longer String is: " + longer.apply("Hello", "World"));
		

	}

}
