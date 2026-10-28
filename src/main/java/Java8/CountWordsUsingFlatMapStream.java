package Java8;

import java.util.Arrays;
import java.util.List;

public class CountWordsUsingFlatMapStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stubCountWordsUsingFlatMap

		List<String> sentences = Arrays.asList("Java is powerful", "Streams are awesome", "FlatMap is useful");

		long wordCount = sentences.stream().map(sentence -> sentence.split(" ")) // Step 1: Split into arrays
				.flatMap(array -> Arrays.stream(array)) // Step 2: Flatten arrays into one stream
				.count(); // Step 3: Count total words

		System.out.println("Total number of words: " + wordCount);

	}

}
