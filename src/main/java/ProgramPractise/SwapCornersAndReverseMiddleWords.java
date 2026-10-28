   package ProgramPractise;

public class SwapCornersAndReverseMiddleWords {

	public static void print(String s) {

		String first = " ";
		int i;

		for (i = 0; i <= s.length();) {

			while (s.charAt(i) != ' ') {
				first = first + s.charAt(i);
				i++;
			}
			break;
		}

		String last = " ";
		int j;
		for (j = s.length() - 1; j >= 1;) {
			while (s.charAt(j) != ' ') {
				last = s.charAt(j) + last;
				j--;

			}
			break;
		}
		System.out.print(last);

		for (int m = j; m >= i; m--) {
			System.out.print(s.charAt(m));
		}
		System.out.print(first);
	}

	public static void main(String[] args) {

		print("Hi my name is shreya");

	}

}
