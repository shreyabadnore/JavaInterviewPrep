package ProgramPractise;

public class WelcomeInRightAnglePattern {

	public static void main(String[] args) {
		String s = "Welcome";

		for (int i = 1; i <= s.length(); i++) {
			System.out.println(s.substring(0, i));
		}

	}

}
