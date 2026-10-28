package ProgramPractise;
import java.util.Arrays;
import java.util.List;

public class SecondLargestNumber_List {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 25, 45, 75, 30, 75, 60);

		int secondLargest = findSecondLargest(numbers);

		if (secondLargest != Integer.MIN_VALUE) {
			System.out.println("Second Largest Number: " + secondLargest);
		} else {
			System.out.println("No second largest number found.");
		}
	}

	public static int findSecondLargest(List<Integer> list) {

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : list) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}

		return secondLargest;
	}
}
