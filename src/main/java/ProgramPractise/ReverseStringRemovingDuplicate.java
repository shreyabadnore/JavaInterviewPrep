package ProgramPractise;

import java.util.HashSet;
import java.util.Set;

public class ReverseStringRemovingDuplicate {

	public static void main(String[] args) {
		String input = "AABBCCDDE";
		reverse(input);

	}

	public static void reverse(String input) {

		Set<Character> s = new HashSet<Character>();
		String output = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);

			if (!s.contains(ch)) {
				s.add(ch);
				output = output + ch;

			}

		}
		System.out.print(output);

	}

}
