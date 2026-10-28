package ProgramPractise;

public class SeprateAlphaNumericString {

	public static void main(String[] args) {
		String str = "436789gbjfldsnj54k654jog63hj54";

		StringBuilder alphabets = new StringBuilder();// for alphabets
		int sum = 0, count=0;

		for (char ch : str.toCharArray()) {
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
				count++;
			} else if (Character.isAlphabetic(ch)) {
				alphabets.append(ch);

			}
		}
		System.out.println("Sum of the numbers is" + sum);
		System.out.println("The Alphabets are" + alphabets);
		System.out.println("The count of numbers is"+ count);

	}

}
