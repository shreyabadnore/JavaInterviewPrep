package ProgramPractise;

public class TreatConsecutiveNumberSingleDigit {

	public static void main(String[] args) {

		System.out.println(findSum("12ujyt555"));

	}

	public static int findSum(String str) {

		String temp = "0";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				temp = temp + ch;

			} else {
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
		}

		return sum + Integer.parseInt(temp);

	}

}
