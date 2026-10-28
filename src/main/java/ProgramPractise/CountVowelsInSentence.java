package ProgramPractise;

public class CountVowelsInSentence {

	public static void calculateVowels(String s) {		
		String p=s.toLowerCase();

		int count = 0;
		for (int i = 0; i < p.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;
			}
		}

		System.out.println(count + " are the number of vowels");

	}

	public static void main(String[] args) {
		calculateVowels(" ");

	}

}
