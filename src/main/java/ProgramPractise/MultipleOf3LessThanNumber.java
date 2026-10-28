package ProgramPractise;

import java.util.ArrayList;
import java.util.List;

public class MultipleOf3LessThanNumber {

	public static void main(String[] args) {

		System.out.println(getMultiple(3, 45));

	}

	public static List<Integer> getMultiple(int num, int limit) {
		List<Integer> list = new ArrayList<Integer>();

		int count = num;
		while (count < limit) {
			list.add(count);
			count = count + num;
		}
		return list;
	}

}
