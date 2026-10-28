package ProgramPractise;
public class SortArrayinAscendingOrder {
public static void main(String[] args) {
		int[] array = { 3, 2, 4, 5, 1 };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}
		}

		System.out.println("Asc Array is" + " ");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
	}

}
