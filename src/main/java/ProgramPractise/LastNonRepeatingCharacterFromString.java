package ProgramPractise;

public class LastNonRepeatingCharacterFromString {

	public static void main(String[] args) {

		lastNonRepeatingCharacterFromString("aabccdeff");

	}

	public static void lastNonRepeatingCharacterFromString(String s) {

		int[] count = new int[256];// use character array as the input string contains ASCII characters

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}

		for (int i = s.length() - 1; i >= 0; i--) {
			if (count[s.charAt(i)] >= 2) {
				System.out.println("Last non repeating character is: " + s.charAt(i));
				return;
			}
		}

		System.out.println("No non repeating character found");
	}
}
