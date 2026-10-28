package ProgramPractise;

public class CountConsecutiveCharacters {

	static void printFrequency(String s) {
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				i++;
				count++;
			}
			System.out.print(s.charAt(i) + "" + count);
		}

	}

	public static void main(String[] args) {

		printFrequency("kkaartik");

	}

}
