package Java8;

import java.util.function.BiFunction;



public class AddBiFunction {

	public static void main(String[] args) {
		
		
		BiFunction<Integer, Integer, Integer> add=(a,b)->a+b;
		
		System.out.println("Addition is:"+add.apply(9, 44));
		

	}

}
