package ProgramPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class list {

	public static void main(String[] args) {

		List<Integer> number = new ArrayList<Integer>();

		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			int randomNumber = random.nextInt(100);
			number.add(randomNumber);

		}

		System.out.println("Original List of Random Number is" + number);

		Collections.sort(number);
		System.out.println("Sorted List Asc" + number);

		Collections.reverse(number);
		System.out.println("Reverse List is Dec" + number);

		int max = Collections.max(number);
		int min = Collections.min(number);

		System.out.println("Max No is" + max);
		System.out.println("Min No is" + min);
		
		int indextoremove=random.nextInt(number.size());
		int removedNumber=number.remove(indextoremove);
		
		System.out.println("number removed at index"+ indextoremove);
		System.out.println("List after removal"+number);
		System.out.println("removedNumber"+removedNumber);
	}

}
