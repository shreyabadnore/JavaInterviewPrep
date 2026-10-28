package Java8;

import java.util.function.BiFunction;

public class FullNameGeneratorBifunction {

	public static void main(String[] args) {
		BiFunction<String, String, String> concat=(a,b) -> a+" "+b;
		
		System.out.println("Combine is " + concat.apply("Shreya", "Badnore"));
		

	}

}
