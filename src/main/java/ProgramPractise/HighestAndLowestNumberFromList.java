package ProgramPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestAndLowestNumberFromList {

	public static void main(String[] args) {
		{

			List<Integer> list = new ArrayList<Integer>();
			list.add(10);
			list.add(20);
			list.add(30);
			list.add(40);

			int max = Collections.max(list);
			int min = Collections.min(list);

			System.out.println(max);
			System.out.println(min);

		}
	}
}
