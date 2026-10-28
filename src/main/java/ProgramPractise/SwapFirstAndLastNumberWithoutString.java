package ProgramPractise;

public class SwapFirstAndLastNumberWithoutString {
	public static int swap(int num) {

		// Find the last digit
		int remainder = num % 10;

		// Find the divisor needed to get the first digit
		int divisor = 1;
		int original_num = num;

		while (original_num >= 10) {
			original_num = original_num / 10;
			divisor = divisor * 10;
		}

		// Find the first digit
		int firstDigit = num / divisor;

		// Remove first and last digit
		int middle = (num % divisor) / 10;

		// Swap first and last digit
		int result = remainder * divisor + middle * 10 + firstDigit;

		return result;
	}

	public static void main(String[] args) {
		System.out.println(swap(12345));

	}

}
