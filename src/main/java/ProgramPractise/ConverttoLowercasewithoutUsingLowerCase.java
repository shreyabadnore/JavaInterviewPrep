package ProgramPractise;

public class ConverttoLowercasewithoutUsingLowerCase {

	public static void toLowerCase(String s) {

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (65 <= ch && ch <= 90) {
				ch = (char) (ch + 32);

			}

			System.out.print(ch);
		}

	}

	public static void main(String[] args) {
		toLowerCase("VFJDSK");

	}

}
