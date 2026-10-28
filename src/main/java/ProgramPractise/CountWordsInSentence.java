package ProgramPractise;

public class CountWordsInSentence {

	public static void main(String[] args) {
	String sentence="Java is awesome";
	
	int wordCount=countWords(sentence);
	
	System.out.println(wordCount);

	}
	
	public static int countWords(String sentence) {
		if(sentence== null||sentence.trim().isEmpty()) {
			return 0;
		}
		
		String[] words=sentence.trim().split("\\s+");
		return words.length;
		
	}

}
