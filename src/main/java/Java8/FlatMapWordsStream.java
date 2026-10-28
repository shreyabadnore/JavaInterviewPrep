package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapWordsStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> sentences = Arrays.asList("Java Streams", "make code", "beautiful and powerful");

		List<String> words = sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))) // split each
																										// sentence into
																										// words
				.collect(Collectors.toList());

		System.out.println(words);

	}

}
