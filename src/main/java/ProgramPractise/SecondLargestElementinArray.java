package ProgramPractise;

public class SecondLargestElementinArray {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5 };
		int largest = 0;
		int secondLargest = 0;

		System.out.print("Given Array is:");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			} else if (array[i] > secondLargest) {
				secondLargest = array[i];
			}
		}

		System.out.println("secondLargest:" + secondLargest);

	}
}
 