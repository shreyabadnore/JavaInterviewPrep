package ProgramPractise;

import java.util.ArrayList;
import java.util.List;

public class GetElementFromLinkedList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("shreya");
		list.add("kartik");
		list.add("hridhaan");

		for (int i = 0; i <list.size(); i++) {
			System.out.println(i + list.get(i));
		}

	}

}
