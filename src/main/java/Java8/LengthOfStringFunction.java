package Java8;

import java.util.function.Function;

public class LengthOfStringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, Integer> length=n->n.length();
		
		System.out.println("Length of the given word is "+ length.apply("Shreyaa"));
		

	}

}
