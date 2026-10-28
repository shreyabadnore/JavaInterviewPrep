package ProgramPractise;

public class AlphanumericNumberCountandSum {

	public static void main(String[] args) {

		String s = "1AB2CD3";
		s=s.toLowerCase();
		int sum = 0, count = 0;
		for (char ch : s.toCharArray()) {
			if (Character.isDigit(ch)) {

				sum = sum + Character.getNumericValue(ch);
				count++;
			}

		}
		System.out.println(sum);
		System.out.println(count);
	}

}
