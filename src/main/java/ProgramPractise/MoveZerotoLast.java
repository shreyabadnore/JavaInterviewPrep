package ProgramPractise;

import java.util.Arrays;

public class MoveZerotoLast {

	public static void moveZero(int input[]) {
		int current_index = 0;

		int n = input.length;

		for (int i = 0; i < n; i++) { 				//for (int i = n - 1; i >= 0; i--)
			if (input[i] != 0) {
				input[current_index] = input[i];
				current_index++;
			}

		}

		while (current_index < n) {					//while (current_index >= 0)
			input[current_index] = 0;
			current_index++;

		}
	
		System.out.println(Arrays.toString(input));
	}

	public static void main(String[] args) {

		moveZero(new int[] { 1, 0, 8, 0, 7, 0, 5, 0, 4, 3, 2, 5, 8 });

	}

}
