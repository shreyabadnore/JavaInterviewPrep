
package ProgramPractise;

public class FirstLetterCapital {

	public static void main(String[] args) {

		System.out.println(formatString("i name is shreya"));

	}

	public static String formatString(String str) {
		String[] words = str.split(" ");

		String output = " ";

		for (String s : words) {
			String firstchar = s.substring(0, 1);

			String afterfirstchar = s.substring(1);

			output = output + firstchar.toUpperCase() + afterfirstchar.toLowerCase()+" ";

		}
		return output.trim();

	}

}
