  package ProgramPractise;

public class ReverseTheStringPreservingTheWhiteSpaces {

	public static void main(String[] args) {

		String input = "I love my country";
		String result = reversePreservingWhitespace(input);
		System.out.println("Original: " + input);
		System.out.println("Reversed: " + result);
	}

	public static String reversePreservingWhitespace(String input) {

		char[] characters = input.toCharArray();

		char[] reversed = new char[characters.length];

		for (int i = 0; i < characters.length; i++) {
			if (Character.isWhitespace(characters[i])) {
				reversed[i] = characters[i];
			}
		}

		int j = characters.length - 1;
		for (int i = 0; i < characters.length; i++) {
			if (!Character.isWhitespace(characters[i])) {
				while (Character.isWhitespace(reversed[j])) {
					j--;
				}
				reversed[j] = characters[i];
				j--;
			}
		}

		return new String(reversed);
	}

}
