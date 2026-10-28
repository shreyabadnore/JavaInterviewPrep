package Java8;

import java.util.function.Function;

public class WordCountInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub>

		Function<String, Integer> word = sentence -> {
			String[] words = sentence.trim().split(" ");

			return words.length;

		};
		
		System.out.println(word.apply("Java 8 Function Interface Practice"));
		

	}

}
