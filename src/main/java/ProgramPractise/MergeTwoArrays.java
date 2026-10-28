package ProgramPractise;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = { 6, 7, 8, 9, 10 };
		merge(a1, a2);

	}

	public static void merge(int[] a1, int[] a2) {

		int[] a3 = new int[a1.length + a2.length];

		for (int i = 0; i < a1.length; i++) {
			a3[i] = a1[i];
		}

		for (int i = 0; i < a2.length; i++) {
			a3[i + a1.length] = a2[i];
		}

		System.out.println(Arrays.toString(a3));

	}

}
