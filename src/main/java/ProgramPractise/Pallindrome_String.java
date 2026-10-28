package ProgramPractise;

public class Pallindrome_String {

	public static void main(String[] args) {
		String s = "Afy";
		reverse(s);

	}

	public static void reverse(String s) {

		String reverse = "";

		int length = s.length();

		for (int i = length - 1; i >= 0; i--) {

			reverse = reverse + s.charAt(i);
		}
		if (s.equals(reverse)) {
			System.out.println("String is pallindrome");
		} else {
			System.out.println("string is not pallindrome");
		}

	}
}
