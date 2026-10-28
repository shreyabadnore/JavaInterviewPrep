package Java8;

import java.util.function.Function;

public class ReverseStringFunction {

	public static void main(String[] args) {
		
		 Function<String, String> reverse = str -> {
	            String result = "";
	            for (int i = str.length() - 1; i >= 0; i--) {
	                result = result+ str.charAt(i);
	            }
	            return result;
	        };                                

	        System.out.println("Original: Shreya");
	        System.out.println("Reversed: " + reverse.apply("Shreya"));

	        System.out.println("Original: Java");
	        System.out.println("Reversed: " + reverse.apply("Java"));
	    }
	}
