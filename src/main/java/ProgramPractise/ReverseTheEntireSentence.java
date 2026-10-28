package ProgramPractise;

public class ReverseTheEntireSentence {
	public static String print(String s) {

		if (s == null) {
			System.out.println("String can't be null");
			throw new RuntimeException("String cant be null");
		}

		if (s.length() == 1) {
			return s;

		}

		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		return rev;
	}

	public static void main(String[] args) {

		System.out.println(print("madam"));

	}

}
