package ProgramPractise;

public class EvenOddArray {

	public static void main(String[] args) {

		int[] arr = { 3, 8, 5, 2, 7, 4, 6, 1 };

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			if (arr[left] % 2 != 0) {
				left++;
			} else if (arr[right] % 2 == 0) {
				right--;
			} else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;
			}
		}

		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
