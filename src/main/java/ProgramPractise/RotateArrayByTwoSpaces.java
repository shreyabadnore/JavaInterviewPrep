package ProgramPractise;
import java.util.Arrays;
public class RotateArrayByTwoSpaces {
	public static void main(String[] args) {
		String[] days = { "Mon", "Tue", "Wed" };
		int k = 2;
		rotateArray(days, k);
		System.out.println("Rotated Arary" + Arrays.toString(days));
	}
	public static void rotateArray(String[] arr, int k) {
		int n = arr.length;
		k = k % n;
		reverse(arr, 0, n - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);

	}
	private static void reverse(String[] arr, int left, int right) {
		while (left < right) {
			String temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;

		}
	}

}
